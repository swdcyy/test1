package com.yxcorp.gifshow.log.PostLogger$FeatureName;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostLogger$FeatureName extends Enum	// class@001aeb
{
    public static final PostLogger$FeatureName[] $VALUES;
    public static final PostLogger$FeatureName EDIT;
    public static final PostLogger$FeatureName PUBLISH;

    static {
       PostLogger$FeatureName uFeatureName1;
       PostLogger$FeatureName[] uFeatureName = new PostLogger$FeatureName[]{uFeatureName1,uFeatureName1};
       uFeatureName1 = new PostLogger$FeatureName("EDIT", 0);
       PostLogger$FeatureName.EDIT = uFeatureName1;
       uFeatureName1 = new PostLogger$FeatureName("PUBLISH", 1);
       PostLogger$FeatureName.PUBLISH = uFeatureName1;
       PostLogger$FeatureName.$VALUES = uFeatureName;
    }
    public void PostLogger$FeatureName(String p0,int p1){
       super(p0, p1);
    }
    public static PostLogger$FeatureName valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostLogger$FeatureName.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostLogger$FeatureName.class, p0);
    }
    public static PostLogger$FeatureName[] values(){
       Object obj = PatchProxy.apply(null, null, PostLogger$FeatureName.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostLogger$FeatureName.$VALUES.clone();
    }
}
