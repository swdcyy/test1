package j7a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j7a.c$a;
import nsd.u;
import j7a.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uc6.c;
import sd5.d;
import android.view.View;
import j7a.c$c;
import java.lang.Runnable;
import ekd.k1;
import android.view.View$OnLayoutChangeListener;
import java.lang.StringBuilder;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.Log;
import ekd.m1;
import android.view.ViewGroup;
import sd5.c;
import im8.a;

public final class c extends PresenterV2	// class@002929
{
    public QPhoto p;
    public View q;
    public View r;
    public View s;
    public d t;
    public View u;
    public final View$OnLayoutChangeListener v;
    public static final c$a w;

    static {
       c.w = new c$a(null);
    }
    public void c(){
       super();
       this.v = new c$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tt = this.t;
       if (tt == null) {
          a.S("mFrameUiHolder");
       }
       View view = tt.N().m();
       a.o(view, "mFrameUiHolder.get\(\).tempUseGetView\(\)");
       this.u = view;
       k1.p(new c$c(this), this);
       tt = this.r;
       if (tt == null) {
          a.S("mTextureFrame");
       }
       tt.addOnLayoutChangeListener(this.v);
       tt = this.u;
       if (tt == null) {
          a.S("mTextureView");
       }
       tt.addOnLayoutChangeListener(this.v);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       k1.n(this);
       c tr = this.r;
       if (tr == null) {
          a.S("mTextureFrame");
       }
       tr.removeOnLayoutChangeListener(this.v);
       tr = this.u;
       if (tr == null) {
          a.S("mTextureView");
       }
       tr.removeOnLayoutChangeListener(this.v);
       return;
    }
    public final void P8(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "6")) {
          return;
       }
       if (p0.getVisibility()) {
          this.S8(p1+" visibility "+p0.getVisibility());
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams.width == null || layoutParams.height == null) {
          this.S8(p1+" lp: "+layoutParams.width+','+layoutParams.height);
       }
       if (!p0.getWidth() || !p0.getHeight()) {
          this.S8(p1+" size: "+p0.getWidth()+','+p0.getHeight());
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       c tq = this.q;
       if (tq == null) {
          a.S("mPlayerRoot");
       }
       this.P8(tq, "PlayerRoot");
       tq = this.r;
       if (tq == null) {
          a.S("mTextureFrame");
       }
       this.P8(tq, "TextureFrame");
       tq = this.s;
       if (tq == null) {
          a.S("mPlayerKitView");
       }
       this.P8(tq, "PlayerKitView");
       tq = this.u;
       if (tq == null) {
          a.S("mTextureView");
       }
       this.P8(tq, "TextureView");
       return;
    }
    public final void S8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       StringBuilder str = "photo:";
       c tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       str = str+tp.getPhotoId()+' '+p0+" caption:";
       c tp1 = this.p;
       if (tp1 == null) {
          a.S("mPhoto");
       }
       Log.d("PlayerLayoutCheckP", str+tp1.getCaption());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       View view = m1.f(p0, R.id.player);
       a.o(view, "bindWidget\(rootView, R.id.player\)");
       this.q = view;
       View view1 = m1.f(p0, R.id.texture_view_frame);
       a.o(view1, "bindWidget\(rootView, R.id.texture_view_frame\)");
       this.r = view1;
       view1 = m1.f(p0, R.id.slide_playerkit_view);
       a.o(view1, "bindWidget\(rootView, R.id.slide_playerkit_view\)");
       this.s = view1;
       d uod = c.a(m1.f(p0, R.id.texture_view_frame));
       a.o(uod, "ContentFrameExitSwipeAni¡­R.id.texture_view_frame\)\)");
       this.t = uod;
       if (uod == null) {
          a.S("mFrameUiHolder");
       }
       this.W7(uod);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       return;
    }
}
