package o90.c;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import o90.e;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import n90.g;

public final class c implements Runnable	// class@00276d
{
    public final KuaiShanEditActivityV2 b;
    public final e c;
    public final Throwable d;

    public void c(KuaiShanEditActivityV2 p0,e p1,Throwable p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "1")) {
          return;
       }
       c tb = this.b;
       tb.P = true;
       KuaiShanEditActivityV2 s = tb.S;
       if (s != null) {
          s.e(this.c.c, false, true);
       }
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
