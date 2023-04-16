package com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateSearchResponse;
import la6.b;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import kotlin.jvm.internal.a;

public final class KSTemplateSearchResponse implements b	// class@001aa9
{
    public String mCursor;
    public boolean mHasSearchResult;
    public List mTemplateList;

    public void KSTemplateSearchResponse(){
       super();
       this.mTemplateList = new ArrayList();
    }
    public List getItems(){
       ArrayList obj = PatchProxy.apply(null, this, KSTemplateSearchResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mTemplateList.iterator();
       while (iterator.hasNext()) {
          KSTemplateDetailInfo kSTemplateDe = iterator.next().toKSTemplateDetailInfo();
          a.o(kSTemplateDe, "feedDetail.toKSTemplateDetailInfo\(\)");
          obj.add(kSTemplateDe);
       }
       return obj;
    }
    public final String getMCursor(){
       return this.mCursor;
    }
    public final boolean getMHasSearchResult(){
       return this.mHasSearchResult;
    }
    public final List getMTemplateList(){
       return this.mTemplateList;
    }
    public boolean hasMore(){
       return false;
    }
    public final void setMCursor(String p0){
       this.mCursor = p0;
    }
    public final void setMHasSearchResult(boolean p0){
       this.mHasSearchResult = p0;
    }
    public final void setMTemplateList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSTemplateSearchResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTemplateList = p0;
       return;
    }
}
