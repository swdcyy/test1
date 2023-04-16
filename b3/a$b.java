package b3.a$b;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import b3.a;
import a3.e;
import java.lang.Object;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteCursorDriver;
import java.lang.String;
import android.database.sqlite.SQLiteQuery;
import android.database.Cursor;
import b3.d;
import android.database.sqlite.SQLiteProgram;
import a3.d;
import android.database.sqlite.SQLiteCursor;

public class a$b implements SQLiteDatabase$CursorFactory	// class@000ad6
{
    public final e a;
    public final a b;

    public void a$b(a p0,e p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Cursor newCursor(SQLiteDatabase p0,SQLiteCursorDriver p1,String p2,SQLiteQuery p3){
       this.a.d(new d(p3));
       return new SQLiteCursor(p1, p2, p3);
    }
}
