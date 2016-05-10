package pl.training.integration.lab03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Entry implements Serializable {

    private Long id;
    @XmlElement(name = "nazwa_waluty")
    private String currency;
    @XmlElement(name = "kod_waluty")
    private String code;
    @XmlElement(name = "kurs_sredni")
    private double value;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entry entry = (Entry) o;

        if (Double.compare(entry.value, value) != 0) return false;
        if (currency != null ? !currency.equals(entry.currency) : entry.currency != null) return false;
        return code != null ? code.equals(entry.code) : entry.code == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = currency != null ? currency.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", value=" + value +
                '}';
    }

}
