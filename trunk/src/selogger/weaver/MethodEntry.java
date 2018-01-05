package selogger.weaver;

public class MethodEntry {

	private static final String SEPARATOR = ",";

	private int classId;
	private int methodId;
	private String className;
	private String methodName;
	private String methodDesc;
	private int access;
	private String sourceFileName;
	
	public MethodEntry(int classId, int methodId, String className, String methodName, String methodDesc, int access, String sourceFileName) {
		this.classId = classId;
		this.methodId = methodId;
		this.className = className;
		this.methodName = methodName;
		this.methodDesc = methodDesc;
		this.access = access;
		this.sourceFileName = sourceFileName;
	}
	
	public String getClassName() {
		return className;
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	public String getMethodDesc() {
		return methodDesc;
	}
	
	public int getAccess() {
		return access;
	}
	
	/**
	 * @return a source file name.  This may return null.
	 */
	public String getSourceFileName() {
		return sourceFileName;
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append(classId);  
		buf.append(SEPARATOR);
		buf.append(methodId);  
		buf.append(SEPARATOR);
		buf.append(className);
		buf.append(SEPARATOR);
		buf.append(methodName);
		buf.append(SEPARATOR);
		buf.append(methodDesc);
		buf.append(SEPARATOR);
		buf.append(access);
		buf.append(SEPARATOR);
		if (sourceFileName != null) buf.append(sourceFileName);
		return buf.toString();
	}
}
