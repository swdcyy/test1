package com.yxcorp.gifshow.follow.stagger.post.g;
import o26.d;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.lang.Object;
import crd.a;
import io.reactivex.subjects.PublishSubject;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import bja.o;
import com.yxcorp.gifshow.follow.stagger.post.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.y6;
import lnc.t;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a;
import t45.d;
import ap3.k;
import java.lang.Runnable;
import bja.k;
import erd.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.follow.stagger.post.g$a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import com.google.common.collect.ImmutableList;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import java.util.Map;
import o26.c;
import bja.s;
import ekd.k1;
import bja.r;
import r26.a;
import java.lang.Float;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import h8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Set;
import r26.c;
import lnc.x6;
import bja.v;
import java.util.concurrent.Callable;
import brd.m;
import bja.n;
import erd.o;
import bja.d0;
import lq.f;
import bja.x;
import r16.f;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.util.List;
import ekd.q;
import java.util.Iterator;
import bja.u;
import bja.p;
import bja.i;
import bja.y;
import bja.l;
import brd.t;
import java.lang.Iterable;
import qk.m;
import com.yxcorp.gifshow.follow.stagger.post.a;
import ok.o;
import java.util.Map$Entry;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.kwai.kcube.TabIdentifier;
import cja.a;
import e36.a;
import wkd.b;
import bf6.h;
import android.app.Activity;
import hn5.n;
import hn5.m;
import android.content.Context;
import on5.b;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import java.util.HashMap;
import java.lang.Enum;
import cja.b;
import bja.c0;
import bja.m;
import com.yxcorp.gifshow.follow.stagger.post.b;
import bja.j;
import com.yxcorp.gifshow.follow.stagger.post.d;
import bja.t;
import tkd.b;
import tkd.d;
import jyb.a;
import com.yxcorp.gifshow.follow.stagger.post.g$b;
import com.kwai.feature.post.api.feature.upload.model.UploadPostForbidNotify;
import java.lang.reflect.Type;
import rq.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.m$k0;
import java.lang.Long;
import com.kwai.library.widget.popup.common.PopupInterface$h;

public class g implements d	// class@0011e8
{
    public boolean b;
    public b c;
    public final a d;
    public PublishSubject e;
    public g3 f;
    public boolean g;
    public final Set h;
    public final Map i;
    public final Set j;
    public final Map k;
    public QPhoto l;
    public QPhoto m;
    public static final z n;

