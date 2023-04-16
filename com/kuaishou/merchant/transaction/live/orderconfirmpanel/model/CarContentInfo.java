package com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.CarContentInfo;
import mkd.a;
import kk4.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ue4.g;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.CarContentInfo$a;
import java.lang.reflect.Type;
import el.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CarContentInfo implements a	// class@0007ff
{
    public a b;
    public final String mPageId;
    public final Object mRequestParams;
    public final String mShownContent;

    public final a a(){
       return this.b;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, CarContentInfo.class, "1")) {
          return;
       }
       this.b = g.c(g.d(this.mRequestParams), new CarContentInfo$a().getType());
       return;
    }
    public final String b(){
       return this.mShownContent;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CarContentInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CarContentInfo && (a.g(this.mShownContent, p0.mShownContent) && (a.g(this.mRequestParams, p0.mRequestParams) && a.g(this.mPageId, p0.mPageId))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       CarContentInfo obj = PatchProxy.apply(null, this, CarContentInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mShownContent;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CarContentInfo tmRequestPar = this.mRequestParams;
       int i2 = (tmRequestPar != null)? tmRequestPar.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmRequestPar = this.mPageId;
       if (tmRequestPar != null) {
          i = tmRequestPar.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CarContentInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CarContentInfo\(mShownContent="+this.mShownContent+", mRequestParams="+this.mRequestParams+", mPageId="+this.mPageId+"\)";
    }
}
