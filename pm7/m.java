package pm7.m;
import pm7.h;
import java.lang.Object;
import java.util.ArrayList;
import rm7.a;
import java.lang.String;
import java.lang.Throwable;
import pm7.e;
import pm7.d;
import pm7.b;

public abstract class m	// class@0021e4
{
    public final h a;
    public final List b;

    public void m(h p0){
       super();
       this.b = new ArrayList();
       this.a = p0;
    }
    public final void a(a p0,String p1){
       String str;
       Object[] objArray;
       if (p0 == null) {
          return;
       }
       Throwable throwable = p0.c();
       try{
          str = p0.h();
       }catch(java.lang.Exception e0){
          str = "";
       }
       int i = 4;
       if (e0 == null) {
          objArray = new Object[i];
          objArray[0] = p1;
          objArray[1] = this.b();
          objArray[2] = p0.b();
          objArray[3] = str;
          d.b().a("PatchState", "%s State:%s event:%s toReportValue=%s", objArray);
       }else {
          objArray = new Object[i];
          objArray[0] = p1;
          objArray[1] = this.b();
          objArray[2] = p0.b();
          objArray[3] = str;
          d.b().f("PatchState", e0, "%s State:%s event:%s toReportValue=%s", objArray);
       }
       return;
    }
    public abstract String b();
}
