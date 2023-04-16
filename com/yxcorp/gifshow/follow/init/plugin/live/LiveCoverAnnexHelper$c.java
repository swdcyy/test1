package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$c;
import com.kwai.component.feedstaggercard.widget.SimpleDanmakuView$c;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import android.view.View;
import java.lang.Integer;
import i2b.a;
import java.util.Objects;
import sp.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.Color;
import java.util.Collection;

public final class LiveCoverAnnexHelper$c extends SimpleDanmakuView$c	// class@0010ca
{
    public List b;
    public final LiveCoverAnnexHelper c;

    public void LiveCoverAnnexHelper$c(LiveCoverAnnexHelper p0,List p1){
       a.p(p1, "mDmList");
       this.c = p0;
       super();
       this.b = p1;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveCoverAnnexHelper$c.class, "4")) {
          return;
       }
       super.b();
       this.b.clear();
       return;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, LiveCoverAnnexHelper$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public View d(Context p0,int p1,View p2){
       ViewGroup$LayoutParams obj;
       a hierarchy;
       if (PatchProxy.isSupport(LiveCoverAnnexHelper$c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveCoverAnnexHelper$c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "context");
       if (this.c.i()) {
          if (p2 == null) {
             p2 = a.a(p0, R.layout.arg_RES_7f0d05e1);
             a.o(p2, "KwaiLayoutInflater.infla¡­em_vertical_danmaku_item\)");
          }
       }else if(p2 != null){
          Objects.requireNonNull(this.c);
          p2 = a.a(p0, R.layout.arg_RES_7f0d05e0);
          a.o(p2, "KwaiLayoutInflater.infla¡­context, itemLayoutResId\)");
       }
       c uoc = this.b.get(p1);
       if (p2.getTag() == uoc) {
          return p2;
       }else {
          LiveCoverAnnexHelper$c tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidTwoRefs(p2, uoc, tc, LiveCoverAnnexHelper.class, "25")) {
             a.p(p2, "view");
             a.p(uoc, "danmaku");
             KwaiImageView kwaiImageVie = p2.findViewById(R.id.image);
             obj = kwaiImageVie.getLayoutParams();
             String str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
             Objects.requireNonNull(obj, str);
             String str1 = "hierarchy";
             boolean b = false;
             if (uoc.getType() == 3) {
                hierarchy = kwaiImageVie.getHierarchy();
                a.o(hierarchy, str1);
                RoundingParams roundingPara = hierarchy.n();
                if (roundingPara != null) {
                   roundingPara.q(b);
                }
                obj.leftMargin = b;
                obj.bottomMargin = b;
                obj.width = a1.d(0x7f0702d6);
                obj.height = a1.d(0x7f0702d6);
                kwaiImageVie.setPlaceHolderImage(R.drawable.arg_RES_7f0821fc);
             }else {
                hierarchy = kwaiImageVie.getHierarchy();
                a.o(hierarchy, str1);
                hierarchy.L(RoundingParams.a());
                obj.leftMargin = a1.d(0x7f07030a);
                obj.bottomMargin = a1.e(2.50f);
                obj.width = a1.d(0x7f07029e);
                obj.height = a1.d(0x7f07029e);
                kwaiImageVie.setPlaceHolderImage(R.drawable.detail_avatar_secret);
             }
             a.o(kwaiImageVie, "this");
             kwaiImageVie.setLayoutParams(obj);
             kwaiImageVie.L(uoc.getIconUrl());
             TextView textView = p2.findViewById(R.id.content);
             obj = textView.getLayoutParams();
             Objects.requireNonNull(obj, str);
             obj.leftMargin = (uoc.getType() == 3)? a1.d(0x7f0702d6): a1.d(0x7f0702cc);
             a.o(textView, "this");
             textView.setLayoutParams(obj);
             textView.setText(uoc.getContent());
             String color = uoc.getColor();
             if (color == null || !color.length()) {
                b = true;
             }
             if (!b) {
                textView.setTextColor(Color.parseColor(uoc.getColor()));
             }else {
                textView.setTextColor(a1.a(R.color.arg_RES_7f061e52));
             }
             textView.setTag(uoc);
          }
          return p2;
       }
    }
    public final void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverAnnexHelper$c.class, "1")) {
          return;
       }
       a.p(p0, "dmList");
       this.b.addAll(p0);
       return;
    }
    public final List g(){
       return this.b;
    }
}
