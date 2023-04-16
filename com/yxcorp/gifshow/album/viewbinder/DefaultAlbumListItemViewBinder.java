package com.yxcorp.gifshow.album.viewbinder.DefaultAlbumListItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumListItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import q79.d;

public final class DefaultAlbumListItemViewBinder extends AbsAlbumListItemViewBinder	// class@001ae0
{

    public void DefaultAlbumListItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultAlbumListItemViewBinder.class, "2")) {
          return;
       }
       a.q(p0, "rootView");
       this.l(p0.findViewById(R.id.label));
       this.m(p0.findViewById(R.id.photo_count));
       this.k(p0.findViewById(R.id.icon));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultAlbumListItemViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d06f3, p1, false);
       a.h(view, "inflater.inflate\(R.layou¡­m_flat, container, false\)");
       return view;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DefaultAlbumListItemViewBinder.class, "1")) {
          return;
       }
       this.l(null);
       this.m(null);
       this.k(null);
       return;
    }
}
