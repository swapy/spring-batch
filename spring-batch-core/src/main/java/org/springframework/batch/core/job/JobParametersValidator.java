package org.springframework.batch.core.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;

/**
 * Strategy interface for a {@link Job} to use in validating its parameters for
 * an execution.
 * 
 * @author Dave Syer
 * 
 */
public interface JobParametersValidator {

	/**
	 * Check the parameters meet whatever requirements are appropriate, and
	 * throw an exception if not.
	 * 
	 * @param parameters some {@link JobParameters}
	 * @throws JobParametersInvalidException if the parameters are invalid
	 */
	void validate(JobParameters parameters) throws JobParametersInvalidException;

}
