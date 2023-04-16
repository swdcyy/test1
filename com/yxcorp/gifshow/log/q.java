package com.yxcorp.gifshow.log.q;
import com.yxcorp.gifshow.log.v;
import com.yxcorp.gifshow.log.policy.LogPolicy;
import com.kwai.framework.model.router.RouteType;
import java.lang.String;
import jb6.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.realtime.RealTimeReporting;
import com.google.common.base.Optional;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Collection;
import ekd.q;
import brd.t;
import brd.w;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kwai.framework.model.feed.BaseFeed;
import vjc.a;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import com.yxcorp.gifshow.log.q$a;
import com.yxcorp.gifshow.log.p;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.log.realshow.nano.ClickLogs$ClickFeed;
import ok.o;
import com.yxcorp.gifshow.log.g$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import kp.r1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import f3b.u;
import com.kuaishou.log.realshow.nano.ClickLogs$ClickLog;
import k2b.u1;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.log.model.Click2MetaData;
import k2b.h2;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.realtime.OperationDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.yxcorp.gifshow.log.realtime.OperationDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.log.realtime.Operation;
import fg6.a;
import com.google.gson.Gson;
import s00.b$a;
import s00.b;
import java.lang.CharSequence;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;
import java.lang.Throwable;
import java.lang.Exception;
import com.google.protobuf.nano.MessageNano;
import s00.b$b;
import ekd.s;
import com.yxcorp.gifshow.log.model.response.UploadLogResponse;
import com.yxcorp.gifshow.log.policy.LogPolicy$Upload;
import l2b.b;
import l2b.a;
import java.lang.Integer;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import erd.g;

public class q extends v	// class@001b29
{
    public Optional f;
    public long g;
    public LogPolicy h;
    public String i;
    public static final q j;

