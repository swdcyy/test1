package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b$a;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$d;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderPlayerSwitchAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.VideoReorderFragment$b;

public class b$a extends VideoSDKPlayerView$d	// class@000e0b
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       b$a obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a.q.t0(new ReorderPlayerSwitchAction());
       obj = this.a;
       b u = obj.u;
       if (u != null) {
          u.c(obj.s.isPlaying());
       }
       return false;
    }
}
