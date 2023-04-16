package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PicTemplateState$ResourceState extends Enum	// class@001343
{
    public static final PicTemplateState$ResourceState[] $VALUES;
    public static final PicTemplateState$ResourceState LOADING;
    public static final PicTemplateState$ResourceState MISSING;
    public static final PicTemplateState$ResourceState READY;
    public static final PicTemplateState$ResourceState UNKNOWN;

    static {
       PicTemplateState$ResourceState resourceStat1;
       PicTemplateState$ResourceState[] resourceStat = new PicTemplateState$ResourceState[]{resourceStat1,resourceStat1,resourceStat1,resourceStat1};
       resourceStat1 = new PicTemplateState$ResourceState("UNKNOWN", 0);
       PicTemplateState$ResourceState.UNKNOWN = resourceStat1;
       resourceStat1 = new PicTemplateState$ResourceState("MISSING", 1);
       PicTemplateState$ResourceState.MISSING = resourceStat1;
       resourceStat1 = new PicTemplateState$ResourceState("LOADING", 2);
       PicTemplateState$ResourceState.LOADING = resourceStat1;
       resourceStat1 = new PicTemplateState$ResourceState("READY", 3);
       PicTemplateState$ResourceState.READY = resourceStat1;
       PicTemplateState$ResourceState.$VALUES = resourceStat;
    }
    public void PicTemplateState$ResourceState(String p0,int p1){
       super(p0, p1);
    }
    public static PicTemplateState$ResourceState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PicTemplateState$ResourceState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PicTemplateState$ResourceState.class, p0);
    }
    public static PicTemplateState$ResourceState[] values(){
       Object obj = PatchProxy.apply(null, null, PicTemplateState$ResourceState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PicTemplateState$ResourceState.$VALUES.clone();
    }
}
