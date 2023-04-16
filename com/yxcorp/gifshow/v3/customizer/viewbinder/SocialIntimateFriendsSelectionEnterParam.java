package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialIntimateFriendsSelectionEnterParam;
import java.io.Serializable;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class SocialIntimateFriendsSelectionEnterParam implements Serializable	// class@000d74
{
    public List resultList;
    public double visibleSize;

    public void SocialIntimateFriendsSelectionEnterParam(){
       super(0, null, 3, null);
    }
    public void SocialIntimateFriendsSelectionEnterParam(double p0,List p1){
       a.p(p1, "resultList");
       super();
       this.visibleSize = p0;
       this.resultList = p1;
    }
    public void SocialIntimateFriendsSelectionEnterParam(double p0,List p1,int p2,u p3){
       ArrayList uArrayList;
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          uArrayList = new ArrayList();
       }
       super(p0, uArrayList);
       return;
    }
    public final List getResultList(){
       return this.resultList;
    }
    public final double getVisibleSize(){
       return this.visibleSize;
    }
    public final void setResultList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialIntimateFriendsSelectionEnterParam.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.resultList = p0;
       return;
    }
    public final void setVisibleSize(double p0){
       this.visibleSize = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SocialIntimateFriendsSelectionEnterParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SocialIntimateFriendsSelectionEnterParam\(visibleSize="+this.visibleSize+", resultList="+this.resultList+')';
    }
}
