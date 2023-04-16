package com.kuaishou.live.lite.anchorinfo.bottombar.c;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import android.content.Context;
import com.yxcorp.gifshow.model.CDNUrl;
import z1.a;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.lite.anchorinfo.bottombar.LiveLiteAnchorAvatarBottomBarViewModel;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import android.view.View;
import ha1.b;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import p83.m;
import androidx.lifecycle.Observer;
import p83.l;
import p83.i;
import p83.j;
import p83.k;
import com.kuaishou.live.lite.anchorinfo.bottombar.c$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.lite.anchorinfo.bottombar.c$b;
import com.kuaishou.live.lite.anchorinfo.bottombar.c$c;
import com.kuaishou.live.lite.anchorinfo.bottombar.c$d;
import com.google.gson.JsonObject;
import i93.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import java.lang.Integer;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarItemChangeReason;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import kg1.j;
import p83.o;
import ub.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import java.lang.CharSequence;

public class c implements LiveLiteBottomBarService$a	// class@001e51
{
    public final View a;
    public final ViewGroup b;
    public final KwaiImageView c;
    public final ImageView d;
    public final KwaiLottieAnimationView e;
    public final KwaiImageView f;
    public final FrameLayout g;
    public final FrameLayout h;
    public final KwaiCDNImageView i;
    public final TextView j;
    public Integer k;
    public Integer l;
    public Integer m;
    public boolean n;
    public boolean o;

    public void c(Context p0,CDNUrl[] p1,a p2,a p3,a p4,a p5,LifecycleOwner p6,LiveLiteAnchorAvatarBottomBarViewModel p7,LiveData p8){
       super();
       View view = b.b(p0, R.layout.lite_bottom_bar_anchor_avatar_layout);
       this.a = view;
       ViewGroup viewGroup = view.findViewById(R.id.lite_bottom_bar_avatar_follow_layout);
       this.b = viewGroup;
       KwaiImageView kwaiImageVie = view.findViewById(R.id.lite_bottom_bar_avatar_image_view);
       this.c = kwaiImageVie;
       this.d = view.findViewById(0x7f0a17de);
       KwaiLottieAnimationView kwaiLottieAn = view.findViewById(R.id.lite_bottom_bar_avatar_follow_lottie);
       this.e = kwaiLottieAn;
       KwaiImageView kwaiImageVie1 = view.findViewById(R.id.lite_bottom_bar_avatar_fans_group_join_icon);
       this.f = kwaiImageVie1;
       FrameLayout uFrameLayout = view.findViewById(R.id.lite_bottom_bar_avatar_fans_group_level_container);
       this.g = uFrameLayout;
       this.h = view.findViewById(0x7f0a17d9);
       this.i = view.findViewById(0x7f0a17dc);
       this.j = view.findViewById(0x7f0a17dd);
       viewGroup.setVisibility(0);
       kwaiImageVie.setVisibility(0);
       kwaiLottieAn.setVisibility(8);
       kwaiImageVie.U(p1);
       p7.x0().observe(p6, new m(this, p5));
       p8.observe(p6, new l(this));
       if (p7.u0() != null && (p7.v0() != null && p7.w0() != null)) {
          p7.u0().observe(p6, new i(this));
          p7.v0().observe(p6, new j(this));
          p7.w0().observe(p6, new k(this));
       }
    label_00c8 :
       kwaiImageVie.setOnClickListener(new c$a(this, p2));
       viewGroup.setOnClickListener(new c$b(this, p3));
       kwaiImageVie1.setOnClickListener(new c$c(this, p4));
       uFrameLayout.setOnClickListener(new c$d(this, p4));
       return;
    }
    public View a(Context p0){
       return this.a;
    }
    public JsonObject b(){
       return j.a(this);
    }
    public boolean c(){
       return j.e(this);
    }
    public JsonObject d(){
       return j.b(this);
    }
    public void e(){
       View[] viewArray;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       if (this.o != null) {
          if (this.n != null && !PatchProxy.applyVoid(objArray, this, uoc, "5")) {
             viewArray = new View[]{this.b,this.d};
             n.Z(8, viewArray);
             viewArray = new View[]{this.g};
             n.Z(0, viewArray);
             uoc = this.l;
             if (uoc != null && (!uoc.intValue() || this.l.intValue() == 3)) {
                viewArray = new View[]{this.f};
                n.Z(0, viewArray);
                viewArray = new View[]{this.i,this.j};
                n.Z(8, viewArray);
             }else {
                viewArray = new View[]{this.f};
                n.Z(8, viewArray);
                viewArray = new View[]{this.i,this.j};
                n.Z(0, viewArray);
             }
          }
       }else if(PatchProxy.applyVoid(objArray, this, uoc, "4")){
          viewArray = new View[]{this.b,this.d};
          n.Z(0, viewArray);
          viewArray = new View[]{this.g};
          n.Z(8, viewArray);
       }
       return;
    }
    public void f(LiveLiteBottomBarService$BottomBarItemChangeReason p0){
       j.d(this, p0);
    }
    public void g(LiveLiteBottomBarService$BottomBarItemChangeReason p0){
       j.c(this, p0);
    }
    public LiveLiteBottomBarService$BottomBarType getType(){
       return LiveLiteBottomBarService$BottomBarType.AVATAR;
    }
    public final void h(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "6")) {
          return;
       }
       if (this.m != null && this.l != null) {
          if (!PatchProxy.applyVoid(objArray, this, uoc, "7")) {
             if (FansGroupKswitchUtil.a()) {
                this.i.p0(j.a(this.l.intValue(), this.m.intValue()), 0, new o(this));
             }else {
                this.i.n0(j.a(this.l.intValue(), this.m.intValue()));
             }
          }
          this.j.setTextColor(j.b(this.l.intValue(), this.m.intValue()));
          FrameLayout$LayoutParams layoutParams = this.j.getLayoutParams();
          layoutParams.leftMargin = a1.e(j.c(this.m.intValue()));
          this.j.setLayoutParams(layoutParams);
       }
       uoc = this.k;
       if (uoc != null) {
          this.j.setText(String.valueOf(uoc));
       }
       this.e();
       return;
    }
    public boolean i(){
       return j.f(this);
    }
}
