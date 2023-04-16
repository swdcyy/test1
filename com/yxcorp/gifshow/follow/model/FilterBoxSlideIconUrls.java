package com.yxcorp.gifshow.follow.model.FilterBoxSlideIconUrls;
import java.io.Serializable;
import com.yxcorp.gifshow.follow.model.FilterBoxSlideIconUrls$a;
import nsd.u;
import com.yxcorp.gifshow.follow.model.DarkLightModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FilterBoxSlideIconUrls implements Serializable	// class@0010fb
{
    public DarkLightModel mNormal;
    public DarkLightModel mSelected;
    public static final FilterBoxSlideIconUrls$a Companion;
    public static final long serialVersionUID;

    static {
       FilterBoxSlideIconUrls.Companion = new FilterBoxSlideIconUrls$a(null);
    }
    public void FilterBoxSlideIconUrls(){
       super(null, null, 3, null);
    }
    public void FilterBoxSlideIconUrls(DarkLightModel p0,DarkLightModel p1){
       super();
       this.mNormal = p0;
       this.mSelected = p1;
    }
    public void FilterBoxSlideIconUrls(DarkLightModel p0,DarkLightModel p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static FilterBoxSlideIconUrls copy$default(FilterBoxSlideIconUrls p0,DarkLightModel p1,DarkLightModel p2,int p3,Object p4){
       FilterBoxSlideIconUrls mNormal;
       FilterBoxSlideIconUrls mSelected;
       if (p3 & 0x01) {
          mNormal = p0.mNormal;
       }
       if (p3 & 0x02) {
          mSelected = p0.mSelected;
       }
       return p0.copy(mNormal, mSelected);
    }
    public final DarkLightModel component1(){
       return this.mNormal;
    }
    public final DarkLightModel component2(){
       return this.mSelected;
    }
    public final FilterBoxSlideIconUrls copy(DarkLightModel p0,DarkLightModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FilterBoxSlideIconUrls.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FilterBoxSlideIconUrls(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FilterBoxSlideIconUrls.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FilterBoxSlideIconUrls && (a.g(this.mNormal, p0.mNormal) && a.g(this.mSelected, p0.mSelected)))) {
          return true;
       }
       return false;
    }
    public final DarkLightModel getMNormal(){
       return this.mNormal;
    }
    public final DarkLightModel getMSelected(){
       return this.mSelected;
    }
    public int hashCode(){
       FilterBoxSlideIconUrls obj = PatchProxy.apply(null, this, FilterBoxSlideIconUrls.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mNormal;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       FilterBoxSlideIconUrls tmSelected = this.mSelected;
       if (tmSelected != null) {
          i = tmSelected.hashCode();
       }
       return (i1 + i);
    }
    public final void setMNormal(DarkLightModel p0){
       this.mNormal = p0;
    }
    public final void setMSelected(DarkLightModel p0){
       this.mSelected = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FilterBoxSlideIconUrls.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FilterBoxSlideIconUrls\(mNormal="+this.mNormal+", mSelected="+this.mSelected+"\)";
    }
}
