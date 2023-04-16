package com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import maa.a;
import java.lang.Number;
import xaa.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$1 extends Lambda implements p	// class@001b20
{
    public static final VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$1 INSTANCE;

    static {
       VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$1.INSTANCE = new VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$1();
    }
    public void VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
    public final a invoke(a p0,int p1){
       if (PatchProxy.isSupport(VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$1.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "assetDraft");
       return p0.h0(p1, false);
    }
}
