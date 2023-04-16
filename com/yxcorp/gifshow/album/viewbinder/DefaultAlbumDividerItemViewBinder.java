package com.yxcorp.gifshow.album.viewbinder.DefaultAlbumDividerItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumDividerItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import o79.i;
import q79.d;

public final class DefaultAlbumDividerItemViewBinder extends AbsAlbumDividerItemViewBinder	// class@001ada
{

    public void DefaultAlbumDividerItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultAlbumDividerItemViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultAlbumDividerItemViewBinder.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.q(p0, "inflater");
       View view = i.o(p0, R.layout.arg_RES_7f0d06d6, null, false);
       a.h(view, "CommonUtil.inflate\(infla¡­ider_layout, null, false\)");
       return view;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
    }
}
