package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.VideoReorderSelectedContainerViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.VideoReorderSelectedContainerViewBinder$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import q79.d;
import java.lang.Boolean;

public final class VideoReorderSelectedContainerViewBinder extends AbsSelectedContainerViewBinder	// class@000e09
{
    public static final VideoReorderSelectedContainerViewBinder$a v;

    static {
       VideoReorderSelectedContainerViewBinder.v = new VideoReorderSelectedContainerViewBinder$a(null);
    }
    public void VideoReorderSelectedContainerViewBinder(Fragment p0){
       a.p(p0, "fragment");
       super(p0);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoReorderSelectedContainerViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       this.r(p0.findViewById(R.id.clock_icon));
       View view = p0.findViewById(R.id.picked_layout);
       a.o(view, "rootView.findViewById\(R.id.picked_layout\)");
       this.u(view);
       view = p0.findViewById(R.id.picked_recycler_view);
       a.o(view, "rootView.findViewById\(R.id.picked_recycler_view\)");
       this.v(view);
       this.y(p0.findViewById(R.id.selected_duration));
       this.x(p0.findViewById(R.id.selected_des));
       this.t(p0.findViewById(R.id.next_step));
       this.s(p0.findViewById(R.id.custom_title_area));
       this.z(p0.findViewById(R.id.title_tv_wrapper));
       this.w(p0.findViewById(R.id.right_container));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VideoReorderSelectedContainerViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.ksa_photo_picker_v4, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­ker_v4, container, false\)");
       return view;
    }
    public boolean g(d p0){
       p0 = PatchProxy.applyOneRefs(p0, this, VideoReorderSelectedContainerViewBinder.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return true;
    }
    public void onDestroy(){
    }
}
