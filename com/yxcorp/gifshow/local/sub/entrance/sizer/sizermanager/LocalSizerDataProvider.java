package com.yxcorp.gifshow.local.sub.entrance.sizer.sizermanager.LocalSizerDataProvider;
import java.io.Serializable;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import java.lang.Object;
import xl8.b;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.local.sub.entrance.sizer.model.NearbySubSizerResponse;

public class LocalSizerDataProvider implements Serializable	// class@001acd
{
    public final b mDataObservable;
    public LocalDelegateType mType;
    public static final long serialVersionUID = 0xf88a90a07b50b73e;

    public void LocalSizerDataProvider(LocalDelegateType p0){
       super();
       this.mDataObservable = new b(null);
       this.mType = p0;
    }
    public t getDataObservable(){
       Object obj = PatchProxy.apply(null, this, LocalSizerDataProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDataObservable.observable().distinctUntilChanged();
    }
    public NearbySubSizerResponse getDataValue(){
       Object obj = PatchProxy.apply(null, this, LocalSizerDataProvider.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDataObservable.a();
    }
    public LocalDelegateType getType(){
       return this.mType;
    }
    public void notifyData(NearbySubSizerResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalSizerDataProvider.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mDataObservable.d(p0);
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, LocalSizerDataProvider.class, "4")) {
          return;
       }
       if (this.getDataValue() != null) {
          NearbySubSizerResponse nearbySubSiz = this.getDataValue().clone();
          if (nearbySubSiz != null) {
             this.notifyData(nearbySubSiz);
          }
       }
       return;
    }
    public void setType(LocalDelegateType p0){
       this.mType = p0;
    }
}
