package com.kuaishou.android.live.model.AdaptationSet;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.live.model.AdaptationUrl;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class AdaptationSet implements Serializable, a	// class@0007dc
{
    public long mGopDuration;
    public List mRepresentation;
    public static final long serialVersionUID = 0xbd6902c1d4ce614c;

    public void AdaptationSet(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, AdaptationSet.class, "1")) {
          return;
       }
       AdaptationSet tmRepresenta = this.mRepresentation;
       if (tmRepresenta != null) {
          Iterator iterator = tmRepresenta.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().mHidden != null) {
                iterator.remove();
             }
          }
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AdaptationSet.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AdaptationSet{mGopDuration="+this.mGopDuration+", mRepresentation="+this.mRepresentation+'}';
    }
}
