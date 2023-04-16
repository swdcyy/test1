package com.kwai.live.gzone.accompanyplay.anchor.x;
import ml8.d;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.PopupWindow;
import android.app.Activity;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import java.lang.String;
import mrd.a;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import i2b.a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.Exception;
import com.kwai.live.gzone.accompanyplay.anchor.u;
import android.view.View$OnTouchListener;
import h37.w;
import android.view.View$OnClickListener;
import ekd.m1;
import h37.x;
import h37.y;
import h37.z;
import h37.v;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public class x extends PopupWindow implements d, PopupWindow$OnDismissListener	// class@000b3e
{
    public Activity b;
    public LiveGzoneAccompanyFleetInfo c;
    public View d;
    public String e;
    public String f;
    public c g;
    public c h;
    public View i;
    public View j;
    public a k;
    public static final int l;

    public void x(Activity p0,LiveGzoneAccompanyFleetInfo p1,String p2,String p3,a p4){
       int i;
       super(p0);
       this.b = p0;
       this.c = p1;
       this.e = p2;
       this.f = p3;
       this.k = p4;
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "8")) {
       }else {
          View view = a.a(p0, R.layout.arg_RES_7f0d0b79);
          this.d = view;
          this.doBindView(view);
          LiveGzoneAccompanyFleetInfo mAccompanySt = this.c.mAccompanyStatus;
          if (mAccompanySt == 4 || mAccompanySt == 3) {
             this.i.setVisibility(0);
             this.j.setVisibility(0);
          }else {
             i = 8;
             this.i.setVisibility(i);
             this.j.setVisibility(i);
          }
          this.setContentView(this.d);
       }
       i = 1;
       if (!PatchProxy.applyVoid(null, this, x.class, "9")) {
          this.setWidth(-2);
          this.setHeight(-2);
          this.setTouchable(i);
          this.setOutsideTouchable(i);
          this.setFocusable(i);
          this.setBackgroundDrawable(new ColorDrawable(0));
       }
       if (!PatchProxy.isSupport(x.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, this, x.class, "7")) {
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = Boolean.TYPE;
             Method declaredMeth = PopupWindow.class.getDeclaredMethod("setTouchModal", uClassArray);
             declaredMeth.setAccessible(i);
             Object[] objArray = new Object[i];
             objArray[0] = Boolean.FALSE;
             declaredMeth.invoke(this, objArray);
          }catch(java.lang.Exception e2){
             e2.printStackTrace();
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
          return;
       }
       m1.a(p0, new w(this), R.id.live_gzone_anchor_accompany_history_tv);
       m1.a(p0, new x(this), R.id.live_gzone_anchor_accompany_rule_tv);
       m1.a(p0, new y(this), R.id.live_gzone_anchor_accompany_fleet_dismiss_tv);
       m1.a(p0, new z(this), R.id.live_gzone_anchor_accompany_cancel_order_tv);
       m1.a(p0, new v(this), R.id.live_gzone_anchor_accompany_violation_history_tv);
       this.i = m1.f(p0, 0x7f0a1ddc);
       this.j = m1.f(p0, 0x7f0a1dd8);
       return;
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, x.class, "12")) {
          return;
       }
       x tg = this.g;
       if (tg != null) {
          tg.o();
          this.g = null;
       }
       tg = this.h;
       if (tg != null) {
          tg.o();
          this.h = null;
       }
       return;
    }
    public void showAsDropDown(View p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "11")) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(p0, this, x.class, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          b = false;
          if (p0 != null && this.d != null) {
             x tb = this.b;
             if (tb != null && (!tb.isFinishing() && !this.b.isDestroyed())) {
                b = true;
             }
          }
       }
       if (!b) {
          return;
       }else {
          this.showAsDropDown(p0, (- a1.e(48.00f)), (p0.getHeight() - a1.e(20.00f)));
          return;
       }
    }
}
