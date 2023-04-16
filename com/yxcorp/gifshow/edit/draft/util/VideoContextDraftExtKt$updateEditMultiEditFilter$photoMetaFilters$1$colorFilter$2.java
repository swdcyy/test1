package com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt$updateEditMultiEditFilter$photoMetaFilters$1$colorFilter$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.edit.draft.ColorFilter;
import com.kuaishou.edit.draft.Attributes;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VideoContextDraftExtKt$updateEditMultiEditFilter$photoMetaFilters$1$colorFilter$2 extends Lambda implements l	// class@001b1f
{
    public static final VideoContextDraftExtKt$updateEditMultiEditFilter$photoMetaFilters$1$colorFilter$2 INSTANCE;

    static {
       VideoContextDraftExtKt$updateEditMultiEditFilter$photoMetaFilters$1$colorFilter$2.INSTANCE = new VideoContextDraftExtKt$updateEditMultiEditFilter$photoMetaFilters$1$colorFilter$2();
    }
    public void VideoContextDraftExtKt$updateEditMultiEditFilter$photoMetaFilters$1$colorFilter$2(){
       super(1);
    }
    public final Attributes invoke(ColorFilter p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContextDraftExtKt$updateEditMultiEditFilter$photoMetaFilters$1$colorFilter$2.class, "1");
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
