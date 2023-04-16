package com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.vh.NormalLyricItemVH;
import pn9.a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.vh.NormalLyricItemVH$progressBar$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import android.widget.ProgressBar;
import nn9.b;
import mn9.a;
import java.util.Objects;
import src.g;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import xrc.b;
import java.lang.Enum;

public final class NormalLyricItemVH extends a	// class@0010de
{
    public final KwaiImageView f;
    public final ImageView g;
    public final p h;
    public final ImageView i;

    public void NormalLyricItemVH(View p0){
       a.p(p0, "itemView");
       super(p0);
       this.f = p0.findViewById(0x7f0a130c);
       this.g = p0.findViewById(0x7f0a381a);
       this.h = s.c(new NormalLyricItemVH$progressBar$2(p0));
       this.i = p0.findViewById(0x7f0a4329);
    }
    public int c(){
       return 0x7f0a0c1b;
    }
    public void e(View p0,int p1){
       NormalLyricItemVH normalLyricI = NormalLyricItemVH.class;
       if (PatchProxy.isSupport(normalLyricI) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, normalLyricI, "3")) {
          return;
       }
       DownloadProgressBar uDownloadPro = PatchProxy.apply(null, this, normalLyricI, "1");
       if (uDownloadPro == PatchProxyResult.class) {
          uDownloadPro = this.h.getValue();
       }
       a.o(uDownloadPro, "progressBar");
       uDownloadPro.setProgress(p1);
       return;
    }
    public void f(b p0,b p1){
       NormalLyricItemVH ti1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NormalLyricItemVH.class, "2")) {
          return;
       }
       a.p(p1, "newState");
       a uoa = p1.g();
       Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.music_v2.model.LyricItem");
       NormalLyricItemVH tf = this.f;
       g c = uoa.c;
       if (c == null) {
          c = new ArrayList();
       }
       tf.P(c);
       tf = this.g;
       a.o(tf, "indicator");
       tf.setSelected(p1.d());
       int i = b.a[p1.e().ordinal()];
       if (i != 1 && i != 2) {
          if (i != 3) {
             if (i == 4) {
                ti1 = this.i;
                a.o(ti1, "downloadArrow");
                ti1.setVisibility(8);
             }
          }else {
             ti1 = this.i;
             a.o(ti1, "downloadArrow");
             ti1.setVisibility(8);
          }
       }else {
          ti1 = this.i;
          a.o(ti1, "downloadArrow");
          ti1.setVisibility(0);
       }
       if (uoa.u()) {
          NormalLyricItemVH ti = this.i;
          a.o(ti, "downloadArrow");
          ti.setVisibility(8);
       }
       return;
    }
}
