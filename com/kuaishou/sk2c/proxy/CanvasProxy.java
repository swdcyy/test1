package com.kuaishou.sk2c.proxy.CanvasProxy;
import java.util.WeakHashMap;
import java.lang.Object;
import android.graphics.Canvas;
import android.graphics.Path;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Region$Op;
import java.lang.Float;
import android.graphics.Rect;
import com.kuaishou.sk2c.proxy.ProxyUtil;
import android.graphics.Paint;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.RectF;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class CanvasProxy	// class@000f34
{
    public static WeakHashMap sBitmapWeakCache;

    static {
       CanvasProxy.sBitmapWeakCache = new WeakHashMap();
    }
    public void CanvasProxy(){
       super();
    }
    public static void clipOutPath(Canvas p0,Path p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, CanvasProxy.class, "15")) {
          return;
       }
       p0.clipPath(p1, Region$Op.DIFFERENCE);
       return;
    }
    public static void clipOutRect(Canvas p0,float p1,float p2,float p3,float p4){
       CanvasProxy uCanvasProxy = CanvasProxy.class;
       if (PatchProxy.isSupport(uCanvasProxy)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uCanvasProxy, "17")) {
             return;
          }
       }
       p0.clipRect(new Rect(ProxyUtil.dip2px(p1), ProxyUtil.dip2px(p2), ProxyUtil.dip2px(p3), ProxyUtil.dip2px(p4)), Region$Op.DIFFERENCE);
       return;
    }
    public static void clipPath(Canvas p0,Path p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, CanvasProxy.class, "14")) {
          return;
       }
       p0.clipPath(p1);
       return;
    }
    public static void clipRect(Canvas p0,float p1,float p2,float p3,float p4){
       CanvasProxy uCanvasProxy = CanvasProxy.class;
       if (PatchProxy.isSupport(uCanvasProxy)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uCanvasProxy, "16")) {
             return;
          }
       }
       p0.clipRect(new Rect(ProxyUtil.dip2px(p1), ProxyUtil.dip2px(p2), ProxyUtil.dip2px(p3), ProxyUtil.dip2px(p4)));
       return;
    }
    public static void drawBitmap(Canvas p0,String p1,float p2,float p3,float p4,float p5,float p6,float p7,float p8,float p9,Paint p10){
       CanvasProxy uCanvasProxy = CanvasProxy.class;
       if (PatchProxy.isSupport(uCanvasProxy)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Float.valueOf(p2);
          objArray[3] = Float.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Float.valueOf(p5);
          objArray[6] = Float.valueOf(p6);
          objArray[7] = Float.valueOf(p7);
          objArray[8] = Float.valueOf(p8);
          objArray[9] = Float.valueOf(p9);
          objArray[10] = p10;
          if (PatchProxy.applyVoid(objArray, null, uCanvasProxy, "12")) {
             return;
          }
       }
       if (TextUtils.isEmpty(p1)) {
          return;
       }else {
          Bitmap uBitmap = CanvasProxy.sBitmapWeakCache.get(p1);
          if (uBitmap == null) {
             uBitmap = BitmapFactory.decodeFile(p1);
             if (uBitmap == null) {
                return;
             }else {
                CanvasProxy.sBitmapWeakCache.put(p1, uBitmap);
             }
          }
          p0.drawBitmap(uBitmap, new Rect((int)p2, (int)p3, (int)p4, (int)p5), new Rect(ProxyUtil.dip2px(p6), ProxyUtil.dip2px(p7), ProxyUtil.dip2px(p8), ProxyUtil.dip2px(p9)), p10);
          return;
       }
    }
    public static void drawBitmap(Canvas p0,String p1,float p2,float p3,float p4,float p5,Paint p6){
       CanvasProxy uCanvasProxy = CanvasProxy.class;
       if (PatchProxy.isSupport(uCanvasProxy)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, null, uCanvasProxy, "11")) {
             return;
          }
       }
       if (TextUtils.isEmpty(p1)) {
          return;
       }else {
          Bitmap uBitmap = CanvasProxy.sBitmapWeakCache.get(p1);
          if (uBitmap == null) {
             uBitmap = BitmapFactory.decodeFile(p1);
             if (uBitmap == null) {
                return;
             }else {
                CanvasProxy.sBitmapWeakCache.put(p1, uBitmap);
             }
          }
          p0.drawBitmap(uBitmap, null, new Rect(ProxyUtil.dip2px(p2), ProxyUtil.dip2px(p3), ProxyUtil.dip2px(p4), ProxyUtil.dip2px(p5)), p6);
          return;
       }
    }
    public static void drawCircle(Canvas p0,float p1,float p2,float p3,Paint p4){
       CanvasProxy uCanvasProxy = CanvasProxy.class;
       if (PatchProxy.isSupport(uCanvasProxy)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, uCanvasProxy, "13")) {
             return;
          }
       }
       if (ProxyUtil.checkHasShadowAndGradient(p4)) {
          p4.setShader(null);
          p0.drawCircle(p1, p2, p3, p4);
          p4.setShader(p4.getShader());
          p4.clearShadowLayer();
       }
       p0.drawCircle((float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2), (float)ProxyUtil.dip2px(p3), p4);
       return;
    }
    public static void drawOval(Canvas p0,RectF p1,Paint p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, CanvasProxy.class, "8")) {
          return;
       }
       if (ProxyUtil.checkHasShadowAndGradient(p2)) {
          p2.setShader(null);
          p0.drawOval(new RectF((float)ProxyUtil.dip2px(p1.left), (float)ProxyUtil.dip2px(p1.top), (float)ProxyUtil.dip2px(p1.right), (float)ProxyUtil.dip2px(p1.bottom)), p2);
          p2.setShader(p2.getShader());
          p2.clearShadowLayer();
       }
       p0.drawOval(new RectF((float)ProxyUtil.dip2px(p1.left), (float)ProxyUtil.dip2px(p1.top), (float)ProxyUtil.dip2px(p1.right), (float)ProxyUtil.dip2px(p1.bottom)), p2);
       return;
    }
    public static void drawPath(Canvas p0,Path p1,Paint p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, CanvasProxy.class, "6")) {
          return;
       }
       if (ProxyUtil.checkHasShadowAndGradient(p2)) {
          p2.setShader(null);
          p0.drawPath(p1, p2);
          p2.setShader(p2.getShader());
          p2.clearShadowLayer();
       }
       p0.drawPath(p1, p2);
       return;
    }
    public static void drawRect(Canvas p0,float p1,float p2,float p3,float p4,Paint p5){
       CanvasProxy uCanvasProxy = CanvasProxy.class;
       Object obj = null;
       if (PatchProxy.isSupport(uCanvasProxy)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, obj, uCanvasProxy, "7")) {
             return;
          }
       }
       if (ProxyUtil.checkHasShadowAndGradient(p5)) {
          p5.setShader(obj);
          p0.drawRect((float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2), (float)ProxyUtil.dip2px(p3), (float)ProxyUtil.dip2px(p4), p5);
          p5.setShader(p5.getShader());
          p5.clearShadowLayer();
       }
       p0.drawRect((float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2), (float)ProxyUtil.dip2px(p3), (float)ProxyUtil.dip2px(p4), p5);
       return;
    }
    public static void drawRoundRect(Canvas p0,float p1,float p2,float p3,float p4,float p5,Paint p6){
       CanvasProxy uCanvasProxy = CanvasProxy.class;
       Object obj = null;
       if (PatchProxy.isSupport(uCanvasProxy)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, obj, uCanvasProxy, "9")) {
             return;
          }
       }
       if (ProxyUtil.checkHasShadowAndGradient(p6)) {
          p6.setShader(obj);
          p0.drawRoundRect(new RectF((float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2), (float)ProxyUtil.dip2px(p3), (float)ProxyUtil.dip2px(p4)), (float)ProxyUtil.dip2px(p5), (float)ProxyUtil.dip2px(p5), p6);
          p6.setShader(p6.getShader());
          p6.clearShadowLayer();
       }
       p0.drawRoundRect(new RectF((float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2), (float)ProxyUtil.dip2px(p3), (float)ProxyUtil.dip2px(p4)), (float)ProxyUtil.dip2px(p5), (float)ProxyUtil.dip2px(p5), p6);
       return;
    }
    public static void drawRoundRect(Canvas p0,float p1,float p2,float p3,float p4,float p5,boolean p6,boolean p7,boolean p8,boolean p9,Path p10,Paint p11){
       float f;
       object oobject = p0;
       object oobject1 = p10;
       object oobject2 = p11;
       CanvasProxy uCanvasProxy = CanvasProxy.class;
       if (PatchProxy.isSupport(uCanvasProxy)) {
          Object[] objArray = new Object[12];
          objArray[0] = oobject;
          objArray[1] = Float.valueOf(p1);
          objArray[2] = Float.valueOf(p2);
          objArray[3] = Float.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Float.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Boolean.valueOf(p9);
          objArray[10] = oobject1;
          objArray[11] = oobject2;
          if (PatchProxy.applyVoid(objArray, null, uCanvasProxy, "18")) {
             return;
          }
       }
       if (!p8 && (!p6 && (!p7 && !p9))) {
          CanvasProxy.drawRoundRect(p0, p1, p2, p3, p4, p5, p11);
          return;
       }else {
          int i = ProxyUtil.dip2px(p5);
          int i1 = ProxyUtil.dip2px(p1);
          int i2 = ProxyUtil.dip2px(p2);
          int i3 = ProxyUtil.dip2px(p3);
          int i4 = ProxyUtil.dip2px(p4);
          if (p6) {
             f = (float)i1;
             oobject1.moveTo(f, (float)(i2 + i));
             oobject1.quadTo(f, (float)i2, (float)(i1 + i), (float)i2);
          }else {
             oobject1.moveTo((float)i1, (float)i2);
          }
          if (p7) {
             float f1 = (float)i2;
             oobject1.lineTo((float)(i3 - i), f1);
             oobject1.quadTo((float)i3, f1, (float)i3, (float)(i2 + i));
          }else {
             oobject1.lineTo((float)i3, (float)i2);
          }
          if (p9) {
             f = (float)i3;
             oobject1.lineTo(f, (float)(i4 - i));
             oobject1.quadTo(f, (float)i4, (float)(i3 - i), (float)i4);
          }else {
             oobject1.lineTo((float)i3, (float)i4);
          }
          if (p8) {
             f = (float)i4;
             oobject1.lineTo((float)(i1 + i), f);
             oobject1.quadTo((float)i1, f, (float)i1, (float)(i4 - i));
          }else {
             oobject1.lineTo((float)i1, (float)i4);
          }
          if (p6) {
             oobject1.lineTo((float)i1, (float)(i2 + i));
          }else {
             oobject1.lineTo((float)i1, (float)i2);
          }
          p10.close();
          p0.drawPath(oobject1, oobject2);
          return;
       }
    }
    public static void drawText(Canvas p0,String p1,float p2,float p3,Paint p4){
       CanvasProxy uCanvasProxy = CanvasProxy.class;
       Object obj = null;
       if (PatchProxy.isSupport(uCanvasProxy)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, obj, uCanvasProxy, "10")) {
             return;
          }
       }
       if (ProxyUtil.checkHasShadowAndGradient(p4)) {
          p4.setShader(obj);
          p0.drawText(p1, (float)ProxyUtil.dip2px(p2), ((float)ProxyUtil.dip2px(p3) - p4.ascent()), p4);
          p4.setShader(p4.getShader());
          p4.clearShadowLayer();
       }
       p0.drawText(p1, (float)ProxyUtil.dip2px(p2), ((float)ProxyUtil.dip2px(p3) - p4.ascent()), p4);
       return;
    }
    public static void restore(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, CanvasProxy.class, "2")) {
          return;
       }
       p0.restore();
       return;
    }
    public static void rotate(Canvas p0,float p1){
       CanvasProxy uCanvasProxy = CanvasProxy.class;
       if (PatchProxy.isSupport(uCanvasProxy) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), null, uCanvasProxy, "5")) {
          return;
       }
       p0.rotate(p1);
       return;
    }
    public static int save(Canvas p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CanvasProxy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.save();
    }
    public static void scale(Canvas p0,float p1,float p2){
       if (PatchProxy.isSupport(CanvasProxy.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), null, CanvasProxy.class, "3")) {
          return;
       }
       p0.scale(p1, p2);
       return;
    }
    public static void translate(Canvas p0,float p1,float p2){
       if (PatchProxy.isSupport(CanvasProxy.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), null, CanvasProxy.class, "4")) {
          return;
       }
       p0.translate((float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2));
       return;
    }
}
