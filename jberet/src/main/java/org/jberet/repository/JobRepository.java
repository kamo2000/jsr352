
/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jberet.repository;

import java.util.Collection;
import java.util.List;
import javax.batch.runtime.JobExecution;
import javax.batch.runtime.JobInstance;

import org.jberet.job.Job;
import org.jberet.runtime.StepExecutionImpl;

public interface JobRepository {
    long nextUniqueId();

    boolean addJob(Job job);

    boolean removeJob(String jobId);

    Job getJob(String jobId);

    Collection<Job> getJobs();
    

    boolean addJobExecution(JobExecution jobExecution);

    JobExecution getJobExecution(long jobExecutionId);

    List<JobExecution> getJobExecutions();


    boolean addJobInstance(JobInstance jobInstance);

    JobInstance getJobInstance(long jobInstanceId);

    List<JobInstance> getJobInstances();

    void savePersistentData(JobExecution jobExecution, StepExecutionImpl stepExecution);

}