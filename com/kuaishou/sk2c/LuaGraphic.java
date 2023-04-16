package com.kuaishou.sk2c.LuaGraphic;
import java.lang.String;
import ekd.v0;
import java.lang.Object;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.kuaishou.sk2c.LuaResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import java.lang.Boolean;
import com.kuaishou.sk2c.proxy.ProxyUtil;

public class LuaGraphic	// class@000f30
{

    static {
       "sk2c".b("sk2c");
    }
    public void LuaGraphic(){
       super();
    }
    public static LuaResult drawBackground(String p0,Canvas p1,Paint p2,Path p3,float p4,float p5){
       LuaGraphic luaGraphic = LuaGraphic.class;
       if (PatchProxy.isSupport(luaGraphic)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Float.valueOf(p4),Float.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, luaGraphic, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return LuaGraphic.nDrawBackground(p0, p1, p2, p3, p4, p5, p4, p5, false, "", 0, 0, new ArrayList());
    }
    public static LuaResult drawBackground(String p0,Canvas p1,Paint p2,Path p3,float p4,float p5,float p6,float p7,boolean p8,String p9,float p10,float p11,List p12){
       LuaGraphic luaGraphic = LuaGraphic.class;
       if (PatchProxy.isSupport(luaGraphic)) {
          Object[] objArray = new Object[13];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Float.valueOf(p5);
          objArray[6] = Float.valueOf(p6);
          objArray[7] = Float.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = p9;
          objArray[10] = Float.valueOf(p10);
          objArray[11] = Float.valueOf(p11);
          objArray[12] = p12;
          Object obj = PatchProxy.apply(objArray, null, luaGraphic, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return LuaGraphic.nDrawBackground(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
    }
    public static void init(float p0){
       LuaGraphic luaGraphic = LuaGraphic.class;
       if (PatchProxy.isSupport(luaGraphic) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), null, luaGraphic, "1")) {
          return;
       }
       ProxyUtil.initDensity(p0);
       LuaGraphic.nInit(p0);
       return;
    }
    public static native LuaResult nDrawBackground(String p0,Canvas p1,Paint p2,Path p3,float p4,float p5,float p6,float p7,boolean p8,String p9,float p10,float p11,List p12);
    public static native void nInit(float p0);
}
