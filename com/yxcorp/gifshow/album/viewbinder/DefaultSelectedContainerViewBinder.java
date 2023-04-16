package com.yxcorp.gifshow.album.viewbinder.DefaultSelectedContainerViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;
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
import o79.i;
import q79.d;

public final class DefaultSelectedContainerViewBinder extends AbsSelectedContainerViewBinder	// class@001ae5
{

    public void DefaultSelectedContainerViewBinder(Fragment p0){
       a.q(p0, "fragment");
       super(p0);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultSelectedContainerViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       this.r(p0.findViewById(R.id.clock_icon));
       View view = p0.findViewById(R.id.picked_layout);
       a.h(view, "rootView.findViewById\(R.id.picked_layout\)");
       this.u(view);
       this.c = p0.findViewById(0x7f0a308b);
       view = p0.findViewById(R.id.picked_recycler_view);
       a.h(view, "rootView.findViewById\(R.id.picked_recycler_view\)");
       this.v(view);
       this.y(p0.findViewById(R.id.selected_duration));
       this.x(p0.findViewById(R.id.selected_des));
       this.t(p0.findViewById(R.id.next_step));
       this.s(p0.findViewById(R.id.custom_title_area));
       this.z(p0.findViewById(R.id.title_tv_wrapper));
       this.w(p0.findViewById(R.id.right_container));
       this.k = p0.findViewById(0x7f0a364d);
       this.l = p0.findViewById(0x7f0a06ea);
       this.m = p0.findViewById(0x7f0a06e9);
       this.n = p0.findViewById(0x7f0a06ec);
       this.o = p0.findViewById(0x7f0a1798);
       this.p = p0.findViewById(0x7f0a3988);
       this.q = p0.findViewById(0x7f0a3987);
       this.r = p0.findViewById(0x7f0a3989);
       this.s = p0.findViewById(0x7f0a3831);
       this.t = p0.findViewById(0x7f0a05b2);
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultSelectedContainerViewBinder.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = i.o(p0, R.layout.ksa_photo_picker_v4, p1, false);
       a.h(view, "CommonUtil.inflate\(infla¡­ker_v4, container, false\)");
       return view;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
    }
}
