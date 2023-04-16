package com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import or5.d;
import td3.o;
import v51.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel$b;
import com.kuaishou.live.lite.userstatus.LiveLiteTimeConsumingUserStatusResponse;
import hf3.a;
import com.kuaishou.livestream.message.nano.SCLiveGiftTitleChangeInfo;
import java.lang.Class;
import lf3.g;
import brd.t;
import com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel$a;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import nsd.h;
import wsd.m;
import kotlin.sequences.SequencesKt__SequencesKt;
import com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel$updateSpringCeremonyNamingData$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.util.List;
import com.kuaishou.livestream.message.nano.LiveGiftTitleInfo;
import java.util.Collection;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import org.json.JSONException;

public final class LiveGiftSpringNamingModel extends Model	// class@0012c6
{
    public final g i;
    public final d j;
    public final o k;
    public final a l;

    public void LiveGiftSpringNamingModel(d p0,o p1,a p2){
       String str;
       a.p(p0, "infoManager");
       a.p(p1, "liteUserStatusManager");
       a.p(p2, "longConnectManager");
       super("LiveGiftSpringNaming", null, false, false, 14, null);
       this.j = p0;
       this.k = p1;
       this.l = p2;
       LiveGiftSpringNamingModel$b uob = new LiveGiftSpringNamingModel$b(this);
       this.i = uob;
       LiveLiteTimeConsumingUserStatusResponse liveLiteTime = p1.d0();
       liveLiteTime = (liveLiteTime != null)? liveLiteTime.mSpringCeremonyNamingData: null;
       this.f(liveLiteTime);
       p2 = p2.u();
       if (p2 != null) {
          p2.u0(1083, SCLiveGiftTitleChangeInfo.class, uob);
       }
       p1.W().subscribe(new LiveGiftSpringNamingModel$a(this));
       return;
    }
    public final void e(SCLiveGiftTitleChangeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSpringNamingModel.class, "2")) {
          return;
       }
       SCLiveGiftTitleChangeInfo info = p0.info;
       if (info == null) {
          b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSpringNamingModel.kt][updateSpringCeremonyNamingData\(\)] data.info == null");
          return;
       }else {
          LiveGiftTitleInfo[] liveGiftTitl = new LiveGiftTitleInfo[0];
          Object[] objArray = SequencesKt___SequencesKt.V2(SequencesKt___SequencesKt.i0(SequencesKt__SequencesKt.h(h.a(info)), new LiveGiftSpringNamingModel$updateSpringCeremonyNamingData$1(this))).toArray(liveGiftTitl);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          p0.info = objArray;
          this.d("LiveGiftSpringNamingVC", p0);
          return;
       }
    }
    public final void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSpringNamingModel.class, "3")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          try{
             p0 = a.a.h(p0, SCLiveGiftTitleChangeInfo.class);
             a.o(p0, "Gsons.KWAI_GSON.fromJson¡­leChangeInfo::class.java\)");
             this.e(p0);
          }catch(org.json.JSONException e4){
             b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSpringNamingModel.kt][updateSpringCeremonyNamingData\(data: String?\)] "+e4.getMessage());
             e4.printStackTrace();
          }
       }
    }
}
