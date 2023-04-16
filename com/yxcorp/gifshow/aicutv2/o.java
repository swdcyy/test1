package com.yxcorp.gifshow.aicutv2.o;
import erd.o;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import w46.a;
import w46.a$a;
import com.kwai.feature.post.log.PostCommonBiz;
import oa9.b;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;

public final class o implements o	// class@0019b4
{
    public final AICutErrorCode b;

    public void o(AICutErrorCode p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       o oo = PatchProxy.applyOneRefs(p0, this, o.class, "1");
       if (oo != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          a.f.a().g(PostCommonBiz.KUAISHAN, "VideoTemplateProject", "start\(\):  fetchFirstFrameBitmap\(\)");
          oo = this.b;
       }
       return oo;
    }
}
