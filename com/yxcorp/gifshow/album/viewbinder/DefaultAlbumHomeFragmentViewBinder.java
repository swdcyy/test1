package com.yxcorp.gifshow.album.viewbinder.DefaultAlbumHomeFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumHomeFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.album.widget.ScrollableLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import o79.i;
import q79.d;

public class DefaultAlbumHomeFragmentViewBinder extends AbsAlbumHomeFragmentViewBinder	// class@001ade
{

    public void DefaultAlbumHomeFragmentViewBinder(Fragment p0){
       a.q(p0, "fragment");
       super(p0);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultAlbumHomeFragmentViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       this.n(p0.findViewById(R.id.view_pager));
       this.m(p0.findViewById(R.id.scrollable_layout));
       this.o(p0.findViewById(R.id.top_custom_area));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultAlbumHomeFragmentViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = i.o(p0, R.layout.arg_RES_7f0d06d7, p1, false);
       a.h(view, "CommonUtil.inflate\(infla¡­agment, container, false\)");
       return view;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DefaultAlbumHomeFragmentViewBinder.class, "2")) {
          return;
       }
       this.n(null);
       this.m(null);
       this.o(null);
       return;
    }
}
