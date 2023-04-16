package androidx.work.impl.a$a;
import w2.c;
import a3.b;
import java.lang.String;

public class a$a extends c	// class@000a68
{

    public void a$a(int p0,int p1){
       super(p0, p1);
    }
    public void a(b p0){
       p0.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` \(`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY\(`work_spec_id`\), FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)");
       p0.execSQL("INSERT INTO SystemIdInfo\(work_spec_id, system_id\) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
       p0.execSQL("DROP TABLE IF EXISTS alarmInfo");
       p0.execSQL("INSERT OR IGNORE INTO worktag\(tag, work_spec_id\) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
    }
}