    static {
       g.n = b.b(c.e("mock_feed", 1));
    }
    public void g(){
       super();
       a uoa = new a();
       this.d = uoa;
       this.e = PublishSubject.g();
       this.g = false;
       this.h = new LinkedHashSet();
       this.i = new ConcurrentHashMap();
       this.j = new HashSet();
       this.k = new ConcurrentHashMap();
       this.l = null;
       this.m = null;
       this.f = new o(this);
       f uof = new f(this);
       if (PatchProxy.applyVoidOneRefs(uof, this, g.class, "29")) {
       }else {
          y6 e = y6.e;
          if (e.j()) {
             uof.run();
          }else {
             uoa.c(e.h(LoadPolicy.SILENT_IF_DOWNLOADED).s(d.a).u(new k(uof), new k(this, uof)));
          }
       }
       ActivityContext.i(new g$a(this));
       return;
    }
    public void g(g$a p0){
       super();
       a uoa = new a();
       this.d = uoa;
       this.e = PublishSubject.g();
       this.g = false;
       this.h = new LinkedHashSet();
       this.i = new ConcurrentHashMap();
       this.j = new HashSet();
       this.k = new ConcurrentHashMap();
       this.l = null;
       this.m = null;
       this.f = new o(this);
       f uof = new f(this);
       if (PatchProxy.applyVoidOneRefs(uof, this, g.class, "29")) {
       }else {
          y6 e = y6.e;
          if (e.j()) {
             uof.run();
          }else {
             uoa.c(e.h(LoadPolicy.SILENT_IF_DOWNLOADED).s(d.a).u(new k(uof), new k(this, uof)));
          }
       }
       ActivityContext.i(new g$a(this));
       return;
    }
    public ImmutableList Id(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c(this.i.values());
    }
    public void J5(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          return;
       }
       k1.o(new s(this, p0));
       return;
    }
    public void Qb(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "7")) {
          return;
       }
       k1.o(new r(this, p0));
       return;
    }
    public void V4(float p0,a p1){
       boolean b;
       String cacheId;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, og, "13")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          return;
       }
       if (p1 != null && (p1.getUploadInfo() != null && !TextUtils.n(p1.getUploadInfo().getUserId(), QCurrentUser.me().getId()))) {
          return;
       }
       if (this.f(p1)) {
          this.i();
       }
       QPhoto obj = PatchProxy.applyOneRefs(p1, this, og, "15");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!this.d(p1) && this.f(p1)){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          return;
       }else {
          Object[] objArray = new Object[i];
          a.C().w("MockFeedRepoImp", "photo onProgressChanged cacheId:"+p1.getCacheId()+" progress:"+p0, objArray);
          cacheId = p1.getCacheId();
          obj = this.i.get(cacheId);
          if (obj != null) {
             this.j(obj, p1);
             this.g(p1);
             return;
          }else {
             objArray = new Object[i];
             a.C().w("MockFeedRepoImp", "photo is null.", objArray);
             if (this.j.contains(cacheId)) {
                return;
             }else {
                this.j.add(cacheId);
                objArray = new Object[i];
                a.C().w("MockFeedRepoImp", "add mPendingItems", objArray);
                m.r(new v(y6.r(c.class), p1)).B(g.n).t(new n(this, p1)).u(d.a).z(new d0(this, p1), f.b, new x(this, cacheId));
                return;
             }
          }
       }
    }
    public void Vf(QPhoto p0){
       this.m = p0;
    }
    public QPhoto Xc(){
       return this.m;
    }
    public void Y5(){
       if (PatchProxy.applyVoid(null, this, g.class, "22")) {
          return;
       }
       f uof = y6.r(f.class);
       if (uof == null) {
          return;
       }
       PostStatus[] postStatusAr = new PostStatus[]{PostStatus.UPLOAD_PENDING,PostStatus.UPLOADING,PostStatus.UPLOAD_FAILED,PostStatus.ENCODE_PENDING,PostStatus.ENCODING,PostStatus.ENCODE_FAILED};
       int i = 1;
       int i1 = 2;
       List list = uof.T0(postStatusAr);
       String str = "loadUploadPhotoIfNeeded";
       String str1 = "MockFeedRepoImp";
       if (list != null) {
          Object[] objArray = new Object[i1];
          objArray[0] = "workSize";
          objArray[i] = String.valueOf(list.size());
          a.C().w(str1, str, objArray);
       }
       if (!PatchProxy.applyVoidOneRefs(list, this, g.class, "23") && !q.f(list)) {
          if (!QCurrentUser.ME.isLogined()) {
             list.clear();
          }else {
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                a uoa1 = iterator1.next();
                if (uoa1 != null && (!uoa1.needUpload() || (uoa1.getUploadInfo() == null || (!(QCurrentUser.ME.getId()).equals(uoa1.getUploadInfo().getUserId()) || this.d(uoa1))))) {
                   iterator1.remove();
                }
             }
          }
       }
       if (list != null) {
          Object[] objArray1 = new Object[i1];
          objArray1[0] = "filterWorkSize";
          objArray1[i] = String.valueOf(list.size());
          a.C().w(str1, str, objArray1);
       }
       if (!PatchProxy.applyVoidOneRefs(list, this, g.class, "24") && !q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (PatchProxy.applyVoidOneRefs(uoa, this, g.class, "25")) {
                continue ;
             }else {
                str1 = uoa.getCacheId();
                QPhoto qPhoto = this.i.get(str1);
                if (qPhoto != null) {
                   this.j(qPhoto, uoa);
                   this.h(uoa, 0);
                   this.g(uoa);
                }else if(this.j.contains(str1)){
                   continue ;
                }else {
                   this.j.add(str1);
                   m.r(new u(uoa)).B(g.n).t(new p(this, uoa)).u(d.a).z(new i(this, uoa), f.b, new y(this, str1));
                }
             }
          }
       }
       return;
    }
    public final void a(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "30")) {
          return;
       }
       if (y6.r(f.class) != null) {
          p0.run();
       }else {
          this.d.c(this.e.subscribe(new l(p0)));
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, g.class, "27")) {
          return;
       }
       g tc = this.c;
       if (tc != null) {
          tc.dispose();
          this.c = null;
       }
       return;
    }
    public final ImmutableList c(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return m.s(p0).p(a.b).B();
    }
    public boolean c5(QPhoto p0){
       Map$Entry uEntry;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, g.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.C().w("MockFeedRepoImp", "removePhoto", objArray);
       obj = this.i.entrySet().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return 0;
          }
          uEntry = obj.next();
          if (p0.equals(uEntry.getValue())) {
             break ;
          }
       }
       this.i.remove(uEntry.getKey());
       return true;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("MockFeedRepoImp", "clear", objArray);
       this.i.clear();
       this.j.clear();
       this.k.clear();
       this.d.d();
       return;
    }
    public final boolean d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == null || (p0.getUploadInfo() == null || p0.getUploadInfo().getMockFeedOption() != b)) {
          b = false;
       }
       return b;
    }
    public final boolean e(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.getUploadInfo() != null && p0.getUploadInfo().getMockFeedOption() == 2))? true: false;
       return b;
    }
    public boolean ec(QPhoto p0){
       Map$Entry uEntry;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().w("MockFeedRepoImp", "removeProfileMockFeeds", objArray);
       obj = this.k.entrySet().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return i;
          }
          uEntry = obj.next();
          if (p0.equals(uEntry.getValue())) {
             break ;
          }
       }
       this.k.remove(uEntry.getKey());
       Object[] objArray1 = new Object[i];
       a.C().w("MockFeedRepoImp", "removeProfileMockFeeds: really remove  photoId = "+p0.getPhotoId(), objArray1);
       return true;
    }
    public final boolean f(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       obj = (p0.getEncodeInfo() != null && p0.getEncodeInfo().isHidden())? 1: 0;
       int i = (p0.getUploadInfo() != null && p0.getUploadInfo().isHidden())? 1: 0;
       if (obj || i) {
          b = false;
       }
       return b;
    }
    public final void g(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("MockFeedRepoImp", "notifyProgressChanged uiProcess="+p0.getUiProgress(), objArray);
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          iterator.next().tc(p0.getStatus(), p0.getId(), p0.getUiProgress(), a.a(p0));
       }
       return;
    }
    public QPhoto gf(){
       g obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj != null) {
          Object[] objArray = new Object[0];
          a.C().w("MockFeedRepoImp", "popLastCompleteMockFeedToInsertFriendTab\(\) photoId"+obj.getPhotoId(), objArray);
       }
       this.l = null;
       return obj;
    }
    public final void h(a p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, og, "17")) {
          return;
       }
       String str = null;
       if (p0 != null) {
          str = "cacheId: "+p0.getCacheId()+" status: "+p0.getStatus();
       }
       str = "notifyStatusChanged "+str+" mockItemSize: "+this.i.size();
       if (p0 != null && (p0.getStatus() != null && (!TextUtils.x(p0.getCacheId()) && (p0.getUploadInfo() != null && (p0.getStatus() != PostStatus.ENCODE_CANCELED && (p0.getStatus() == PostStatus.UPLOAD_CANCELED || a.a(p0))))))) {
          this.i.remove(p0.getCacheId());
          str = str+"after remove canceled mockItemSize: "+this.i.size();
       }
    label_00a9 :
       Object[] objArray = new Object[0];
       a.C().w("MockFeedRepoImp", str, objArray);
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          iterator.next().u4(this.c(this.i.values()), p0, p1);
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, g.class, "12")) {
          return;
       }
       if (this.b == null) {
          this.b = true;
          h oh = b.a(0x3adc2a3f);
          oh.e(4);
          if (m.a().U3(ActivityContext.g().e())) {
             oh.h();
          }
       }
       return;
    }
    public final void j(QPhoto p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "14")) {
          return;
       }
       p0.setFeedStatus(p1.getStatus());
       p0.setPostWorkInfoId(p1.getId());
       p0.setMockFeedTarget(b.h.equals(a.a(p1)));
       if (p1.getStatus() == PostStatus.UPLOAD_COMPLETE) {
          p0.setSource(6);
          p0.mFollowStatus = User$FollowStatus.FOLLOWING;
       }
       return;
    }
    public ImmutableList se(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c(this.k.values());
    }
    public void w9(PostStatus p0,a p1){
       Object[] objArray;
       QPhoto qPhoto;
       t ot;
       boolean b;
       a a;
       boolean b1;
       boolean b2;
       Object obj = this;
       g$b obj1 = p0;
       Object[] obj2 = p1;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, og, "9")) {
          return;
       }
       String str = "onStatusChanged";
       String str1 = "cacheId";
       String str2 = "status";
       boolean i = 1;
       int i1 = 0;
       if (obj2 != null) {
          HashMap hashMap = new HashMap();
          hashMap.put(str2, p0.name());
          hashMap.put(str1, String.valueOf(p1.getCacheId()));
          objArray = new Object[i];
          objArray[i1] = hashMap;
          a.C().w("MockFeedRepoImp", str, objArray);
       }
       if (obj.d(obj2)) {
          obj2 = new Object[i1];
          b.D().w("MockFeedRepoImp", "onStatusChanged not mock data", obj2);
          return;
       }else {
          PostStatus uPLOAD_COMPL = PostStatus.UPLOAD_COMPLETE;
          if (obj1 == uPLOAD_COMPL) {
             this.i();
          }
          Object[] objArray1 = (obj1 == PostStatus.UPLOAD_CANCELED || obj1 == PostStatus.ENCODE_CANCELED)? 1: null;
          if (!obj.f(obj2)) {
             obj2 = new Object[i1];
             a.C().w("MockFeedRepoImp", "onStatusChanged: postWorkInfo is invisible", obj2);
             return;
          }else if(obj2 == null){
             qPhoto = null;
          }else {
             qPhoto = obj.i.get(p1.getCacheId());
          }
          int i2 = obj.i.size();
          if (qPhoto == null && objArray1) {
             obj2 = new Object[i1];
             a.C().w("MockFeedRepoImp", "cached is null and isCanceled", obj2);
             return;
          }else {
             x6 ox6 = y6.r(c.class);
             if (qPhoto == null || obj1 == uPLOAD_COMPL) {
                objArray1 = new Object[i1];
                a.C().w("MockFeedRepoImp", "cached is null and status is upload complete", objArray1);
                ot = (obj2 != null)? t.just(p1).observeOn(g.n).flatMap(new m(ox6, qPhoto)).doOnNext(new b(obj, obj2, obj1)): null;
             }else if(objArray1 != null){
                ot = t.just(qPhoto).doOnNext(new c0(obj, obj2));
             }else {
                ot = t.just(qPhoto);
             }
             String str3 = (obj2 == null)? "": p1.getCacheId();
             a uoa1 = a.C();
             objArray = new Object[1];
             HashMap hashMap1 = PatchProxy.applyTwoRefs(obj1, str3, obj, og, "11");
             if (hashMap1 != patchProxyRe) {
             }else {
                hashMap1 = new HashMap();
                hashMap1.put(str1, str3);
                hashMap1.put(str2, p0.name());
             }
             objArray[0] = hashMap1;
             uoa1.w("MockFeedRepoImp", str, objArray);
             if (ot != null) {
                ot.observeOn(d.a).subscribe(new j(obj, obj2, i2), d.b);
             }
             if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, og, "10")) {
                hashMap1 = 0;
             }else {
                Object[] objArray2 = new Object[0];
                a.C().w("MockFeedRepoImp", "showToastOrDialog\(\) status="+obj1+" postWorkInfo id="+p1.getId(), objArray2);
                obj.a(new t(obj1, obj2));
                d.a(-1079301847).c50(obj1);
             }
             if (obj.g == null) {
                obj1 = PatchProxy.applyOneRefs(obj2, null, uoa, "2");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                   og = 1;
                }else if(a.a(p1) && obj2 != null){
                   if (p1.getUploadTaskType() == 1) {
                      b = true;
                   }
                }else {
                   og = 1;
                }
                b = false;
                if (b) {
                   obj1 = new g$b(obj);
                   if (!PatchProxy.applyVoidTwoRefs(obj2, obj1, null, uoa, "3")) {
                      UploadPostForbidNotify uploadPostFo = a.H(UploadPostForbidNotify.class);
                      a = a.a;
                      Objects.requireNonNull(a);
                      EncodeInfo obj3 = PatchProxy.applyOneRefs(obj2, a, uoa, "4");
                      if (obj3 != patchProxyRe) {
                         i = obj3.booleanValue();
                      }else {
                         obj3 = PatchProxy.applyOneRefs(obj2, a, uoa, "5");
                         if (obj3 != patchProxyRe) {
                            b1 = obj3.booleanValue();
                         }else if(obj2 == null){
                            if (p1.getEncodeInfo() != null) {
                               obj3 = p1.getEncodeInfo();
                               a.o(obj3, "workInfo.encodeInfo");
                               if (obj3.isCrashInEncodingAndGiveUpWorkspace()) {
                               label_01f8 :
                                  b1 = true;
                               }
                            }
                            if (!p1.isSaveWorkSpace()) {
                               goto label_01f8 ;
                            }
                         }
                         b1 = false;
                         if (!b1) {
                            IUploadInfo obj4 = PatchProxy.applyOneRefs(obj2, a, uoa, "6");
                            if (obj4 != patchProxyRe) {
                               b2 = obj4.booleanValue();
                            }else if(obj2 != null && p1.getUploadInfo() != null){
                               obj4 = p1.getUploadInfo();
                               String str4 = "workInfo.uploadInfo";
                               a.o(obj4, str4);
                               if (obj4.getVideoContext() != null) {
                                  obj4 = p1.getUploadInfo();
                                  a.o(obj4, str4);
                                  VideoContext videoContext = obj4.getVideoContext();
                                  a.o(videoContext, "videoContext");
                                  i b3 = videoContext.G().b;
                                  if (!TextUtils.x(b3.i0)) {
                                     m$k0 i0 = b3.i0;
                                     a.o(i0, "videoInfo.moodTemplateId");
                                     if (Long.parseLong(i0)) {
                                     label_025c :
                                        b2 = true;
                                     }
                                  }
                                  if (b3.B0 != null || b3.I0 == 2) {
                                     goto label_025c ;
                                  }
                               }
                            }
                            b2 = false;
                            if (!b2) {
                               i = false;
                            }
                         }
                         i = true;
                      }
                      a.b(obj2, uploadPostFo, i, obj1);
                   }
                }
             }
          label_0268 :
             return;
          }
       }
    }
}
