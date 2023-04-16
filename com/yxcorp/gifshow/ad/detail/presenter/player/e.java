package com.yxcorp.gifshow.ad.detail.presenter.player.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.presenter.player.e$a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import android.widget.ImageView;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import ekd.y0;
import android.view.View;
import ekd.m1;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import com.yxcorp.gifshow.image.KwaiImageView;
import de5.a;

public class e extends PresenterV2	// class@00167b
{
    public ScaleHelpView p;
    public a q;
    public KwaiImageView r;
    public KwaiContentFrame s;
    public y0 t;
    public QPhoto u;
    public Bitmap v;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "9")) {
          return;
       }
       this.p.setAssistListener(new e$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "10")) {
          return;
       }
       this.R8();
       return;
    }
    public Bitmap P8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoe, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!this.u.isImageType()) {
          return this.s.C();
       }
       uoe = PatchProxy.apply(objArray, this, uoe, "6");
       if (uoe != patchProxyRe) {
       }else if(this.v == null){
          this.v = Bitmap.createBitmap(this.r.getMeasuredWidth(), this.r.getMeasuredHeight(), Bitmap$Config.ARGB_8888);
       }
       this.r.draw(new Canvas(this.v));
       uoe = this.v;
       return uoe;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       e tt = this.t;
       if (tt != null) {
          tt.e();
          this.t = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3120);
       this.r = m1.f(p0, 0x7f0a319f);
       this.p = m1.f(p0, 0x7f0a2a96);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       this.u = this.q8(QPhoto.class);
       return;
    }
}
