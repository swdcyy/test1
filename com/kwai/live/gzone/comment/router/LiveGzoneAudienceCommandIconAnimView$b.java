package com.kwai.live.gzone.comment.router.LiveGzoneAudienceCommandIconAnimView$b;
import ub.a;
import com.kwai.live.gzone.comment.router.LiveGzoneAudienceCommandIconAnimView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class LiveGzoneAudienceCommandIconAnimView$b extends a	// class@000ca1
{
    public final KwaiImageView b;
    public final LiveGzoneAudienceCommandIconAnimView c;

    public void LiveGzoneAudienceCommandIconAnimView$b(LiveGzoneAudienceCommandIconAnimView p0,KwaiImageView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneAudienceCommandIconAnimView$b.class, "1")) {
          return;
       }
       this.b.setImageResource(R.drawable.arg_RES_7f08122c);
       p0.n = true;
       return;
    }
}
