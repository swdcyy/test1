package com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.edit.draft.Makeup;
import com.kuaishou.edit.draft.Attributes;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$2 extends Lambda implements l	// class@001b21
{
    public static final VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$2 INSTANCE;

    static {
       VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$2.INSTANCE = new VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$2();
    }
    public void VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$2(){
       super(1);
    }
    public final Attributes invoke(Makeup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContextDraftExtKt$updateEditMultiMakeup$photoMetaMakeups$1$makeup$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.o(p0, "it");
       Attributes attributes = p0.getAttributes();
       a.o(attributes, "it.attributes");
       return attributes;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
