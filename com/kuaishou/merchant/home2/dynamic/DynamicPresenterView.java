package com.kuaishou.merchant.home2.dynamic.DynamicPresenterView;
import ho4.q;
import oy3.b;
import android.widget.FrameLayout;
import android.content.Context;
import hx3.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import zw3.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.ArrayList;
import android.view.View;
import xm4.a;
import android.view.ViewGroup;

public class DynamicPresenterView extends FrameLayout implements q, b	// class@0016fc
{
    public final PresenterV2 b;
    public PresenterV2 c;
    public HashMap d;

    public void DynamicPresenterView(Context p0,o p1){
       super(p0);
       PresenterV2 presenterV2 = new PresenterV2();
       this.b = presenterV2;
       if (a.t().d("merchantHomeAgileLocalOptimizeCode", false)) {
          boolean i = p1.n();
          c uoc = c.class;
          if (PatchProxy.isSupport(uoc)) {
             Object obj = PatchProxy.applyOneRefs(Integer.valueOf(i), null, uoc, "3");
             if (obj != PatchProxyResult.class) {
                i = obj.booleanValue();
             label_0045 :
                if (!i) {
                   this.addView(a.a(p0, p1.n()));
                label_005a :
                   PresenterV2 presenterV21 = p1.a();
                   this.c = presenterV21;
                   if (presenterV21 != null) {
                      presenterV2.U7(presenterV21);
                   }
                   presenterV2.f(this);
                   return;
                }
             }
          }
          i = c.a.contains(Integer.valueOf(i));
          goto label_0045 ;
       }
       a.b(p0, p1.n(), this);
       goto label_005a ;
    }
    public void G4(){
       if (PatchProxy.applyVoid(null, this, DynamicPresenterView.class, "4")) {
          return;
       }
       DynamicPresenterView tc = this.c;
       if (tc != null && tc instanceof b) {
          tc.G4();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, DynamicPresenterView.class, "3")) {
          return;
       }
       this.b.destroy();
       return;
    }
    public final PresenterV2 getRootPresenter(){
       return this.b;
    }
    public void p7(){
       if (PatchProxy.applyVoid(null, this, DynamicPresenterView.class, "5")) {
          return;
       }
       DynamicPresenterView tc = this.c;
       if (tc != null && tc instanceof b) {
          tc.p7();
       }
       return;
    }
}
