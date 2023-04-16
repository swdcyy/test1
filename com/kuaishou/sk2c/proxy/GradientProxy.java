package com.kuaishou.sk2c.proxy.GradientProxy;
import java.lang.Object;
import android.graphics.Shader$TileMode;
import android.graphics.LinearGradient;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.sk2c.proxy.ProxyUtil;
import android.graphics.RadialGradient;

public class GradientProxy	// class@000f35
{

    public void GradientProxy(){
       super();
    }
    public static LinearGradient newLinearGradient(float p0,float p1,float p2,float p3,int[] p4,float[] p5,Shader$TileMode p6){
       Object obj;
       GradientProxy gradientProx = GradientProxy.class;
       if (PatchProxy.isSupport(gradientProx)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),p4,p5,p6};
          obj = PatchProxy.apply(objArray, null, gradientProx, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       LinearGradient linearGradie = new LinearGradient((float)ProxyUtil.dip2px(p0), (float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2), (float)ProxyUtil.dip2px(p3), p4, p5, p6);
       return obj;
    }
    public static RadialGradient newRadialGradient(float p0,float p1,float p2,int[] p3,float[] p4,Shader$TileMode p5){
       Object obj;
       GradientProxy gradientProx = GradientProxy.class;
       if (PatchProxy.isSupport(gradientProx)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),p3,p4,p5};
          obj = PatchProxy.apply(objArray, null, gradientProx, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       RadialGradient radialGradie = new RadialGradient((float)ProxyUtil.dip2px(p0), (float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2), p3, p4, p5);
       return obj;
    }
}
