package com.yxcorp.gifshow.postentrance.bubblev2.processor.a;
import erd.g;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.postentrance.bubblev2.exception.BubbleThrowable;
import hzb.a;
import kotlin.jvm.internal.a;

public final class a implements g	// class@00103b
{
    public final PublishGuideInfo b;

    public void a(PublishGuideInfo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else if(p0 instanceof BubbleThrowable){
          p0 = p0.getErrorInfo();
          PublishGuideInfo mId = this.b.mId;
          a.o(mId, "bubbleInfo.mId");
          p0.d(mId);
          p0.e(this.b.mType);
       }
       return;
    }
}
