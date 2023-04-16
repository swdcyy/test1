package com.kwai.framework.krn.bridges.facemagic.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Iterator;
import ekd.v0;
import c96.a;
import java.lang.StringBuilder;
import java.lang.StackTraceElement;
import java.lang.Exception;
import q87.c;

public class a	// class@0015ad
{

    public void a(){
       super();
    }
    public static boolean a(){
       ArrayList obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new ArrayList();
       obj.add("c++_shared");
       obj.add("PNG");
       obj.add("klsf");
       obj.add("CGE");
       obj.add("opencv_world");
       obj.add("ffmpeg");
       obj.add("skwai");
       obj.add("kgpu");
       obj.add("gorgeous");
       obj.add("spine");
       obj.add("protobuf-lite");
       String str = "FaceMagic";
       try{
          obj.add(str);
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             iterator.b(iterator.next());
          }
          return true;
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          a.D().t("react-native-faceMagic", "魔表所需So加载失败 Exception:"+e0.getStackTrace(), objArray);
          return 0;
       }
    }
}
