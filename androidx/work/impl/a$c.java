package androidx.work.impl.a$c;
import w2.c;
import a3.b;
import java.lang.String;

public class a$c extends c	// class@000a6a
{

    public void a$c(int p0,int p1){
       super(p0, p1);
    }
    public void a(b p0){
       p0.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
       p0.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
