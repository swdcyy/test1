package com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment$a;
import com.yxcorp.gifshow.fragment.f;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import d77.h;
import lnc.a1;
import java.lang.CharSequence;
import java.lang.Throwable;
import java.lang.Boolean;
import g9c.d;
import qvb.a;
import com.yxcorp.retrofit.model.KwaiException;
import d77.f;
import android.view.View$OnClickListener;
import com.kwai.library.widget.refresh.RefreshLayout;
import f37.n0;
import d77.e;

public class LiveGzoneAccompanyPlayTogetherFragment$a extends f	// class@000df9
{
    public View l;
    public final LiveGzoneAccompanyPlayTogetherFragment m;

    public void LiveGzoneAccompanyPlayTogetherFragment$a(LiveGzoneAccompanyPlayTogetherFragment p0,RecyclerFragment p1){
       this.m = p0;
       super(p1);
    }
    public View J0(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, LiveGzoneAccompanyPlayTogetherFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          this.l = super.J0();
          obj = KwaiEmptyStateView.e();
          obj.b();
          obj.k(R.drawable.arg_RES_7f080603);
          String str = this.m.J.i2();
          if (str != null) {
             Object[] objArray = new Object[]{str};
             obj.i(String.format(a1.p(R.string.arg_RES_7f10237e), objArray));
          }
          obj.a(this.l);
       }
       return this.l;
    }
    public KwaiEmptyStateView$a c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAccompanyPlayTogetherFragment$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KwaiEmptyStateView$a uoa = super.c(p0);
       uoa.b();
       return uoa;
    }
    public void k(boolean p0,Throwable p1){
       LiveGzoneAccompanyPlayTogetherFragment$a uoa = LiveGzoneAccompanyPlayTogetherFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       uoa = this.m;
       if (uoa.G != null) {
          uoa.ia().m1(this.m.G);
          this.m.G = null;
       }
       this.m.L.setVisibility(8);
       this.f();
       this.x();
       View view = this.n();
       int i = 0x7f080609;
       if (p0 && (this.m.J.isEmpty() && (p1 instanceof KwaiException && p1.mErrorCode == 109))) {
          KwaiEmptyStateView$a uoa1 = this.c("");
          uoa1.k(i);
          uoa1.j(2);
          uoa1.h(R.string.arg_RES_7f1030ae);
          uoa1.e(R.string.arg_RES_7f103059);
          uoa1.p(new f(this));
          uoa1.a(view);
          this.a.K(view);
          return;
       }else {
          KwaiEmptyStateView$a uoa2 = KwaiEmptyStateView.e();
          uoa2.k(i);
          uoa2.j(n0.a(p1));
          uoa2.p(new e(this));
          uoa2.a(view);
          this.a.K(view);
          super.k(p0, p1);
          return;
       }
    }
}
