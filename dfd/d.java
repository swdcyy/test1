package dfd.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nfd.o3;
import jfd.b;
import jfd.d;
import yed.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import cw9.c;
import j06.c;
import nfd.t0;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ImageView;
import com.yxcorp.plugin.search.utils.j0;
import ekd.m1;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;

public class d extends PresenterV2	// class@000cbd
{
    public d p;
    public d q;
    public KBoxItem r;
    public KwaiImageView s;
    public KwaiContentFrame t;
    public KwaiImageView u;
    public FrameLayout v;
    public boolean w;

    public void d(){
       super();
    }
    public void d(boolean p0){
       super();
       this.w = p0;
    }
    public void E8(){
       int i2;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
          return;
       }
       d tu = this.u;
       int i = 0;
       if (tu != null) {
          o3.H(tu, i);
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "5")) {
          this.p.getWidth();
          this.p.getHeight();
          float f = 0x3f800000 / this.p.getCoverAspectRatio();
          int i1 = this.q.a();
          d tq = this.q;
          Objects.requireNonNull(tq);
          ViewGroup$MarginLayoutParams obj = PatchProxy.apply(objArray, tq, d.class, "3");
          if (obj != PatchProxyResult.class) {
             i2 = obj.intValue();
          }else if(tq.b == null){
             tq.b = c.a(a.B.getResources(), 0x7f070e58);
          }
          d tt = tq.b;
          i1 = i1 - (i2 * 2);
          if ((double)f - 0x3ff570a3d70a3d71 < 0 && c.c()) {
             i = 1;
          }
          if (i) {
             i1 = t0.z0;
          }
          float f1 = (float)i1;
          i = (int)(f1 / f);
          float f2 = 0x3f553f7d;
          int i3 = (f - f2 < 0)? (int)(f1 / f2): i;
          obj = this.v.getLayoutParams();
          obj.width = i1;
          obj.height = i3;
          this.v.setLayoutParams(obj);
          tt = this.t;
          if (tt != null) {
             obj = tt.getLayoutParams();
             obj.width = i1;
             obj.height = i;
             if (i > i3) {
                i = (i3 - i) / 2;
                obj.topMargin = i;
                obj.bottomMargin = i;
             }
             this.t.setLayoutParams(obj);
          }
          tt = this.u;
          if (tt != null) {
             obj = tt.getLayoutParams();
             obj.width = i1;
             obj.height = i3;
             this.u.setLayoutParams(obj);
          }
          ViewGroup$LayoutParams layoutParams = this.s.getLayoutParams();
          layoutParams.height = i3;
          this.s.setLayoutParams(layoutParams);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       if (this.w != null) {
          j0.D(this.v, (float)t0.e);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a30d8);
       this.t = m1.f(p0, 0x7f0a0f90);
       this.u = m1.f(p0, 0x7f0a0f93);
       this.s = m1.f(p0, 0x7f0a0f91);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("SEARCH_PLAY_PHOTO_WRAPPER");
       this.q = this.r8("SEARCH_PLAY_LAZY_DATA");
       this.r = this.s8(KBoxItem.class);
       return;
    }
}
