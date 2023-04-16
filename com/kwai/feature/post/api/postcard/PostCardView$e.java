package com.kwai.feature.post.api.postcard.PostCardView$e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class PostCardView$e implements g	// class@001423
{
    public static final PostCardView$e b;

    static {
       PostCardView$e.b = new PostCardView$e();
    }
    public void PostCardView$e(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostCardView$e.class, "1")) {
       }else {
          PostUtils.D("PostCardView", "combineData error: ", p0);
       }
       return;
    }
}
