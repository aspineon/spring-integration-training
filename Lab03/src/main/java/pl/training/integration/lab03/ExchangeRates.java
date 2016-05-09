package pl.training.integration.lab03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "tabela_kursow")
public class ExchangeRates {

    @XmlElement(name = "pozycja")
    private List<Entry> entries;

    public List<Entry> getEntries() {
        return entries;
    }

    @Override
    public String toString() {
        return "ExchangeRates{" +
                "entries=" + entries +
                '}';
    }

}
