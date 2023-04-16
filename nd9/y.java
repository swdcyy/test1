package nd9.y;
import nd9.x;
import nd9.y$a;
import nsd.u;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import lnc.a1;
import android.app.Activity;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nd9.y$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import android.os.Handler;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import nd9.y$b;
import android.view.View$OnTouchListener;
import nd9.y$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import nd9.v;
import android.animation.Animator$AnimatorListener;
import nd9.w;
import nd9.u;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import nd9.y$e;
import com.kwai.library.widget.popup.common.PopupInterface$h;

public final class y extends x	// class@003162
{
    public TextView c;
    public KwaiImageView d;
    public View e;
    public View f;
    public c g;
    public final Handler h;
    public final Activity i;
    public final MagicEmoji$MagicFace j;
    public final String k;
    public final b l;
    public static final BubbleInterface$Position m;
    public static final int n;
    public static final y$a o;

    static {
       y.o = new y$a(null);
       y.m = BubbleInterface$Position.TOP;
       y.n = a1.e(19.00f);
    }
    public void y(Activity p0,MagicEmoji$MagicFace p1,String p2,b p3){
       a.p(p0, "activity");
       a.p(p1, "magicFace");
       a.p(p3, "callerContext");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.h = new y$d(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, y.class, "5")) {
          return;
       }
       y tg = this.g;
       if (tg != null) {
          tg.o();
       }
       this.h.removeCallbacksAndMessages(null);
       return;
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       View view = m1.f(p0, R.id.title);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.title\)");
       this.c = view;
       view = m1.f(p0, R.id.cover_image);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.cover_image\)");
       this.d = view;
       view = m1.f(p0, R.id.arrow);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.arrow\)");
       this.e = view;
       view = m1.f(p0, R.id.popup_container);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.popup_container\)");
       this.f = view;
       if (view == null) {
          a.S("container");
       }
       view.setOnTouchListener(y$b.b);
       m1.a(p0, new y$c(this), R.id.apply_button);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, y.class, "2")) {
          return;
       }
       y tc = this.c;
       if (tc == null) {
          a.S("title");
       }
       tc.setText(this.j.mName);
       tc = this.j;
       SimpleMagicFace mImages = tc.mImages;
       if (mImages != null) {
          tc = this.d;
          if (tc == null) {
             a.S("cover");
          }
          tc.U(mImages);
       }else {
          SimpleMagicFace mImage = tc.mImage;
          if (mImage != null) {
             y td = this.d;
             if (td == null) {
                a.S("cover");
             }
             td.L(mImage);
          }
       }
       return;
    }
    public void e(int p0,int p1){
       a$c uoc;
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oy, "4")) {
          return;
       }
       BubbleInterface$Position m = y.m;
       y ti = this.i;
       int n = y.n;
       int i = 0;
       if (PatchProxy.isSupport(x.class)) {
          Object[] objArray = new Object[]{m,Integer.valueOf(p0),Integer.valueOf(p1),ti,Integer.valueOf(0x7f0d1017),Integer.valueOf(n),null};
          uoc = PatchProxy.apply(objArray, this, x.class, "3");
          if (uoc != PatchProxyResult.class) {
          label_00b6 :
             this.g = uoc.Y(new y$e(this));
             this.h.removeCallbacksAndMessages(null);
             this.h.sendEmptyMessageDelayed(1, 5000);
             return;
          }
       }
       a.p(m, "position");
       a.p(ti, "activity");
       uoc = new a$c(ti);
       uoc.n0(p0, p1);
       uoc.v0(n);
       uoc.D0(m);
       uoc.A(1);
       uoc.P(1);
       v ov = PatchProxy.applyOneRefs(null, this, x.class, "1");
       if (ov != PatchProxyResult.class) {
       }else {
          ov = new v(this, null);
       }
       uoc.F(ov);
       w ow = PatchProxy.apply(null, this, x.class, "2");
       if (ow != PatchProxyResult.class) {
       }else {
          ow = new w(this);
       }
       uoc.N(ow);
       uoc.L(new u(this, R.layout.arg_RES_7f0d1017));
       uoc.D(PopupInterface$Excluded.NOT_AGAINST);
       a.o(uoc, "Bubble.Builder\(activity\)¡­ace.Excluded.NOT_AGAINST\)");
       goto label_00b6 ;
    }
}
