package b53.s;
import com.kuaishou.live.gzone.barrage.BarrageView;
import z1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.FrameLayout;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Math;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Float;
import java.lang.Integer;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import android.graphics.Typeface;
import lnc.a1;
import java.util.Objects;
import android.text.TextPaint;
import ekd.b;

public class s	// class@000324
{
    public BarrageView a;
    public int b;
    public int c;
    public int d;
    public a e;

    public void s(BarrageView p0,a p1){
       super();
       this.a = p0;
       this.e = p1;
    }
    public float a(){
       Object obj = PatchProxy.apply(null, this, s.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.a.getAlpha();
    }
    public final int b(){
       Object[] objArray;
       Activity obj = PatchProxy.apply(null, this, s.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = n.d(this.a);
       int i = 0;
       if (obj != null) {
          int i1 = Math.min(n.j(obj), n.k(obj)) / (this.a.getLineHeight() + this.a.getLineVerticalSpacing());
          objArray = new Object[i];
          a.C().s("BarrageSettingHelper", "getMaxLineCount: "+i1, objArray);
          return i1;
       }else {
          objArray = new Object[i];
          a.C().t("BarrageSettingHelper", "getMaxLineCount error! failed to get context", objArray);
          return 1;
       }
    }
    public boolean c(){
       boolean b = (this.b == null)? true: false;
       return b;
    }
    public void d(float p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, os, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("BarrageSettingHelper", "setAlpha: "+p0, objArray);
       this.a.setAlpha(p0);
       return;
    }
    public void e(int p0){
       SharedPreferences a;
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, os, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("BarrageSettingHelper", "setAreaSize: "+p0, objArray);
       int i = 1;
       if (p0) {
          int i1 = 3;
          if (p0 != i) {
             if (p0 != 2) {
                this.a.i(i1);
                p0 = 1;
             }else {
                this.a.i(this.b());
             }
          }else {
             this.a.i(i1);
          }
       }
       os = this.b;
       this.b = p0;
       if (os != p0) {
          this.e.accept(Integer.valueOf(p0));
       }
       a = a.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putInt("live_barrage_setting_area_model", p0);
       g.a(uEditor);
       if (p0) {
          SharedPreferences$Editor uEditor1 = a.edit();
          uEditor1.putInt("live_open_barrage_setting_area_model", p0);
          g.a(uEditor1);
       }
       return;
    }
    public void f(int p0){
       int i4;
       int i5;
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, os, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().s("BarrageSettingHelper", "setFontSizeModel: "+p0, objArray);
       int i1 = 24;
       Typeface dEFAULT_BOLD = Typeface.DEFAULT_BOLD;
       int i2 = 18;
       int i3 = 15;
       if (p0) {
          if (p0 != 1) {
             if (p0 != 3) {
                if (p0 != 4) {
                   p0 = 2;
                   i4 = 40;
                   i2 = 15;
                }else {
                   i1 = 32;
                   i4 = 60;
                   i2 = 21;
                   i3 = 21;
                }
             }else {
                i1 = 28;
                i4 = 50;
                i3 = 18;
             }
          }else {
             i4 = 30;
             i2 = 12;
             i3 = 12;
             i5 = 3;
          label_007c :
             this.d = p0;
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putInt("live_barrage_setting_font_size_model", p0);
             g.a(uEditor);
             s ta = this.a;
             i1 = a1.e((float)i1);
             i5 = a1.e((float)i5);
             i4 = a1.e((float)i4);
             Objects.requireNonNull(ta);
             if (PatchProxy.isSupport(BarrageView.class)) {
                Object[] objArray1 = new Object[]{Integer.valueOf(i1),Integer.valueOf(i5),Integer.valueOf(i4),Integer.valueOf(i2),dEFAULT_BOLD,Integer.valueOf(i3)};
                if (PatchProxy.applyVoid(objArray1, ta, BarrageView.class, "26")) {
                label_0107 :
                   if (this.b == 2) {
                      this.a.i(this.b());
                   }
                   return;
                }
             }
             ta.setLineHeight(i1);
             ta.o = i5;
             ta.p = i4;
             float f = (float)i2;
             if (PatchProxy.isSupport(BarrageView.class) && PatchProxy.applyOneRefs(Float.valueOf(f), ta, BarrageView.class, "24") != PatchProxyResult.class) {
             }else {
                ta.r = f;
                ta.w.setTextSize((float)a1.e(f));
             }
             ta.s = i3;
             goto label_0107 ;
          }
       }else {
          i1 = 19;
          i4 = 20;
          i2 = 10;
          i3 = 10;
       }
       i5 = 5;
       goto label_007c ;
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "6")) {
          return;
       }
       if (this.b == null) {
          this.a.f();
       }else {
          s ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, BarrageView.class, "14") && (ta.getVisibility() || (!ta.A.isAlive() && !PatchProxy.applyVoid(objArray, ta, BarrageView.class, "13")))) {
             ta.setVisibility(0);
             if (!PatchProxy.applyVoid(objArray, ta, BarrageView.class, "17") && (!ta.getVisibility() && !ta.A.isAlive())) {
                ta.A.start();
             }
          }
       }
       return;
    }
}
