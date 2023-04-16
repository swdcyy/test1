package com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$recommendIndex$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;
import java.lang.reflect.Type;
import java.lang.Integer;

public final class TagRecommendPageList$recommendIndex$2 extends Lambda implements a	// class@0012be
{
    public static final TagRecommendPageList$recommendIndex$2 INSTANCE;

    static {
       TagRecommendPageList$recommendIndex$2.INSTANCE = new TagRecommendPageList$recommendIndex$2();
    }
    public void TagRecommendPageList$recommendIndex$2(){
       super(0);
    }
    public final int invoke(){
       PublishPageSetting obj = PatchProxy.apply(null, this, TagRecommendPageList$recommendIndex$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.t().getValue("publish_page_settings", PublishPageSetting.class, new PublishPageSetting()).mRecommendTagIndex;
       int i = (obj > null)? obj - 1: 10;
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
