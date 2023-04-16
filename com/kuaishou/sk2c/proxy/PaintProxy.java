package com.kuaishou.sk2c.proxy.PaintProxy;
import java.lang.Object;
import android.graphics.Paint;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Typeface;
import java.lang.Integer;
import java.lang.Float;
import com.kuaishou.sk2c.proxy.ProxyUtil;
import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import android.graphics.Shader;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import java.lang.CharSequence;
import android.text.TextUtils;

public class PaintProxy	// class@000f36
{

    public void PaintProxy(){
       super();
    }
    public static float ascent(Paint p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PaintProxy.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return p0.ascent();
    }
    public static void reset(Paint p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PaintProxy.class, "1")) {
          return;
       }
       p0.reset();
       p0.setTypeface(p0.getTypeface());
       p0.setAntiAlias(true);
       return;
    }
    public static void setAlpha(Paint p0,int p1){
       PaintProxy paintProxy = PaintProxy.class;
       if (PatchProxy.isSupport(paintProxy) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, paintProxy, "4")) {
          return;
       }
       p0.setAlpha(p1);
       return;
    }
    public static void setColor(Paint p0,int p1){
       PaintProxy paintProxy = PaintProxy.class;
       if (PatchProxy.isSupport(paintProxy) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, paintProxy, "7")) {
          return;
       }
       p0.setColor(p1);
       return;
    }
    public static void setLetterSpace(Paint p0,float p1){
       PaintProxy paintProxy = PaintProxy.class;
       if (PatchProxy.isSupport(paintProxy) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), null, paintProxy, "13")) {
          return;
       }
       p0.setLetterSpacing(p1);
       return;
    }
    public static void setPathEffect(Paint p0,float[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PaintProxy.class, "14")) {
          return;
       }
       for (int i = 0; i < p1.length; i = i + 1) {
          p1[i] = (float)ProxyUtil.dip2px(p1[i]);
       }
       p0.setPathEffect(new DashPathEffect(p1, 0));
       return;
    }
    public static Shader setShader(Paint p0,Shader p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PaintProxy.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.setShader(p1);
    }
    public static void setShadowLayer(Paint p0,float p1,float p2,float p3,int p4){
       PaintProxy paintProxy = PaintProxy.class;
       if (PatchProxy.isSupport(paintProxy)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, paintProxy, "10")) {
             return;
          }
       }
       p0.setShadowLayer(p1, (float)ProxyUtil.dip2px(p2), (float)ProxyUtil.dip2px(p3), p4);
       return;
    }
    public static void setStrokeCap(Paint p0,Paint$Cap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PaintProxy.class, "8")) {
          return;
       }
       p0.setStrokeCap(p1);
       return;
    }
    public static void setStrokeJoin(Paint p0,Paint$Join p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PaintProxy.class, "9")) {
          return;
       }
       p0.setStrokeJoin(p1);
       return;
    }
    public static void setStrokeWidth(Paint p0,float p1){
       PaintProxy paintProxy = PaintProxy.class;
       if (PatchProxy.isSupport(paintProxy) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), null, paintProxy, "6")) {
          return;
       }
       p0.setStrokeWidth((float)ProxyUtil.dip2px(p1));
       return;
    }
    public static void setStyle(Paint p0,Paint$Style p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PaintProxy.class, "2")) {
          return;
       }
       p0.setStyle(p1);
       return;
    }
    public static void setTextSize(Paint p0,float p1){
       PaintProxy paintProxy = PaintProxy.class;
       if (PatchProxy.isSupport(paintProxy) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), null, paintProxy, "5")) {
          return;
       }
       p0.setTextSize((float)ProxyUtil.dip2px(p1));
       return;
    }
    public static void setTypeface(Paint p0,String p1,int p2){
       if (PatchProxy.isSupport(PaintProxy.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, PaintProxy.class, "12")) {
          return;
       }
       try{
          Typeface typeface = p0.getTypeface();
          if (!TextUtils.isEmpty(p1)) {
             typeface = Typeface.createFromFile(p1);
          }
          p0.setTypeface(Typeface.create(e0, p2));
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
