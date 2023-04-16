package com.kwai.feature.post.api.feature.recommend.PostRecommendDataManager;
import java.lang.Object;
import com.kwai.feature.post.api.feature.recommend.PostRecommendDataManager$1;
import com.kwai.feature.post.api.feature.recommend.PostRecommendDataManager$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import java.util.LinkedHashMap;

public class PostRecommendDataManager	// class@0013c5
{
    public LinkedHashMap a;
    public String b;
    public String c;

    public void PostRecommendDataManager(){
       super();
       this.b = "";
       this.c = "";
       this.a = new PostRecommendDataManager$1(this);
    }
    public void PostRecommendDataManager(PostRecommendDataManager$1 p0){
       super();
       this.b = "";
       this.c = "";
       this.a = new PostRecommendDataManager$1(this);
    }
    public static PostRecommendDataManager b(){
       return PostRecommendDataManager$a.a;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, PostRecommendDataManager.class, "1")) {
          return;
       }
       Log.b("PostRecommendDataManager", "clearData");
       this.a.clear();
       this.b = "";
       this.c = "";
       return;
    }
    public String c(){
       return this.c;
    }
}
