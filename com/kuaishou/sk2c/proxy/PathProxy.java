package com.kuaishou.sk2c.proxy.PathProxy;
import java.lang.Object;
import android.graphics.Path;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import android.graphics.RectF;
import com.kuaishou.sk2c.proxy.ProxyUtil;
import android.graphics.Path$Direction;

public class PathProxy	// class@000f37
{

    public void PathProxy(){
       super();
    }
    public static void addRoundRect(Path p0,float p1,float p2,float p3,float p4,float p5){
       PathProxy pathProxy = PathProxy.class;
       if (PatchProxy.isSupport(pathProxy)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, pathProxy, "6")) {
             return;
          }
       }
       p0.addRoundRect(new RectF((float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2), (float)ProxyUtil.dip2px(p3), (float)ProxyUtil.dip2px(p4)), (float)ProxyUtil.dip2px(p5), (float)ProxyUtil.dip2px(p5), Path$Direction.CCW);
       return;
    }
    public static void close(Path p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PathProxy.class, "7")) {
          return;
       }
       p0.close();
       return;
    }
    public static void cubicTo(Path p0,float p1,float p2,float p3,float p4,float p5,float p6){
       PathProxy pathProxy = PathProxy.class;
       if (PatchProxy.isSupport(pathProxy)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5),Float.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, pathProxy, "5")) {
             return;
          }
       }
       p0.cubicTo((float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2), (float)ProxyUtil.dip2px(p3), (float)ProxyUtil.dip2px(p4), (float)ProxyUtil.dip2px(p5), (float)ProxyUtil.dip2px(p6));
       return;
    }
    public static void lineTo(Path p0,float p1,float p2){
       if (PatchProxy.isSupport(PathProxy.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), null, PathProxy.class, "3")) {
          return;
       }
       p0.lineTo((float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2));
       return;
    }
    public static void moveTo(Path p0,float p1,float p2){
       if (PatchProxy.isSupport(PathProxy.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), null, PathProxy.class, "2")) {
          return;
       }
       p0.moveTo((float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2));
       return;
    }
    public static void quadTo(Path p0,float p1,float p2,float p3,float p4){
       PathProxy pathProxy = PathProxy.class;
       if (PatchProxy.isSupport(pathProxy)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, pathProxy, "4")) {
             return;
          }
       }
       p0.quadTo((float)ProxyUtil.dip2px(p1), (float)ProxyUtil.dip2px(p2), (float)ProxyUtil.dip2px(p3), (float)ProxyUtil.dip2px(p4));
       return;
    }
    public static void reset(Path p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PathProxy.class, "1")) {
          return;
       }
       p0.reset();
       return;
    }
}
