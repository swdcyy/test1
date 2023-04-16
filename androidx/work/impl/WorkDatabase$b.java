package androidx.work.impl.WorkDatabase$b;
import androidx.room.RoomDatabase$b;
import a3.b;
import java.lang.String;
import androidx.work.impl.WorkDatabase;

public class WorkDatabase$b extends RoomDatabase$b	// class@000a63
{

    public void WorkDatabase$b(){
       super();
    }
    public void b(b p0){
       p0.beginTransaction();
       p0.execSQL(WorkDatabase.I());
       p0.setTransactionSuccessful();
       p0.endTransaction();
    }
}
