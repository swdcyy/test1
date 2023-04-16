package com.yxcorp.gifshow.editor.aicutv2.VideoTemplateEditor$aiCutEditorDelegate$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VideoTemplateEditor$aiCutEditorDelegate$1 extends Lambda implements a	// class@001b74
{
    public static final VideoTemplateEditor$aiCutEditorDelegate$1 INSTANCE;

    static {
       VideoTemplateEditor$aiCutEditorDelegate$1.INSTANCE = new VideoTemplateEditor$aiCutEditorDelegate$1();
    }
    public void VideoTemplateEditor$aiCutEditorDelegate$1(){
       super(0);
    }
    public final VideoTemplateFragment invoke(){
       Object obj = PatchProxy.apply(null, this, VideoTemplateEditor$aiCutEditorDelegate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VideoTemplateFragment();
    }
    public Object invoke(){
       return this.invoke();
    }
}
