package com.yxcorp.gifshow.util.c;
import android.app.Activity;
import java.lang.Object;
import lnc.c;
import android.content.res.Resources$Theme;
import android.content.res.TypedArray;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.utility.Log;
import joc.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.StringBuilder;

public class c	// class@001f5f
{
    public final Activity a;
    public Boolean b;
    public int c;
    public final s$b d;
    public static final boolean e;

    static {
       c.e = true;
    }
    public void c(Activity p0){
       super();
       this.c = 0;
       this.d = new c(this);
       this.a = p0;
    }
    public boolean a(){
       int i = 0;
       int i1 = 1;
       if (this.b == null) {
          int[] ointArray = new int[i1];
          ointArray[i] = 0x1010058;
          TypedArray typedArray = this.a.getTheme().obtainStyledAttributes(ointArray);
          this.b = Boolean.valueOf(typedArray.getBoolean(i, i));
          typedArray.recycle();
       }
       if (this.b.booleanValue()) {
          Log.g("ActivityOpacityHelper", "convertToTranslucent\(\) isTranslucentTheme");
          return i1;
       }else if(!c.e){
          Log.g("ActivityOpacityHelper", "convertToTranslucent\(\) SDK NOT ENABLE");
          return i;
       }else {
          int i2 = 2;
          String str = "convertToTranslucent\(\) state=";
          if (this.c == null) {
             this.c = i1;
             c ta = this.a;
             c td = this.d;
             if (s.c == null) {
                s.a();
             }
             try{
                s.f = new WeakReference(td);
                Object[] objArray = new Object[i];
                Object[] objArray1 = new Object[i2];
                objArray1[i] = s.e;
                objArray1[i1] = s.d.invoke(ta, objArray);
                s.c.invoke(ta, objArray1);
                Log.g("ActivityOpacityHelper", str+this.c);
                return i;
             }catch(java.lang.Exception e0){
             }
          }else {
             Log.g("ActivityOpacityHelper", str+this.c);
             if (this.c == i2) {
                i = true;
             }
             return i;
          }
       }
    }
}
