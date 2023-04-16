package ek.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import r0.a;
import android.graphics.drawable.Drawable;
import ek.b;

public class a	// class@001f51
{

    public static ColorStateList a(Context p0,TypedArray p1,int p2){
       if (p1.hasValue(p2)) {
          int resourceId = p1.getResourceId(p2, 0);
          if (resourceId) {
             ColorStateList uColorStateL = a.c(p0, resourceId);
             if (uColorStateL != null) {
                return uColorStateL;
             }
          }
       }
       return p1.getColorStateList(p2);
    }
    public static Drawable b(Context p0,TypedArray p1,int p2){
       if (p1.hasValue(p2)) {
          int resourceId = p1.getResourceId(p2, 0);
          if (resourceId) {
             Drawable uDrawable = a.d(p0, resourceId);
             if (uDrawable != null) {
                return uDrawable;
             }
          }
       }
       return p1.getDrawable(p2);
    }
    public static int c(TypedArray p0,int p1,int p2){
       if (p0.hasValue(p1)) {
          return p1;
       }
       return p2;
    }
    public static b d(Context p0,TypedArray p1,int p2){
       if (p1.hasValue(p2)) {
          int resourceId = p1.getResourceId(p2, 0);
          if (resourceId) {
             return new b(p0, resourceId);
          }
       }
       return null;
    }
}
