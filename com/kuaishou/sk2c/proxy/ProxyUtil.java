package com.kuaishou.sk2c.proxy.ProxyUtil;
import java.lang.Object;
import android.graphics.Paint;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.sk2c.graphics.LPaint;
import android.graphics.Shader;
import java.lang.Float;
import java.lang.Number;
import java.lang.RuntimeException;

public class ProxyUtil	// class@000f38
{
    public static float sDensity;

    public void ProxyUtil(){
       super();
    }
    public static boolean checkHasShadowAndGradient(Paint p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ProxyUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 instanceof LPaint) {
          boolean b1 = p0.hasShadowLayerL();
          int i = (p0.getShader() != null)? 1: 0;
          if (i && b1) {
             b = true;
          }
       }
    label_002f :
       return b;
    }
    public static int dip2px(float p0){
       ProxyUtil proxyUtil = ProxyUtil.class;
       if (PatchProxy.isSupport(proxyUtil)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, proxyUtil, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       float sDensity = ProxyUtil.sDensity;
       if (sDensity > 0) {
          return (int)((p0 * sDensity) + 0x3f000000);
       }else {
          throw new RuntimeException("sDensity does not init!");
       }
    }
    public static void initDensity(float p0){
       if (ProxyUtil.sDensity <= 0) {
          ProxyUtil.sDensity = p0;
       }
       return;
    }
}
