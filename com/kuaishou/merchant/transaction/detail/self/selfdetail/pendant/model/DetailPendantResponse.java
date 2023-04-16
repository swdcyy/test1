package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantResponse;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantResponse$a;
import nsd.u;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantPollingInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.BaseDetailPendantItemModel;
import java.lang.StringBuilder;

public final class DetailPendantResponse implements Serializable	// class@00074c
{
    public final DetailPendantPollingInfo mPollingInfo;
    public final List mRightBottomPendant;
    public static final DetailPendantResponse$a Companion;
    public static final long serialVersionUID;

    static {
       DetailPendantResponse.Companion = new DetailPendantResponse$a(null);
    }
    public void DetailPendantResponse(){
       super(new ArrayList(), null, 2, null);
    }
    public void DetailPendantResponse(List p0,DetailPendantPollingInfo p1){
       super();
       this.mRightBottomPendant = p0;
       this.mPollingInfo = p1;
    }
    public void DetailPendantResponse(List p0,DetailPendantPollingInfo p1,int p2,u p3){
       ArrayList uArrayList;
       if (p2 & 0x01) {
          uArrayList = new ArrayList();
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(uArrayList, p1);
       return;
    }
    public static DetailPendantResponse copy$default(DetailPendantResponse p0,List p1,DetailPendantPollingInfo p2,int p3,Object p4){
       DetailPendantResponse mRightBottom;
       DetailPendantResponse mPollingInfo;
       if (p3 & 0x01) {
          mRightBottom = p0.mRightBottomPendant;
       }
       if (p3 & 0x02) {
          mPollingInfo = p0.mPollingInfo;
       }
       return p0.copy(mRightBottom, mPollingInfo);
    }
    public final List component1(){
       return this.mRightBottomPendant;
    }
    public final DetailPendantPollingInfo component2(){
       return this.mPollingInfo;
    }
    public final DetailPendantResponse copy(List p0,DetailPendantPollingInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailPendantResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DetailPendantResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailPendantResponse.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DetailPendantResponse && (a.g(this.mRightBottomPendant, p0.mRightBottomPendant) && a.g(this.mPollingInfo, p0.mPollingInfo)))) {
          return true;
       }
       return false;
    }
    public final DetailPendantPollingInfo getMPollingInfo(){
       return this.mPollingInfo;
    }
    public final List getMRightBottomPendant(){
       return this.mRightBottomPendant;
    }
    public final int getRealCount(){
       DetailPendantResponse obj = PatchProxy.apply(null, this, DetailPendantResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mRightBottomPendant;
       int i = 0;
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().isValid()) {
                i = i + 1;
             }
          }
       }
       return i;
    }
    public int hashCode(){
       DetailPendantResponse obj = PatchProxy.apply(null, this, DetailPendantResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mRightBottomPendant;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       DetailPendantResponse tmPollingInf = this.mPollingInfo;
       if (tmPollingInf != null) {
          i = tmPollingInf.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isValid(){
       DetailPendantResponse obj = PatchProxy.apply(null, this, DetailPendantResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mRightBottomPendant;
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().isValid()) {
                return true;
             }
          }
       }
       return false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DetailPendantResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DetailPendantResponse\(mRightBottomPendant="+this.mRightBottomPendant+", mPollingInfo="+this.mPollingInfo+"\)";
    }
}
