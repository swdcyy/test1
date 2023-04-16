package com.yxcorp.gifshow.pendant.response.PendantSharedParams;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.pendant.response.AdsorptionStateConfigV2;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.pendant.response.PendantLocationParam;

public class PendantSharedParams implements Serializable	// class@001279
{
    public AdsorptionStateConfigV2 adsorptionStateConfigV2;
    public List legalArea;
    public boolean stateSync;

    public void PendantSharedParams(){
       super();
    }
    public final AdsorptionStateConfigV2 getAdsorptionStateConfigV2(){
       return this.adsorptionStateConfigV2;
    }
    public final List getLegalArea(){
       return this.legalArea;
    }
    public int[] getLegalAreaYArray(){
       int[] ointArray;
       PendantSharedParams obj = PatchProxy.apply(null, this, PendantSharedParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.legalArea;
       int i = 0;
       if (obj != null) {
          ointArray = new int[obj.size()];
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             ointArray[i] = obj1.mY;
             i = i1;
          }
       }else {
          ointArray = new int[i];
       }
       return ointArray;
    }
    public boolean getStateSync(){
       return this.stateSync;
    }
    public final void setAdsorptionStateConfigV2(AdsorptionStateConfigV2 p0){
       this.adsorptionStateConfigV2 = p0;
    }
    public final void setLegalArea(List p0){
       this.legalArea = p0;
    }
    public void setStateSync(boolean p0){
       this.stateSync = p0;
    }
}
