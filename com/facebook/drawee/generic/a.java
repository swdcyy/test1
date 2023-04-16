package com.facebook.drawee.generic.a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.generic.RoundingParams;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import xb.o;
import android.graphics.Bitmap;
import android.graphics.Paint;
import xb.n;
import android.graphics.drawable.NinePatchDrawable;
import xb.r;
import xb.p;
import java.lang.Object;
import java.lang.String;
import cb.a;
import xb.e;
import kd.b;
import com.facebook.drawee.generic.RoundingParams$RoundingMethod;
import xb.i;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import xb.t$b;
import android.graphics.PointF;
import xb.s;

public class a	// class@001090
{
    public static final Drawable a;

    static {
       a.a = new ColorDrawable(0);
    }
    public static Drawable a(Drawable p0,RoundingParams p1,Resources p2){
       if (p0 instanceof BitmapDrawable) {
          o oo = new o(p2, p0.getBitmap(), p0.getPaint());
          a.b(oo, p1);
          return oo;
       }else if(p0 instanceof NinePatchDrawable){
          r or = new r(p0);
          a.b(or, p1);
          return or;
       }else if(p0 instanceof ColorDrawable){
          p op = p.c(p0);
          a.b(op, p1);
          return op;
       }else {
          Object[] objArray = new Object[]{p0};
          a.z("WrappingUtils", "Don\'t know how to round that drawable: %s", objArray);
          return p0;
       }
    }
    public static void b(n p0,RoundingParams p1){
       p0.a(p1.h());
       p0.l(p1.e());
       p0.setBorder(p1.d(), p1.e);
       p0.b(p1.g);
       p0.t(p1.h);
       p0.o(p1.i);
    }
    public static e c(e p0){
       Drawable uDrawable = p0.p();
       while (uDrawable != p0 && uDrawable instanceof e) {
          Drawable uDrawable1 = uDrawable;
       }
       return p0;
    }
    public static Drawable d(Drawable p0,RoundingParams p1,Resources p2){
       if (b.d()) {
          b.a("WrappingUtils#maybeApplyLeafRounding");
       }
       if (p0 != null && (p1 == null || p1.i() != RoundingParams$RoundingMethod.BITMAP_ONLY)) {
          if (b.d()) {
             b.b();
          }
          return p0;
       }else if(p0 instanceof i){
          e uoe = a.c(p0);
          uoe.k(a.a(uoe.k(a.a), p1, p2));
          if (b.d()) {
             b.b();
          }
          return p0;
       }else {
          p0 = a.a(p0, p1, p2);
          if (b.d()) {
             b.b();
          }
          return p0;
       }
    }
    public static Drawable e(Drawable p0,RoundingParams p1){
       if (b.d()) {
          b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
       }
       if (p0 != null && (p1 == null || p1.i() != RoundingParams$RoundingMethod.OVERLAY_COLOR)) {
          if (b.d()) {
             b.b();
          }
          return p0;
       }else {
          RoundedCornersDrawable roundedCorne = new RoundedCornersDrawable(p0);
          a.b(roundedCorne, p1);
          roundedCorne.w(p1.g());
          if (b.d()) {
             b.b();
          }
          return roundedCorne;
       }
    }
    public static Drawable f(Drawable p0,t$b p1){
       return a.g(p0, p1, null);
    }
    public static Drawable g(Drawable p0,t$b p1,PointF p2){
       if (b.d()) {
          b.a("WrappingUtils#maybeWrapWithScaleType");
       }
       if (p0 == null || p1 == null) {
          if (b.d()) {
             b.b();
          }
          return p0;
       }else {
          s os = new s(p0, p1);
          if (p2 != null) {
             os.z(p2);
          }
          if (b.d()) {
             b.b();
          }
          return os;
       }
    }
}
