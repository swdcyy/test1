package com.kwai.video_clip.viewbinder.DefaultViewClipFragmentViewBinder;
import com.kwai.video_clip.viewbinder.AbsVideoClipFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import com.kwai.video_clip.widget.VideoSelectView;
import com.kwai.video_clip.widget.CustomHorizontalScroller;
import com.kwai.video_clip.widget.ThumbnailDrawerView;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import o79.i;
import vw7.a;

public final class DefaultViewClipFragmentViewBinder extends AbsVideoClipFragmentViewBinder	// class@001105
{

    public void DefaultViewClipFragmentViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultViewClipFragmentViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       this.s(p0.findViewById(R.id.player_view));
       this.A(p0.findViewById(R.id.select_view));
       this.r(p0.findViewById(R.id.scroll_view));
       this.x(p0.findViewById(R.id.timeline_view));
       this.q(p0.findViewById(R.id.btn_back));
       this.w(p0.findViewById(R.id.btn_ok));
       this.v(p0.findViewById(R.id.video_indicator));
       this.y(p0.findViewById(R.id.timeline_view));
       this.u(p0.findViewById(R.id.text_duration));
       this.t(p0.findViewById(R.id.btn_back));
       this.z(p0.findViewById(R.id.tip_duration));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultViewClipFragmentViewBinder.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = i.o(p0, R.layout.arg_RES_7f0d06e3, p1, false);
       a.h(view, "CommonUtil.inflate\(infla¡­_video, container, false\)");
       return view;
    }
    public boolean h(a p0){
       return false;
    }
    public void onDestroy(){
    }
}
