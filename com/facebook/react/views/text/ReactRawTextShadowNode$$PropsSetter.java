package com.facebook.react.views.text.ReactRawTextShadowNode$$PropsSetter;
import com.facebook.react.uimanager.k$d;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.x;
import com.facebook.react.views.text.ReactRawTextShadowNode;
import java.util.Objects;

public class ReactRawTextShadowNode$$PropsSetter implements k$d	// class@001407
{

    public void ReactRawTextShadowNode$$PropsSetter(){
       super();
    }
    public void getProperties(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactRawTextShadowNode$$PropsSetter.class, "2")) {
          return;
       }
       p0.put("text", "String");
       return;
    }
    public void setProperty(x p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactRawTextShadowNode$$PropsSetter.class, "1")) {
       }else {
          Objects.requireNonNull(p1);
          if (p1.equals("text")) {
             p0.setText(p2);
          }
       }
       return;
    }
}
