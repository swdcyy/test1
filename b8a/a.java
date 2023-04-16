package b8a.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lxb.s;
import java.lang.Float;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import android.content.Context;
import com.yxcorp.utility.n;
import java.util.Objects;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import lnc.a1;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.entity.QPhoto;

public class a extends PresenterV2	// class@000390
{
    public KwaiImageView p;
    public QPhoto q;
    public s r;

    public void a(){
       super();
    }
    public void E8(){
       a tr;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          s c = this.r.c;
          Float uFloat = PatchProxy.applyOneRefs(c, objArray, uoa, "5");
          if (uFloat != patchProxyRe) {
          }else {
             float f = 0x3f800000;
             if (c == null) {
                uFloat = Float.valueOf(f);
             }else {
                ImageMeta$AtlasCoverSize mHeight = c.mHeight;
                tr = null;
                float f1 = (mHeight - tr)? c.mWidth / mHeight: 0x3f800000;
                if (f1 - tr) {
                   f = f1;
                }
                uFloat = Float.valueOf(f);
             }
          }
          int i = n.y(this.getContext());
          int i1 = (int)((float)i / uFloat.floatValue());
          a tp = this.p;
          tr = this.r;
          Objects.requireNonNull(tr);
          CDNUrl[] uCDNUrlArray = PatchProxy.apply(objArray, tr, s.class, "1");
          if (uCDNUrlArray == patchProxyRe) {
             s b = tr.b;
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[b.size()];
             uCDNUrlArray = b.toArray(uCDNUrlArray1);
          }
          tp.V(uCDNUrlArray, i, i1);
       }
       ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
       layoutParams.width = a1.e(36.00f);
       layoutParams.height = a1.e(48.00f);
       this.p.setLayoutParams(layoutParams);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a148e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.q = this.r8("DOWNLOAD_PHOTO");
       this.r = this.q8(s.class);
       return;
    }
}
