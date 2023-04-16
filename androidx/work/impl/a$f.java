package androidx.work.impl.a$f;
import w2.c;
import a3.b;
import java.lang.String;

public class a$f extends c	// class@000a6d
{

    public void a$f(int p0,int p1){
       super(p0, p1);
    }
    public void a(b p0){
       p0.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