    static {
       q.j = new q();
    }
    public void q(){
       super();
       this.g = 4000;
       this.h = LogPolicy.DEFAULT;
       this.i = b.d("n/clc/click2", RouteType.API);
    }
    public static q m(){
       return q.j;
    }
    public static String q(String p0){
       if (p0 != null) {
       }else {
          p0 = "_";
       }
       return p0;
    }
    public long a(){
       return this.g;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, q.class, "4")) {
          return;
       }
       this.f = RealTimeReporting.getInstance().getOperationDao();
       return;
    }
    public boolean d(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oq, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0) {
          p0 = (this.n().isEmpty() && this.l().isEmpty())? true: false;
          return p0;
       }else {
          return q.f(this.n());
       }
    }
    public t i(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oq, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       boolean b = false;
       if (p0) {
          return t.merge(this.p(true), this.p(b));
       }else {
          return this.p(b);
       }
    }
    public void k(QPhoto p0,ClientEvent$ExpTagTrans p1,String p2,String p3){
       boolean b;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, q.class, "5")) {
          return;
       }
       if (a.a(p0.mEntity)) {
          return;
       }
       q$a uoa = new q$a(null);
       uoa.mPlayedPhotoSource = TextUtils.I(p0.getFullSource());
       uoa.mExpTag = q.q(p0.getExpTag());
       uoa.mPreExpTag = q.q(p2);
       uoa.mPhotoInfo = TextUtils.I(p3);
       ClickLogs$ClickFeed uClickFeed = new ClickLogs$ClickFeed();
       g$b uob = b.a(0xe0ff4fb).b(null);
       if (uob.c(p1)) {
          ClientEvent$ExpTagTrans uExpTagTrans = uob.d();
          if (uExpTagTrans == null || !(p1.serverExpTag).equals(uExpTagTrans.serverExpTag)) {
             uob.a(p1);
          }
       }
       ClientEvent$ExpTagTransList uExpTagTrans1 = uob.b();
       if (uExpTagTrans1 != null) {
          uClickFeed.expTagList = uExpTagTrans1;
       }
       if (p0.getServerExpTag() != null) {
          uClickFeed.serverExpTag = p0.getServerExpTag();
       }
       if (p0.getSource() != null) {
          uClickFeed.source = p0.getSource();
       }
       int i = 1;
       if (p0.isArticle()) {
          uClickFeed.feedType = i;
          uClickFeed.subType = i;
       }
       if (r1.c2(p0.getEntity())) {
          uClickFeed.feedType = 2;
       }
       uClickFeed.reportContext = TextUtils.I(p0.getReportContext());
       FeedLogCtx uFeedLogCtx = r1.O0(p0.mEntity);
       if (uFeedLogCtx != null) {
          uClickFeed.interStidContainer = u.c(uFeedLogCtx.stidContainer);
          uClickFeed.interStExParams = TextUtils.k(uFeedLogCtx.stExParams);
       }
       ClickLogs$ClickLog uClickLog = new ClickLogs$ClickLog();
       ClickLogs$ClickFeed[] uClickFeedAr = new ClickLogs$ClickFeed[i];
       uClickLog.feed = uClickFeedAr;
       uClickFeedAr[0] = uClickFeed;
       uoa.a = uClickLog;
       uClickLog = PatchProxy.apply(null, null, u1.class, "80");
       b = (uClickLog != PatchProxyResult.class)? uClickLog.booleanValue(): a.t().d("enableNewClick2", 0);
       if (b) {
          if (!PatchProxy.applyVoidOneRefs(uoa, this, q.class, "6")) {
             Click2MetaData uClick2MetaD = new Click2MetaData();
             uClick2MetaD.clickLog = uoa.a;
             u1.s(uClick2MetaD);
          }
       }else if(PatchProxy.applyVoidOneRefs(uoa, this, q.class, "7")){
          this.f(new h2(this, uoa));
       }
       return;
    }
    public final List l(){
       Object obj = PatchProxy.apply(null, this, q.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.f.isPresent()) {
          return new ArrayList();
       }
       try{
          WhereCondition[] whereConditi = new WhereCondition[0];
          return this.f.get().queryBuilder().where(OperationDao$Properties.Is_delayed_log.eq(Boolean.TRUE), whereConditi).limit(10).list();
       }catch(java.lang.Exception e0){
          return new ArrayList();
       }
    }
    public final List n(){
       Object obj = PatchProxy.apply(null, this, q.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.f.isPresent()) {
          return new ArrayList();
       }
       try{
          Property is_delayed_l = OperationDao$Properties.Is_delayed_log;
          WhereCondition whereConditi = is_delayed_l.isNull();
          WhereCondition[] whereConditi1 = new WhereCondition[0];
          return this.f.get().queryBuilder().whereOr(whereConditi, is_delayed_l.eq(Boolean.FALSE), whereConditi1).limit(10).list();
       }catch(java.lang.Exception e0){
          return new ArrayList();
       }
    }
    public final Map o(List p0){
       q$a uoa = q$a.class;
       String obj = PatchProxy.applyOneRefs(p0, this, q.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b();
       HashMap hashMap = new HashMap();
       if (!PatchProxy.applyVoidTwoRefs(p0, hashMap, this, q.class, "13")) {
          StringBuilder str1 = "";
          StringBuilder str2 = "";
          StringBuilder str3 = "";
          StringBuilder str4 = "";
          int i2 = 0;
          while (i2 < p0.size()) {
             Operation operation1 = p0.get(i2);
             try{
                q$a uoa2 = a.a.h(operation1.getContent(), uoa);
                String str5 = "|";
                str1 = str1+uoa2.mPlayedPhotoSource+str5;
                str2 = str2+uoa2.mPreExpTag+str5;
                str3 = str3+uoa2.mExpTag+str5;
                str4 = str4+uoa2.mPhotoInfo+str5;
                i2 = i2 + 1;
             }catch(com.google.gson.JsonSyntaxException e0){
             }
          }
          hashMap.put("data", str1.substring(0, (str1.length() - 1)));
          hashMap.put("exptag0", str2.substring(0, (str2.length() - 1)));
          hashMap.put("exptag", str3.substring(0, (str3.length() - 1)));
          hashMap.put("photoinfo", str4.substring(0, (str4.length() - 1)));
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, hashMap, this, q.class, "12")) {
          ClickLogs$ClickLog uClickLog = new ClickLogs$ClickLog();
          ClickLogs$ClickFeed[] uClickFeedAr = new ClickLogs$ClickFeed[p0.size()];
          uClickLog.feed = uClickFeedAr;
          int i = 0;
          while (i < p0.size()) {
             Operation operation = p0.get(i);
             try{
                q$a uoa1 = a.a.h(operation.getContent(), uoa);
                byte[] uobyteArray = b.a().a(uoa1.mClickBatchLog);
                if (TextUtils.n("gzip", uoa1.mEncoding)) {
                   byte[] uobyteArray1 = PatchProxy.applyOneRefs(uobyteArray, this, q.class, "14");
                   if (uobyteArray1 != PatchProxyResult.class) {
                   }else if(uobyteArray == null || !uobyteArray.length){
                      uobyteArray1 = null;
                   }else {
                      ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                      ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(uobyteArray);
                      GZIPInputStream gZIPInputStr = new GZIPInputStream(uByteArrayIn);
                      byte[] uobyteArray2 = new byte[256];
                      int i1 = gZIPInputStr.read(uobyteArray2);
                      while (i1 >= 0) {
                         uByteArrayOu.write(uobyteArray2, 0, i1);
                      }
                      gZIPInputStr.close();
                      uByteArrayIn.close();
                      uByteArrayOu.close();
                      uobyteArray = uByteArrayOu.toByteArray();
                   }
                }
                uClickLog.feed[i] = ClickLogs$ClickLog.parseFrom(uobyteArray).feed[0];
                i = i + 1;
             }catch(com.google.gson.JsonSyntaxException e0){
             }
          }
          byte[] uobyteArray3 = MessageNano.toByteArray(uClickLog);
          String str = (TextUtils.n("gzip", this.b()))? b.b().a(s.b(uobyteArray3)): b.b().a(uobyteArray3);
          hashMap.put("clickLog", str);
       }
       if (TextUtils.n("gzip", obj)) {
          hashMap.put("encoding", "gzip");
       }
       return hashMap;
    }
    public final t p(boolean p0){
       List obj;
       t ot;
       Map map;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oq, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = (p0)? this.l(): this.n();
       if (q.f(obj)) {
          return t.just(new UploadLogResponse());
       }else if(PatchProxy.isSupport(oq)){
          ot = PatchProxy.applyTwoRefs(obj, Boolean.valueOf(p0), this, oq, "10");
          if (ot != patchProxyRe) {
          }else if(this.h.getUploadPolicy() == LogPolicy$Upload.NONE){
             ot = t.just(new UploadLogResponse());
          }else {
             ArrayList uArrayList = new ArrayList(obj);
             Operation operation = obj.get(0);
             try{
                map = this.o(uArrayList);
             }catch(java.lang.Exception e0){
                e0.clear();
                e0.add(map);
                map = a.a.h(map.getContent(), HashMap.class);
             }
             b uob = a.a();
             q ti = this.i;
             int i = (p0)? 2: 1;
             ot = uob.a(ti, Integer.valueOf(i), map).map(new e()).observeOn(d.c).observeOn(this.d).doOnNext(new p(this, e0));
          }
       }else {
          goto label_0049 ;
       }
       return ot;
    }
}
