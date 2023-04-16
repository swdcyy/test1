package androidx.work.impl.a$b;
import w2.c;
import a3.b;
import android.os.Build$VERSION;
import java.lang.String;

public class a$b extends c	// class@000a69
{

    public void a$b(int p0,int p1){
       super(p0, p1);
    }
    public void a(b p0){
       if (Build$VERSION.SDK_INT >= 23) {
          p0.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN \(2, 3, 5\) AND schedule_requested_at=-1 AND interval_duration<>0");
       }
       return;
    }
}
