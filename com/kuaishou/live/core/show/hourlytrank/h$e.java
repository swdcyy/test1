package com.kuaishou.live.core.show.hourlytrank.h$e;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.hourlytrank.h;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankPendantView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ba2.e;
import java.lang.System;
import com.kuaishou.livestream.message.nano.SCLivePopularityRankInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import p63.a$a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import com.kuaishou.android.live.log.b;
import p63.a;
import jt5.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import java.lang.CharSequence;
import ba2.i;

public class h$e extends m	// class@000c16
{
    public final int c;
    public final int d;
    public final LiveHourlyRankPendantView e;
    public final h f;

    public void h$e(h p0,int p1,int p2,LiveHourlyRankPendantView p3){
       this.f = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void a(View p0){
       h y;
       int i;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, h$e.class, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, e.class, str)) {
          e.a = System.currentTimeMillis();
       }
       h$e tf = this.f;
       h$e tc = this.c;
       h$e td = this.d;
       String str1 = 1;
       String str2 = 3;
       if (tc == str2) {
          y = tf.Y;
          td = (y != null)? y.rankType: 0;
       }else if(tf.h1 != null && tc == str1){
          y = tf.X;
          if (y != null) {
             td = y.aggregationRankType;
          }
       }
       if (tc != str2) {
          str1 = null;
       }
       a$a uoa = new a$a();
       if (str1) {
          uoa.a("popularitySubRankType", String.valueOf(td));
          i = 7;
       }else {
          i = td;
       }
       LiveLogTag hOURLY_RANK = LiveLogTag.HOURLY_RANK;
       hOURLY_RANK.appendTag("LiveNewHourlyRankPresenter");
       LiveLogTag liveLogTag = hOURLY_RANK;
       b.U(liveLogTag, "onPendantClick", "rankType", Integer.valueOf(this.d), "tabType", h.W8(i), "popularitySubRankType", Integer.valueOf(td));
       h k = this.f.K;
       if (k != null) {
          k.c(h.W8(i), "HOURLY_RANK", 0, uoa.b());
       }
       int[] ointArray = new int[0];
       i.d(this.f.J.a(), td, this.e.getContentText().toString(), ointArray);
       return;
    }
}
