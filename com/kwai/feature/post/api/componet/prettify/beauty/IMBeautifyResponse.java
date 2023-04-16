package com.kwai.feature.post.api.componet.prettify.beauty.IMBeautifyResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class IMBeautifyResponse implements Serializable	// class@0012dc
{
    public List beautifyGroupInfoList;
    public List beautifyItemInfoList;
    public List oldSuiteInfoList;
    public List suiteInfoList;

    public void IMBeautifyResponse(){
       super();
       this.oldSuiteInfoList = CollectionsKt__CollectionsKt.E();
       this.suiteInfoList = CollectionsKt__CollectionsKt.E();
       this.beautifyItemInfoList = CollectionsKt__CollectionsKt.E();
       this.beautifyGroupInfoList = CollectionsKt__CollectionsKt.E();
    }
    public final List getBeautifyGroupInfoList(){
       return this.beautifyGroupInfoList;
    }
    public final List getBeautifyItemInfoList(){
       return this.beautifyItemInfoList;
    }
    public final List getOldSuiteInfoList(){
       return this.oldSuiteInfoList;
    }
    public final List getSuiteInfoList(){
       return this.suiteInfoList;
    }
    public final void setBeautifyGroupInfoList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautifyResponse.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.beautifyGroupInfoList = p0;
       return;
    }
    public final void setBeautifyItemInfoList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautifyResponse.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.beautifyItemInfoList = p0;
       return;
    }
    public final void setOldSuiteInfoList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautifyResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.oldSuiteInfoList = p0;
       return;
    }
    public final void setSuiteInfoList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautifyResponse.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.suiteInfoList = p0;
       return;
    }
}
