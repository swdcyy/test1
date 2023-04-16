package com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.a;
import g9c.a;
import lnc.a1;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.d0;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil;
import va1.n0;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.d;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.b$b;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyEmptyRecommendItemView;
import java.util.Collection;
import ekd.q;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyMusicInfo;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.c;
import tt2.v;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;

public class a extends a	// class@001528
{
    public v g;
    public LiveVoicePartyKtvMusicDownloadHelper h;
    public int i;
    public int j;

    public void a(){
       super();
       this.i = a1.e(11.00f);
       this.j = a1.e(43.00f);
    }
    public int X0(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (d0.n(p0)) {
          return ((VoicePartySurfaceUtil.e(p0) - this.i) - this.j);
       }
       return ((n0.f() - this.i) - this.j);
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       d a;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          b$b uob = this.N0(p1);
          a tg = this.g;
          a th = this.h;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidThreeRefs(uob, tg, th, p0, d.class, "1")) {
             a = p0.a;
             Objects.requireNonNull(a);
             if (PatchProxy.applyVoidThreeRefs(uob, tg, th, a, LiveVoicePartyEmptyRecommendItemView.class, "1") || (uob != null && !q.f(uob.a))) {
                a.removeAllViews();
                Iterator iterator = uob.a.iterator();
                while (iterator.hasNext()) {
                   View view = a.d(a.getContext(), R.layout.arg_RES_7f0d0e5a, a, false);
                   a.addView(view);
                   c uoc = new c(tg, th);
                   uoc.f(view);
                   Object[] objArray = new Object[]{iterator.next()};
                   uoc.i(objArray);
                }
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       d uod;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uod = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uod != PatchProxyResult.class) {
          label_0040 :
             return uod;
          }
       }
       LiveVoicePartyEmptyRecommendItemView liveVoicePar = a.g(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d0e59, p0, false);
       ViewGroup$LayoutParams layoutParams = liveVoicePar.getLayoutParams();
       if (layoutParams != null) {
          layoutParams.width = this.X0(liveVoicePar.getContext());
       }
       uod = new d(liveVoicePar);
       goto label_0040 ;
    }
}
