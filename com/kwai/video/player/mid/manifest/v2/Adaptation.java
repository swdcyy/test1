package com.kwai.video.player.mid.manifest.v2.Adaptation;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.kwai.video.player.mid.manifest.v2.Representation;

public class Adaptation implements Serializable, Cloneable	// class@000b61
{
    public float mDurationMs;
    public int mId;
    public List mRepresentation;
    public String vcodec;

    public void Adaptation(){
       super();
    }
    public Adaptation clone(){
       Adaptation obj = PatchProxy.apply(null, this, Adaptation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.clone();
       obj.mRepresentation = new ArrayList();
       Adaptation tmRepresenta = this.mRepresentation;
       if (tmRepresenta != null) {
          Iterator iterator = tmRepresenta.iterator();
          while (iterator.hasNext()) {
             obj.mRepresentation.add(iterator.next().clone());
          }
       }
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
}
