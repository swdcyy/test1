package com.yxcorp.gifshow.album.viewbinder.PreviewItemClickViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import j79.l0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import java.util.Objects;
import o79.d;
import j79.d0;
import w69.k;
import android.view.View;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import o79.i;
import p79.c;
import j79.h0;
import j79.c;
import j79.q;
import u79.o;
import u79.a;
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
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class PreviewItemClickViewBinder extends AbsPreviewItemViewBinder	// class@001afc
{

    public void PreviewItemClickViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public boolean b(l0 p0){
       View view;
       p0 = PatchProxy.applyOneRefs(p0, this, PreviewItemClickViewBinder.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (this.j() instanceof MediaPreviewFragment) {
          MediaPreviewFragment mediaPreview = this.j();
          Objects.requireNonNull(mediaPreview);
          if (!PatchProxy.applyVoid(null, mediaPreview, MediaPreviewFragment.class, "20")) {
             MediaPreviewFragment i = mediaPreview.i;
             if (i != null) {
                boolean b = i.I0();
                String str = (b)? "unclean": "clean";
                d.j("PHOTO_PREVIEW", str);
                int i1 = b ^ 0x01;
                mediaPreview.i.P0(i1);
                MediaPreviewFragment n = mediaPreview.n;
                int i2 = 0x7f060b23;
                if (n != null) {
                   d0 uod0 = d0.class;
                   if (!PatchProxy.isSupport(uod0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), n, uod0, "6")) {
                      if (n.f.r0().o()) {
                         if (b) {
                            view = n.g.o();
                            if (view != null) {
                               view.setBackgroundColor(i.a(i2));
                            }
                         }else {
                            view = n.g.o();
                            if (view != null) {
                               view.setBackgroundColor(i.a(R.color.arg_RES_7f060b26));
                            }
                         }
                      }else {
                         c.k(n.g.o(), b, 300, 0x3f333333);
                      }
                   }
                }
                n = mediaPreview.q;
                if (n != null) {
                   h0 oh0 = h0.class;
                   if (!PatchProxy.isSupport(oh0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), n, oh0, "5")) {
                      if (n.f.r0().o()) {
                         if (b) {
                            view = n.g.o();
                            if (view != null) {
                               view.setBackgroundColor(i.a(i2));
                            }
                         }else {
                            view = n.g.o();
                            if (view != null) {
                               view.setBackgroundColor(i.a(R.color.arg_RES_7f060b26));
                            }
                         }
                      }else {
                         c.k(n.g.o(), b, 300, 0x3f333333);
                      }
                   }
                }
                n = mediaPreview.u;
                if (n != null) {
                   n.a(b);
                }
                i = mediaPreview.o;
                if (i != null) {
                   i.i(i1);
                   mediaPreview.o.h(i1);
                   mediaPreview = mediaPreview.o;
                   Objects.requireNonNull(mediaPreview);
                   if (!PatchProxy.applyVoid(null, mediaPreview, q.class, "10")) {
                      o oo = mediaPreview.e.C();
                      if (oo != null) {
                         oo.g(false);
                      }
                   }
                }
             }
          }
       }
       return true;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PreviewItemClickViewBinder.class, "2")) {
          return;
       }
       a.q(p0, "rootView");
       this.D(p0.findViewById(R.id.preview_bubble_container));
       this.E(p0.findViewById(R.id.preview_bubble_parent));
       this.z(p0.findViewById(R.id.preview_bubble_close));
       int i = this.x();
       if (i) {
          if (i == 2) {
             this.f = p0.findViewById(0x7f0a31f2);
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
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PreviewItemClickViewBinder.class, "3");
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
             a.h(view, "CommonUtil.inflate\(infla¡­,\n          false\n      \)");
             return view;
          }else {
             view = i.o(p0, R.layout.arg_RES_7f0d06fb, p1, false);
             a.h(view, "CommonUtil.inflate\(infla¡­,\n          false\n      \)");
             return view;
          }
       }else {
          view = i.o(p0, R.layout.arg_RES_7f0d06fc, p1, false);
          a.h(view, "CommonUtil.inflate\(infla¡­,\n          false\n      \)");
          return view;
       }
    }
}
