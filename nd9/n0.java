package nd9.n0;
import oc9.d0;
import com.kwai.library.widget.popup.common.f;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.SharedPreferences$Editor;
import oe6.g;
import oc9.t;
import oc9.s;
import nd9.l0;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.base.d;
import java.lang.Integer;
import j8c.a;
import q87.c;
import android.view.View;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import nd9.h0;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.b$c;
import nd9.i0;
import android.app.Activity;
import android.graphics.Rect;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.b;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import nd9.n0$a;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public class n0 extends d0	// class@003151
{
    public ViewTreeObserver$OnGlobalLayoutListener o;
    public View p;
    public boolean q;
    public boolean r;
    public static final int s;
    public static final SharedPreferences t;

    static {
       n0.s = f.b(15.00f);
       n0.t = b.b("DefaultPreferenceHelper");
    }
    public void n0(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public static boolean g2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return n0.t.getBoolean(p0, false);
    }
    public static void k2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, n0.class, "9")) {
          return;
       }
       g.a(n0.t.edit().putBoolean(p0, true));
       return;
    }
    public void E1(boolean p0){
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on0, "2")) {
          return;
       }
       s.e(this, p0);
       this.b2(new l0(this));
       return;
    }
    public void d5(int p0){
       Object[] objArray;
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on0, "1")) {
          return;
       }
       super.d5(p0);
       if (this.p != null) {
          if (this.q != null) {
             objArray = new Object[0];
             a.D().w("TabGuideController", "tryShowPictureAlbumBubble", objArray);
             if (!n0.g2("album_picture_tab_guide_shown") && this.l2(this.p.findViewById(15), 0x7f103dd5, RecordBubbleItem.ALBUM_PICTURE_TAB, h0.a)) {
                objArray = new Object[0];
                a.D().w("TabGuideController", "tryShowPictureAlbumBubble success", objArray);
                this.q = false;
             }
          }
          if (this.r != null) {
             objArray = new Object[0];
             a.D().w("TabGuideController", "tryShowDraftBubble", objArray);
             if (!n0.g2("draft_tab_guide_shown") && this.l2(this.p.findViewById(14), 0x7f103d5b, RecordBubbleItem.DRAFT_TAB, i0.a)) {
                objArray = new Object[0];
                a.D().w("TabGuideController", "tryShowDraftBubble success", objArray);
                this.r = false;
             }
          }
       }
    label_0091 :
       return;
    }
    public boolean h2(Activity p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, n0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Rect rect = n.B(p1, false);
       int i = n.k(p0);
       float f = (float)(rect.left + rect.right) / 2.00f;
       StringBuilder str = "tabViewRect: "+rect;
       int s = n0.s;
       Object[] objArray = new Object[false];
       a.D().w("TabGuideController", str+" displayWidth: "+i+" tabViewCenterX: "+f+" safeMargin: "+s, objArray);
       if (f - (float)s < 0 || f - (float)(i - s) > 0) {
          return false;
       }
       return true;
    }
    public final void i2(){
       if (PatchProxy.applyVoid(null, this, n0.class, "7")) {
          return;
       }
       n0 tp = this.p;
       if (tp != null && this.o != null) {
          ViewTreeObserver viewTreeObse = tp.getViewTreeObserver();
          if (viewTreeObse != null) {
             viewTreeObse.removeOnGlobalLayoutListener(this.o);
             this.o = null;
          }
       }
       return;
    }
    public final boolean l2(View p0,int p1,c p2,b$c p3){
       d obj;
       int this;
       if (PatchProxy.isSupport(n0.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, n0.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.e;
       if (obj == null) {
          return true;
       }else {
          c uoc = this.d.b().V7();
          if (p0 != null && (!p0.getVisibility() && uoc != null)) {
             this = 0;
             if (!this.h2(obj, p0)) {
                Object[] objArray = new Object[this];
                a.D().w("TabGuideController", "tabView not full display", objArray);
                return this;
             }else {
                Object[] this1 = new Object[this];
                a.D().w("TabGuideController", "try show tab guide", this1);
                b uob = new b(p2).n(p0);
                uob.y(BubbleInterface$Position.TOP);
                uob.s(R.layout.arg_RES_7f0d0146);
                b uob1 = uob.A(p1);
                b uob2 = uob1.z(new n0$a(this, obj, p0));
                uob2.q(5000);
                uob2.v(p3);
                uoc.n(uob2);
             }
          }
          return true;
       }
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, n0.class, "3")) {
          return;
       }
       super.onDestroyView();
       this.i2();
       return;
    }
}
