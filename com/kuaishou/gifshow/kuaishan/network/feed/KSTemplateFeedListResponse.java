package com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import la6.b;
import com.yxcorp.gifshow.util.PostBaseInfoManager$DetailResponse;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Boolean;
import la6.a;

public class KSTemplateFeedListResponse extends PostBaseInfoManager$DetailResponse implements b	// class@001aa8
{
    public String mCursor;
    public List mTemplateList;
    public static final long serialVersionUID = 0x41228ea0afa3e916;

    public void KSTemplateFeedListResponse(){
       super();
       this.mTemplateList = new ArrayList();
    }
    public List getItems(){
       ArrayList obj = PatchProxy.apply(null, this, KSTemplateFeedListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mTemplateList.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().toKSTemplateDetailInfo());
       }
       return obj;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, KSTemplateFeedListResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
