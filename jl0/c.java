package jl0.c;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import jl0.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ha1.b;
import com.kuaishou.live.ad.social.y;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import lnc.y0;
import jl0.b;
import android.view.ViewOutlineProvider;
import com.google.gson.JsonObject;
import i93.j;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarItemChangeReason;

public final class c implements LiveLiteBottomBarService$a	// class@002bc3
{
    public boolean a;
    public boolean b;
    public View c;
    public y d;
    public final LiveLiteBottomBarService$BottomBarType e;
    public final a f;

    public void c(LiveLiteBottomBarService$BottomBarType p0,a p1){
       a.p(p0, "type");
       a.p(p1, "onRealShowListener");
       super();
       this.e = p0;
       this.f = p1;
    }
    public View a(Context p0){
       c tc;
       c uoc = c.class;
       y obj = PatchProxy.applyOneRefs(p0, this, uoc, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       if (this.c == null) {
          View view = b.b(p0, R.layout.arg_RES_7f0d0ad1);
          this.c = view;
          obj = new y();
          this.d = obj;
          obj.a(view);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, uoc, "2")) {
             uoc = this.c;
             if (uoc instanceof ViewGroup) {
                tc = uoc;
             }
             if (objArray != null) {
                view = objArray.getChildAt(0);
                if (view != null) {
                   ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                   if (layoutParams != null) {
                      int i = y0.l(R.dimen.arg_RES_7f07030d);
                      layoutParams.width = i;
                      layoutParams.height = i;
                      c tc1 = this.c;
                      if (tc1 != null) {
                         tc1.setLayoutParams(layoutParams);
                      }
                   }
                   view.setClipToOutline(true);
                   view.setOutlineProvider(new b());
                }
             }
             this.e(this.b);
          }
       }
       tc = this.c;
       a.m(tc);
       return tc;
    }
    public JsonObject b(){
       return j.a(this);
    }
    public boolean c(){
       return j.e(this);
    }
    public JsonObject d(){
       return j.b(this);
    }
    public final void e(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "7")) {
          return;
       }
       this.b = p0;
       uoc = this.d;
       if (uoc != null) {
          int i = (p0)? 0x7f0601aa: 0x7f060610;
          i = y0.k(i);
          y oy = y.class;
          if (!PatchProxy.isSupport(oy) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uoc, oy, "5")) {
             uoc.a.setBackgroundColor(i);
          }
       }
       return;
    }
    public void f(LiveLiteBottomBarService$BottomBarItemChangeReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       a.p(p0, "reason");
       j.d(this, p0);
       this.e(this.b);
       c td = this.d;
       if (td != null) {
          td.d();
       }
       if (this.a == null) {
          this.f.J1();
          this.a = true;
       }
       return;
    }
    public void g(LiveLiteBottomBarService$BottomBarItemChangeReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       a.p(p0, "reason");
       j.c(this, p0);
       this.a = false;
       c td = this.d;
       if (td != null) {
          td.e();
       }
       this.f.D();
       return;
    }
    public LiveLiteBottomBarService$BottomBarType getType(){
       return this.e;
    }
    public boolean i(){
       return j.f(this);
    }
}
