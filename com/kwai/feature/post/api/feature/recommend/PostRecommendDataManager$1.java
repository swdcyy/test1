package com.kwai.feature.post.api.feature.recommend.PostRecommendDataManager$1;
import java.util.LinkedHashMap;
import com.kwai.feature.post.api.feature.recommend.PostRecommendDataManager;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class PostRecommendDataManager$1 extends LinkedHashMap	// class@0013c3
{
    public final PostRecommendDataManager this$0;

    public void PostRecommendDataManager$1(PostRecommendDataManager p0){
       this.this$0 = p0;
       super();
    }
    public boolean removeEldestEntry(Map$Entry p0){
       p0 = PatchProxy.applyOneRefs(p0, this, PostRecommendDataManager$1.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.size() > 20)? true: false;
       return b;
    }
}
