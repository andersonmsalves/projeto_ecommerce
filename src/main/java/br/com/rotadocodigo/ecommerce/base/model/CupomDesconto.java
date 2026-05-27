package br.com.rotadocodigo.ecommerce.base.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cupom_desconto")
@SequenceGenerator(name = "seq_cupom_desconto", sequenceName = "seq_cupom_desconto", allocationSize = 1, initialValue = 1)

public class CupomDesconto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cupom_desconto")
    private Long id;

    private String codigoDescricao;

    private BigDecimal valorRealDescricao;

    private BigDecimal valorPorcentagemDescricao;

    @Temporal(TemporalType.DATE)
    private Date dataValidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoDescricao() {
        return codigoDescricao;
    }

    public void setCodigoDescricao(String codigoDescricao) {
        this.codigoDescricao = codigoDescricao;
    }

    public BigDecimal getValorPorcentagemDescricao() {
        return valorPorcentagemDescricao;
    }

    public void setValorPorcentagemDescricao(BigDecimal valorPorcentagemDescricao) {
        this.valorPorcentagemDescricao = valorPorcentagemDescricao;
    }

    public BigDecimal getValorRealDescricao() {
        return valorRealDescricao;
    }

    public void setValorRealDescricao(BigDecimal valorRealDescricao) {
        this.valorRealDescricao = valorRealDescricao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CupomDesconto that = (CupomDesconto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
