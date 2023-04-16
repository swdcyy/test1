package com.smile.gifshow.post.profile.viewbinder.MiYouAlbumAssetFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.album.widget.LoadingView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import o79.i;
import q79.d;

public class MiYouAlbumAssetFragmentViewBinder extends AbsAlbumAssetFragmentViewBinder	// class@000c79
{

    public void MiYouAlbumAssetFragmentViewBinder(Fragment p0){
       a.p(p0, "fragment");
       super(p0);
    }
    public void e(View p0){
       a.p(p0, "rootView");
       this.x(p0);
       this.w(p0.findViewById(R.id.album_view_list));
       this.v(p0.findViewById(R.id.no_file_tv));
       this.u(p0.findViewById(R.id.no_file_sub_tv));
       this.s(p0.findViewById(R.id.no_file_icon));
       this.t(p0.findViewById(R.id.no_file_layout));
       this.r(p0.findViewById(R.id.loading_view));
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       a.p(p0, "inflater");
       View view = i.o(p0, R.layout.arg_RES_7f0d0700, p1, false);
       a.o(view, "CommonUtil.inflate\(infla¡­agment, container, false\)");
       return view;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
       this.w(null);
       this.v(null);
       this.u(null);
       this.s(null);
       this.t(null);
       this.r(null);
    }
}
