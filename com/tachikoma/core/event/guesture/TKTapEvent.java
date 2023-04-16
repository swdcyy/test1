package com.tachikoma.core.event.guesture.TKTapEvent;
import com.tachikoma.core.event.base.TKBaseEvent;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import java.lang.Float;

public class TKTapEvent extends TKBaseEvent	// class@000dc5
{
    public HashMap mPosition;

    public void TKTapEvent(){
       super();
       this.mPosition = new HashMap();
    }
    public void configWithData(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKTapEvent.class, "1")) {
          return;
       }
       super.configWithData(p0);
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          this.mPosition.put(key, Float.valueOf(uEntry.getValue().floatValue()));
       }
       return;
    }
    public HashMap getPosition(){
       return this.mPosition;
    }
    public void setPosition(HashMap p0){
       this.mPosition = p0;
    }
}
