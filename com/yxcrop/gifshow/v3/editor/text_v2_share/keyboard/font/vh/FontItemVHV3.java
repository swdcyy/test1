package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vh.FontItemVHV3;
import pn9.a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vh.FontItemVHV3$fontImage$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vh.FontItemVHV3$downloadArrow$2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vh.FontItemVHV3$downloadProgressBar$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.MagicFaceDownloadProgressBar;
import android.widget.ProgressBar;
import nn9.b;
import mn9.a;
import java.util.Objects;
import bod.a;
import faa.a;
import java.lang.StringBuilder;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import d0c.a;
import q87.c;
import android.widget.ImageView;
import java.util.List;
import java.util.Collection;
import ekd.q;
import d0c.e;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import aod.b;
import java.lang.Enum;

public final class FontItemVHV3 extends a	// class@000bae
{
    public final KwaiImageView f;
    public final p g;
    public final p h;
    public final p i;

    public void FontItemVHV3(View p0){
       a.p(p0, "itemView");
       super(p0);
       View view = p0.findViewById(R.id.fl_selection);
       a.o(view, "itemView.findViewById\(R.id.fl_selection\)");
       this.f = view;
       this.g = s.c(new FontItemVHV3$fontImage$2(p0));
       this.h = s.c(new FontItemVHV3$downloadArrow$2(p0));
       this.i = s.c(new FontItemVHV3$downloadProgressBar$2(p0));
    }
    public int c(){
       return 0x7f0a1482;
    }
    public void e(View p0,int p1){
       FontItemVHV3 uFontItemVHV = FontItemVHV3.class;
       if (PatchProxy.isSupport(uFontItemVHV) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uFontItemVHV, "6")) {
          return;
       }
       MagicFaceDownloadProgressBar magicFaceDow = PatchProxy.apply(null, this, uFontItemVHV, "3");
       if (magicFaceDow == PatchProxyResult.class) {
          magicFaceDow = this.i.getValue();
       }
       a.o(magicFaceDow, "downloadProgressBar");
       magicFaceDow.setProgress(p1);
       return;
    }
    public void f(b p0,b p1){
       ImageView imageView;
       FontItemVHV3 uFontItemVHV = FontItemVHV3.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uFontItemVHV, "5")) {
          return;
       }
       a.p(p1, "newState");
       a uoa = p1.g();
       Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.model.FontItem");
       Object[] objArray = new Object[0];
       a.D().s("FontItemVH", this.getPosition()+" bind "+uoa.b().c()+' '+p1.d()+' '+uoa.e()+' '+uoa.b().b(), objArray);
       if (!PatchProxy.applyVoidTwoRefs(uoa, p1, this, uFontItemVHV, "4")) {
          String str = (p1.d())? uoa.getId()+"_selected": uoa.getId()+"_unselected";
          KwaiImageView kwaiImageVie = this.i();
          a.o(kwaiImageVie, "fontImage");
          if (a.g(str, kwaiImageVie.getTag())) {
             Object[] objArray1 = new Object[0];
             a.D().w("FontItemVH", "changeBackgroundAndImage tag equals, return", objArray1);
          }else {
             kwaiImageVie = this.i();
             a.o(kwaiImageVie, "fontImage");
             kwaiImageVie.setTag(str);
             uFontItemVHV = this.f;
             int i1 = (p1.d())? 0: 8;
             uFontItemVHV.setVisibility(i1);
             if (!q.f(uoa.b().a())) {
                List list = uoa.b().a();
                if (list != null) {
                   list = e.a.a(list);
                   if (list.isEmpty() ^ 1) {
                      this.i().P(list);
                   }
                }
             }
          }
       }
    label_010d :
       int i = b.a[p1.e().ordinal()];
       if (i != 1 && i != 2) {
          if (i != 3) {
             if (i == 4) {
                imageView = this.h();
                a.o(imageView, "downloadArrow");
                imageView.setVisibility(8);
             }
          }else {
             imageView = this.h();
             a.o(imageView, "downloadArrow");
             imageView.setVisibility(8);
          }
       }else {
          imageView = this.h();
          a.o(imageView, "downloadArrow");
          imageView.setVisibility(0);
       }
       return;
    }
    public final ImageView h(){
       Object obj = PatchProxy.apply(null, this, FontItemVHV3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final KwaiImageView i(){
       Object obj = PatchProxy.apply(null, this, FontItemVHV3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
}
