package com.kuaishou.live.common.core.component.multipk.playfashion.cohesiontip.LiveMultiPkCohesionBangsTipVC;
import ws1.e;
import com.kuaishou.live.viewcontroller.ViewController;
import zs1.b;
import ft1.b;
import com.yxcorp.gifshow.models.Gift;
import ws1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.playfashion.cohesiontip.LiveMultiPkCohesionBangsTipVC$bangsViewModel$2;
import com.kuaishou.live.common.core.component.multipk.playfashion.cohesiontip.LiveMultiPkCohesionBangsTipVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import mt1.a;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.playfashion.cohesiontip.LiveMultiPkCohesionBangsTipVC$$special$$inlined$viewModels$2;
import msd.a;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import lt1.d;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.util.AttributeSet;
import nsd.u;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import qrd.l1;
import java.lang.StringBuilder;
import lt1.c;
import java.lang.Boolean;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import androidx.lifecycle.LifecycleOwner;
import xh3.b;
import ut1.a;
import wt1.a;
import android.view.View$OnClickListener;
import ws1.d;
import com.kuaishou.live.common.core.component.multipk.container.LiveMultiPKAreaType;

public final class LiveMultiPkCohesionBangsTipVC extends ViewController implements e	// class@001657
{
    public final p j;
    public View k;
    public KwaiCDNImageView l;
    public final b m;
    public final b n;
    public final Gift o;
    public final c p;

    public void LiveMultiPkCohesionBangsTipVC(b p0,b p1,Gift p2,c p3){
       a.p(p0, "coreModel");
       a.p(p1, "gameModel");
       a.p(p2, "gift");
       a.p(p3, "pkContainerLayout");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.j = new ViewModelLazy(m0.d(a.class), new LiveMultiPkCohesionBangsTipVC$$special$$inlined$viewModels$2(new LiveMultiPkCohesionBangsTipVC$$special$$inlined$viewModels$1(this)), new LiveMultiPkCohesionBangsTipVC$bangsViewModel$2(this));
    }
    public View B1(ViewGroup p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMultiPkCohesionBangsTipVC liveMultiPkC = LiveMultiPkCohesionBangsTipVC.class;
       View obj = PatchProxy.applyOneRefs(p0, this, liveMultiPkC, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "parentViewGroup");
       LiveMultiPkCohesionBangsTipVC tk = this.k;
       if (tk != null) {
          return tk;
       }
       Object[] objArray = null;
       obj = PatchProxy.apply(objArray, this, liveMultiPkC, "5");
       if (obj != patchProxyRe) {
       }else {
          String str1 = a1.p(R.string.arg_RES_7f102c25);
          a.o(str1, "CommonUtil.string\(R.string.live_send_someone\)");
          TextView textView = d.d(this.D2(), str1);
          KwaiCDNImageView kwaiCDNImage = new KwaiCDNImageView(this.D2(), objArray, 2, objArray);
          kwaiCDNImage.setLayoutParams(new ViewGroup$LayoutParams(a1.e(16.00f), a1.e(16.00f)));
          this.l = kwaiCDNImage;
          obj = c.d(c.d(c.d(new c(this.D2()), textView, objArray, 2, objArray), this.l, objArray, 2, objArray), d.d(this.D2(), this.o.mName+" "+a1.p(R.string.arg_RES_7f101f95)), objArray, 2, objArray).e();
       }
       this.k = obj;
       a uoa = PatchProxy.apply(objArray, this, liveMultiPkC, "1");
       if (uoa == patchProxyRe) {
          uoa = this.j.getValue();
       }
       if (!PatchProxy.applyVoidOneRefs(uoa, this, liveMultiPkC, "6")) {
          LiveMultiPkCohesionBangsTipVC tl = this.l;
          if (tl != null) {
             b.b(tl, this, uoa.u0());
          }
          uoa = this.n.q();
          if (uoa != null) {
             String str = uoa.b();
             if (str != null) {
                tl = this.k;
                if (tl != null) {
                   tl.setOnClickListener(new a(str, this));
                }
             }
          }
       }
    label_00e9 :
       return obj;
    }
    public void D(){
       d.a(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkCohesionBangsTipVC.class, "2")) {
          return;
       }
       this.p.w(this);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkCohesionBangsTipVC.class, "3")) {
          return;
       }
       this.p.n(this);
       return;
    }
    public int getPriority(){
       return 3;
    }
    public void onShow(){
       d.b(this);
    }
    public LiveMultiPKAreaType w1(){
       return LiveMultiPKAreaType.BANGS;
    }
}
