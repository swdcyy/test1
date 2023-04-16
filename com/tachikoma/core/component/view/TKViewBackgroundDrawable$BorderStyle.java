package com.tachikoma.core.component.view.TKViewBackgroundDrawable$BorderStyle;
import java.lang.Enum;
import java.lang.String;
import android.graphics.PathEffect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable$a;
import android.graphics.DashPathEffect;

public final class TKViewBackgroundDrawable$BorderStyle extends Enum	// class@000db3
{
    public static final TKViewBackgroundDrawable$BorderStyle[] $VALUES;
    public static final TKViewBackgroundDrawable$BorderStyle DASHED;
    public static final TKViewBackgroundDrawable$BorderStyle DOTTED;
    public static final TKViewBackgroundDrawable$BorderStyle SOLID;

    static {
       TKViewBackgroundDrawable$BorderStyle uBorderStyle = new TKViewBackgroundDrawable$BorderStyle("SOLID", 0);
       TKViewBackgroundDrawable$BorderStyle.SOLID = uBorderStyle;
       TKViewBackgroundDrawable$BorderStyle uBorderStyle1 = new TKViewBackgroundDrawable$BorderStyle("DASHED", 1);
       TKViewBackgroundDrawable$BorderStyle.DASHED = uBorderStyle1;
       TKViewBackgroundDrawable$BorderStyle uBorderStyle2 = new TKViewBackgroundDrawable$BorderStyle("DOTTED", 2);
       TKViewBackgroundDrawable$BorderStyle.DOTTED = uBorderStyle2;
       TKViewBackgroundDrawable$BorderStyle[] uBorderStyle3 = new TKViewBackgroundDrawable$BorderStyle[]{uBorderStyle,uBorderStyle1,uBorderStyle2};
       TKViewBackgroundDrawable$BorderStyle.$VALUES = uBorderStyle3;
    }
    public void TKViewBackgroundDrawable$BorderStyle(String p0,int p1){
       super(p0, p1);
    }
    public static PathEffect getPathEffect(TKViewBackgroundDrawable$BorderStyle p0,float p1){
       TKViewBackgroundDrawable$BorderStyle uBorderStyle = TKViewBackgroundDrawable$BorderStyle.class;
       float[] obj = null;
       if (PatchProxy.isSupport(uBorderStyle)) {
          Object obj1 = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), obj, uBorderStyle, "3");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       int i = TKViewBackgroundDrawable$a.a[p0.ordinal()];
       int i1 = 0;
       int i2 = 2;
       if (i != 1) {
          if (i != i2) {
             return obj;
          }else {
             obj = new float[]{p1,p1,p1,p1};
             return new DashPathEffect(obj, 0);
          }
       }else {
          obj = new float[i2];
          obj[i1] = 2.00f * p1;
          obj[1] = p1;
          return new DashPathEffect(obj, 0);
       }
    }
    public static TKViewBackgroundDrawable$BorderStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TKViewBackgroundDrawable$BorderStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TKViewBackgroundDrawable$BorderStyle.class, p0);
    }
    public static TKViewBackgroundDrawable$BorderStyle[] values(){
       Object obj = PatchProxy.apply(null, null, TKViewBackgroundDrawable$BorderStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TKViewBackgroundDrawable$BorderStyle.$VALUES.clone();
    }
}
