/**
 * 
 */
package com.krishna.mavenTestProjects;

import org.springframework.stereotype.Component;

/**
 * @author 91889
 *
 */
@Component
public class Desktop implements Computer {

	@Override
	public String getComputer() {
		return "Desktop";
	}

}
