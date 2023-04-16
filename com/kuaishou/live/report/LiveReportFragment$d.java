package com.kuaishou.live.report.LiveReportFragment$d;
import y8c.r;
import com.kuaishou.live.report.LiveReportFragment;
import android.app.Activity;
import com.kuaishou.live.report.MenuInfo;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ap3.b;
import ap3.a;
import com.kwai.component.misc.report.ReportInfo;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.google.gson.JsonObject;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import brd.t;
import com.kwai.framework.logger.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import brd.x;
import cjd.e;
import erd.o;
import com.kuaishou.live.report.b;
import sfc.a;
import erd.g;
import crd.b;
import nl8.p;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kuaishou.live.report.LiveReportFragment$d$a;
import android.view.View$OnClickListener;

public class LiveReportFragment$d extends r	// class@000f53
{
    public final Activity i;
    public final LiveReportFragment j;

    public void LiveReportFragment$d(LiveReportFragment p0,Activity p1){
       this.j = p0;
       super();
       this.i = p1;
    }
    public void H(MenuInfo p0,LiveStreamFeed p1){
       LiveReportFragment liveReportFr;
       LiveReportFragment liveReportFr1;
       String str3;
       FeedLogCtx obj5;
       t obj = this;
       MenuInfo obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveReportFragment$d uod = LiveReportFragment$d.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, uod, "3")) {
          return;
       }
       b uob = a.b();
       MenuInfo mSubmitUrl = obj1.mSubmitUrl;
       LiveReportFragment$d j = obj.j;
       LiveReportFragment e = j.E;
       ReportInfo mSourceType = e.mSourceType;
       ReportInfo mReportedUse = e.mReportedUserId;
       ReportInfo mLiveId = e.mLiveId;
       ReportInfo mEntrySource = e.mEntrySource;
       obj1 = obj1.mType;
       ReportInfo mRefer = e.mRefer;
       ReportInfo mPreRefer = e.mPreRefer;
       LiveReportFragment j1 = j.J;
       LiveReportFragment k = j.K;
       String str = (obj2 != null)? r1.M0(p1): null;
       String str1 = (obj2 != null)? r1.I1(p1): null;
       a obj3 = PatchProxy.applyOneRefs(obj2, obj, uod, "2");
       if (obj3 != patchProxyRe) {
          obj = obj3;
          liveReportFr = k;
          liveReportFr1 = j1;
       }else if(obj2 == null){
          liveReportFr = k;
          liveReportFr1 = j1;
          obj = null;
       }else {
          JsonObject jsonObject = new JsonObject();
          liveReportFr = k;
          liveReportFr1 = j1;
          jsonObject.c0("commonStid", b.a(0x4b316083).i(obj.j.L, null));
          jsonObject.c0("interStid", r1.Q1(p1));
          String str4 = jsonObject.toString();
       }
       Object obj4 = null;
       obj3 = PatchProxy.applyOneRefs(obj2, obj4, LiveReportFragment.class, "6");
       String str2 = "";
       if (obj3 != patchProxyRe) {
          str3 = obj3;
       }else if(obj2 == null){
          obj5 = r1.O0(p1);
          if (obj5 != null) {
             str3 = obj5.toJsonString();
          }
       }
       str3 = str2;
       obj5 = obj4;
       obj = uob.a(mSubmitUrl, mSourceType, mReportedUse, mLiveId, mEntrySource, obj1, mRefer, mPreRefer, liveReportFr1, liveReportFr, str, str1, obj, str3);
       FeedLogCtx uFeedLogCtx = (obj2 != null)? r1.O0(p1): obj5;
       obj3 = new a("LIVE_REPORT_RESULT", null, null, null, uFeedLogCtx);
       obj.compose(obj1).map(new e()).subscribe(b.b, new a());
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, LiveReportFragment$d.class, "1")) {
          return;
       }
       MenuInfo menuInfo = this.t();
       if (menuInfo != null) {
          this.y().setText(menuInfo.mTitle);
          this.y().setOnClickListener(new LiveReportFragment$d$a(this, menuInfo));
       }
       return;
    }
}
