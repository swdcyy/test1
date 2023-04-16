package com.yxcorp.gifshow.album.viewbinder.DefaultAlbumListFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumListFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import o79.i;
import q79.d;

public final class DefaultAlbumListFragmentViewBinder extends AbsAlbumListFragmentViewBinder	// class@001adf
{

    public void DefaultAlbumListFragmentViewBinder(Fragment p0){
       a.q(p0, "fragment");
       super(p0);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultAlbumListFragmentViewBinder.class, "2")) {
          return;
       }
       a.q(p0, "rootView");
       this.k(p0.findViewById(R.id.recycler_view));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultAlbumListFragmentViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = i.o(p0, R.layout.arg_RES_7f0d06e4, p1, false);
       a.h(view, "CommonUtil.inflate\(infla¡­layout, container, false\)");
       return view;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DefaultAlbumListFragmentViewBinder.class, "1")) {
          return;
       }
       this.k(null);
       return;
    }
}
