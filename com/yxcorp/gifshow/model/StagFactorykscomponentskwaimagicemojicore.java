package com.yxcorp.gifshow.model.StagFactorykscomponentskwaimagicemojicore;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import elb.f;
import com.yxcorp.gifshow.model.ExtractFrameResult$TypeAdapter;
import com.yxcorp.gifshow.model.ExtractFrameVerify;
import com.yxcorp.gifshow.model.ExtractFrameVerify$TypeAdapter;
import elb.g;
import com.yxcorp.gifshow.model.ExtractFrameRules$TypeAdapter;
import com.yxcorp.gifshow.model.ExtractFrameInfo;
import com.yxcorp.gifshow.model.ExtractFrameInfo$TypeAdapter;
import com.yxcorp.gifshow.model.ExtractFrameAttribute;
import com.yxcorp.gifshow.model.ExtractFrameAttribute$TypeAdapter;

public final class StagFactorykscomponentskwaimagicemojicore implements j	// class@001e93
{

    public void StagFactorykscomponentskwaimagicemojicore(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentskwaimagicemojicore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == f.class) {
          return new ExtractFrameResult$TypeAdapter(p0);
       }
       if (rawType == ExtractFrameVerify.class) {
          return new ExtractFrameVerify$TypeAdapter(p0);
       }
       if (rawType == g.class) {
          return new ExtractFrameRules$TypeAdapter(p0);
       }
       if (rawType == ExtractFrameInfo.class) {
          return new ExtractFrameInfo$TypeAdapter(p0);
       }
       if (rawType == ExtractFrameAttribute.class) {
          return new ExtractFrameAttribute$TypeAdapter(p0);
       }
       return null;
    }
}
