package kd9.v;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.frame.e;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oa0.a;
import xf6.g;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import ld9.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Intent;
import ekd.j0;
import lnc.n4;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import j8c.a;
import q87.c;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.record.frame.d;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;

public final class v implements Runnable	// class@002c70
{
    public final e b;

    public void v(e p0){
       this.b = p0;
    }
    public final void run(){
       boolean b;
       int b1;
       int b2;
       v tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uoe, "3")) {
       }else if(!a.F() || (g.f0() && !b.i(tb.e))){
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          d obj = PatchProxy.apply(objArray, tb, uoe, "6");
          b = true;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             obj = tb.e;
             if (obj != null) {
                Intent intent = obj.getIntent();
                if (intent != null) {
                   Object obj1 = PatchProxy.applyOneRefs(intent, tb, uoe, "7");
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else {
                      b1 = j0.b(intent, "camera_page_source", 0);
                      b1 = (b1 != 4 && (b1 != 5 && (b1 != 8 && (b1 != 9 && (b1 != 10 && (b1 == 15 || b1 == 12))))))? true: false;
                   }
                   if (b1) {
                      Object obj2 = PatchProxy.applyOneRefs(intent, tb, uoe, "8");
                      if (obj2 != patchProxyRe) {
                         b2 = obj2.booleanValue();
                      }else if(n4.c(intent) || (n4.i(intent) != null || (n4.b(intent) || j0.g(intent, "music")))){
                         if (!TextUtils.x(j0.f(intent, "musicId"))) {
                            b2 = -1;
                            if (j0.b(intent, "musicType", b2) == b2) {
                            }
                         }else if(j0.g(intent, "key_post_entrance_draft_params")){
                            b2 = false;
                         }
                      }
                   label_00c6 :
                      b2 = true;
                      if (b2) {
                      label_00cc :
                         b = false;
                      }
                   }else {
                      goto label_00cc ;
                   }
                }else {
                   goto label_00cc ;
                }
             }
          }
          if (b) {
             objArray = new Object[0];
             a.D().w("FrameGuideController", "try show dialog", objArray);
             tb.d.b().V7().n(new d(tb));
          }
       }
    label_00f0 :
       tb.d.b().V7().u(RecordBubbleItem.FRAME_GUIDE);
       return;
    }
}
