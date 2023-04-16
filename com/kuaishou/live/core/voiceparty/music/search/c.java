package com.kuaishou.live.core.voiceparty.music.search.c;
import hka.a;
import ty5.d;
import java.lang.String;
import com.kwai.feature.component.searchhistory.SearchLayout;
import androidx.fragment.app.c;
import tt2.w;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.content.Context;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import lnc.a1;
import java.lang.CharSequence;
import android.view.View;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import wt2.e;
import com.kwai.feature.component.searchhistory.SearchLayout$d;
import com.kuaishou.live.core.voiceparty.music.search.LiveVoicePartySearchHistoryMusicFragmentCreator;
import com.kwai.feature.component.searchhistory.SearchLayout$e;
import wt2.f;
import com.kwai.feature.component.searchhistory.SearchLayout$f;
import com.kuaishou.live.core.voiceparty.music.search.c$a;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartySearchMusicFragment;
import android.os.Bundle;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.g;
import g9c.a;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;

public class c implements a, d	// class@0017e7
{
    public final SearchLayout b;
    public final c c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final w h;
    public LiveVoicePartySearchMusicFragment i;
    public String j;
    public String k;
    public c$a l;

    public void c(String p0,String p1,String p2,SearchLayout p3,c p4,int p5,w p6){
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.b = p3;
       this.c = p4;
       this.d = p5;
       this.h = p6;
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
       }else if(p3.c instanceof TextView){
          p3.c.setTextColor(ContextCompat.getColor(p3.getContext(), R.color.arg_RES_7f061fa8));
       }
       p3.setShowSearchSuggest(true);
       p3.setSearchListener(this);
       p3.setSearchHint(a1.p(R.string.arg_RES_7f102e2a));
       b uob = new b();
       uob.v(ContextCompat.getColor(p3.getContext(), R.color.arg_RES_7f060760));
       uob.g(KwaiRadiusStyles.FULL);
       p3.findViewById(R.id.search_inputbox).setBackground(uob.a());
       p3.findViewById(R.id.editor).setTextColor(ContextCompat.getColor(p3.getContext(), R.color.arg_RES_7f061f7d));
       p3.setFragmentManagerProvider(new e(this));
       p3.setSearchHistoryFragmentCreator(new LiveVoicePartySearchHistoryMusicFragmentCreator());
       p3.setSearchSuggestFragmentCreator(new f());
       this.a();
       return;
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.b();
       c tl = this.l;
       if (tl != null) {
          tl.R();
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       if (this.i != null) {
          this.c.beginTransaction().s(this.i).m();
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c ti = this.i;
       if (ti == null) {
          LiveVoicePartySearchMusicFragment liveVoicePar = new LiveVoicePartySearchMusicFragment();
          this.i = liveVoicePar;
          liveVoicePar.K = this.h;
          Bundle uBundle = new Bundle();
          uBundle.putString("liveStreamId", this.e);
          uBundle.putString("voicePartyId", this.f);
          uBundle.putString("ktvId", this.g);
          uBundle.putString("musicSearchKey", this.j);
          uBundle.putString("ssid", this.k);
          this.i.setArguments(uBundle);
          e uoe = this.c.beginTransaction();
          uoe.v(this.d, this.i);
          uoe.m();
       }else {
          ti.q().invalidate();
          this.i.g7().M0();
          this.c.beginTransaction().E(this.i).m();
       }
       return;
    }
    public void ke(String p0,boolean p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, c.class, "7")) {
          return;
       }
       c ti = this.i;
       if (ti == null) {
          return;
       }
       ti.g7().M0();
       ti = this.l;
       if (ti != null) {
          ti.U();
       }
       return;
    }
    public boolean onBackPressed(){
       return false;
    }
    public void qc(String p0,boolean p1,String p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, c.class, "6")) {
          return;
       }
       c ti = this.i;
       if (ti == null) {
          if (!TextUtils.x(p0)) {
             this.j = p0;
             this.k = p2;
          }
          this.b();
       }else {
          Objects.requireNonNull(ti);
          if (!PatchProxy.applyVoidTwoRefs(p0, p2, ti, LiveVoicePartySearchMusicFragment.class, "3")) {
             ti.F = p0;
             ti.J = p2;
             ti.a();
          }
       }
       c tl = this.l;
       if (tl != null) {
          tl.S();
       }
       return;
    }
    public void s7(boolean p0){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, c.class, "5")) {
          return;
       }
       this.a();
       c tl = this.l;
       if (tl != null) {
          tl.T();
       }
       return;
    }
}
