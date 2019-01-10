package training.stack.OOPS;

public class File extends Entity{
	private String content;
	private int size;
	public File(String name, Folder parent) {
		super(name, parent);
		this.size = size;
	}

	@Override
	public int size() {
		return size;
	}
	public String getContent()
	{
		return content;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
}
