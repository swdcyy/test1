package cg8.d$a;
import w2.c;
import a3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d$a extends c	// class@000417
{

    public void d$a(int p0,int p1){
       super(p0, p1);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       p0.execSQL("ALTER TABLE BackupMiniAppPackageInfo ADD COLUMN insertTime INTEGER NOT NULL DEFAULT 0");
       return;
    }
}
