package b3.d;
import a3.d;
import android.database.sqlite.SQLiteProgram;
import java.lang.Object;
import java.lang.String;

public class d implements d	// class@0002b7
{
    public final SQLiteProgram b;

    public void d(SQLiteProgram p0){
       super();
       this.b = p0;
    }
    public void bindBlob(int p0,byte[] p1){
       this.b.bindBlob(p0, p1);
    }
    public void bindDouble(int p0,double p1){
       this.b.bindDouble(p0, p1);
    }
    public void bindLong(int p0,long p1){
       this.b.bindLong(p0, p1);
    }
    public void bindNull(int p0){
       this.b.bindNull(p0);
    }
    public void bindString(int p0,String p1){
       this.b.bindString(p0, p1);
    }
    public void clearBindings(){
       this.b.clearBindings();
    }
    public void close(){
       this.b.close();
    }
}
