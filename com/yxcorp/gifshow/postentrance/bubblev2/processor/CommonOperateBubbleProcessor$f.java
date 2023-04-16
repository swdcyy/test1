package com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.postentrance.bubblev2.exception.BubbleThrowable;
import java.util.concurrent.TimeoutException;
import rzb.r;
import hzb.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.util.Map;

public final class CommonOperateBubbleProcessor$f implements g	// class@001037
{
    public static final CommonOperateBubbleProcessor$f b;

    static {
       CommonOperateBubbleProcessor$f.b = new CommonOperateBubbleProcessor$f();
    }
    public void CommonOperateBubbleProcessor$f(){
       super();
    }
    public void accept(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonOperateBubbleProcessor$f.class, str)) {
       }else if(p0 instanceof BubbleThrowable && (!p0.getCause() instanceof TimeoutException && !p0.getNotRecordUnAvailable())){
          r c = r.c;
          p0 = p0.getErrorInfo().a();
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(p0, c, r.class, str)) {
             a.p(p0, "bubbleId");
             r.a.put(p0, Boolean.FALSE);
          }
       }
       return;
    }
}
