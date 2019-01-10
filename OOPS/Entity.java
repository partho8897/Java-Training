package training.stack.OOPS;

public abstract class Entity {
	private String name = "";
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(long dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Folder getParent() {
		return parent;
	}

	public void setParent(Folder parent) {
		this.parent = parent;
	}

	//int size = 0;
	private long dateCreated;
	//String id = "";
	private Folder parent;
	
	public Entity(String name, Folder  parent)
	{
		this.name = name;
		this.dateCreated = System.currentTimeMillis();
		this.parent = parent;
	}
	

	public boolean delete(Entity e)
	{
		return this.parent.delete(e);
		
	}
	
	public String getPath()
	{
		if(parent == null)
			return name;
		return this.getParent().getPath()+"/"+name;
	}
	
	public abstract int size();
}
