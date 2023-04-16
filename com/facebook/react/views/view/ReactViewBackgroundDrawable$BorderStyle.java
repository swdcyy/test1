package com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderStyle;
import java.lang.Enum;
import java.lang.String;
import android.graphics.PathEffect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.views.view.ReactViewBackgroundDrawable$a;
import android.graphics.DashPathEffect;

public final class ReactViewBackgroundDrawable$BorderStyle extends Enum	// class@001437
{
    public static final ReactViewBackgroundDrawable$BorderStyle[] $VALUES;
    public static final ReactViewBackgroundDrawable$BorderStyle DASHED;
    public static final ReactViewBackgroundDrawable$BorderStyle DOTTED;
    public static final ReactViewBackgroundDrawable$BorderStyle SOLID;

    static {
       ReactViewBackgroundDrawable$BorderStyle uBorderStyle = new ReactViewBackgroundDrawable$BorderStyle("SOLID", 0);
       ReactViewBackgroundDrawable$BorderStyle.SOLID = uBorderStyle;
       ReactViewBackgroundDrawable$BorderStyle uBorderStyle1 = new ReactViewBackgroundDrawable$BorderStyle("DASHED", 1);
       ReactViewBackgroundDrawable$BorderStyle.DASHED = uBorderStyle1;
       ReactViewBackgroundDrawable$BorderStyle uBorderStyle2 = new ReactViewBackgroundDrawable$BorderStyle("DOTTED", 2);
       ReactViewBackgroundDrawable$BorderStyle.DOTTED = uBorderStyle2;
       ReactViewBackgroundDrawable$BorderStyle[] uBorderStyle3 = new ReactViewBackgroundDrawable$BorderStyle[]{uBorderStyle,uBorderStyle1,uBorderStyle2};
       ReactViewBackgroundDrawable$BorderStyle.$VALUES = uBorderStyle3;
    }
    public void ReactViewBackgroundDrawable$BorderStyle(String p0,int p1){
       super(p0, p1);
    }
    public static PathEffect getPathEffect(ReactViewBackgroundDrawable$BorderStyle p0,float p1){
       ReactViewBackgroundDrawable$BorderStyle uBorderStyle = ReactViewBackgroundDrawable$BorderStyle.class;
       float[] obj = null;
       if (PatchProxy.isSupport(uBorderStyle)) {
          Object obj1 = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), obj, uBorderStyle, "3");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       int i = ReactViewBackgroundDrawable$a.a[p0.ordinal()];
       int i1 = 4;
       if (i != 2) {
          if (i != 3) {
             return obj;
          }else {
             obj = new float[i1];
             obj[0] = p1;
             obj[1] = p1;
             obj[2] = p1;
             obj[3] = p1;
             return new DashPathEffect(obj, 0);
          }
       }else {
          obj = new float[i1];
          p1 = p1 * 3.00f;
          obj[0] = p1;
          obj[1] = p1;
          obj[2] = p1;
          obj[3] = p1;
          return new DashPathEffect(obj, 0);
       }
    }
    public static ReactViewBackgroundDrawable$BorderStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReactViewBackgroundDrawable$BorderStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ReactViewBackgroundDrawable$BorderStyle.class, p0);
    }
    public static ReactViewBackgroundDrawable$BorderStyle[] values(){
       Object obj = PatchProxy.apply(null, null, ReactViewBackgroundDrawable$BorderStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReactViewBackgroundDrawable$BorderStyle.$VALUES.clone();
    }
}
