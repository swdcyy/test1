package com.yxcorp.gifshow.profile.presenter.profile.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s1c.r0;
import tkd.b;
import tkd.d;
import lv5.d;
import o26.d;
import java.util.ArrayList;
import j4c.v;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;
import o26.c;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import j4c.w;
import com.yxcorp.gifshow.profile.http.l$a;
import com.yxcorp.gifshow.profile.http.l;
import com.yxcorp.gifshow.util.rx.RxBus;
import cda.f;
import brd.t;
import t45.d;
import brd.z;
import j4c.x;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.Number;
import com.kwai.feature.api.social.profile.model.ProfileDraftsFeed;
import com.kuaishou.android.model.mix.w;
import s1c.q;
import java.lang.StringBuilder;
import q87.c;
import j4c.u;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.lang.System;
import java.lang.Integer;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserOwnerCount;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;

public class w extends PresenterV2	// class@001590
{
    public final d p;
    public final List q;
    public final long r;
    public final r0 s;
    public l t;
    public final c u;

    public void w(r0 p0){
       super();
       this.p = d.a(-447917650).XV();
       this.q = new ArrayList();
       this.u = new v(this);
       this.r = a.t().b("profile_video_mock_max_time", 300) * 1000;
       this.s = p0;
    }
    public void E8(){
       w ow = w.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ow, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ow, "14")) {
          g.e(KsLogProfileTag.MOCK_FEED.appendTag("MyProfileMockDataPresenter"), "init");
          this.p.J5(this.u);
          this.q.addAll(this.P8(this.p.se()));
          this.t.o2(new w(this));
          this.X7(RxBus.f.f(f.class).observeOn(d.a).subscribe(new x(this)));
       }
       return;
    }
    public void J8(){
       w ow = w.class;
       if (PatchProxy.applyVoid(null, this, ow, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, ow, "15")) {
          g.e(KsLogProfileTag.MOCK_FEED.appendTag("MyProfileMockDataPresenter"), "clear");
          this.p.Qb(this.u);
          this.q.clear();
          this.t.o2(null);
       }
       return;
    }
    public final List P8(List p0){
       boolean b;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, w.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (qPhoto == null || !r1.b3(qPhoto.mEntity)) {
             continue ;
          }else {
             PhotoMeta obj1 = PatchProxy.applyOneRefs(qPhoto, this, w.class, "9");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                obj1 = r1.u1(qPhoto.mEntity);
                if (obj1 != null) {
                   obj1 = obj1.mPostWorkStatus;
                   if (obj1 == null || obj1 == PostStatus.UPLOAD_COMPLETE) {
                      b = true;
                   }
                }
                b = false;
             }
             if (!b) {
                continue ;
             }
          }
          obj.add(qPhoto);
       }
       return obj;
    }
    public final int R8(List p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, w.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Iterator iterator = p0.iterator();
       int i = 0;
       int i1 = 0;
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (!qPhoto.mEntity instanceof ProfileDraftsFeed && (qPhoto.isLiveStream() || w.F0(qPhoto.mEntity))) {
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       obj = new Object[i];
       q.C().w("MyProfileMockDataPresenter", "find index: "+i1, obj);
       return i1;
    }
    public final int S8(List p0,QPhoto p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, w.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return y.o(p0, new u(p1));
    }
    public final boolean V8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((System.currentTimeMillis() - p0.created()) - this.r > 0)? true: false;
       return b;
    }
    public final boolean W8(boolean p0,QPhoto p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       w ow = w.class;
       if (PatchProxy.isSupport(ow)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, ow, "12");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       Object obj1 = PatchProxy.applyOneRefs(p1, this, ow, "11");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(!p1.isPublic() && (!p1.isLimitVisibility() && !p1.isMessageGroupVisibility())){
          b1 = true;
       }else {
          b1 = false;
       }
       if (p0 == b1) {
          b = false;
       }
       return b;
    }
    public final void X8(int p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ow, "5")) {
          return;
       }
       ow = this.s;
       String str = "MyProfileMockDataPresenter";
       if (ow == null) {
          g.e(KsLogProfileTag.MOCK_FEED.appendTag(str), "mProfilePageParam is null, not need update photo count");
          return;
       }else if(p0 <= 0){
          g.f(KsLogProfileTag.MOCK_FEED.appendTag(str), "updatePhotoCount ", "newPhotoCount", String.valueOf(p0));
          return;
       }else {
          User mOwnerCount = ow.b.mOwnerCount;
          mOwnerCount.mPrivatePhoto = (this.t.l2())? mOwnerCount.mPrivatePhoto + p0: mOwnerCount.mPublicPhoto + p0;
          this.s.b.notifyChanged();
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.t = this.r8("PAGE_LIST");
       return;
    }
}
