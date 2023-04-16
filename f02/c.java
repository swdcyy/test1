package f02.c;
import pq1.b;
import lu1.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import nsd.u;
import kotlin.NoWhenBranchMatchedException;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import bld.b;
import bld.c;
import android.graphics.drawable.Drawable;

public final class c	// class@002265
{

    public static final r a(b p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoc, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "lineCellInfo");
       r or = c.c(p1);
       if (c.d(p0)) {
          or.j(1);
       }else {
          or.j(0);
       }
       return or;
    }
    public static final r b(b p0,boolean p1){
       b a;
       float f;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "lineCellInfo");
       boolean b = c.d(p0);
       r or = c.c(p1);
       if (!p1) {
          if (b) {
             or.j(1);
          }else {
             or.j(0);
          }
       }else {
          or.j(1);
       }
       if (p0.b - 0x3c23d70a <= 0) {
          a = p0.a;
          if (a > 0 && (a + p0.c) - 0x3f7d70a4 < 0) {
             f = 0.30f;
          label_0058 :
             or.i(f);
             return or;
          }
       }
       f = 0x3f800000;
       goto label_0058 ;
    }
    public static final r c(boolean p0){
       int i = p0;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uoc, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (i == 1) {
          r or = new r(a1.e(16.00f), 9.00f, KwaiRadiusStyles.R2, a1.e(4.00f), 0, 0, a1.e(6.00f), a1.e(24.00f), 48, null);
       }else if(!i){
          r or1 = new r(a1.e(20.00f), 11.00f, KwaiRadiusStyles.R4, a1.e(6.00f), 0, 0, a1.e(6.00f), a1.e(0x41f00000), 48, null);
       }else {
          throw new NoWhenBranchMatchedException();
       }
       return i;
    }
    public static final boolean d(b p0){
       boolean b = (p0.a - 0x3efae148 >= 0)? true: false;
       return b;
    }
    public static final void e(r p0,TextView p1){
       int i;
       ViewGroup$LayoutParams layoutParams1;
       c uoc = c.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, uoc, "1")) {
          return;
       }
       a.p(p0, "userTagStyle");
       a.p(p1, "userTagView");
       if (!PatchProxy.applyVoidTwoRefs(p1, p0, obj, uoc, "2")) {
          ViewGroup$LayoutParams layoutParams = p1.getLayoutParams();
          layoutParams.height = p0.d();
          if (layoutParams instanceof RelativeLayout$LayoutParams) {
             i = 21;
             if (p0.e() == 1) {
                layoutParams1 = layoutParams;
                layoutParams1.addRule(i);
                layoutParams1.removeRule(20);
             }else {
                layoutParams1 = layoutParams;
                layoutParams1.addRule(20);
                layoutParams1.removeRule(i);
             }
          }else if(layoutParams instanceof FrameLayout$LayoutParams){
             layoutParams1 = layoutParams;
             i = (p0.e() == 1)? 0x800035: 0x800033;
             layoutParams1.gravity = i;
          }
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             layoutParams1 = layoutParams;
             layoutParams1.setMarginStart(p0.f());
             layoutParams1.setMarginEnd(p0.f());
             layoutParams1.topMargin = p0.f();
          }
          p1.setLayoutParams(layoutParams);
       }
       p1.setPadding(p0.g(), 0, p0.g(), 0);
       p1.setMinWidth(p0.a());
       b uob = new b();
       uob.g(p0.b());
       uob.v(a1.a(R.color.arg_RES_7f060292));
       p1.setBackground(uob.a());
       p1.setAlpha(p0.c());
       p1.setTextSize(1, p0.h());
       return;
    }
}
