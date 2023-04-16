package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vh.FontItemVH;
import pn9.a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vh.FontItemVH$fontImageWrapper$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vh.FontItemVH$fontImage$2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vh.FontItemVH$downloadArrow$2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vh.FontItemVH$downloadProgressBar$2;
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
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import vz6.a;
import lnc.a1;
import android.widget.RelativeLayout;
import a2.i0;
import java.io.File;
import com.yxcorp.gifshow.postfont.FontEnv;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.List;
import java.util.Collection;
import ekd.q;
import d0c.e;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import aod.a;
import java.lang.Enum;

public final class FontItemVH extends a	// class@000baa
{
    public final p f;
    public final p g;
    public final p h;
    public final p i;

    public void FontItemVH(View p0){
       a.p(p0, "itemView");
       super(p0);
       this.f = s.c(new FontItemVH$fontImageWrapper$2(p0));
       this.g = s.c(new FontItemVH$fontImage$2(p0));
       this.h = s.c(new FontItemVH$downloadArrow$2(p0));
       this.i = s.c(new FontItemVH$downloadProgressBar$2(p0));
    }
    public int c(){
       return 0x7f0a1482;
    }
    public void e(View p0,int p1){
       FontItemVH uFontItemVH = FontItemVH.class;
       if (PatchProxy.isSupport(uFontItemVH) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uFontItemVH, "7")) {
          return;
       }
       MagicFaceDownloadProgressBar magicFaceDow = PatchProxy.apply(null, this, uFontItemVH, "4");
       if (magicFaceDow == PatchProxyResult.class) {
          magicFaceDow = this.i.getValue();
       }
       a.o(magicFaceDow, "downloadProgressBar");
       magicFaceDow.setProgress(p1);
       return;
    }
    public void f(b p0,b p1){
       Object obj = this;
       ImageView obj1 = p1;
       FontItemVH uFontItemVH = FontItemVH.class;
       if (PatchProxy.applyVoidTwoRefs(p0, obj1, obj, uFontItemVH, "6")) {
          return;
       }
       a.p(obj1, "newState");
       a uoa = p1.g();
       Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.model.FontItem");
       Object[] objArray = new Object[0];
       String str = "FontItemVH";
       a.D().s(str, this.getPosition()+" bind "+uoa.b().c()+' '+p1.d()+' '+uoa.e()+' '+uoa.b().b(), objArray);
       int i = 1;
       if (!PatchProxy.applyVoidTwoRefs(uoa, obj1, obj, uFontItemVH, "5")) {
          String str1 = (p1.d())? uoa.getId()+"_selected": uoa.getId()+"_unselected";
          KwaiImageView kwaiImageVie = this.i();
          String str2 = "fontImage";
          a.o(kwaiImageVie, str2);
          if (a.g(str1, kwaiImageVie.getTag())) {
             Object[] objArray1 = new Object[0];
             a.D().w(str, "changeBackgroundAndImage tag equals, return", objArray1);
          }else {
             kwaiImageVie = this.i();
             a.o(kwaiImageVie, str2);
             kwaiImageVie.setTag(str1);
             Drawable uDrawable = null;
             if (p1.d()) {
                KwaiImageView kwaiImageVie1 = this.i();
                a.o(kwaiImageVie1, str2);
                kwaiImageVie1.setBackground(uDrawable);
                a uoa1 = new a(1, a1.e(16.00f), -1, 0xff000000, 20, a1.e(6.00f), 0, a1.e(4.00f));
                i0.v0(this.j(), kwaiImageVie1);
                str1 = uoa.b().b();
                if (str1 != null) {
                   this.i().v(new File(FontEnv.a(), str1), -1, -1);
                }
             }else {
                RelativeLayout relativeLayo = this.j();
                a.o(relativeLayo, "fontImageWrapper");
                relativeLayo.setBackground(uDrawable);
                this.i().setBackgroundResource(R.drawable.arg_RES_7f080c7a);
                if (!q.f(uoa.b().a())) {
                   List list = uoa.b().a();
                   if (list != null) {
                      list = e.a.a(list);
                      if (list.isEmpty() ^ i) {
                         this.i().P(list);
                      }
                   }
                }
             }
          }
       }
    label_016c :
       int i1 = a.a[p1.e().ordinal()];
       if (i1 != i && i1 != 2) {
          if (i1 != 3) {
             if (i1 == 4) {
                obj1 = this.h();
                a.o(obj1, "downloadArrow");
                obj1.setVisibility(8);
             }
          }else {
             obj1 = this.h();
             a.o(obj1, "downloadArrow");
             obj1.setVisibility(8);
          }
       }else {
          obj1 = this.h();
          a.o(obj1, "downloadArrow");
          obj1.setVisibility(0);
       }
       return;
    }
    public final ImageView h(){
       Object obj = PatchProxy.apply(null, this, FontItemVH.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final KwaiImageView i(){
       Object obj = PatchProxy.apply(null, this, FontItemVH.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final RelativeLayout j(){
       Object obj = PatchProxy.apply(null, this, FontItemVH.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
}
