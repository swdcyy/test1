package com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment$a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment;

public final class VideoTemplateFragment$a$a implements Runnable	// class@001b8e
{
    public final VideoTemplateFragment$a b;

    public void VideoTemplateFragment$a$a(VideoTemplateFragment$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VideoTemplateFragment$a$a.class, "1")) {
          return;
       }
       this.b.b.qh().remove(this.b);
       VideoTemplateFragment$a b = this.b.b;
       VideoTemplateFragment n = b.N;
       if (n != null) {
          b.qh().remove(n);
       }
       return;
    }
}
