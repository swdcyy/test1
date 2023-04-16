package com.smile.gifshow.post.profile.viewbinder.MiYouAlbumFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import o79.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import q79.d;
import android.widget.TextView;

public class MiYouAlbumFragmentViewBinder extends AbsAlbumFragmentViewBinder	// class@000c7a
{

    public void MiYouAlbumFragmentViewBinder(Fragment p0){
       a.p(p0, "fragment");
       super(p0);
    }
    public void e(View p0){
       a.p(p0, "rootView");
       super.e(p0);
       this.u(p0.findViewById(R.id.left_btn));
       this.x(p0.findViewById(R.id.view_pager));
       this.t(p0.findViewById(R.id.album_list_container));
       this.v(p0.findViewById(R.id.photo_picker_title_bar));
       this.s(p0.findViewById(R.id.album_list_divider));
       this.r(p0.findViewById(R.id.bottom_container));
       this.z(p0.findViewById(R.id.tabs));
       this.y(p0.findViewById(R.id.preview_frame_cover));
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view;
       a.p(p0, "inflater");
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(0x7f0d0701),p1,Boolean.FALSE,Integer.valueOf(2)};
          view = PatchProxy.apply(objArray, null, oi, "25");
          if (view != PatchProxyResult.class) {
          label_003e :
             a.o(view, "CommonUtil.inflate\(infla¡­cker, container, false,2\)");
             return view;
          }
       }
       view = a.h(p0, R.layout.arg_RES_7f0d0701, p1, 0, 2);
       goto label_003e ;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
       super.onDestroy();
       this.u(null);
       this.x(null);
       this.s(null);
       this.v(null);
       this.t(null);
       this.y(null);
       this.w(null);
    }
}
