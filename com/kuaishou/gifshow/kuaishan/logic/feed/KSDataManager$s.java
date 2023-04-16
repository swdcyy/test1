package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$s;
import erd.g;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import u80.e;
import java.lang.StringBuilder;
import q87.c;

public final class KSDataManager$s implements g	// class@001a35
{
    public final String b;

    public void KSDataManager$s(String p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$s.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null) {
             p0 = p0.mTemplateList.iterator();
             while (p0.hasNext()) {
                KSFeedTemplateDetailInfo kSFeedTempla = p0.next();
                if (!TextUtils.n(kSFeedTempla.mGroupId, this.b)) {
                   Object[] objArray = new Object[0];
                   e.D().w("KSDataManager", "template "+kSFeedTempla.mId+" group id updated from "+kSFeedTempla.mGroupId+" to "+this.b, objArray);
                   kSFeedTempla.mGroupId = this.b;
                }
             }
          }
       }
       return;
    }
}
