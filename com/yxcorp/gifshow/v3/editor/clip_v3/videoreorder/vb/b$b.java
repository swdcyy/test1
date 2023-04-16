package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b$b;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$e;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b;
import com.kwai.video.editorsdk2.PreviewPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderPlayerAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.lang.Double;
import com.kwai.video.editorsdk2.RenderPosDetail;
import tvc.f;
import androidx.lifecycle.LiveData;
import jpc.a;
import java.util.List;
import tvc.e;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderItemChangeAction;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import lnc.i1;

public class b$b extends VideoSDKPlayerView$e	// class@000e0c
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void onEnd(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       this.a.s.seekToStart();
       this.a.q.t0(new ReorderPlayerAction(false, false, false));
       return;
    }
    public void onTimeUpdate(PreviewPlayer p0,double p1){
       if (PatchProxy.isSupport(b$b.class) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, b$b.class, "2")) {
          return;
       }
       p0.v = p1;
       return;
    }
    public void onTimeUpdateWithRenderPosDetail(PreviewPlayer p0,RenderPosDetail p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "3")) {
          return;
       }
       int i = this.a.q.r0().getValue().f().size();
       if (p1.getTrackAssetIndex() < 0 || p1.getTrackAssetIndex() >= i) {
          i1.c(new RuntimeException("error index out of bound renderPosDetail.getTrackAssetIndex\(\):"+p1.getTrackAssetIndex()));
          return;
       }else if(p1.getTrackAssetIndex() != this.a.q.o0().c() && this.a.s.isPlaying()){
          this.a.q.t0(new ReorderItemChangeAction(p1.getTrackAssetIndex(), false));
       }
       return;
    }
}
