package com.yxcorp.gifshow.album.viewbinder.ShareSelectContainerAlbumFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import o79.i;
import q79.d;

public final class ShareSelectContainerAlbumFragmentViewBinder extends AbsAlbumFragmentViewBinder	// class@001afe
{

    public void ShareSelectContainerAlbumFragmentViewBinder(Fragment p0){
       a.q(p0, "fragment");
       super(p0);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareSelectContainerAlbumFragmentViewBinder.class, "2")) {
          return;
       }
       a.q(p0, "rootView");
       super.e(p0);
       this.u(p0.findViewById(R.id.left_btn));
       this.x(p0.findViewById(R.id.view_pager));
       this.t(p0.findViewById(R.id.album_list_container));
       this.v(p0.findViewById(R.id.photo_picker_title_bar));
       this.s(p0.findViewById(R.id.album_list_divider));
       this.r(p0.findViewById(R.id.bottom_container));
       this.z(p0.findViewById(R.id.tabs));
       this.y(p0.findViewById(R.id.preview_frame_cover));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ShareSelectContainerAlbumFragmentViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = i.h(p0.getContext(), R.layout.ksa_album_fragment_select_container_top, null, false);
       if (view != null) {
          return view;
       }
       View view1 = i.o(p0, R.layout.ksa_album_fragment_select_container_top, p1, false);
       a.h(view1, "CommonUtil.inflate\(infla¡­er_top, container, false\)");
       return view1;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ShareSelectContainerAlbumFragmentViewBinder.class, "1")) {
          return;
       }
       super.onDestroy();
       this.u(null);
       this.x(null);
       this.s(null);
       this.v(null);
       this.t(null);
       this.y(null);
       return;
    }
}
