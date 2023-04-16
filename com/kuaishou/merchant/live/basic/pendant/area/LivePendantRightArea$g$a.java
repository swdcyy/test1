package com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$g$a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$g;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ms3.c;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import qrd.l1;
import ag6.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import android.view.ViewParent;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import kotlin.jvm.internal.a;
import o07.n;

public final class LivePendantRightArea$g$a implements PopupInterface$f	// class@0018aa
{
    public final LivePendantRightArea$g b;

    public void LivePendantRightArea$g$a(LivePendantRightArea$g p0){
       this.b = p0;
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       l1 a;
       l1 a1;
       p0 = PatchProxy.applyFourRefsWithListener(p0, p1, p2, p3, this, LivePendantRightArea$g$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = this.b.f.c();
       ViewGroup viewGroup = null;
       if (view != null) {
          view.setLayoutParams(new ViewGroup$LayoutParams(a1.e((float)this.b.f.getWidth()), a1.e((float)this.b.f.getHeight())));
          a = l1.a;
       }else {
          view = viewGroup;
       }
       if (view == null) {
          boolean b = false;
          view = a.c(p1, R.layout.arg_RES_7f0d110a, p2, b);
          KwaiImageView kwaiImageVie = view.findViewById(R.id.bubble_image);
          if (!TextUtils.x(this.b.f.getIconUrl())) {
             kwaiImageVie.setVisibility(b);
             kwaiImageVie.L(this.b.f.getIconUrl());
          }
          view.findViewById(R.id.bubble_text).setText(this.b.f.getContent());
          a1 = l1.a;
       }
       ViewParent parent = view.getParent();
       if (parent instanceof ViewGroup) {
          viewGroup = parent;
       }
       if (viewGroup != null) {
          a.h(MerchantCommonLogBiz.ROUTER, "LivePendantRightArea", "bubble parent not null", "materialId", this.b.f.a());
          viewGroup.removeView(view);
       }
       a.m(view);
       PatchProxy.onMethodExit(LivePendantRightArea$g$a.class, "1");
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
