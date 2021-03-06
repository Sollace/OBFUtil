package net.acomputerdog.OBFUtil.map;

import net.acomputerdog.OBFUtil.table.OBFTable;

public interface ObfMap<T extends ObfMap.Entry> {
	
	public String[] getAllObf();
	
	public String[] getAllDeObf();
	
	public T byDeobf(String deobf);
	
	public T byObf(String obf);
	
	public boolean hasObf(String obf);
	
	public boolean hasDeObf(String deobf);
	
	public void add(String obf, String deobf);
	
	public void write(OBFTable table, boolean overwrite, TargetType type);
	
    public static interface Entry {
    	String obf();
    	String deObf();
    }
}
