package o1.f;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import o1.f$a;
import android.os.Handler;
import java.lang.Object;
import z1.h;
import android.content.res.Resources$NotFoundException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Integer;
import java.lang.CharSequence;
import p1.e;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import o1.c$a;
import o1.c;

public final class f	// class@002745
{

    public static int a(Resources p0,int p1,Resources$Theme p2){
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.getColor(p1, null);
       }
       return p0.getColor(p1);
    }
    public static ColorStateList b(Resources p0,int p1,Resources$Theme p2){
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.getColorStateList(p1, null);
       }
       return p0.getColorStateList(p1);
    }
    public static Drawable c(Resources p0,int p1,Resources$Theme p2){
       return p0.getDrawable(p1, p2);
    }
    public static Typeface d(Context p0,int p1){
       if (p0.isRestricted()) {
          return null;
       }
       return f.g(p0, p1, new TypedValue(), 0, null, null, false, false);
    }
    public static Typeface e(Context p0,int p1,TypedValue p2,int p3,f$a p4){
       if (p0.isRestricted()) {
          return null;
       }
       return f.g(p0, p1, p2, p3, p4, null, true, false);
    }
    public static void f(Context p0,int p1,f$a p2,Handler p3){
       h.g(p2);
       if (p0.isRestricted()) {
          p2.a(-4, null);
          return;
       }else {
          f.g(p0, p1, new TypedValue(), 0, p2, null, false, false);
          return;
       }
    }
    public static Typeface g(Context p0,int p1,TypedValue p2,int p3,f$a p4,Handler p5,boolean p6,boolean p7){
       Resources resources = p0.getResources();
       resources.getValue(p1, p2, true);
       Typeface typeface = f.h(p0, resources, p2, p1, p3, p4, p5, p6, p7);
       if (typeface == null && (p4 != null || p7)) {
          return typeface;
       }
       throw new Resources$NotFoundException("Font resource ID #0x"+Integer.toHexString(p1)+" could not be retrieved.");
    }
    public static Typeface h(Context p0,Resources p1,TypedValue p2,int p3,int p4,f$a p5,Handler p6,boolean p7,boolean p8){
       int i = p4;
       f$a uoa = p5;
       Handler handler = p6;
       TypedValue string = p2.string;
       if (string == null) {
          throw new Resources$NotFoundException("Resource \""+p1.getResourceName(p3)+"\" \("+Integer.toHexString(p3)+"\) is not a Font: "+p2);
       }
       String str = string.toString();
       if (!str.startsWith("res/")) {
          if (uoa) {
             uoa.a(-3, handler);
          }
          return null;
       }else {
          Typeface typeface = e.f(p1, p3, i);
          if (typeface != null) {
             if (uoa != null) {
                uoa.b(typeface, handler);
             }
             return typeface;
          }else if(p8){
             return null;
          }else if((str.toLowerCase()).endsWith(".xml")){
             c$a uoa1 = c.b(p1.getXml(p3), p1);
             if (uoa1 == null) {
                if (uoa != null) {
                   uoa.a(-3, handler);
                }
                return null;
             }else {
                return e.c(p0, uoa1, p1, p3, p4, p5, p6, p7);
             }
          }else {
             Typeface typeface1 = e.d(p0, p1, p3, str, i);
             if (uoa != null) {
                if (typeface1 != null) {
                   uoa.b(typeface1, handler);
                }else {
                   uoa.a(-3, handler);
                }
             }
             return typeface1;
          }
       }
    }
}
