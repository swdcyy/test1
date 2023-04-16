package com.yxcorp.gifshow.growth.halfscreenfollow.e;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.growth.halfscreenfollow.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.k2;
import k2b.u1;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import com.yxcorp.gifshow.growth.halfscreenfollow.a;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.growth.halfscreenfollow.b;
import com.yxcorp.gifshow.growth.halfscreenfollow.f$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.growth.halfscreenfollow.c;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import tna.b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class e implements Runnable	// class@001389
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void run(){
       String str1;
       Activity uActivity = ActivityContext.g().e();
       if (!uActivity instanceof GifshowActivity) {
       }else if(uActivity.isFinishing() || (PatchProxy.applyVoidOneRefs(uActivity, null, f.class, "2") || !uActivity instanceof GifshowActivity)){
          k2 ok2 = u1.j();
          String str = "";
          if (ok2 != null) {
             if (("HALF_SCREEN_FOLLOW_PANEL_H5").equals(ok2.d)) {
                ok2 = u1.n();
                if (ok2 != null) {
                   str = ok2.l();
                   ok2 = ok2.d;
                }else {
                label_004c :
                   str1 = str;
                }
             }else {
                str = ok2.l();
                str1 = ok2.d;
             }
          }else {
             goto label_004c ;
          }
          d uod = new d(uActivity);
          uod.b1(KwaiDialogOption.f);
          uod.G(a.a);
          uod.O(b.a);
          uod.L(new f$b(str, ok2));
          uod.B(true);
          uod.z(true);
          uod.J(c.a);
          uod.A(true);
          uod.Y(new b());
       }
       return;
    }
}
