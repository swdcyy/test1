package com.kwai.feature.post.api.feature.story.model.PostStoryParams$StoryCameraCallSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostStoryParams$StoryCameraCallSource extends Enum	// class@0013c8
{
    public static final PostStoryParams$StoryCameraCallSource[] $VALUES;
    public static final PostStoryParams$StoryCameraCallSource SOURCE_CLASS;
    public static final PostStoryParams$StoryCameraCallSource SOURCE_NORMAL;

    static {
       PostStoryParams$StoryCameraCallSource storyCameraC = new PostStoryParams$StoryCameraCallSource("SOURCE_NORMAL", 0);
       PostStoryParams$StoryCameraCallSource.SOURCE_NORMAL = storyCameraC;
       PostStoryParams$StoryCameraCallSource storyCameraC1 = new PostStoryParams$StoryCameraCallSource("SOURCE_CLASS", 1);
       PostStoryParams$StoryCameraCallSource.SOURCE_CLASS = storyCameraC1;
       PostStoryParams$StoryCameraCallSource[] storyCameraC2 = new PostStoryParams$StoryCameraCallSource[]{storyCameraC,storyCameraC1};
       PostStoryParams$StoryCameraCallSource.$VALUES = storyCameraC2;
    }
    public void PostStoryParams$StoryCameraCallSource(String p0,int p1){
       super(p0, p1);
    }
    public static PostStoryParams$StoryCameraCallSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostStoryParams$StoryCameraCallSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostStoryParams$StoryCameraCallSource.class, p0);
    }
    public static PostStoryParams$StoryCameraCallSource[] values(){
       Object obj = PatchProxy.apply(null, null, PostStoryParams$StoryCameraCallSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostStoryParams$StoryCameraCallSource.$VALUES.clone();
    }
}
