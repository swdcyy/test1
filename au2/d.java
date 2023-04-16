package au2.d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ty5.d;
import com.kwai.library.widget.popup.common.c;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kuaishou.live.core.voiceparty.d0;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import bu2.a;
import android.app.Activity;
import android.view.Window;
import p91.m;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import au2.c;
import au2.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import android.view.View$OnClickListener;
import com.kwai.feature.component.searchhistory.SearchLayout;
import java.lang.CharSequence;
import android.graphics.drawable.GradientDrawable;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.EditText;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUserFragment;
import java.lang.Boolean;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import o07.n;
import ty5.c;
import com.kuaishou.live.core.voiceparty.online.search.VoicePartySearchOnlineFragment;

public class d extends c implements PopupInterface$f, d	// class@0002cc
{
    public VoicePartySearchOnlineFragment p;
    public b q;
    public String r;
    public int s;
    public PresenterV2 t;
    public a0 u;
    public r1 v;
    public m w;
    public int x;
    public static final int y;

    static {
       d.y = a1.d(0x7f07042c);
    }
    public void d(c$b p0){
       super(p0);
       p0.F(d0.f());
       p0.N(d0.g());
       p0.L(this);
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       this.t.destroy();
       return;
    }
    public void O(Bundle p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "3")) {
          return;
       }
       View view = this.z();
       if (!PatchProxy.applyVoidOneRefs(view, this, uod, "5")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.t = presenterV2;
          presenterV2.U7(new a(this.u().getWindow(), this.w));
          this.t.f(view);
       }
       d tt = this.t;
       Object[] objArray = new Object[2];
       objArray[0] = this;
       int i = 1;
       d tv = this.v;
       if (tv == null) {
          tv = this.u;
       }
       objArray[i] = tv;
       tt.i(objArray);
       c.b(this.w.b(), this.w.a(), this.w.y(), this.x);
       return;
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       d tq = this.q;
       if (tq != null) {
          tq.e();
       }
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       VoicePartyOnlineUserFragment voicePartyOn;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, d.class, "2");
       if (p0 != patchProxyRe) {
          return p0;
       }
       boolean b = false;
       View view = a.g(p1, R.layout.arg_RES_7f0d16d2, p2, b);
       View$OnClickListener onClickListe = null;
       view.setOnClickListener(onClickListe);
       if (!PatchProxy.applyVoidOneRefs(view, this, uod, "6")) {
          SearchLayout searchLayout = view.findViewById(R.id.voice_party_online_search_layout);
          searchLayout.setShowSearchSuggest(b);
          searchLayout.setSearchHint(a1.p(R.string.arg_RES_7f100f55));
          searchLayout.setSearchListener(this);
          GradientDrawable gradientDraw = new GradientDrawable();
          gradientDraw.setColor(ContextCompat.getColor(this.u(), R.color.arg_RES_7f06170d));
          gradientDraw.setCornerRadius((float)d.y);
          view.findViewById(R.id.search_inputbox).setBackground(gradientDraw);
          view.findViewById(R.id.cancel_button).setTextColor(ContextCompat.getColor(this.u(), R.color.arg_RES_7f061fa8));
          view.findViewById(R.id.editor).setTextColor(ContextCompat.getColor(this.u(), R.color.arg_RES_7f061f7d));
       }
       if (!PatchProxy.applyVoid(onClickListe, this, uod, "9")) {
          String liveStreamId = this.w.getLiveStreamId();
          uod = this.r;
          d ts = this.s;
          d tq = this.q;
          ClientContent$LiveStreamPackage liveStreamPa = this.w.a();
          ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.w.y();
          BaseFragment uBaseFragmen = this.w.b();
          if (PatchProxy.isSupport(VoicePartyOnlineUserFragment.class)) {
             Object[] objArray = new Object[]{liveStreamId,uod,Boolean.FALSE,Integer.valueOf(ts),tq,liveStreamPa,liveVoicePar,uBaseFragmen};
             voicePartyOn = PatchProxy.apply(objArray, onClickListe, VoicePartyOnlineUserFragment.class, "2");
             if (voicePartyOn != patchProxyRe) {
             label_011f :
                e uoe = this.u().getSupportFragmentManager().beginTransaction();
                uoe.g(R.id.live_voice_party_online_users_container, voicePartyOn, voicePartyOn.getClass().getSimpleName());
                uoe.m();
             }
          }
          Bundle uBundle = new Bundle();
          uBundle.putString("liveStreamId", liveStreamId);
          uBundle.putString("voicePartyId", uod);
          uBundle.putBoolean("key_should_show_order_music_info", b);
          uBundle.putInt("MIC_ID", ts);
          VoicePartyOnlineUserFragment voicePartyOn1 = new VoicePartyOnlineUserFragment();
          voicePartyOn1.setArguments(uBundle);
          voicePartyOn1.L = tq;
          voicePartyOn1.M = liveStreamPa;
          voicePartyOn1.N = liveVoicePar;
          voicePartyOn1.O = uBaseFragmen;
          voicePartyOn = voicePartyOn1;
          goto label_011f ;
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
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, d.class, "10")) {
          return;
       }
       d tp = this.p;
       if (tp != null && tp.isAdded()) {
          this.p.Hh(p0);
       }else if(PatchProxy.applyVoidOneRefs(p0, this, uod, "7")){
          if (this.p == null) {
             this.p = VoicePartySearchOnlineFragment.Gh(this.w.getLiveStreamId(), this.r, false, this.s, this.q, this.w.a(), this.w.y(), this.w.b());
          }
          this.p.Hh(p0);
          e uoe = this.u().getSupportFragmentManager().beginTransaction();
          uod = this.p;
          uoe.g(R.id.live_voice_party_online_users_container, uod, uod.getClass().getSimpleName());
          uoe.m();
       }
       tp = this.q;
       if (tp != null) {
          tp.b(p0);
       }
       return;
    }
    public void s7(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "12")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uod, "8")) {
          d tp = this.p;
          if (tp != null && tp.isAdded()) {
             this.u().getSupportFragmentManager().beginTransaction().u(this.p).m();
          }
       }
       return;
    }
}
