package com.yxcorp.gifshow.album.viewbinder.DefaultAlbumAssetFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.album.widget.LoadingView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import o79.i;
import q79.d;

public class DefaultAlbumAssetFragmentViewBinder extends AbsAlbumAssetFragmentViewBinder	// class@001ad8
{

    public void DefaultAlbumAssetFragmentViewBinder(Fragment p0){
       a.q(p0, "fragment");
       super(p0);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultAlbumAssetFragmentViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       this.x(p0);
       this.w(p0.findViewById(R.id.album_view_list));
       this.v(p0.findViewById(R.id.no_file_tv));
       this.u(p0.findViewById(R.id.no_file_sub_tv));
       this.s(p0.findViewById(R.id.no_file_icon));
       this.t(p0.findViewById(R.id.no_file_layout));
       this.r(p0.findViewById(R.id.loading_view));
       this.h = p0.findViewById(0x7f0a2ecc);
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultAlbumAssetFragmentViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = i.h(p0.getContext(), R.layout.ksa_photo_pick_img_fragment, p1, false);
       if (view != null) {
          return view;
       }
       View view1 = i.o(p0, R.layout.ksa_photo_pick_img_fragment, p1, false);
       a.h(view1, "CommonUtil.inflate\(infla¡­agment, container, false\)");
       return view1;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DefaultAlbumAssetFragmentViewBinder.class, "2")) {
          return;
       }
       this.w(null);
       this.v(null);
       this.u(null);
       this.s(null);
       this.t(null);
       this.r(null);
       return;
    }
}
