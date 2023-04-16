package com.kuaishou.live.core.voiceparty.music.search.LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment;
import g06.f;
import g06.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import lnc.a1;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gka.h;
import com.kwai.feature.component.searchhistory.SearchHistoryData;
import android.view.View;
import java.lang.Runnable;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.animation.ValueAnimator;
import wt2.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.voiceparty.music.search.LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import qvb.i;
import com.kuaishou.live.core.voiceparty.music.search.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import wkd.b;
import com.kwai.feature.component.searchhistory.b;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.kuaishou.live.core.voiceparty.music.search.a;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;
import y8c.g;
import ut2.f;
import g06.d;

public class LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment extends RecyclerFragment implements f, e	// class@0017e2
{
    public TextView F;
    public View G;
    public boolean H;
    public e I;
    public static final int J;

    static {
       LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.J = a1.e(45.00f);
    }
    public void LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment(){
       super();
       this.H = false;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h();
    }
    public void F6(SearchHistoryData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "11")) {
          return;
       }
       LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment tI = this.I;
       if (tI != null) {
          tI.F6(p0);
       }
       return;
    }
    public final void Gh(View p0,int p1,Runnable p2){
       if (PatchProxy.isSupport(LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int measuredHeig = p0.getMeasuredHeight();
       p0.getLayoutParams().height = measuredHeig;
       int[] ointArray = new int[]{measuredHeig,p1};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       valueAnimato.setDuration(300);
       valueAnimato.addUpdateListener(new a(p0));
       valueAnimato.addListener(new LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment$a(this, p2));
       valueAnimato.start();
       return;
    }
    public final void Hh(boolean p0){
       if (PatchProxy.isSupport(LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "3")) {
          return;
       }
       this.H = p0;
       this.q().i2(this.H);
       return;
    }
    public final void Ih(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "5")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.F.setText("");
          this.G.setVisibility(8);
       }else {
          this.F.setText(p0);
          this.G.setVisibility(0);
       }
       return;
    }
    public String K(){
       return "voice_party_music";
    }
    public boolean S0(){
       return false;
    }
    public void T5(SearchHistoryData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "13")) {
          return;
       }
       b.a(0x4abd6a99).d(this.K(), p0.mSearchWord);
       this.a();
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d16d1;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, null);
       return objectsByTag;
    }
    public void jd(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "12")) {
          return;
       }
       b.a(0x4abd6a99).a(this.K());
       this.a();
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "14")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (p0) {
          this.Hh(false);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.G = p0.findViewById(0x7f0a12a4);
       this.F = p0.findViewById(0x7f0a12a3);
       if (!PatchProxy.applyVoid(null, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "4")) {
          this.F.setOnClickListener(new a(this));
       }
       this.h0().setPadding(0, a1.e(5.00f), 0, a1.e(0x41f00000));
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "9")) {
          return;
       }
       super.v2(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "2")) {
          boolean b = false;
          if (!this.q().getItems().size()) {
             this.Hh(b);
             this.G.setVisibility(8);
          }else {
             this.G.setVisibility(b);
             b q = this.q().q;
             LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment tH = this.H;
             if (tH == null && q > 2) {
                this.Ih(a1.p(R.string.arg_RES_7f1001ad));
             }else if(tH != null){
                this.Ih(a1.p(R.string.arg_RES_7f1005b4));
             }else {
                this.Ih(objArray);
             }
          }
       }
       return;
    }
    public g vh(){
       f obj = PatchProxy.apply(null, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new f();
       obj.w = this;
       return obj;
    }
    public void y9(List p0){
       d.b(this, p0);
    }
    public i yh(){
       b obj = PatchProxy.apply(null, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.i2(this.H);
       return obj;
    }
}
