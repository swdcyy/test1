package cx0.b;
import ks5.b;
import cx0.b$a;
import nsd.u;
import va1.n0;
import lnc.a1;
import android.content.Context;
import com.kuaishou.live.authentication.LiveAudienceAuthorAuthenticationTopPendantInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ks5.a;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import i2b.a;
import cx0.c;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import cx0.d;
import com.yxcorp.gifshow.model.CDNUrl;
import cx0.b$b;
import android.widget.ImageView;
import cx0.e;
import ks5.e;
import ks5.d;
import cx0.b$c;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.widget.LivePkShimmerLayout;

public abstract class b implements b	// class@001e8f
{
    public ViewGroup a;
    public KwaiImageView b;
    public KwaiImageView c;
    public LivePkShimmerLayout d;
    public int e;
    public boolean f;
    public final Context g;
    public final LiveAudienceAuthorAuthenticationTopPendantInfo h;
    public static final int i;
    public static final int[] j;
    public static final float[] k;
    public static final b$a l;

    static {
       b.l = new b$a(null);
       b.i = n0.e() + a1.d(0x7f0708a3);
       int[] ointArray = new int[]{0,a1.a(0x7f061e54),a1.a(0x7f060620),a1.a(0x7f061e54),0};
       b.j = ointArray;
       b.k = new float[5]{0x3e800000,0x3eb33333,0x3f000000,0x3f266666,0x3f400000};
    }
    public void b(Context p0,LiveAudienceAuthorAuthenticationTopPendantInfo p1){
       a.p(p0, "context");
       a.p(p1, "pendantInfo");
       super();
       this.g = p0;
       this.h = p1;
    }
    public void D(){
       a.d(this);
    }
    public void a(int p0){
       a.f(this, p0);
    }
    public View b(ViewGroup p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       b obj = PatchProxy.applyOneRefs(p0, this, uob, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "parent");
       obj = this.a;
       if (obj != null) {
          return obj;
       }
       View view = PatchProxy.applyOneRefs(p0, this, uob, "8");
       if (view != patchProxyRe) {
       }else {
          View view1 = a.i(p0, R.layout.arg_RES_7f0d09eb);
          a.o(view1, "KwaiLayoutInflater.infla¡­ntication_pendant_layout\)");
          view = view1;
          view.setOnClickListener(new c(this));
          this.c = m1.f(view, 0x7f0a1911);
          this.b = m1.f(view, 0x7f0a1910);
          b th = this.h;
          if (!PatchProxy.applyVoidOneRefs(th, this, uob, "1")) {
             b ta = this.a;
             int i = 0;
             if (ta != null) {
                ta.setVisibility(i);
             }
             this.e = i;
             LiveAudienceAuthorAuthenticationTopPendantInfo mBeforeLinka = th.mBeforeLinkageImgUrl;
             a.o(mBeforeLinka, "pendantInfo.mBeforeLinkageImgUrl");
             this.t(this.c, mBeforeLinka, new d(this));
             ta = this.b;
             if (ta != null) {
                ta.setTranslationY((float)b.i);
             }
             LiveAudienceAuthorAuthenticationTopPendantInfo mAfterLinkag = th.mAfterLinkageImgUrl;
             a.o(mAfterLinkag, "pendantInfo.mAfterLinkageImgUrl");
             this.t(this.b, mAfterLinkag, new e(this));
          }
       }
       this.a = view;
       return view;
    }
    public boolean c(){
       return d.a(this);
    }
    public void d(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       a.p(p0, "parent");
       d.b(this, p0);
       this.f = true;
       this.u();
       return;
    }
    public void e(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       a.p(p0, "parent");
       d.c(this, p0);
       this.f = false;
       this.w();
       return;
    }
    public int getBizId(){
       return 22;
    }
    public boolean i(){
       return a.c(this);
    }
    public String k(){
       return a.a(this);
    }
    public void onShow(){
       a.e(this);
    }
    public int[] p(){
       return a.b(this);
    }
    public final void t(KwaiImageView p0,CDNUrl[] p1,b$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "11")) {
          return;
       }
       if (p0 == null) {
          p2.b();
          return;
       }else {
          p0.a0(p1, new b$c(p0, p2));
          return;
       }
    }
    public abstract void u();
    public abstract void v();
    public final void w(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.clearAnimation();
       }
       tb = this.d;
       if (tb != null) {
          tb.n();
       }
       return;
    }
}
