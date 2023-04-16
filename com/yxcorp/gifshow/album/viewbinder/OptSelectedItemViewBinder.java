package com.yxcorp.gifshow.album.viewbinder.OptSelectedItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.kwai.moved.impls.widget.KsAlbumScaleLayout;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import o79.i;
import q79.d;

public final class OptSelectedItemViewBinder extends AbsSelectedItemViewBinder	// class@001afb
{

    public void OptSelectedItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OptSelectedItemViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       this.t(p0.findViewById(R.id.media_preview));
       this.s(p0.findViewById(R.id.scale_layout));
       this.r(p0.findViewById(R.id.media_duration));
       this.q(p0.findViewById(R.id.delete_img));
       this.u(p0.findViewById(R.id.select_view));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, OptSelectedItemViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = i.o(p0, R.layout.arg_RES_7f0d06f6, p1, false);
       a.h(view, "CommonUtil.inflate\(infla¡­eo_opt, container, false\)");
       return view;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, OptSelectedItemViewBinder.class, "2")) {
          return;
       }
       this.t(null);
       this.r(null);
       this.s(null);
       this.q(null);
       return;
    }
}
