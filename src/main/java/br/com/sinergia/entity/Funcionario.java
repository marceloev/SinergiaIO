package br.com.sinergia.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "TFUNC")
@Table(name = "TFUNC")
public class Funcionario {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_CODFUNC")
    @Column(name = "CODFUNC")
    private int codigoFuncionario;

    @Length(max = 80, message = "Nome do Funcionário deve conter até 80 dígitos")
    @NotNull(message = "Nome do Funcionário não pode ser vazio")
    @Column(name = "NOMEFUNC", length = 80, nullable = false)
    private String nomeFuncionario;

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
}
