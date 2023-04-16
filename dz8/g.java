package dz8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dz8.g$a;
import nsd.u;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverItem;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import im8.f;
import java.lang.Number;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class g extends PresenterV2	// class@00210c
{
    public PhotoAdvertisement$CoverItem p;
    public f q;
    public f r;
    public KwaiImageView s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final int w;
    public static final g$a x;

    static {
       g.x = new g$a(null);
       g.t = a1.e(260.00f);
       g.u = a1.e(146.00f);
       g.v = a1.e(146.00f);
       g.w = a1.e(260.00f);
    }
    public void g(){
       super();
    }
    public void E8(){
       int b;
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "3")) {
          return;
       }
       g ts = this.s;
       if (ts == null) {
          a.S("mIvCover");
       }
       g tp = this.p;
       if (tp == null) {
          a.S("mCoverItem");
       }
       ts.L(tp.mUrl);
       if (!PatchProxy.applyVoid(objArray, this, og, "4")) {
          ts = this.s;
          if (ts == null) {
             a.S("mIvCover");
          }
          ViewGroup$LayoutParams layoutParams = ts.getLayoutParams();
          if (layoutParams != null) {
             Object obj = PatchProxy.apply(objArray, this, og, "5");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                og = this.q;
                if (og == null) {
                   a.S("mCoverHeight");
                }
                b = og.get().intValue();
                g tr = this.r;
                if (tr == null) {
                   a.S("mCoverWidth");
                }
                Object obj1 = tr.get();
                a.o(obj1, "mCoverWidth.get\(\)");
                if (b > obj1.intValue()) {
                   b = true;
                }else {
                   b = false;
                }
             }
             if (b) {
                layoutParams.width = g.u;
                layoutParams.height = g.t;
             }else {
                layoutParams.width = g.w;
                layoutParams.height = g.v;
             }
             og = this.s;
             if (og == null) {
                a.S("mIvCover");
             }
             og.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.iv_cover);
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, R.id.iv_cover\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       f obj = this.q8(PhotoAdvertisement$CoverItem.class);
       a.o(obj, "inject\(CoverItem::class.java\)");
       this.p = obj;
       obj = this.x8("HALF_LANDING_PAGE_COVER_HEIGHT");
       a.o(obj, "injectRef\(AccessIds.HALF¡­ANDING_PAGE_COVER_HEIGHT\)");
       this.q = obj;
       obj = this.x8("HALF_LANDING_PAGE_COVER_WIDTH");
       a.o(obj, "injectRef\(AccessIds.HALF_LANDING_PAGE_COVER_WIDTH\)");
       this.r = obj;
       return;
    }
}
