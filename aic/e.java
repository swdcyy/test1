package aic.e;
import zhc.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e17.i;
import android.app.Activity;
import brd.t;
import com.yxcorp.gifshow.share.d;
import aic.e$a;
import aic.e$b;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.share.widget.GuideShareMoreDialog;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.common.c;

public final class e implements b	// class@00012c
{
    public GuideShareMoreDialog a;
    public final GifshowActivity b;
    public final BaseFeed c;

    public void e(GifshowActivity p0,BaseFeed p1){
       a.p(p0, "activity");
       a.p(p1, "feed");
       super();
       this.b = p0;
       this.c = p1;
    }
    public final GifshowActivity a(){
       return this.b;
    }
    public void b(){
       PatchProxy.applyVoid(null, this, e.class, "5");
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       i.a(R.style.arg_RES_7f110669, 0x7f101059);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tb = this.b;
       if (tb instanceof GifshowActivity && (!tb.isDestroyed() && !this.b.isFinishing())) {
          d.c(this.c, this.b).subscribe(new e$a(this), new e$b(this));
       }
    label_0035 :
       return;
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "4")) {
          return;
       }
       e ta = this.a;
       if (ta != null) {
          GuideShareMoreDialog guideShareMo = PatchProxy.apply(objArray, ta, GuideShareMoreDialog.class, "7");
          if (guideShareMo != PatchProxyResult.class) {
          }else {
             guideShareMo = ta.e;
             if (guideShareMo == null) {
                a.S("popup");
             }
          }
          if (guideShareMo != null) {
             guideShareMo.o();
          }
       }
       return;
    }
}
