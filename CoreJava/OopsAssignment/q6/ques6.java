package q6;


abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
		return "this is file persistence";}
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
		return "this is database persistence";}
}

public class ques6 {

	public static void main(String[] args) {
		
		FilePersistence file= new FilePersistence();
		DatabasePersistence data= new DatabasePersistence();
		System.out.println(file.persist());
		System.out.println(data.persist());
		

	}

}
