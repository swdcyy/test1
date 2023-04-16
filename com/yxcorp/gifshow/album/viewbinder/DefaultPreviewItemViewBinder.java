package com.yxcorp.gifshow.album.viewbinder.DefaultPreviewItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import j79.l0;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.album.widget.preview.KSAPassThroughEventView;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import o79.i;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class DefaultPreviewItemViewBinder extends AbsPreviewItemViewBinder	// class@001ae3
{

    public void DefaultPreviewItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public boolean b(l0 p0){
       return false;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPreviewItemViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       this.D(p0.findViewById(R.id.preview_bubble_container));
       this.E(p0.findViewById(R.id.preview_bubble_parent));
       this.z(p0.findViewById(R.id.preview_bubble_close));
       int i = this.x();
       if (i) {
          if (i == 2) {
             this.C(p0.findViewById(R.id.player_seekbar));
             this.B(p0.findViewById(R.id.ksa_current_time_view));
             this.H(p0.findViewById(R.id.ksa_total_time_view));
             this.F(p0.findViewById(R.id.ksa_preview_video));
          }
       }else {
          this.G(p0.findViewById(R.id.ksa_preview_image));
          this.I(p0.findViewById(R.id.ksa_preview_image_2));
          this.A(p0.findViewById(R.id.preview_cover_image));
          this.y(p0.findViewById(R.id.touch_view));
       }
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultPreviewItemViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       int i = this.x();
       if (i) {
          if (i != 1) {
             if (i != 2) {
                throw new IllegalArgumentException("view type : "+this.x()+" is wrong");
             }
             view = i.o(p0, R.layout.arg_RES_7f0d06fe, p1, false);
             a.h(view, "CommonUtil.inflate\(infla¡­er,\n        false\n      \)");
             return view;
          }else {
             view = i.o(p0, R.layout.arg_RES_7f0d06fb, p1, false);
             a.h(view, "CommonUtil.inflate\(infla¡­er,\n        false\n      \)");
             return view;
          }
       }else {
          view = i.o(p0, R.layout.arg_RES_7f0d06fc, p1, false);
          a.h(view, "CommonUtil.inflate\(infla¡­er,\n        false\n      \)");
          return view;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DefaultPreviewItemViewBinder.class, "2")) {
          return;
       }
       super.onDestroy();
       return;
    }
}
