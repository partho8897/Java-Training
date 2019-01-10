package training.stack.OOPS;

import java.util.ArrayList;

public class Folder extends Entity{

	private ArrayList<Entity> entityList;
	
	public Folder(String name, Folder parent)
	{
		super(name,parent);
		entityList = new ArrayList<Entity>();
	}
	
	public boolean deleteEntry(Entity e)
	{
		return entityList.remove(e);
	}
	
	@Override
	public int size()
	{
		int size = 0;
		for(Entity e : entityList)
		{
			size+=e.size();
		}
		return size;
	}
}
