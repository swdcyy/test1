package com.tachikoma.core.event.view.TKInputEvent;
import com.tachikoma.core.event.base.TKBaseEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class TKInputEvent extends TKBaseEvent	// class@000dc7
{
    public int inputState;
    public String text;

    public void TKInputEvent(){
       super();
    }
    public void setState(int p0){
       TKInputEvent tKInputEvent = TKInputEvent.class;
       if (PatchProxy.isSupport(tKInputEvent) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKInputEvent, "1")) {
          return;
       }
       super.setState(p0);
       this.inputState = p0;
       return;
    }
    public void setText(String p0){
       this.text = p0;
    }
}
