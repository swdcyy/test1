package g8a.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g8a.a$a;
import g8a.a$b;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import jd5.i;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import g8a.a$c;
import erd.g;
import crd.b;
import brd.t;
import g8a.a$d;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import android.view.View;
import ekd.m1;
import android.text.TextPaint;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import qrd.l1;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public final class a extends PresenterV2	// class@00240d
{
    public BaseFragment p;
    public QPhoto q;
    public t r;
    public SlidePlayViewModel s;
    public View t;
    public TextView u;
    public SlideHorizontalAtlasPlayer v;
    public boolean w;
    public PublishSubject x;
    public final a y;
    public final i z;

    public void a(){
       super();
       this.y = new a$a(this);
       this.z = new a$b(this);
    }
    public static final TextView P8(a p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mPositionView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.requireParentFragment());
       this.s = slidePlayVie;
       a.m(slidePlayVie);
       a tp1 = this.p;
       if (tp1 == null) {
          a.S(str);
       }
       slidePlayVie.P(tp1, this.y);
       tp = this.v;
       if (tp != null) {
          tp.x(this.z);
       }
       tp = this.r;
       if (tp == null) {
          a.S("mNasaScaleCleanControllerShowObservable");
       }
       this.X7(tp.subscribe(new a$c(this)));
       tp = this.x;
       if (tp == null) {
          a.S("mClearScaleCleanViewSubject");
       }
       this.X7(tp.subscribe(new a$d(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a ts = this.s;
       a.m(ts);
       a tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       ts.D(tp, this.y);
       ts = this.v;
       if (ts != null) {
          ts.M(this.z);
       }
       return;
    }
    public final void R8(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       StringBuilder str = p0+'/';
       a tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       String str1 = str+tq.getAtlasList().size();
       uoa = this.u;
       if (uoa == null) {
          a.S("mPositionView");
       }
       CharSequence text = uoa.getText();
       if (text != null && !text.equals(str1)) {
          uoa = this.u;
          if (uoa == null) {
             a.S("mPositionView");
          }
          uoa.setText(str1);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0280);
       this.v = m1.f(p0, 0x7f0a032f);
       p0 = m1.f(p0, R.id.atlas_position_view);
       a.o(p0, "ViewBindUtils.bindWidget¡­R.id.atlas_position_view\)");
       this.u = p0;
       String str = "mPositionView";
       if (p0 == null) {
          a.S(str);
       }
       TextPaint paint = p0.getPaint();
       a.o(paint, "mPositionView.paint");
       paint.setFakeBoldText(true);
       a tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setColor(a1.a(R.color.arg_RES_7f06020a));
       gradientDraw.setShape(0);
       gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07027a));
       tu.setBackground(gradientDraw);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       obj = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.N¡­NTROLLER_SHOW_OBSERVABLE\)");
       this.r = obj;
       obj = this.r8("ATLAS_CLEAR_SCALE_CLEAN_VIEW_EVENT");
       a.o(obj, "inject\(DetailAccessIds.A¡­R_SCALE_CLEAN_VIEW_EVENT\)");
       this.x = obj;
       return;
    }
}
