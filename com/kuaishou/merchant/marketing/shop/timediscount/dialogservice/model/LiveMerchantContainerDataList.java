package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.model.LiveMerchantContainerDataList;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import y94.b;
import java.util.List;
import java.lang.Number;

public final class LiveMerchantContainerDataList extends ArrayList	// class@001c17
{
    public List mLiveMerchantContainerDataListObservers;

    public void LiveMerchantContainerDataList(){
       super();
       this.mLiveMerchantContainerDataListObservers = new ArrayList();
    }
    public void LiveMerchantContainerDataList(Collection p0){
       super(p0);
       this.mLiveMerchantContainerDataListObservers = new ArrayList();
    }
    public void add(int p0,Object p1){
       if (PatchProxy.isSupport(LiveMerchantContainerDataList.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, LiveMerchantContainerDataList.class, "2")) {
          return;
       }
       super.add(p0, p1);
       this.b(false, p0);
       return;
    }
    public boolean add(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantContainerDataList.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b(false, this.size());
       return super.add(p0);
    }
    public final void b(boolean p0,int p1){
       if (PatchProxy.isSupport(LiveMerchantContainerDataList.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, LiveMerchantContainerDataList.class, "8")) {
          return;
       }
       Iterator iterator = this.mLiveMerchantContainerDataListObservers.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (p0) {
             if (uob != null) {
                uob.a(p1);
             }
          }else if(uob != null){
             uob.b(p1);
          }
       }
       return;
    }
    public final void cancelObserve(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantContainerDataList.class, "7")) {
          return;
       }
       this.mLiveMerchantContainerDataListObservers.remove(p0);
       return;
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantContainerDataList.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public final void observe(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantContainerDataList.class, "6")) {
          return;
       }
       if (this.mLiveMerchantContainerDataListObservers.contains(p0)) {
          return;
       }
       this.mLiveMerchantContainerDataListObservers.add(p0);
       return;
    }
    public final Object remove(int p0){
       if (PatchProxy.isSupport(LiveMerchantContainerDataList.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveMerchantContainerDataList.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.removeAt(p0);
    }
    public boolean remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantContainerDataList.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b(true, this.indexOf(p0));
       return super.remove(p0);
    }
    public Object removeAt(int p0){
       if (PatchProxy.isSupport(LiveMerchantContainerDataList.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveMerchantContainerDataList.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b(true, p0);
       return super.remove(p0);
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantContainerDataList.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
}
