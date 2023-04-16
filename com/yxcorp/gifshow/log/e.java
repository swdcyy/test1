package com.yxcorp.gifshow.log.e;
import erd.g;
import com.kwai.framework.model.router.RouteType;
import java.lang.String;
import jb6.b;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.yxcorp.gifshow.log.e$a;
import java.lang.System;
import com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowFeed;
import y8c.c;
import y8c.q;
import com.kwai.framework.model.feed.BaseFeed;
import vjc.a;
import java.lang.Long;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import com.yxcorp.gifshow.log.e$c;
import k2b.o;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.v;

public class e implements g	// class@001b04
{
    public final Map b;
    public final Map c;
    public final boolean d;
    public static final String e;

    static {
       e.e = b.d("n/clc/cover/show", RouteType.API);
    }
    public void e(boolean p0){
       super();
       this.b = new HashMap();
       this.c = new HashMap();
       this.d = p0;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          e$a b = iterator.next().b;
          long l = System.currentTimeMillis();
          b.renderedTimestamp = l;
          b.enterTimestamp = l;
       }
       return;
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "8")) {
       }else if(this.d == null){
          switch (p0.a){
              case 1:
                if (p0.c.c1()) {
                   this.a();
                }
                break;
              case 2:
              case 5:
                this.e();
                break;
              case 3:
                this.a();
                break;
              case 4:
                if (p0.c.c1()) {
                   this.e();
                }
                break;
              case 6:
                this.e();
                this.b.clear();
                this.c.clear();
                break;
              default:
          }
       }
       return;
    }
    public void b(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       if (this.d != null && !a.a(p0)) {
          this.c.put(p0.getId(), Long.valueOf(System.currentTimeMillis()));
       }
       return;
    }
    public synchronized void c(QPhoto p0){
       e$a uoa;
       Long longx;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       if (this.d == null || a.a(p0.mEntity)) {
          return;
       }
       if (p0.isLiveStream()) {
          uoa = this.b.remove(p0.getLiveStreamId());
          longx = this.c.remove(p0.getLiveStreamId());
       }else {
          uoa = this.b.remove(p0.getPhotoId());
          longx = this.c.remove(p0.getPhotoId());
       }
       if (uoa == null) {
          return;
       }else if(longx != null){
          uoa.b.renderedTimestamp = longx.longValue();
       }
       e$a b = uoa.b;
       if (!b.renderedTimestamp) {
          return;
       }else {
          b.leaveTimestamp = System.currentTimeMillis();
          this.f(uoa);
          return;
       }
    }
    public void d(QPhoto p0,QPhoto p1,int p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, e.class, "2")) {
          return;
       }
       if (this.d != null && !a.a(p0.mEntity)) {
          long l = p0.getListLoadSequenceIDLong().longValue();
          long l1 = (p1 != null)? p1.getListLoadSequenceIDLong().longValue(): 0;
          e$a uoa = new e$a(l, l1);
          e$a b = uoa.b;
          b.coverIndex = p2 + 1;
          b.authorId = TextUtils.k(p0.getUserId());
          b.expTag = TextUtils.k(p0.getExpTag());
          b.serverExpTag = TextUtils.I(p0.getServerExpTag());
          b.enterTimestamp = System.currentTimeMillis();
          if (p0.isArticle()) {
             b.subtype = 1;
          }
          if (!TextUtils.x(p0.getLogReportContent())) {
             b.reportContext = p0.getLogReportContent();
          }
          if (p0.isLiveStream()) {
             b = uoa.b;
             b.feedType = 2;
             b.liveStreamId = TextUtils.k(p0.getLiveStreamId());
             this.b.put(uoa.b.liveStreamId, uoa);
          }else {
             b = uoa.b;
             b.feedType = 1;
             b.photoId = TextUtils.k(p0.getPhotoId());
             this.b.put(uoa.b.photoId, uoa);
          }
       }
       return;
    }
    public synchronized final void e(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       if (this.b.isEmpty()) {
          return;
       }
       long l = System.currentTimeMillis();
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          e$a uoa = iterator.next();
          e$a b = uoa.b;
          Long longx = (b.feedType == 2)? this.c.get(b.liveStreamId): this.c.get(b.photoId);
          if (longx != null) {
             uoa.b.renderedTimestamp = longx.longValue();
          }
          uoa.b.leaveTimestamp = l;
          this.f(uoa);
       }
       return;
    }
    public final void f(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e$c.k().f(new o(p0));
       return;
    }
}
