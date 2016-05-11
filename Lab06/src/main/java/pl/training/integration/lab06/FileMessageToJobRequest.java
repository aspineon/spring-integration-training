package pl.training.integration.lab06;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.integration.launch.JobLaunchRequest;
import org.springframework.messaging.Message;

import java.io.File;

public class FileMessageToJobRequest {

    private Job job;

    public JobLaunchRequest transform(Message<File> fileMessage) {
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        jobParametersBuilder.addString("path", fileMessage.getPayload().getAbsolutePath());
        return new JobLaunchRequest(job, jobParametersBuilder.toJobParameters());
    }

    public void setJob(Job job) {
        this.job = job;
    }

}
