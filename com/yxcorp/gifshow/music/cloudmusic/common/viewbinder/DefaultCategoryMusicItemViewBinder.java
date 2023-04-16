package com.yxcorp.gifshow.music.cloudmusic.common.viewbinder.DefaultCategoryMusicItemViewBinder;
import com.yxcorp.gifshow.music.cloudmusic.common.viewbinder.AbsCategoryMusicItemViewBinder;
import c35.c;
import com.kwai.library.widget.specific.misc.SpectrumView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout;
import com.kwai.library.widget.specific.misc.PlayBackView;
import ekd.m1;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.yxcorp.gifshow.music.utils.CloudMusicViewFactory;

public final class DefaultCategoryMusicItemViewBinder extends AbsCategoryMusicItemViewBinder	// class@00200f
{

    public void DefaultCategoryMusicItemViewBinder(c p0,int p1){
       super(p0, p1);
    }
    public SpectrumView a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AbsCategoryMusicItemViewBinder obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, AbsCategoryMusicItemViewBinder.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.t;
          if (obj == null) {
             a.S("_spectrumView");
          }
       }
       return obj;
    }
    public ConstraintLayout b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AbsCategoryMusicItemViewBinder obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, AbsCategoryMusicItemViewBinder.class, "5");
       if (obj != patchProxyRe) {
       }else {
          obj = this.v;
          if (obj == null) {
             a.S("_contentLayout");
          }
       }
       return obj;
    }
    public TextView c(){
       Object obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o;
    }
    public TextView d(){
       Object obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q;
    }
    public View e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AbsCategoryMusicItemViewBinder obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, AbsCategoryMusicItemViewBinder.class, "7");
       if (obj != patchProxyRe) {
       }else {
          obj = this.w;
          if (obj == null) {
             a.S("_underLayout");
          }
       }
       return obj;
    }
    public KwaiImageView f(){
       Object obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i;
    }
    public TextView g(){
       Object obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n;
    }
    public View h(){
       Object obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p;
    }
    public KwaiImageView i(){
       Object obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j;
    }
    public LinearLayout j(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AbsCategoryMusicItemViewBinder obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, AbsCategoryMusicItemViewBinder.class, "9");
       if (obj != patchProxyRe) {
       }else {
          obj = this.x;
          if (obj == null) {
             a.S("_confirmBtn");
          }
       }
       return obj;
    }
    public PlayBackView k(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AbsCategoryMusicItemViewBinder obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, AbsCategoryMusicItemViewBinder.class, "3");
       if (obj != patchProxyRe) {
       }else {
          obj = this.u;
          if (obj == null) {
             a.S("_playBtn");
          }
       }
       return obj;
    }
    public TextView l(){
       Object obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m;
    }
    public View m(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AbsCategoryMusicItemViewBinder obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, AbsCategoryMusicItemViewBinder.class, "11");
       if (obj != patchProxyRe) {
       }else {
          obj = this.y;
          if (obj == null) {
             a.S("_rootView");
          }
       }
       return obj;
    }
    public TextView n(){
       Object obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k;
    }
    public TextView o(){
       Object obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l;
    }
    public LinearLayout q(){
       Object obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r;
    }
    public LinearLayout r(){
       Object obj = PatchProxy.apply(null, this, DefaultCategoryMusicItemViewBinder.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s;
    }
    public void s(View p0){
       View view;
       AbsCategoryMusicItemViewBinder uAbsCategory = AbsCategoryMusicItemViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultCategoryMusicItemViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "view");
       this.e = m1.f(p0, 0x7f0a3b96);
       this.f = m1.f(p0, 0x7f0a3b97);
       this.g = m1.f(p0, 0x7f0a3b95);
       this.h = m1.f(p0, 0x7f0a3b97);
       this.i = m1.f(p0, 0x7f0a2ca8);
       this.j = m1.f(p0, 0x7f0a09e2);
       this.k = m1.f(p0, 0x7f0a3b3f);
       this.l = m1.f(p0, 0x7f0a0a95);
       this.m = m1.f(p0, 0x7f0a3cc3);
       this.n = m1.f(p0, 0x7f0a2d10);
       this.o = m1.f(p0, 0x7f0a0c57);
       this.p = m1.f(p0, 0x7f0a0c58);
       this.q = m1.f(p0, 0x7f0a4349);
       this.r = m1.f(p0, 0x7f0a0a98);
       this.s = m1.f(p0, 0x7f0a0acd);
       view = m1.f(p0, R.id.spectrum);
       a.o(view, "bindWidget\(view, R.id.spectrum\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsCategory, "2")) {
          a.p(view, "<set-?>");
          this.t = view;
       }
       view = m1.f(p0, R.id.confirm_btn_v2);
       a.o(view, "bindWidget\(view, R.id.confirm_btn_v2\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsCategory, "10")) {
          a.p(view, "<set-?>");
          this.x = view;
       }
       view = m1.f(p0, R.id.play_btn);
       a.o(view, "bindWidget\(view, R.id.play_btn\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsCategory, "4")) {
          a.p(view, "<set-?>");
          this.u = view;
       }
       view = m1.f(p0, R.id.content_layout);
       a.o(view, "bindWidget\(view, R.id.content_layout\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsCategory, "6")) {
          a.p(view, "<set-?>");
          this.v = view;
       }
       p0 = m1.f(p0, R.id.item_root);
       a.o(p0, "bindWidget\(view, R.id.item_root\)");
       if (!PatchProxy.applyVoidOneRefs(p0, this, uAbsCategory, "12")) {
          a.p(p0, "<set-?>");
          this.y = p0;
       }
       return;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultCategoryMusicItemViewBinder.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = CloudMusicViewFactory.a(p1, this.z);
       a.o(view, "CloudMusicViewFactory.cr¡­View\(container, viewType\)");
       return view;
    }
}
