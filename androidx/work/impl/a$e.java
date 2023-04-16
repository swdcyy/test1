package androidx.work.impl.a$e;
import w2.c;
import a3.b;
import java.lang.String;

public class a$e extends c	// class@000a6c
{

    public void a$e(int p0,int p1){
       super(p0, p1);
    }
    public void a(b p0){
       p0.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` \(`period_start_time`\)");
    }
}
