package com.kuaishou.growth.pendant.debugtool.entry.DebugToolEntryView;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewConfiguration;
import java.util.Objects;
import android.view.WindowManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.view.WindowManager$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import com.yxcorp.utility.n;
import ne0.a;
import android.app.Application;
import o56.a;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.view.MotionEvent;
import java.lang.Math;

public final class DebugToolEntryView extends FrameLayout implements View$OnClickListener	// class@000659
{
    public final int b;
    public final WindowManager c;
    public WindowManager$LayoutParams d;
    public float e;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public a j;
    public boolean k;

    public void DebugToolEntryView(Context p0){
       super(p0, null, 2, null);
    }
    public void DebugToolEntryView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       a.o(viewConfigur, "ViewConfiguration.get\(context\)");
       this.b = viewConfigur.getScaledTouchSlop();
       p0 = p0.getSystemService("window");
       Objects.requireNonNull(p0, "null cannot be cast to non-null type android.view.WindowManager");
       this.c = p0;
       if (PatchProxy.applyVoid(null, this, DebugToolEntryView.class, "1")) {
       }else {
          a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d079b, this, true);
          this.setOnClickListener(this);
       }
       return;
    }
    public void DebugToolEntryView(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
    public final WindowManager$LayoutParams a(){
       WindowManager$LayoutParams obj = PatchProxy.apply(null, this, DebugToolEntryView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new WindowManager$LayoutParams();
       obj.type = (Build$VERSION.SDK_INT >= 26)? 2038: 2002;
       obj.format = 1;
       obj.flags = 8;
       obj.gravity = 51;
       obj.width = -2;
       obj.height = -2;
       obj.x = 0;
       obj.y = n.c(this.getContext(), 50.00f);
       return obj;
    }
    public void onClick(View p0){
       a obj;
       int b;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, DebugToolEntryView.class, "3")) {
          return;
       }
       a.p(p0, "v");
       if (this.j == null) {
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          this.j = new a(uApplication);
       }
       DebugToolEntryView tj = this.j;
       if (tj != null) {
          Object[] objArray = null;
          int i = 1;
          if (tj.h != null) {
             obj = PatchProxy.apply(objArray, tj, uoa, "6");
             int i1 = 0;
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                obj = tj.b;
                if (obj == null) {
                   a.S("mDTPageView");
                }
                if (!obj.getVisibility()) {
                   b = 1;
                }else {
                   b = 0;
                }
             }
             b = b ^ i;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tj, uoa, "5")) {
                a b1 = tj.b;
                if (b1 == null) {
                   a.S("mDTPageView");
                }
                if (!b) {
                   i1 = 8;
                }
                b1.setVisibility(i1);
             }
          }else if(PatchProxy.applyVoid(objArray, tj, uoa, "4") || tj.h != null){
             uoa = tj.g;
             obj = tj.b;
             if (obj == null) {
                a.S("mDTPageView");
             }
             uoa.addView(obj, tj.a());
             tj.h = i;
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       DebugToolEntryView obj = PatchProxy.applyOneRefs(p0, this, DebugToolEntryView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       int action = p0.getAction();
       boolean b = false;
       if (action) {
          if (action != 1) {
             if (action == 2) {
                float f = p0.getRawY() - this.h;
                if (Math.abs((p0.getRawX() - this.g)) - (float)this.b > 0 || Math.abs(f) - (float)this.b > 0) {
                   this.g = p0.getRawX();
                   this.h = p0.getRawY();
                   this.i = true;
                   if (!PatchProxy.applyVoid(null, this, DebugToolEntryView.class, "4") && this.d == null) {
                      ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
                      Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                      this.d = layoutParams;
                   }
                   DebugToolEntryView td = this.d;
                   a.m(td);
                   obj = this.d;
                   a.m(obj);
                   td.y = obj.y + (int)f;
                   this.c.updateViewLayout(this, this.d);
                   return true;
                }
             }
          }else if(this.i != null){
             this.i = b;
             return true;
          }
       }else {
          this.e = p0.getRawX();
          this.f = p0.getRawY();
          this.g = p0.getRawX();
          this.h = p0.getRawY();
          this.i = b;
          this.bringToFront();
       }
       return super.onTouchEvent(p0);
    }
}
