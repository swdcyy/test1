package cg8.d$c;
import w2.c;
import a3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.mini.d;

public final class d$c extends c	// class@000419
{

    public void d$c(int p0,int p1){
       super(p0, p1);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
          return;
       }
       try{
          p0.execSQL("ALTER TABLE MiniAppDetailInfo ADD COLUMN apiBlacklist TEXT");
       }catch(java.lang.Exception e0){
          d.e("MiniPackageDbMigrations", e0);
       }
       p0.execSQL("DROP TABLE IF EXISTS MainPackageDownloadDbModel");
       return;
    }
}
