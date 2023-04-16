package com.facebook.react.views.art.ARTTextShadowNode$$PropsSetter;
import com.facebook.react.uimanager.k$d;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.x;
import com.facebook.react.views.art.ARTTextShadowNode;
import java.util.Objects;
import java.lang.Double;
import com.facebook.react.views.art.ARTShapeShadowNode;
import com.facebook.react.bridge.ReadableArray;
import kf.a;
import com.facebook.react.bridge.ReadableMap;

public class ARTTextShadowNode$$PropsSetter implements k$d	// class@001399
{

    public void ARTTextShadowNode$$PropsSetter(){
       super();
    }
    public void getProperties(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ARTTextShadowNode$$PropsSetter.class, "2")) {
          return;
       }
       p0.put("alignment", "number");
       p0.put("d", "Array");
       p0.put("fill", "Array");
       p0.put("frame", "Map");
       p0.put("opacity", "number");
       p0.put("stroke", "Array");
       p0.put("strokeCap", "number");
       p0.put("strokeDash", "Array");
       p0.put("strokeJoin", "number");
       p0.put("strokeWidth", "number");
       p0.put("transform", "Array");
       return;
    }
    public void setProperty(x p0,String p1,Object p2){
       int this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ARTTextShadowNode$$PropsSetter.class, "1")) {
       }else {
          Objects.requireNonNull(p1);
          int i = -1;
          int i1 = 1;
          this = 0;
          switch (p1.hashCode()){
              case 0xb477f80b:
                if (p1.equals("opacity")) {
                   i = 0;
                }
                break;
              case 0xcad57638:
                if (p1.equals("stroke")) {
                   i = 1;
                }
                break;
              case 0xda5ffdea:
                if (p1.equals("strokeDash")) {
                   i = 2;
                }
                break;
              case 0xda62eb82:
                if (p1.equals("strokeJoin")) {
                   i = 3;
                }
                break;
              case 0xfec9467a:
                if (p1.equals("strokeCap")) {
                   i = 4;
                }
                break;
              case 'd':
                if (p1.equals("d")) {
                   i = 5;
                }
                break;
              case 0x2ff583:
                if (p1.equals("fill")) {
                   i = 6;
                }
                break;
              case 0x5d2a96d:
                if (p1.equals("frame")) {
                   i = 7;
                }
                break;
              case 0x3ebe6b6c:
                if (p1.equals("transform")) {
                   i = 8;
                }
                break;
              case 0x695fa1e3:
                if (p1.equals("alignment")) {
                   i = 9;
                }
                break;
              case 0x72aeea6e:
                if (p1.equals("strokeWidth")) {
                   i = 10;
                }
                break;
              default:
          }
       label_00a2 :
          float f = 0x3f800000;
          switch (i){
              case 0:
                if (p2 != null) {
                   f = p2.floatValue();
                }
                p0.setOpacity(f);
                break;
              case 1:
                p0.setStroke(p2);
                break;
              case 2:
                p0.setStrokeDash(p2);
                break;
              case 3:
                if (p2 != null) {
                   i1 = p2.intValue();
                }
                p0.setStrokeJoin(i1);
                break;
              case 4:
                if (p2 != null) {
                   i1 = p2.intValue();
                }
                p0.setStrokeCap(i1);
                break;
              case 5:
                p0.setShapePath(p2);
                break;
              case 6:
                p0.setFill(p2);
                break;
              case 7:
                p0.setFrame(p2);
                break;
              case 8:
                p0.setTransform(p2);
                break;
              case 9:
                if (p2 != null) {
                   this = p2.intValue();
                }
                p0.setAlignment(this);
                break;
              case 10:
                if (p2 != null) {
                   f = p2.floatValue();
                }
                p0.setStrokeWidth(f);
                break;
              default:
          }
       }
       return;
    }
}
