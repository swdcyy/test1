package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.VideoReorderFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.VideoReorderFragment;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mpc.c;
import xvc.f;

public class VideoReorderFragment$a implements ViewModelProvider$Factory	// class@000df9
{
    public final VideoReorderFragment a;

    public void VideoReorderFragment$a(VideoReorderFragment p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, VideoReorderFragment$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new c(this.a.p);
    }
}
