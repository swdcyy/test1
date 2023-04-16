package com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadListAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class VideoTemplateViewBinder$a extends m	// class@001b92
{
    public final VideoTemplateViewBinder c;

    public void VideoTemplateViewBinder$a(VideoTemplateViewBinder p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplateViewBinder$a.class, "1")) {
          return;
       }
       this.c.l.t0(new VideoTemplateLoadListAction());
       return;
    }
}
