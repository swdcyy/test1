package com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt$updateEditMultiBeauty$photoMetaBeauties$1$beauty$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.edit.draft.Beauty;
import com.kuaishou.edit.draft.Attributes;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VideoContextDraftExtKt$updateEditMultiBeauty$photoMetaBeauties$1$beauty$2 extends Lambda implements l	// class@001b1d
{
    public static final VideoContextDraftExtKt$updateEditMultiBeauty$photoMetaBeauties$1$beauty$2 INSTANCE;

    static {
       VideoContextDraftExtKt$updateEditMultiBeauty$photoMetaBeauties$1$beauty$2.INSTANCE = new VideoContextDraftExtKt$updateEditMultiBeauty$photoMetaBeauties$1$beauty$2();
    }
    public void VideoContextDraftExtKt$updateEditMultiBeauty$photoMetaBeauties$1$beauty$2(){
       super(1);
    }
    public final Attributes invoke(Beauty p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContextDraftExtKt$updateEditMultiBeauty$photoMetaBeauties$1$beauty$2.class, "1");
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
