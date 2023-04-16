package com.kuaishou.live.core.voiceparty.micmanager.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ty5.d;
import com.kwai.library.widget.popup.common.c;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.d0;
import android.app.Activity;
import d61.y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import co2.u1;
import co2.v1;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import au2.c;
import au2.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import com.kwai.feature.component.searchhistory.SearchLayout;
import java.lang.CharSequence;
import android.graphics.drawable.GradientDrawable;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.EditText;
import com.kuaishou.live.core.voiceparty.micmanager.VoicePartyMicManagerFragment;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import yx2.l;
import co2.f2;
import java.lang.Integer;
import ps2.n;
import o07.n;
import ty5.c;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.online.search.VoicePartySearchOnlineFragment;

public class b extends c implements PopupInterface$f, d	// class@00155f
{
    public VoicePartySearchOnlineFragment p;
    public b q;
    public String r;
    public int s;
    public boolean t;
    public TextView u;
    public f2 v;
    public int w;
    public r1 x;
    public a0 y;
    public m z;
    public static final int A;

    static {
       b.A = a1.d(0x7f07042c);
    }
    public void b(c$b p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d0 uod0 = d0.class;
       super(p0);
       if (y.d(this.u())) {
          Activity uActivity = this.u();
          u1 ou1 = PatchProxy.applyOneRefs(uActivity, null, uod0, "7");
          if (ou1 != patchProxyRe) {
          }else {
             ou1 = new u1(uActivity);
          }
          p0.F(ou1);
          uActivity = this.u();
          v1 ov1 = PatchProxy.applyOneRefs(uActivity, null, uod0, "8");
          if (ov1 != patchProxyRe) {
          }else {
             ov1 = new v1(uActivity);
          }
          p0.N(ov1);
       }else {
          p0.F(d0.f());
          p0.N(d0.g());
       }
       p0.L(this);
       return;
    }
    public void O(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       c.b(this.z.b(), this.z.a(), this.z.y(), this.w);
       return;
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       b tq = this.q;
       if (tq != null) {
          tq.e();
       }
       c.a(this.z.b(), this.z.a(), this.z.y(), "SEARCH_CARD");
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       int b;
       String str;
       b uob = b.class;
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       b = false;
       View view = a.g(p1, R.layout.arg_RES_7f0d16b9, p2, b);
       ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
       int i = -1;
       int i1 = (y.d(this.u()))? -1: a1.e(0x43cf0000);
       layoutParams.height = i1;
       if (y.d(this.u())) {
          i = a1.e(300.00f);
       }
       layoutParams.width = i;
       view.setLayoutParams(layoutParams);
       View$OnClickListener onClickListe = null;
       view.setOnClickListener(onClickListe);
       if (!PatchProxy.applyVoidOneRefs(view, this, uob, "5")) {
          SearchLayout searchLayout = view.findViewById(R.id.voice_party_online_search_layout);
          searchLayout.setShowSearchSuggest(b);
          searchLayout.setSearchHint(a1.p(R.string.arg_RES_7f100f55));
          searchLayout.setSearchListener(this);
          GradientDrawable gradientDraw = new GradientDrawable();
          gradientDraw.setColor(ContextCompat.getColor(this.u(), R.color.arg_RES_7f06170d));
          gradientDraw.setCornerRadius((float)b.A);
          view.findViewById(R.id.search_inputbox).setBackground(gradientDraw);
          view.findViewById(R.id.cancel_button).setTextColor(ContextCompat.getColor(this.u(), R.color.arg_RES_7f061fa8));
          view.findViewById(R.id.editor).setTextColor(ContextCompat.getColor(this.u(), R.color.arg_RES_7f061f7d));
       }
       if (!PatchProxy.applyVoid(onClickListe, this, uob, "9")) {
          VoicePartyMicManagerFragment voicePartyMi = VoicePartyMicManagerFragment.Lh(this.z.getLiveStreamId(), this.r, this.t, this.s, this.z.a(), this.z.y(), this.z.b(), this.q);
          e uoe = this.u().getSupportFragmentManager().beginTransaction();
          uoe.g(R.id.live_voice_party_online_users_container, voicePartyMi, voicePartyMi.getClass().getSimpleName());
          uoe.m();
       }
       if (!PatchProxy.applyVoidOneRefs(view, this, uob, "6")) {
          View view1 = view.findViewById(R.id.live_anchor_aboard_mic_container);
          if (this.x != null && l.a()) {
             view1.setVisibility(b);
             TextView textView = view.findViewById(R.id.voice_party_mic_aboard_mode);
             this.u = textView;
             b = this.v.g();
             if (PatchProxy.isSupport(l.class)) {
                str = PatchProxy.applyOneRefs(Integer.valueOf(b), onClickListe, l.class, "7");
                if (str != PatchProxyResult.class) {
                }else if(b != 1){
                   if (b != 2) {
                      str = (b != 3)? "": a1.p(R.string.arg_RES_7f101f59);
                   }else {
                      str = a1.p(R.string.arg_RES_7f102de8);
                   }
                }else {
                   str = a1.p(R.string.arg_RES_7f102de7);
                }
             }else {
                goto label_0155 ;
             }
             textView.setText(str);
             this.u.setOnClickListener(new n(this));
          }else {
             view1.setVisibility(8);
          }
       }
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
    public void ke(String p0,boolean p1){
       c.b(this, p0, p1);
    }
    public void qc(String p0,boolean p1,String p2){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, b.class, "10")) {
          return;
       }
       b tp = this.p;
       if (tp != null && tp.isAdded()) {
          this.p.Hh(p0);
       }else if(PatchProxy.applyVoidOneRefs(p0, this, uob, "7")){
          if (this.p == null) {
             this.p = VoicePartySearchOnlineFragment.Gh(this.z.getLiveStreamId(), this.r, this.t, this.s, this.q, this.z.a(), this.z.y(), this.z.b());
          }
          this.p.Hh(p0);
          e uoe = this.u().getSupportFragmentManager().beginTransaction();
          uob = this.p;
          uoe.g(R.id.live_voice_party_online_users_container, uob, uob.getClass().getSimpleName());
          uoe.m();
       }
       tp = this.q;
       if (tp != null) {
          tp.b(p0);
       }
       c.a(this.z.b(), this.z.a(), this.z.y(), "SEARCH");
       return;
    }
    public void s7(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "12")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uob, "8")) {
          b tp = this.p;
          if (tp != null && tp.isAdded()) {
             this.u().getSupportFragmentManager().beginTransaction().u(this.p).m();
          }
       }
       return;
    }
}
