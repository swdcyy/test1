package androidx.work.impl.a$d;
import w2.c;
import a3.b;
import java.lang.String;

public class a$d extends c	// class@000a6b
{

    public void a$d(int p0,int p1){
       super(p0, p1);
    }
    public void a(b p0){
       p0.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` \(`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY\(`work_spec_id`\), FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)");
    }
}
