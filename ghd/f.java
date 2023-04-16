package ghd.f;
import a17.b$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qyb.a;
import java.lang.Object;
import a17.c;
import android.view.View;
import k2b.e0;
import sgd.a;
import com.yxcorp.plugin.setting.utils.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.content.Context;
import ekd.p0;
import e17.i;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class f implements b$b	// class@000f2d
{
    public final int a;
    public final GifshowActivity b;
    public final int c;
    public final a d;

    public void f(int p0,GifshowActivity p1,int p2,a p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(c p0,View p1,int p2){
       int i;
       f ta = this.a;
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       f uof = null;
       if (ta == 1) {
          i = p2;
       }else if(!p2){
          i = 0;
       }else {
          i = 2;
       }
       a.h(ta, tb, i);
       if (tc != p2) {
          if (!p2) {
             if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p2), tb, td, null, b.class, "6")) {
                if (!p0.C(tb)) {
                   i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
                }else {
                   b.b(1, td);
                   i.a(R.style.arg_RES_7f11066a, 0x7f10470e);
                }
             }
          }else {
             b.e(tb, td, null);
             p0.q(uof);
          }
       }
       return;
    }
}
