package com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$SkipTag;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CleanerConfigurationWrapper$SkipTag extends Enum	// class@0012ff
{
    public static final CleanerConfigurationWrapper$SkipTag[] $VALUES;
    public static final CleanerConfigurationWrapper$SkipTag DEFAULT;
    public static final CleanerConfigurationWrapper$SkipTag SCAN;
    public static final CleanerConfigurationWrapper$SkipTag SKIP;
    public static final CleanerConfigurationWrapper$SkipTag SKIP_CHILDREN;

    static {
       CleanerConfigurationWrapper$SkipTag skipTag;
       CleanerConfigurationWrapper$SkipTag[] skipTagArray = new CleanerConfigurationWrapper$SkipTag[]{skipTag,skipTag,skipTag,skipTag};
       skipTag = new CleanerConfigurationWrapper$SkipTag("DEFAULT", 0);
       CleanerConfigurationWrapper$SkipTag.DEFAULT = skipTag;
       skipTag = new CleanerConfigurationWrapper$SkipTag("SCAN", 1);
       CleanerConfigurationWrapper$SkipTag.SCAN = skipTag;
       skipTag = new CleanerConfigurationWrapper$SkipTag("SKIP_CHILDREN", 2);
       CleanerConfigurationWrapper$SkipTag.SKIP_CHILDREN = skipTag;
       skipTag = new CleanerConfigurationWrapper$SkipTag("SKIP", 3);
       CleanerConfigurationWrapper$SkipTag.SKIP = skipTag;
       CleanerConfigurationWrapper$SkipTag.$VALUES = skipTagArray;
    }
    public void CleanerConfigurationWrapper$SkipTag(String p0,int p1){
       super(p0, p1);
    }
    public static CleanerConfigurationWrapper$SkipTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CleanerConfigurationWrapper$SkipTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CleanerConfigurationWrapper$SkipTag.class, p0);
    }
    public static CleanerConfigurationWrapper$SkipTag[] values(){
       Object obj = PatchProxy.apply(null, null, CleanerConfigurationWrapper$SkipTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CleanerConfigurationWrapper$SkipTag.$VALUES.clone();
    }
}
