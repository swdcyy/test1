package com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyEmptyRecommendView;
import ml8.d;
import tt2.v;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.android.model.music.Music;
import tt2.u;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.widget.TextView;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import gs2.g;
import co2.f2;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import ut2.c;
import gs2.f;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.e;
import java.lang.Runnable;
import ok.h;
import tt2.w;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import f9c.a;

public class LiveVoicePartyEmptyRecommendView extends LinearLayout implements d, v	// class@001526
{
    public CustomRecyclerView b;
    public TextView c;
    public View d;
    public a e;
    public b f;
    public w g;
    public f2 h;
    public a i;
    public static final int j;

    public void LiveVoicePartyEmptyRecommendView(Context p0){
       super(p0, null);
    }
    public void LiveVoicePartyEmptyRecommendView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveVoicePartyEmptyRecommendView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void ad(Music p0,int p1){
       u.a(this, p0, p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyEmptyRecommendView.class, "1")) {
          return;
       }
       this.b = p0.findViewById(0x7f0a2789);
       this.c = p0.findViewById(0x7f0a2787);
       this.d = p0.findViewById(0x7f0a2788);
       return;
    }
    public void gb(Music p0,int p1){
       if (PatchProxy.isSupport(LiveVoicePartyEmptyRecommendView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveVoicePartyEmptyRecommendView.class, "8")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.i.a();
       LiveVoicePartyEmptyRecommendView th = this.h;
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, th, null, g.class, "4")) {
          n.q("CURE_LRC_KTV_CHOOSE_SOOG_PANEL_SELECT", n.g(th), null, liveStreamPa);
       }
       return;
    }
    public void gc(Music p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyEmptyRecommendView.class, "7")) {
          return;
       }
       LiveVoicePartyEmptyRecommendView tg = this.g;
       if (tg == null) {
          return;
       }
       tg.a(p0, new f(p1, p0), e.b);
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyEmptyRecommendView.class, "3")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyEmptyRecommendView.class, "2")) {
          a uoa = new a();
          this.e = uoa;
          this.b.setAdapter(uoa);
          this.b.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
          this.b.addItemDecoration(new b(0, 0, a1.e(43.00f), 0));
          new a().b(this.b);
       }
       return;
    }
    public void setOrderSongViewIndicatorVisibility(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyEmptyRecommendView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVoicePartyEmptyRecommendView.class, "4")) {
          return;
       }
       this.d.setVisibility(p0);
       return;
    }
}
