package com.kuaishou.live.lite.adapter.component.plugin.m;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin;
import dc3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ha1.b;
import ok.x;
import com.kwai.video.waynelive.LivePlayerController;
import java.util.List;
import sa1.b;
import xp5.g;
import sz1.e;
import ee1.a;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import java.lang.Boolean;
import lp3.h;
import com.kuaishou.live.lite.adapter.component.plugin.f;
import lp3.f;
import l83.b;
import v51.a;
import xp5.i;
import n91.f;
import mq5.b;
import java.util.Arrays;
import bo1.f;
import l83.c;
import b93.e;
import c73.a;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import at5.a;
import n83.c;
import java.util.Objects;
import n83.c$a;
import kotlin.jvm.internal.a;
import bz2.a;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$a;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import com.kuaishou.live.lite.adapter.component.plugin.k;
import msd.a;
import com.kuaishou.live.lite.adapter.component.plugin.i;
import com.kuaishou.live.lite.adapter.component.plugin.g;
import com.kuaishou.live.lite.adapter.component.plugin.c;
import com.kuaishou.live.lite.adapter.component.plugin.h;
import com.kuaishou.live.lite.adapter.component.plugin.l;
import com.kuaishou.live.lite.adapter.component.plugin.b;
import com.kuaishou.live.lite.adapter.component.plugin.a;
import com.kuaishou.live.lite.adapter.component.plugin.d;
import com.kuaishou.live.lite.adapter.component.plugin.e;
import com.kuaishou.live.lite.adapter.component.plugin.j;

public class m implements LiveLiteAdapterPlugin	// class@001e22
{

    static {
       if (PatchProxy.applyVoid(null, null, a.class, "1")) {
       }else {
          b.g(new int[10]{R.layout.live_multi_pk_rank_score_layout,0x7f0d0cb8,R.layout.live_pk_combo_win_group_layout,0x7f0d0cf9,R.layout.live_pk_combo_win_right_top_view_group_layout,0x7f0d0cfa,R.layout.live_lite_multi_line_container_layout,0x7f0d0c66,R.layout.live_lite_multi_line_self_anchor_cell_widget_layout,0x7f0d0cc1});
       }
    }
    public void m(){
       super();
    }
    public List By(x p0,LivePlayerController p1){
       Boolean fALSE;
       Class[] uClassArray;
       Object obj = p0;
       Class[] obj1 = p1;
       a uoa = a.class;
       Object obj2 = PatchProxy.applyTwoRefs(obj, obj1, this, m.class, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       Pair[] pairArray = new Pair[]{new Pair(fALSE, new h(uoa, new f(obj))),new Pair(fALSE, new h(e.class, new b(obj1), Arrays.asList(uClassArray))),new Pair(fALSE, new h(f.class, new c(obj1), Arrays.asList(obj1)))};
       fALSE = Boolean.FALSE;
       uClassArray = new Class[]{g.class,a.class,i.class,uoa,f.class,b.class,b.class};
       obj1 = new Class[]{g.class,b.class,e.class};
       return Arrays.asList(pairArray);
    }
    public Object KG(){
       a uoa = PatchProxy.apply(null, this, m.class, "3");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public a dV(LiveVoicePartyPlayViewService p0,LiveStreamFeed p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c$a obj = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "2");
       if (obj != patchProxyRe) {
       }else {
          obj = c.k;
          Objects.requireNonNull(obj);
          c uoc = PatchProxy.applyTwoRefs(p0, p1, obj, c$a.class, "1");
          if (uoc != patchProxyRe) {
          }else {
             a.p(p0, "playViewService");
             a.p(p1, "feed");
             uoc = new c(p0, p1);
          }
       }
       return obj;
    }
    public List eT(){
       LiveLiteAdapterPlugin$a[] obj = PatchProxy.apply(null, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.d(30);
       obj = new LiveLiteAdapterPlugin$a[11];
       obj[0] = new LiveLiteAdapterPlugin$a("Gift", LiveLiteAdapterPlugin$ScatterPriority.SideBarItem, k.b);
       LiveLiteAdapterPlugin$ScatterPriority default = LiveLiteAdapterPlugin$ScatterPriority.Default;
       obj[1] = new LiveLiteAdapterPlugin$a("Effect", default, i.b);
       obj[2] = new LiveLiteAdapterPlugin$a("ProfileCard", default, g.b);
       obj[3] = new LiveLiteAdapterPlugin$a("MultiPk", default, c.b);
       obj[4] = new LiveLiteAdapterPlugin$a("MultiChat", default, h.b);
       obj[5] = new LiveLiteAdapterPlugin$a("MultiChatV2", default, l.b);
       obj[6] = new LiveLiteAdapterPlugin$a("MultiLine", default, b.b);
       obj[7] = new LiveLiteAdapterPlugin$a("Interact", default, a.b);
       obj[8] = new LiveLiteAdapterPlugin$a("TreasureBox", default, d.b);
       obj[9] = new LiveLiteAdapterPlugin$a("VoiceParty", default, e.b);
       obj[10] = new LiveLiteAdapterPlugin$a("FansGroup", default, j.b);
       return Arrays.asList(obj);
    }
    public boolean isAvailable(){
       return true;
    }
}
