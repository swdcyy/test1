package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$h;
import java.util.concurrent.Callable;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$c;

public final class KSDataManager$h implements Callable	// class@001a1f
{
    public final KSDataManager b;
    public final KSTemplateFeedListResponse c;

    public void KSDataManager$h(KSDataManager p0,KSTemplateFeedListResponse p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       KSDataManager$c uoc = PatchProxy.apply(null, this, KSDataManager$h.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new KSDataManager$c(this.b, this.c, true);
       }
       return uoc;
    }
}
