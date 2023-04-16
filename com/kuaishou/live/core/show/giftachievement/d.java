package com.kuaishou.live.core.show.giftachievement.d;
import im8.g;
import k51.c;
import java.util.HashSet;
import android.util.SparseArray;
import java.util.HashMap;
import com.kuaishou.live.core.show.giftachievement.d$a;
import g92.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.livestream.message.nano.SCLiveGiftAchievementUpdateNotice;
import lf3.g;
import hf3.a;
import g92.g;
import ok.x;
import p91.m;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import g92.b;
import bp6.a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;
import java.lang.Long;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.live.core.show.giftachievement.LiveAudienceGiftAchievementModel;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.kuaishou.live.core.show.giftachievement.LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement;
import java.util.Collections;
import com.google.common.base.a;
import java.lang.Iterable;
import com.kuaishou.live.core.show.giftachievement.LiveAudienceGiftAchievementModel$a;
import java.util.Collection;
import ekd.q;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.giftachievement.e$a;
import g92.e;
import java.util.Map;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.show.giftachievement.a;
import com.kuaishou.live.core.show.giftachievement.b;
import com.kuaishou.live.core.show.giftachievement.c;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;

public class d extends c implements g	// class@000bc0
{
    public LiveAudienceGiftAchievementModel p;
    public long q;
    public a0 r;
    public final HashSet s;
    public final SparseArray t;
    public final HashMap u;
    public e v;
    public final g w;
    public boolean x;
    public static String sLivePresenterClassName = "LiveAudienceGiftAchievementPresenter";

    public void d(){
       super();
       this.q = 0;
       this.s = new HashSet();
       this.t = new SparseArray();
       this.u = new HashMap();
       this.v = new d$a(this);
       this.w = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       if (this.x != null) {
          return;
       }
       this.r.C.u0(810, SCLiveGiftAchievementUpdateNotice.class, this.w);
       this.X7(g.a.get().a(this.r.Z2.getLiveStreamId()).map(new e()).observeOn(d.a).subscribe(new b(this), new a()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       if (this.x == null) {
          this.r.C.o(810, this.w);
       }
       this.t.clear();
       this.u.clear();
       return;
    }
    public final void P8(int p0,long p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, uod, "11")) {
          return;
       }
       List list = this.t.get(p0, new ArrayList());
       list.add(Long.valueOf(p1));
       this.t.put(p0, list);
       return;
    }
    public final String R8(LiveAudienceGiftAchievementModel p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.mAchievementList.iterator();
       while (iterator.hasNext()) {
          obj.add(Long.valueOf(iterator.next().mAchievementId));
       }
       Collections.sort(obj);
       return a.f('+').c(obj);
    }
    public final void S8(LiveAudienceGiftAchievementModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       this.u.clear();
       this.t.clear();
       Iterator iterator = p0.mAchievementList.iterator();
       while (iterator.hasNext()) {
          LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement liveAudience = iterator.next();
          this.u.put(Long.valueOf(liveAudience.mAchievementId), liveAudience);
          Iterator iterator1 = liveAudience.mGiftInfoList.iterator();
          while (iterator1.hasNext()) {
             LiveAudienceGiftAchievementModel$a uoa = iterator1.next();
             this.P8(uoa.mGiftId, liveAudience.mAchievementId);
             if (!q.f(uoa.mRelationGiftIds)) {
                Iterator iterator2 = uoa.mRelationGiftIds.iterator();
                while (iterator2.hasNext()) {
                   this.P8(iterator2.next().intValue(), liveAudience.mAchievementId);
                }
             }
          }
       }
       return;
    }
    public final void V8(LiveAudienceGiftAchievementModel p0){
       long l;
       boolean b;
       Iterator iterator2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "4")) {
          return;
       }
       d tp = this.p;
       if (tp != null && p0.mCurrentWeek - tp.mCurrentWeek < 0) {
          return;
       }
       LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement obj = PatchProxy.applyOneRefs(p0, this, uod, "5");
       if (obj != patchProxyRe) {
          l = obj.longValue();
       }else {
          l = 0;
          iterator2 = p0.mAchievementList.iterator();
          while (iterator2.hasNext()) {
             Iterator iterator3 = iterator2.next().mGiftInfoList.iterator();
             while (iterator3.hasNext()) {
                l = l + iterator3.next().mSentCount;
             }
          }
       }
       LiveAudienceGiftAchievementModel$a obj1 = PatchProxy.applyOneRefs(p0, this, uod, "6");
       int i = 0;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          d tp1 = this.p;
          b = (tp1 != null && (p0.mCurrentWeek - tp1.mCurrentWeek > 0 || !TextUtils.n(this.R8(p0), this.R8(this.p))))? true: false;
       }
       if (b) {
          this.q = l;
          this.p = p0;
          this.S8(p0);
       }else if(l - this.q >= 0){
          this.q = l;
          this.p = p0;
          if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "10")) {
             Iterator iterator1 = p0.mAchievementList.iterator();
             while (iterator1.hasNext()) {
                LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement liveAudience = iterator1.next();
                obj = this.u.get(Long.valueOf(liveAudience.mAchievementId));
                if (obj == null || obj.mGiftInfoList.size() != liveAudience.mGiftInfoList.size()) {
                   this.S8(p0);
                   break ;
                }else {
                   this.u.put(Long.valueOf(liveAudience.mAchievementId), liveAudience);
                   int i1 = 0;
                   while (i1 < liveAudience.mGiftInfoList.size()) {
                      obj1 = liveAudience.mGiftInfoList.get(i1).mRelationGiftIds;
                      LiveAudienceGiftAchievementModel$a mRelationGif = obj.mGiftInfoList.get(i1).mRelationGiftIds;
                      if (!q.f(obj1) && (q.f(mRelationGif) || obj1.size() > mRelationGif.size())) {
                         iterator2 = obj1.iterator();
                         while (iterator2.hasNext()) {
                            this.P8(iterator2.next().intValue(), liveAudience.mAchievementId);
                         }
                      }
                      i1 = i1 + 1;
                   }
                }
             }
          }
       }else if(i){
          Iterator iterator = this.s.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(this.p);
          }
       }
       return;
       i = 1;
       goto label_0133 ;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new e());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       a0 uoa0 = this.q8(a0.class);
       this.r = uoa0;
       this.x = k0.c(uoa0.c.mEntity, a.a, b.a, c.a).or(Boolean.FALSE).booleanValue();
       return;
    }
}
