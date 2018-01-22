package selogger;



public enum EventType {

	RESERVED, 
	/** The first event of a method execution.  If the method is an instance method (excluding constructor), the object is recorded in this event. */
	METHOD_ENTRY,  
	/** A formal parameter of a method. */ 
	METHOD_PARAM,
	/** In a constructor, this event records an initialized object ("this").   */
	METHOD_OBJECT_INITIALIZED, 
	/** The last event of a method execution.  A return value is recorded. */
	METHOD_NORMAL_EXIT, 
	/** An exception is terminating a method execution.  The last instruction (label) is recorded. */
	METHOD_EXCEPTIONAL_EXIT_LABEL,  
	/** The last event of a method execution terminated by an exception.  The exception object is recorded. */
	METHOD_EXCEPTIONAL_EXIT,
	CATCH, 
	THROW, 
	CALL, 
	CALL_PARAM, 
	CALL_RETURN, 
	GET_INSTANCE_FIELD, 
	GET_INSTANCE_FIELD_RESULT,
	GET_STATIC_FIELD, 
	PUT_INSTANCE_FIELD, 
	PUT_INSTANCE_FIELD_VALUE,
	PUT_INSTANCE_FIELD_BEFORE_INITIALIZATION,
	PUT_STATIC_FIELD, 
	ARRAY_LOAD, 
	ARRAY_LOAD_INDEX, 
	ARRAY_LOAD_RESULT, 
	/** This event is recorded if an array-load instruction used either a null reference or an invalid index. */
	ARRAY_LOAD_FAIL,
	ARRAY_STORE, 
	ARRAY_STORE_INDEX, 
	ARRAY_STORE_VALUE,
	NEW_ARRAY,
	NEW_ARRAY_RESULT, 
	MULTI_NEW_ARRAY, 
	MULTI_NEW_ARRAY_OWNER, 
	MULTI_NEW_ARRAY_ELEMENT,
	ARRAY_LENGTH, 
	ARRAY_LENGTH_RESULT, 
	/** Beginning of synchronized(object){...}.  The object is recorded. */
	MONITOR_ENTER, 
	/** End of synchronized(object){...}.  The object is recorded. */
	MONITOR_EXIT,  
	CONSTANT_OBJECT_LOAD, 
	NEW_OBJECT, 
	NEW_OBJECT_CREATION_COMPLETED,
	INSTANCEOF, 
	INSTANCEOF_RESULT,
	/** This event is recorded when INVOKEDYNAMIC instruction created a function object.  */
	INVOKE_DYNAMIC,
	/** An execution passed a particular code location.  The event records a Data ID corresponding to a previous location. */
	LABEL,
	/** A jump event does not appear in event sequence.  The Data ID is recorded in Jump instructions. */
	JUMP,
	LOCAL_LOAD, 
	LOCAL_STORE,
	/** A return from subroutine. This is recorded as a local variable access. */
	RET,
	/**	An arithmetic division.  No events actually have this event type, but a LABEL event may refer to this type as a cause. */
	DIVIDE
	;
	
}
