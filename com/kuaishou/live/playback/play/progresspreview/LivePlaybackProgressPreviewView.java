package com.kuaishou.live.playback.play.progresspreview.LivePlaybackProgressPreviewView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;

public class LivePlaybackProgressPreviewView extends RelativeLayout	// class@000d33
{
    public RelativeLayout b;
    public RelativeLayout c;
    public KwaiImageView d;
    public ImageView e;
    public TextView f;
    public TextView g;

    public void LivePlaybackProgressPreviewView(Context p0){
       super(p0, null);
    }
    public void LivePlaybackProgressPreviewView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LivePlaybackProgressPreviewView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LivePlaybackProgressPreviewView.class, "1")) {
       }else {
          View view = a.k(this, R.layout.arg_RES_7f0d0d31, true);
          this.e = view.findViewById(0x7f0a2315);
          this.d = view.findViewById(0x7f0a2317);
          this.b = view.findViewById(0x7f0a231a);
          this.c = view.findViewById(0x7f0a2313);
          this.f = view.findViewById(0x7f0a2314);
          this.g = view.findViewById(0x7f0a2319);
          this.b.setVisibility(4);
          this.d.setVisibility(4);
          this.d.M(c0.a.b("/udata/pkg/kwai-client-image/live_playback/live_playback_progress_preview_time_mask.png"), null);
       }
       return;
    }
    public void setTotalTimeDisplayText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlaybackProgressPreviewView.class, "4")) {
          return;
       }
       this.g.setText(p0);
       return;
    }
}
