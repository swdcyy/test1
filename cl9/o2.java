package cl9.o2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cl9.m2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import fk9.b;
import com.kuaishou.android.model.mix.QComment;
import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import android.animation.ObjectAnimator;
import java.lang.Runnable;
import ekd.k1;
import android.graphics.drawable.Drawable;
import cl9.l2;
import erd.g;
import crd.b;
import brd.t;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import ekd.m1;

public class o2 extends PresenterV2	// class@000651
{
    public View p;
    public QComment q;
    public RecyclerFragment r;
    public Drawable s;
    public int t;
    public int u;
    public final Runnable v;
    public ObjectAnimator w;
    public t x;

    public void o2(){
       super();
       this.t = -1;
       this.v = new m2(this);
    }
    public void E8(){
       o2 oo2 = o2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo2, "4")) {
          return;
       }
       if (this.r.g7() instanceof b && this.q.equals(this.r.g7().z)) {
          if (!PatchProxy.applyVoid(objArray, this, oo2, "5")) {
             int color = ContextCompat.getColor(this.p.getContext(), R.color.arg_RES_7f06077f);
             this.t = color;
             this.u = color - 0xff000000;
             oo2 = this.w;
             if (oo2 != null && oo2.isStarted()) {
                this.w.end();
             }
             this.p.setBackgroundColor(this.t);
             k1.r(this.v, 900);
          }
       }else {
          this.p.setBackgroundDrawable(this.s);
       }
       this.X7(this.x.subscribe(new l2(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, o2.class, "3")) {
          return;
       }
       TypedArray typedArray = this.getContext().getTheme().obtainStyledAttributes(c$b.U3);
       this.s = typedArray.getDrawable(30);
       typedArray.recycle();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o2.class, "7")) {
          return;
       }
       this.P8();
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o2.class, "8")) {
          return;
       }
       this.p.clearAnimation();
       k1.m(this.v);
       o2 tw = this.w;
       if (tw != null && tw.isStarted()) {
          this.w.end();
          this.w = objArray;
       }
       this.p.setBackgroundDrawable(this.s);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o2.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0873);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o2.class, "1")) {
          return;
       }
       this.q = this.q8(QComment.class);
       this.r = this.r8("FRAGMENT");
       this.x = this.r8("COMMENT_HIDE_PANEL_OBSERVABLE");
       return;
    }
}
