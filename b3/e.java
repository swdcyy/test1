package b3.e;
import a3.f;
import b3.d;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteProgram;
import java.lang.String;

public class e extends d implements f	// class@0002b8
{
    public final SQLiteStatement c;

    public void e(SQLiteStatement p0){
       super(p0);
       this.c = p0;
    }
    public void execute(){
       this.c.execute();
    }
    public long executeInsert(){
       return this.c.executeInsert();
    }
    public int executeUpdateDelete(){
       return this.c.executeUpdateDelete();
    }
    public long simpleQueryForLong(){
       return this.c.simpleQueryForLong();
    }
    public String simpleQueryForString(){
       return this.c.simpleQueryForString();
    }
}
