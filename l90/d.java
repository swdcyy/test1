package l90.d;
import erd.o;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedDetailListResponse;
import java.util.List;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.StringBuilder;

public final class d implements o	// class@002530
{
    public final String b;

    public void d(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       p0 = p0.mTemplateList;
       if (p0.isEmpty()) {
          throw new KSException(-12, "cant find this template for id="+tb);
       }
       p0 = p0.get(0).toKSTemplateDetailInfo();
       KSTemplateDetailInfo mPosterShowI = p0.mPosterShowIcon;
       if (mPosterShowI != null && !mPosterShowI.isEmpty()) {
          return p0.mPosterShowIcon;
       }
       throw new KSException(-12, "iconUrl is null or empty");
    }
}
