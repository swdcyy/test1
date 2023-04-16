package com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment;
import com.kwai.live.gzone.accompanyplay.audience.o;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import io.reactivex.subjects.PublishSubject;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment$c;
import java.lang.Integer;
import android.text.SpannableStringBuilder;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import java.lang.CharSequence;
import android.text.style.ForegroundColorSpan;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.text.style.AbsoluteSizeSpan;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.utility.n;
import android.widget.TextView;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.kwai.live.gzone.accompanyplay.audience.p0$e;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$e;
import android.view.View;
import ekd.m1;
import d61.f0;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import f37.o0;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment$a;
import erd.g;
import brd.t;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import o37.a;
import k37.a0;
import lnc.i3;
import y8c.g;
import r37.c;
import qvb.i;
import com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment$b;

public class LiveGzoneAudienceAccompanyTicketFragment extends RecyclerFragment implements o, d	// class@000c4f
{
    public TextView F;
    public TextView G;
    public PublishSubject H;
    public b I;
    public b J;
    public LiveGzoneAccompanyTabHostFragment$e K;
    public k0$g L;

    public void LiveGzoneAudienceAccompanyTicketFragment(){
       super();
       this.H = PublishSubject.g();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAudienceAccompanyTicketFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGzoneAudienceAccompanyTicketFragment$c(this, this);
    }
    public void Gh(int p0){
       if (PatchProxy.isSupport(LiveGzoneAudienceAccompanyTicketFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGzoneAudienceAccompanyTicketFragment.class, "4")) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       String str = TextUtils.N((long)p0);
       String str1 = a1.r(R.string.arg_RES_7f1023cc, str);
       spannableStr.append(str1);
       int i = str1.indexOf(str);
       spannableStr.setSpan(new ForegroundColorSpan(a.a().a().getResources().getColor(R.color.arg_RES_7f0607c8)), i, (str.length() + i), 33);
       spannableStr.setSpan(new AbsoluteSizeSpan(n.c(this.getContext(), 24.00f)), i, (str.length() + i), 33);
       this.G.setText(spannableStr);
       return;
    }
    public void R2(k0$g p0,p0$e p1){
       this.L = p0;
    }
    public boolean S1(){
       return false;
    }
    public void W5(LiveGzoneAccompanyTabHostFragment$e p0){
       this.K = p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceAccompanyTicketFragment.class, "1")) {
          return;
       }
       this.F = m1.f(p0, 0x7f0a1e02);
       TextView textView = m1.f(p0, R.id.live_gzone_audience_accompany_user_ticket_count_text_view);
       this.G = textView;
       f0.i(textView, this.getContext());
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0b83;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAudienceAccompanyTicketFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveGzoneAudienceAccompanyTicketFragment.class, null);
       return objectsByTag;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGzoneAudienceAccompanyTicketFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return o0.i(p0, 0x7f0d0b83, p1);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceAccompanyTicketFragment.class, "9")) {
          return;
       }
       super.onDestroy();
       b9.a(this.I);
       b9.a(this.J);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneAudienceAccompanyTicketFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       this.Gh(0);
       this.I = this.H.subscribe(new LiveGzoneAudienceAccompanyTicketFragment$a(this));
       return;
    }
    public void u(){
       Object[] objArray = null;
       String str = "8";
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneAudienceAccompanyTicketFragment.class, str)) {
          return;
       }
       super.u();
       this.a();
       ClientContent$LiveStreamPackage liveStreamPa = this.L.a();
       a uoa = this.L.t();
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, uoa, objArray, a0.class, str)) {
          a0.k("ACCOMPANY_PLAY_TICKETS_PANEL", a0.a(uoa).e(), liveStreamPa, uoa);
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAudienceAccompanyTicketFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.H);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAudienceAccompanyTicketFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGzoneAudienceAccompanyTicketFragment$b(this);
    }
}
