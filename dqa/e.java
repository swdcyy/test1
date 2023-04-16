package dqa.e;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cra.w;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedManager;
import q87.c;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedHelper;
import com.yxcorp.gifshow.entity.QPhoto;

public final class e implements Runnable	// class@0024ed
{
    public final String b;
    public final String c;

    public void e(String p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       PreEmbeddedManager l = PreEmbeddedManager.l;
       int i = 0;
       Object[] objArray = new Object[i];
       w.C().w(l.d(), "onAppInit\(\) runOnBackgroundThreadImmediately", objArray);
       String str = PreEmbeddedManager.a(l)+'/'+this.b;
       String str1 = PreEmbeddedManager.a(l)+'/'+this.c;
       PreEmbeddedHelper c = PreEmbeddedHelper.c;
       boolean b = c.b(this.b, str);
       boolean b1 = c.b(this.c, str1);
       if (b && b1) {
          Object[] objArray1 = new Object[i];
          w.C().w(l.d(), "onAppInit\(\) isCopyJsonSuccess && isCopyVideoSuccess", objArray1);
          PreEmbeddedManager.b = str;
          PreEmbeddedManager.c = str1;
       }
       PreEmbeddedManager.b();
       return;
    }
}
