package abc.i;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideConfig;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import v6d.a;
import xf6.i;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import wb5.g;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import lnc.a1;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideBannerView;
import android.content.Context;
import com.yxcorp.gifshow.relation.intimate.dialog.f;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$a;
import android.view.ViewGroup$LayoutParams;
import abc.j;
import android.view.View$OnClickListener;
import abc.k;
import abc.i$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.library.widget.popup.common.c;
import java.lang.Integer;
import k2b.e0;
import cbc.b;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView;

public class i extends e	// class@0000d4
{
    public IntimateGuideConfig m;
    public ViewGroup n;
    public ViewGroup o;
    public KwaiImageView p;
    public TextView q;
    public IntimateGuideBannerView r;

    public void i(GifshowActivity p0,IntimateRelationDialogParams p1,PopupInterface$h p2){
       super(p0, p1, p2);
       this.m = a.t().getValue("intimateGuideConfig", IntimateGuideConfig.class, null);
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!a.g() || i.c("ENABLE_SHOW_INTIMATE_GUIDE_FORCE")) {
          return true;
       }
       this.d();
       return false;
    }
    public int f(){
       return 0x7f0d0640;
    }
    public void h(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0b5b);
       i tm = this.m;
       if (tm != null && !TextUtils.x(tm.mBgUrl)) {
          this.p.M(this.m.mBgUrl, null);
       }
       return;
    }
    public void l(KwaiImageView p0,boolean p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi, "3")) {
          return;
       }
       g.a(p0, QCurrentUser.me(), HeadImageSize.ADJUST_BIG);
       this.d.setBackground(this.e(-1));
       return;
    }
    public void m(KwaiImageView p0,boolean p1){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, i.class, "2")) {
          return;
       }
       p0.setImageResource(R.drawable.arg_RES_7f082204);
       this.e.setBackground(this.e(-1));
       return;
    }
    public void p(View p0){
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "1")) {
          return;
       }
       this.h(p0);
       IntimateRelationDialogParams mTitle = (!TextUtils.x(this.i.mTitle))? this.i.mTitle: a1.p(R.string.arg_RES_7f100d94);
       this.o(p0, mTitle);
       this.n = m1.f(p0, 0x7f0a3553);
       this.o = m1.f(p0, 0x7f0a355c);
       this.q = m1.f(p0, 0x7f0a3bd1);
       boolean b = false;
       this.k(p0, b);
       if (!PatchProxy.applyVoidOneRefs(p0, this, oi, "5") && !PatchProxy.applyVoidOneRefs(p0, this, oi, "6")) {
          this.o.setVisibility(8);
          this.n.setVisibility(b);
          LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, -2);
          layoutParams.gravity = 17;
          IntimateGuideBannerView intimateGuid = new IntimateGuideBannerView(p0.getContext(), this.m, new f(this));
          this.r = intimateGuid;
          this.n.addView(intimateGuid, layoutParams);
          if (!PatchProxy.applyVoid(null, this, oi, "7")) {
             m1.f(this.n, R.id.left_btn).setOnClickListener(new j(this));
             m1.f(this.n, R.id.right_btn).setOnClickListener(new k(this));
          }
       }
       m1.b(p0, new i$a(this), R.id.close_btn);
       return;
    }
    public void s(c p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi, "11")) {
          return;
       }
       if (p1) {
          b.j(this.g, "CLOSE");
       }
       super.s(p0, p1);
       return;
    }
    public void u(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "10")) {
          return;
       }
       b.k(this.g, true, false, this.i.mTargetId);
       a.m(true);
       return;
    }
    public void v(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "9")) {
          return;
       }
       this.r.setMDisableAutoScroll(false);
       this.r.m();
       return;
    }
}
