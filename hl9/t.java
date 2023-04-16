package hl9.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewStub;
import android.content.Context;
import java.lang.Number;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import android.graphics.Color;
import ekd.r;
import java.lang.Boolean;
import zf6.k;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import androidx.core.widget.b;
import nx9.c;
import com.yxcorp.gifshow.widget.FasterTextView;
import com.lsjwzh.widget.text.FastTextView;
import android.text.TextPaint;
import java.lang.CharSequence;

public final class t extends PresenterV2	// class@0026de
{
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;

    static {
       t.p = a1.d(0x7f070271);
       t.q = a1.d(0x7f070267);
       t.r = a1.d(0x7f070356);
       t.s = a1.d(0x7f070267);
       t.t = a1.d(0x7f07033f);
    }
    public void t(){
       super();
    }
    public static View P8(View p0,int p1){
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ot, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = p0.findViewById(p1);
       if (p0 instanceof ViewStub) {
          return null;
       }else {
          return p0;
       }
    }
    public static int R8(Context p0,int p1,int p2){
       if (PatchProxy.isSupport(t.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, t.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (t.W8(p0)) {
          p1 = p2;
       }
       return p1;
    }
    public static ColorStateList S8(Context p0,int p1){
       int[] obj;
       int[] ointArray1;
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ot, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int color = ContextCompat.getColor(p0, p1);
       p1 = r.d((int)(((double)Color.alpha(color) * 0x3fe0000000000000) + 0x3fe0000000000000), color);
       int[][] ointArray = new int[][5]{ointArray1,ointArray1,ointArray1,ointArray1,ointArray1};
       ointArray1 = new int[]{-16842910};
       ointArray1 = new int[]{0x10100a7};
       ointArray1 = new int[]{0x10100a1};
       ointArray1 = new int[]{0x10100a0};
       ointArray1 = new int[0];
       obj = new int[]{p1,p1,p1,p1,color};
       return new ColorStateList(ointArray, obj);
    }
    public static boolean V8(){
       Object obj = PatchProxy.apply(null, null, t.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!k.d() || k.g())? true: false;
       return b;
    }
    public static boolean W8(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, t.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return t.V8();
       }
       boolean b = (ContextCompat.getColor(p0, 0x7f061be2) == -1)? true: false;
       return b;
    }
    public static void X8(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, t.class, "16")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Drawable[] compoundDraw = p0.getCompoundDrawables();
       if (compoundDraw != null && compoundDraw.length == 4) {
          compoundDraw[0].setTint(ContextCompat.getColor(p0.getContext(), R.color.arg_RES_7f060817));
          compoundDraw[0].setBounds(0, 1, a1.e(11.70f), a1.e(11.70f));
          p0.setCompoundDrawables(compoundDraw[0], compoundDraw[1], compoundDraw[2], compoundDraw[3]);
       }
       return;
    }
    public static void Y8(TextView p0,int p1,int p2){
       if (PatchProxy.isSupport(t.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, t.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Drawable[] compoundDraw = p0.getCompoundDrawables();
       if (compoundDraw[p1] != null) {
          a.n(compoundDraw[p1], p2);
       }
       p0.setCompoundDrawables(compoundDraw[0], compoundDraw[1], compoundDraw[2], compoundDraw[3]);
       return;
    }
    public static void Z8(TextView p0,int p1,ColorStateList p2){
       if (PatchProxy.isSupport(t.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, t.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Drawable[] compoundDraw = p0.getCompoundDrawables();
       if (compoundDraw[p1] != null) {
          a.o(compoundDraw[p1], p2);
       }
       p0.setCompoundDrawables(compoundDraw[0], compoundDraw[1], compoundDraw[2], compoundDraw[3]);
       return;
    }
    public static void a9(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, t.class, "17")) {
          return;
       }
       t.b9(p0, true);
       return;
    }
    public static void b9(View p0,boolean p1){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ot, "18")) {
          return;
       }
       float f = 13.00f;
       if (!PatchProxy.isSupport(ot) || (!PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(f), Boolean.valueOf(p1), null, t.class, "19") && p0 != null)) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.height = -2;
          p0.setLayoutParams(layoutParams);
          p0.setMinimumHeight(n.c(p0.getContext(), f));
          int paddingLeft = p0.getPaddingLeft();
          int i = (p1)? n.c(p0.getContext(), 0x3f000000): 0;
          p0.setPadding(paddingLeft, i, p0.getPaddingRight(), 0);
       }
       return;
    }
    public static void c9(TextView p0,ColorStateList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, t.class, "7")) {
          return;
       }
       t.d9(p0, p1, true);
       return;
    }
    public static void d9(TextView p0,ColorStateList p1,boolean p2){
       if (PatchProxy.isSupport(t.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, t.class, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setTextColor(p1);
       if (p2) {
          b.j(p0, p1);
       }
       return;
    }
    public static void e9(View p0,ColorStateList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, t.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (c.f() && p0 instanceof FasterTextView) {
          p0.setTextColor(p1);
       }else {
          p0.setTextColor(p1);
       }
       return;
    }
    public static void h9(View p0,boolean p1){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ot, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (c.f() && p0 instanceof FasterTextView) {
          p0.getPaint().setFakeBoldText(p1);
       }else {
          p0.getPaint().setFakeBoldText(p1);
       }
       return;
    }
    public static void j9(View p0,int p1){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, ot, "5")) {
          return;
       }
       if (c.f() && p0 instanceof FasterTextView) {
          p0.setMinimumWidth(p1);
       }else {
          p0.setMinWidth(p1);
       }
       return;
    }
    public static void k9(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, t.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (c.f() && p0 instanceof FasterTextView) {
          p0.setText(p1);
       }else {
          p0.setText(p1);
       }
       return;
    }
    public static void l9(View p0,int p1){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, ot, "24")) {
          return;
       }
       p0 = p0.findViewById(p1);
       if (p0 instanceof ViewStub) {
          p0.inflate();
       }
       return;
    }
}
