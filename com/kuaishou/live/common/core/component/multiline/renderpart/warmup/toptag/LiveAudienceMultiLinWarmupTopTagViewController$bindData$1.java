package com.kuaishou.live.common.core.component.multiline.renderpart.warmup.toptag.LiveAudienceMultiLinWarmupTopTagViewController$bindData$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.DateUtils;

public final class LiveAudienceMultiLinWarmupTopTagViewController$bindData$1 extends Lambda implements p	// class@0015c5
{
    public static final LiveAudienceMultiLinWarmupTopTagViewController$bindData$1 INSTANCE;

    static {
       LiveAudienceMultiLinWarmupTopTagViewController$bindData$1.INSTANCE = new LiveAudienceMultiLinWarmupTopTagViewController$bindData$1();
    }
    public void LiveAudienceMultiLinWarmupTopTagViewController$bindData$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0.longValue(), p1.booleanValue());
    }
    public final String invoke(long p0,boolean p1){
       String str;
       if (PatchProxy.isSupport(LiveAudienceMultiLinWarmupTopTagViewController$bindData$1.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, LiveAudienceMultiLinWarmupTopTagViewController$bindData$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p1) {
          str = "";
       }else if(p0 <= 0){
          str = "00:00";
       }else {
          str = DateUtils.v(p0);
       }
       return str;
    }
}
