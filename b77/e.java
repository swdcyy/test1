package b77.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b77.i;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.view.View;
import b77.h;
import b77.e$a;
import android.view.View$OnClickListener;
import crd.b;
import lnc.b9;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.widget.FrameLayout;
import android.widget.TextView;
import zf6.j;
import java.lang.Integer;
import u37.g;
import u37.e;
import fq5.b;
import brd.t;
import b77.e$e;
import erd.g;
import com.kwai.framework.model.user.QCurrentUser;
import mkc.b;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import b77.d;
import cjd.e;
import erd.o;
import b77.e$d;
import b77.e$b;
import b77.e$c;
import com.yxcorp.gifshow.image.KwaiImageView;
import b77.n;
import com.kwai.library.widget.popup.common.c;

public class e extends PresenterV2	// class@0003d7
{
    public Drawable A;
    public Drawable B;
    public View C;
    public View D;
    public b E;
    public h F;
    public b p;
    public c q;
    public KwaiImageView r;
    public KwaiImageView s;
    public TextView t;
    public TextView u;
    public List v;
    public View w;
    public View x;
    public TextView y;
    public View z;

    public void e(){
       super();
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          this.A = new i();
          Drawable uDrawable = a1.f(R.drawable.arg_RES_7f080d8b);
          this.B = uDrawable;
          this.x.setBackground(uDrawable);
          this.x.setSelected(false);
          this.w.setBackground(this.B);
          this.w.setSelected(false);
          this.C.setBackground(new h());
          this.m8().findViewById(R.id.medal_popup_view).setBackground(new h());
       }
       this.a();
       this.z.setOnClickListener(new e$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "17")) {
          return;
       }
       b9.a(this.E);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, e.class, "14")) {
          return;
       }
       this.w.setBackground(this.A);
       this.w.setSelected(true);
       this.w.setAlpha(0x3f800000);
       this.x.setBackground(this.B);
       this.x.setSelected(false);
       this.x.setAlpha(0x3f000000);
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "13")) {
          return;
       }
       this.x.setBackground(this.A);
       this.x.setSelected(true);
       this.x.setAlpha(0x3f800000);
       this.w.setBackground(this.B);
       this.w.setSelected(false);
       this.w.setAlpha(0x3f000000);
       return;
    }
    public final void S8(KwaiEmptyStateView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "10")) {
          return;
       }
       TextView textView = p0.findViewById(R.id.retry_btn);
       textView.setBackground(j.j(R.drawable.arg_RES_7f082555, 2));
       textView.setTextColor(j.a(R.color.arg_RES_7f0606ca, 2));
       return;
    }
    public void V8(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "16")) {
          return;
       }
       if (p0 != 2) {
          if (p0 == 3) {
             this.y.setEnabled(false);
             this.y.setText(R.string.arg_RES_7f1014d2);
             this.w.setEnabled(false);
             this.x.setEnabled(false);
          }
       }else {
          this.y.setEnabled(true);
          this.y.setText(R.string.arg_RES_7f101421);
          this.w.setEnabled(true);
          this.x.setEnabled(true);
       }
       return;
    }
    public void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "15")) {
          return;
       }
       this.X7(e.e().b(this.p.getLiveStreamId(), p0).subscribe(new e$e(this)));
       return;
    }
    public void a(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          if (!PatchProxy.applyVoid(objArray, this, uoe, "7")) {
             KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
             uoa.b();
             uoa.k(R.drawable.arg_RES_7f080609);
             uoa.j(2);
             uoa.h(R.string.arg_RES_7f1030ae);
             uoa.e(R.string.arg_RES_7f103059);
             uoa.p(new d(this));
             this.S8(uoa.a(c.h(this.C, b.g)));
             this.D.setVisibility(8);
          }
          return;
       }else {
          this.X7(e.e().a(this.p.getLiveStreamId()).map(new e()).doOnSubscribe(new e$d(this)).subscribe(new e$b(this), new e$c(this)));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a1205);
       this.s = p0.findViewById(0x7f0a121a);
       this.t = p0.findViewById(0x7f0a1204);
       this.u = p0.findViewById(0x7f0a1219);
       this.w = p0.findViewById(0x7f0a171b);
       this.x = p0.findViewById(0x7f0a3649);
       this.y = p0.findViewById(0x7f0a1206);
       this.z = p0.findViewById(0x7f0a11f6);
       this.C = p0.findViewById(0x7f0a3f11);
       this.D = p0.findViewById(0x7f0a2921);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.q8(n.class);
       return;
    }
}
