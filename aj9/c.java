package aj9.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import java.lang.Object;
import java.util.Objects;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import qr4.i;
import qr4.k$j;

public final class c implements Runnable	// class@0000dd
{
    public final a b;
    public final float c;
    public final int d;
    public final float e;

    public void c(a p0,float p1,int p2,float p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       c tb = this.b;
       c te = this.e;
       a e = tb.e;
       float f = (float)this.d;
       int i = (int)(this.c / f);
       Objects.requireNonNull(e);
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyOneRefs(Integer.valueOf(i), e, videoContext, "88") != PatchProxyResult.class) {
       }else {
          VideoContext.b();
          e.a.c.g = i;
       }
       tb.e.H1((double)(te / f));
       return;
    }
}
