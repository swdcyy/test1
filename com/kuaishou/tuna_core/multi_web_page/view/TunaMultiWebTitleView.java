package com.kuaishou.tuna_core.multi_web_page.view.TunaMultiWebTitleView;
import d05.a;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_core.multi_web_page.view.TunaMultiWebTitleView$mSelectedColor$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna_core.multi_web_page.view.TunaMultiWebTitleView$mUnSelectedColor$2;
import android.graphics.drawable.GradientDrawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import qrd.l1;
import android.view.View;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo$TabInfo;
import java.lang.Integer;
import android.content.Context;
import ekd.p1;
import android.widget.TextView;
import java.lang.Boolean;
import java.lang.CharSequence;

public final class TunaMultiWebTitleView implements a	// class@0010fe
{
    public View a;
    public TextView b;
    public View c;
    public int d;
    public boolean e;
    public final p f;
    public final p g;
    public final GradientDrawable h;
    public final Activity i;

    public void TunaMultiWebTitleView(Activity p0){
       float f1;
       a.p(p0, "context");
       super();
       this.i = p0;
       this.d = -1;
       this.f = s.c(new TunaMultiWebTitleView$mSelectedColor$2(this));
       this.g = s.c(new TunaMultiWebTitleView$mUnSelectedColor$2(this));
       GradientDrawable gradientDraw = new GradientDrawable();
       TunaMultiWebTitleView tunaMultiWeb = TunaMultiWebTitleView.class;
       float f = 0x3f800000;
       if (PatchProxy.isSupport(tunaMultiWeb)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(f), this, tunaMultiWeb, "7");
          if (obj != PatchProxyResult.class) {
             f1 = obj.floatValue();
          label_005b :
             gradientDraw.setCornerRadius(f1);
             gradientDraw.setColor(this.g());
             this.h = gradientDraw;
             return;
          }
       }
       Resources resources = p0.getResources();
       a.o(resources, "context.resources");
       f1 = 0x3f000000 + (f * c.c(resources).density);
       goto label_005b ;
    }
    public View a(){
       return this.a;
    }
    public View b(TunaMultiWebConfigInfo$TabInfo p0,int p1){
       String obj;
       TunaMultiWebTitleView tunaMultiWeb = TunaMultiWebTitleView.class;
       if (PatchProxy.isSupport(tunaMultiWeb)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, tunaMultiWeb, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "tabInfo";
       try{
          a.p(p0, obj);
          this.a = p1.g(this.i, 0x7f0d1644);
       }catch(java.lang.Exception e0){
       }
       this.d = p1;
       TunaMultiWebTitleView ta = this.a;
       if (ta != null) {
          this.b = ta.findViewById(0x7f0a40b5);
          this.c = ta.findViewById(0x7f0a40b6);
          if (!PatchProxy.isSupport(e0) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.FALSE, this, TunaMultiWebTitleView.class, "4")) {
             TunaMultiWebTitleView tb = this.b;
             if (tb != null) {
                tb.setGravity(17);
                tb.setText(p0.title);
             }
             this.c(false);
          }
       }
       return this.a;
    }
    public void c(boolean p0){
       int i;
       TunaMultiWebTitleView tunaMultiWeb = TunaMultiWebTitleView.class;
       if (PatchProxy.isSupport(tunaMultiWeb) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tunaMultiWeb, "6")) {
          return;
       }
       this.e = p0;
       if (p0) {
          i = this.g();
       }else {
          Number number = PatchProxy.apply(null, this, tunaMultiWeb, "2");
          if (number == PatchProxyResult.class) {
             number = this.g.getValue();
          }
          i = number.intValue();
       }
       int i1 = (p0)? 0: 4;
       TunaMultiWebTitleView tb = this.b;
       if (tb != null) {
          tb.setTextColor(i);
       }
       tunaMultiWeb = this.c;
       if (tunaMultiWeb != null) {
          tunaMultiWeb.setVisibility(i1);
       }
       return;
    }
    public boolean d(){
       return this.e;
    }
    public void e(int p0){
       TunaMultiWebTitleView tunaMultiWeb = TunaMultiWebTitleView.class;
       if (PatchProxy.isSupport(tunaMultiWeb) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tunaMultiWeb, "5")) {
          return;
       }
       tunaMultiWeb = this.c;
       if (tunaMultiWeb != null) {
          tunaMultiWeb.setVisibility(p0);
       }
       return;
    }
    public final Activity f(){
       return this.i;
    }
    public final int g(){
       Object obj = PatchProxy.apply(null, this, TunaMultiWebTitleView.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.f.getValue();
       }
       return obj.intValue();
    }
    public int getPos(){
       return this.d;
    }
}
