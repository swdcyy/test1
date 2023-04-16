package b3.b$a$a;
import android.database.DatabaseErrorHandler;
import a3.c$a;
import b3.a;
import java.lang.Object;
import android.database.sqlite.SQLiteDatabase;
import b3.b$a;
import a3.b;

public class b$a$a implements DatabaseErrorHandler	// class@0002b3
{
    public final c$a a;
    public final a[] b;

    public void b$a$a(c$a p0,a[] p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onCorruption(SQLiteDatabase p0){
       this.a.c(b$a.c(this.b, p0));
    }
}
