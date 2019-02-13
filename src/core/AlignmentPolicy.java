package net.opentsdb.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


public enum AlignmentPolicy {
	FLOOR("floor", "af"),
	NEAREST("nearest", "an"),
	CEILING("ceiling", "ac");
	
	// The user friendly name for this alignment policy
	private final String name;
	private final String commandSpec;
	
	AlignmentPolicy( final String name, final String commandSpec ) {
		this.name = name;
		this.commandSpec = commandSpec;
	}
	
	/**
	 * Get this alignment policy's user-friendly name.
	 * @return this fill policy's user-friendly name.
	 */
	@JsonValue
	public String getName() {
		return name;
	}
	
	/**
	 * @return the command spec for this alignment policy
	 */
	public String getCommandSpec() {
		return commandSpec;
	}
	
	/**
	 * Get an instance of this enumeration from a user-friendly name.
	 *  
	 * @param name The user-friendly name of an alignment policy.
	 * @return an instance of {@link AlignmentPolicy}, if the name is null 
	 * or empty the default policy of {@code FLOOR} is returned
	 * @throws IllegalArgumentException if the name does not match an 
	 * alignment policy
	 */
	@JsonCreator
	public static AlignmentPolicy fromString( final String name ) {
		if ( name == null || name == "" ) {
			return FLOOR;
		}
		
		for ( final AlignmentPolicy policy : AlignmentPolicy.values()) {
			if ( policy.name.equalsIgnoreCase(name)) {
				return policy;
			}
		}
		
		throw new IllegalArgumentException("Unrecognized alignment policy: " + name);
	}
	
	public static AlignmentPolicy fromCommandSpec ( final String commandSpec ) {
		if ( commandSpec == null || commandSpec == "" ) {
			return FLOOR;
		}
		
		for ( final AlignmentPolicy policy : AlignmentPolicy.values()) {
			if ( policy.commandSpec.equalsIgnoreCase(commandSpec)) {
				return policy;
			}
		}
		
		throw new IllegalArgumentException("Unrecognized alignment policy: " + commandSpec);		
	}
}
