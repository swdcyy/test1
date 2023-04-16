package com.kwai.nearby.local.presenter.secondary.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.nearby.local.presenter.secondary.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.q;
import qvb.j;
import com.yxcorp.gifshow.nearby.common.model.CommonBtnModel;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn;
import com.yxcorp.gifshow.util.w0;
import sc7.i0;

public class c extends PresenterV2	// class@000fd2
{
    public final q A;
    public KwaiImageView p;
    public KwaiImageView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public View u;
    public View v;
    public KwaiImageView w;
    public NearbyCommonRvBtn x;
    public RecyclerFragment y;
    public i0 z;

    public void c(){
       super();
       this.A = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.y.q().h(this.A);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.y.q().f(this.A);
       return;
    }
    public final String P8(CommonBtnModel p0){
       i3 obj = PatchProxy.applyOneRefs(p0, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("button_content", p0.mText);
       obj.d("button_name", p0.mLogName);
       return obj.e();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1257);
       this.q = m1.f(p0, 0x7f0a1262);
       this.r = m1.f(p0, 0x7f0a127c);
       this.v = m1.f(p0, 0x7f0a3cf6);
       this.w = m1.f(p0, 0x7f0a3ce9);
       this.s = m1.f(p0, 0x7f0a1278);
       this.t = m1.f(p0, 0x7f0a3d2a);
       this.u = m1.f(p0, 0x7f0a3bb1);
       this.x = m1.f(p0, 0x7f0a2d7e);
       w0.a(this.v, 0x3f000000);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.y = this.r8("FRAGMENT");
       this.z = this.r8("PAGE_LIST");
       return;
    }
}
