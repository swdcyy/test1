package com.yxcorp.gifshow.designercreation.widget.VideoPlayerView$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.ImageView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import uzc.b;

public final class VideoPlayerView$d implements View$OnClickListener	// class@00131f
{
    public final VideoPlayerView b;

    public void VideoPlayerView$d(VideoPlayerView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, VideoPlayerView$d.class, "1")) {
          return;
       }
       VideoPlayerView$d tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, VideoPlayerView.class, "11")) {
          boolean b = false;
          tb.h = b;
          VideoPlayerView c = tb.c;
          if (c != null) {
             c.setVisibility(b);
          }
          c = tb.d;
          if (c != null) {
             c.setVisibility(b);
          }
          if (!PatchProxy.applyVoid(objArray, tb, VideoPlayerView.class, "12")) {
             VideoPlayerView l = tb.l;
             if (l != null && l.b()) {
                View view = l.a(R.id.error_container);
                if (view != null) {
                   view.setVisibility(8);
                }
             }
          }
          tb.i();
          tb.e();
       }
       PatchProxy.onMethodExit(VideoPlayerView$d.class, "1");
       return;
    }
}
