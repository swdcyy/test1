package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.ClipPanelDetachAction$a;
import t36.f$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener$CHANGE_TYPE;

public final class ClipPanelDetachAction$a implements f$a	// class@000dad
{
    public final boolean a;

    public void ClipPanelDetachAction$a(boolean p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipPanelDetachAction$a.class, "1")) {
       }else {
          a.p(p0, "videoFrameChangeListener");
          p0.w(VideoFrameChangeListener$CHANGE_TYPE.ROTATE, this.a);
       }
       return;
    }
}
