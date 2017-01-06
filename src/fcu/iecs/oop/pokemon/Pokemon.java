package fcu.iecs.oop.pokemon;
public abstract class Pokemon implements Fightable{
	private String nickName;
	private int cp;
	private final PokemonType type;
	public String getNickName() 
	{
		return nickName;
	}
	public void setNickName(String nickName) 
	{
		this.nickName = nickName;
	}
	public int getCp()
	{
		return cp;
	}
	public void setCp(int cp)
	{
		this.cp = cp;
	}
	public PokemonType getType() 
	{
		return type;
	}
	public Pokemon(String nickName,PokemonType type,int cp)
	{
		this.nickName=nickName;
		this.type=type;
		this.cp=cp;
	}
}