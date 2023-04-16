package jg9.c1;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.base.d;
import jg9.a1;
import jg9.c1$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import gh9.d;
import android.view.View;
import zb9.q;
import jg9.c1$b;
import erd.g;
import crd.b;
import zb9.j;
import jg9.c1$c;
import android.view.animation.Animation;
import android.content.Context;
import android.view.animation.AnimationUtils;
import lnc.a1;
import hg9.l;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import jg9.c1$d;
import com.yxcorp.gifshow.bubble.b$c;
import jg9.c1$e;
import com.yxcorp.gifshow.camera.bubble.b$c;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public final class c1 extends BaseMultiTakePictureController	// class@002a8c
{
    public boolean t;

    public void c1(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.d.n(a1.class, new c1$a(this));
    }
    public boolean c1(){
       Object obj = PatchProxy.apply(null, this, c1.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.c1() && this.d.d(d.c).b == null)? true: false;
       return b;
    }
    public boolean g2(){
       Object obj = PatchProxy.apply(null, this, c1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.g2() && (this.t == null && this.d.d(d.c).b == null))? true: false;
       return b;
    }
    public boolean h2(){
       return false;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c1.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.k(p0);
       this.Y1(this.d.l(q.class, new c1$b(this)));
       this.Y1(this.d.l(j.class, new c1$c(this)));
       return;
    }
    public Animation k2(){
       Animation obj = PatchProxy.apply(null, this, c1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = AnimationUtils.loadAnimation(this.e, R.anim.arg_RES_7f01012e);
       a.o(obj, "AnimationUtils.loadAnima¡­ake_picture_flash_effect\)");
       return obj;
    }
    public String m2(){
       String obj = PatchProxy.apply(null, this, c1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a1.p(R.string.arg_RES_7f1048b5);
       a.o(obj, "CommonUtil.string\(R.stri¡­napshot_save_local_album\)");
       return obj;
    }
    public void o2(){
       if (PatchProxy.applyVoid(null, this, c1.class, "3")) {
          return;
       }
       View view = this.l2().b(false);
       if (view != null) {
          d a = this.d.d(d.c).a;
          b uob = new b(RecordBubbleItem.MULTI_TAKE);
          BubbleInterface$Position bOTTOM = (a != null)? BubbleInterface$Position.BOTTOM: BubbleInterface$Position.TOP;
          uob.y(bOTTOM);
          int i = (a != null)? 0x7f0d0143: 0x7f0d0146;
          uob.s(i);
          b uob1 = uob.n(view).A(R.string.arg_RES_7f1048b7);
          uob1.q((long)5000);
          uob1 = uob1.z(new c1$d(this));
          uob1.v(c1$e.a);
          a.o(uob1, "RecordBubble\(RecordBubbl¡­akeTips\(false\)\n        }\)");
          a = this.d;
          a.o(a, "mCallerContext");
          w ow = a.b();
          a.o(ow, "mCallerContext.controllerManager");
          ow.V7().n(uob1);
       }
       return;
    }
    public void r2(){
    }
}
