package com.tachikoma.core.event.guesture.TKPinchEvent;
import com.tachikoma.core.event.base.TKBaseEvent;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;

public class TKPinchEvent extends TKBaseEvent	// class@000dc4
{
    public float scale;

    public void TKPinchEvent(){
       super();
    }
    public void configWithData(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPinchEvent.class, "1")) {
          return;
       }
       super.configWithData(p0);
       this.scale = p0.get("scale").floatValue();
       return;
    }
    public void setScale(float p0){
       this.scale = p0;
    }
}
