package com.yxcorp.gifshow.album.viewbinder.DefaultAlbumTakePhotoItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumTakePhotoItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import o79.i;
import q79.d;

public final class DefaultAlbumTakePhotoItemViewBinder extends AbsAlbumTakePhotoItemViewBinder	// class@001ae1
{

    public void DefaultAlbumTakePhotoItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultAlbumTakePhotoItemViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       this.m(p0.findViewById(R.id.unable_select_mask));
       this.o(p0.findViewById(R.id.ksa_take_photo_layout));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultAlbumTakePhotoItemViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = i.o(p0, R.layout.arg_RES_7f0d06f2, p1, false);
       a.h(view, "CommonUtil.inflate\(infla¡­camera, container, false\)");
       return view;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DefaultAlbumTakePhotoItemViewBinder.class, "2")) {
          return;
       }
       this.m(null);
       this.o(null);
       return;
    }
}
