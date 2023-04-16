package h63.j;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h63.j$a;
import h63.j$b;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y43.a;
import h47.b;
import j47.d;
import com.kuaishou.protobuf.gamezone.multitab.nano.SCGzoneLiveRoomMultiTab;
import h63.j$c;
import lf3.g;
import hf3.a;
import java.util.List;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.QLivePlayConfig;
import xp5.a;
import java.util.ArrayList;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabServerInfo;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab$TabType;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.Map;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabServerInfo$TabDetail;
import b77.j;
import c77.q;
import h63.n;
import java.util.HashMap;
import v53.f;

public class j extends PresenterV2 implements g	// class@002c86
{
    public g p;
    public f q;
    public b r;
    public a s;
    public a t;
    public q u;
    public b v;
    public Map w;

    public void j(){
       super();
       this.u = new j$a(this);
       this.v = new j$b(this);
       this.w = new LinkedHashMap();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.s.u.di(this.v, true);
       j$c uoc = new j$c(this);
       this.p = uoc;
       this.t.u0(927, SCGzoneLiveRoomMultiTab.class, uoc);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "8")) {
          return;
       }
       this.s.u.H8(this.v);
       this.t.o(927, this.p);
       return;
    }
    public List P8(){
       ArrayList uArrayList;
       LiveGzoneTab liveGzoneTab = LiveGzoneTab.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       QLivePlayConfig obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.s.R().mSubType;
       if (obj != 2 && (obj != 103 && (this.s.R().mIsGzoneCompetitionLive != null || this.s.y4().g()))) {
          uArrayList = PatchProxy.apply(null, null, liveGzoneTab, "8");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             uArrayList.add(new LiveGzoneTabServerInfo(LiveGzoneTab$TabType.CHAT.mTypeValue));
          }
          return uArrayList;
       }else {
          uArrayList = PatchProxy.apply(null, null, liveGzoneTab, "6");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             uArrayList.add(new LiveGzoneTabServerInfo(LiveGzoneTab$TabType.CHAT.mTypeValue));
             uArrayList.add(new LiveGzoneTabServerInfo(LiveGzoneTab$TabType.ANCHOR_PROFILE.mTypeValue));
             uArrayList.add(new LiveGzoneTabServerInfo(LiveGzoneTab$TabType.PLAY_TOGETHER.mTypeValue));
             uArrayList.add(new LiveGzoneTabServerInfo(LiveGzoneTab$TabType.RANK.mTypeValue));
          }
          return uArrayList;
       }
    }
    public void R8(List p0){
       LiveGzoneTabServerInfo liveGzoneTab;
       LiveGzoneTabServerInfo liveGzoneTab1;
       LiveGzoneTab liveGzoneTab4;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "4")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          boolean b = true;
          int i = 0;
          if (iterator.hasNext()) {
             if ((LiveGzoneTab$TabType.CHAT.mTypeValue).equals(iterator.next().mType)) {
                liveGzoneTab = 1;
             }
          }else {
             liveGzoneTab = null;
          }
          if (!liveGzoneTab) {
             p0.add(i, new LiveGzoneTabServerInfo(LiveGzoneTab$TabType.CHAT.mTypeValue));
          }
          this.w.clear();
          iterator = p0.iterator();
          while (iterator.hasNext()) {
             liveGzoneTab1 = iterator.next();
             LiveGzoneTab$TabType tabType = LiveGzoneTab$TabType.fromTabType(liveGzoneTab1.mType);
             if (tabType == null || tabType.mSupportFirstLevelTab == null) {
             }else {
                LiveGzoneTab liveGzoneTab2 = PatchProxy.applyTwoRefs(liveGzoneTab1, tabType, this, j.class, "5");
                if (liveGzoneTab2 != PatchProxyResult.class) {
                }else {
                   liveGzoneTab2 = new LiveGzoneTab(tabType, liveGzoneTab1.mTabId);
                   liveGzoneTab2.g(liveGzoneTab1);
                   if (!q.f(liveGzoneTab1.mSubTabs)) {
                      Iterator iterator1 = liveGzoneTab1.mSubTabs.iterator();
                      while (iterator1.hasNext()) {
                         LiveGzoneTabServerInfo liveGzoneTab3 = iterator1.next();
                         LiveGzoneTab$TabType tabType1 = LiveGzoneTab$TabType.fromTabType(liveGzoneTab3.mType);
                         if (tabType1 == null) {
                            continue ;
                         }else {
                            liveGzoneTab4 = new LiveGzoneTab(tabType1, liveGzoneTab3.mTabId);
                            liveGzoneTab4.e = liveGzoneTab2;
                            liveGzoneTab4.g(liveGzoneTab3);
                            if (PatchProxy.applyVoidOneRefs(liveGzoneTab4, liveGzoneTab2, LiveGzoneTab.class, "3")) {
                               continue ;
                            }
                         }
                         liveGzoneTab2.d.add(liveGzoneTab4);
                      }
                   }
                }
                if (liveGzoneTab2 == null) {
                   continue ;
                }else if(tabType == LiveGzoneTab$TabType.RANK){
                   LiveGzoneConfigResponse liveGzoneCon = this.s.u.Ue();
                   if (liveGzoneCon == null || liveGzoneCon.mDisableGameLiveUserRank != null) {
                      continue ;
                   }else {
                      liveGzoneTab2.f = b;
                   }
                }
                this.w.put(liveGzoneTab2.e(), liveGzoneTab2);
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, j.class, "6")) {
             liveGzoneTab1 = null;
             if (!q.f(p0)) {
                Iterator iterator2 = p0.iterator();
                while (iterator2.hasNext()) {
                   liveGzoneTab = iterator2.next();
                   LiveGzoneTabServerInfo mTabDetail = liveGzoneTab.mTabDetail;
                   if (mTabDetail != null && mTabDetail.mLiveImageTab != null) {
                      liveGzoneTab1 = liveGzoneTab.mTabId;
                   }else {
                      continue ;
                   }
                }
             }
             if (!PatchProxy.applyVoidOneRefs(liveGzoneTab1, this, j.class, "7")) {
                a b1 = this.s.b1;
                if (b1 != null) {
                   b1.b(liveGzoneTab1);
                }
             }
          }
       }
       this.u.c();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(j.class, new n());
       }else {
          obj.put(j.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.q = this.q8(f.class);
       a uoa = this.q8(a.class);
       this.s = uoa;
       this.r = uoa.m;
       this.t = uoa.W;
       return;
    }
}
