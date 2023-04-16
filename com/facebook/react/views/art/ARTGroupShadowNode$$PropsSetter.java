package com.facebook.react.views.art.ARTGroupShadowNode$$PropsSetter;
import com.facebook.react.uimanager.k$d;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.x;
import com.facebook.react.views.art.ARTGroupShadowNode;
import java.util.Objects;
import com.facebook.react.bridge.ReadableArray;
import kf.a;
import java.lang.Double;

public class ARTGroupShadowNode$$PropsSetter implements k$d	// class@001389
{

    public void ARTGroupShadowNode$$PropsSetter(){
       super();
    }
    public void getProperties(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ARTGroupShadowNode$$PropsSetter.class, "2")) {
          return;
       }
       p0.put("clipping", "Array");
       p0.put("opacity", "number");
       p0.put("transform", "Array");
       return;
    }
    public void setProperty(x p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ARTGroupShadowNode$$PropsSetter.class, "1")) {
       }else {
          Objects.requireNonNull(p1);
          int i = -1;
          switch (p1.hashCode()){
              case 0xb477f80b:
                if (p1.equals("opacity")) {
                   i = 0;
                }
                break;
              case 0x36c0fcc2:
                if (p1.equals("clipping")) {
                   i = 1;
                }
                break;
              case 0x3ebe6b6c:
                if (p1.equals("transform")) {
                   i = 2;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                float f = (p2 == null)? 0x3f800000: p2.floatValue();
                p0.setOpacity(f);
                break;
              case 1:
                p0.setClipping(p2);
                break;
              case 2:
                p0.setTransform(p2);
                break;
              default:
          }
       }
       return;
    }
}
