package com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter$d;
import com.kwai.library.widget.viewpager.tabstrip.a;
import com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter;
import android.content.Context;
import androidx.fragment.app.c;
import java.util.List;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.viewpager.tabstrip.b;
import android.os.Bundle;
import java.util.HashMap;
import y43.a;
import o63.c;
import java.util.Map;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import j47.c;
import java.util.Iterator;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Number;

public class LiveGzoneAudienceRankTabPresenter$d extends a	// class@000e22
{
    public List m;
    public final LiveGzoneAudienceRankTabPresenter n;

    public void LiveGzoneAudienceRankTabPresenter$d(LiveGzoneAudienceRankTabPresenter p0,Context p1,c p2,List p3){
       this.n = p0;
       super(p1, p2);
       this.m = p3;
    }
    public Fragment B(int p0){
       LiveGzoneAudienceRankTabPresenter$d uod = LiveGzoneAudienceRankTabPresenter$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       HashMap hashMap = new HashMap();
       hashMap.put("tabData", "");
       LiveGzoneAudienceRankTabPresenter$d tn = this.n;
       return tn.t.O.n3("GameLiveRankList", this.m.get(p0).a().getString("ComponentName", ""), tn.p, hashMap, false);
    }
    public final b E(String p0){
       b uob;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAudienceRankTabPresenter$d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uob = obj.next();
          if ((uob.c().c()).equals(p0)) {
             break ;
          }
       }
       return uob;
    }
    public PagerSlidingTabStrip$d b(int p0){
       LiveGzoneAudienceRankTabPresenter$d uod = LiveGzoneAudienceRankTabPresenter$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.m.get(p0).c();
    }
    public int c(String p0){
       b obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAudienceRankTabPresenter$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.E(p0);
       if (obj != null) {
          return this.m.indexOf(obj);
       }
       return super.c(p0);
    }
    public String d(int p0){
       LiveGzoneAudienceRankTabPresenter$d uod = LiveGzoneAudienceRankTabPresenter$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.m.get(p0).c().c();
    }
    public PagerSlidingTabStrip$d e(String p0){
       b obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAudienceRankTabPresenter$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E(p0);
       if (obj != null) {
          return obj.c();
       }
       return super.e(p0);
    }
}
