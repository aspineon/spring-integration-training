package pl.training.integration.lab06;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ReportMapper implements FieldSetMapper<Report> {

    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public Report mapFieldSet(FieldSet fieldSet) throws BindException {
        Report report = new Report();
        report.setId(fieldSet.readLong(0));
        report.setName(fieldSet.readString(1));
        report.setQty(fieldSet.readInt(2));
        try {
            report.setDate(formatter.parse(fieldSet.readString(3)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return report;
    }

}
