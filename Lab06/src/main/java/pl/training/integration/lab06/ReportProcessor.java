package pl.training.integration.lab06;

import org.springframework.batch.item.ItemProcessor;

public class ReportProcessor implements ItemProcessor<Report, Report> {

    @Override
    public Report process(Report report) throws Exception {
        System.out.println(report);
        report.setQty(report.getQty() + 1);
        return report;
    }

}
