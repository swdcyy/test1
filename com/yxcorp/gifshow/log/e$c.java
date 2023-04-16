package com.yxcorp.gifshow.log.e$c;
import com.yxcorp.gifshow.log.v;
import com.yxcorp.gifshow.log.e$c$a;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.realtime.RealTimeReporting;
import com.google.common.base.Optional;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.realtime.CoverShowDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import brd.t;
import java.util.List;
import com.google.common.collect.ArrayListMultimap;
import java.util.Iterator;
import com.yxcorp.gifshow.log.realtime.CoverShow;
import com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowFeed;
import com.yxcorp.gifshow.log.e$a;
import java.lang.Long;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qk.g0;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import java.util.Collection;
import ok.n;
import java.lang.Iterable;
import com.google.common.collect.Ordering;
import com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowLog;
import com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowPage;
import com.yxcorp.gifshow.log.e$b;
import qk.y;
import java.util.HashMap;
import com.google.protobuf.nano.MessageNano;
import l2b.b;
import l2b.a;
import com.yxcorp.gifshow.log.e;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import k2b.p;
import erd.g;
import java.lang.Integer;

public class e$c extends v	// class@001b01
{
    public final Ordering f;
    public Optional g;
    public long h;
    public static final e$c i;

    static {
       e$c.i = new e$c();
    }
    public void e$c(){
       super();
       this.f = new e$c$a(this);
       this.h = TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES);
    }
    public static e$c k(){
       return e$c.i;
    }
    public long a(){
       return this.h;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "1")) {
          return;
       }
       this.g = RealTimeReporting.getInstance().getCoverShowDao();
       return;
    }
    public boolean d(boolean p0){
       e$c uoc = e$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (this.g.isPresent() && this.g.get().queryBuilder().count()) {
          b = false;
       }
       return b;
    }
    public t i(boolean p0){
       List obj;
       int b;
       e$a b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e$c uoc = e$c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoc, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       int i = 0;
       if (this.g.isPresent()) {
          obj = this.g.get().queryBuilder().limit(1000).list();
          ArrayListMultimap obj1 = PatchProxy.applyOneRefs(obj, this, uoc, "4");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = ArrayListMultimap.create();
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                CoverShow uCoverShow = iterator.next();
                try{
                   CoverShowLogs$CoverShowFeed uCoverShowFe = CoverShowLogs$CoverShowFeed.parseFrom(uCoverShow.getContent());
                   e$a uoa = new e$a(uCoverShow.getLlsid().longValue(), uCoverShow.getLlsidFirstPage().longValue());
                   uoa.b = uCoverShowFe;
                   CoverShowLogs$CoverShowFeed photoId = (TextUtils.x(uCoverShowFe.liveStreamId))? uCoverShowFe.photoId: uCoverShowFe.liveStreamId;
                   obj1.put(photoId, uoa);
                }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e5){
                   e5.printStackTrace();
                   goto label_004c ;
                }
             }
             ArrayListMultimap uArrayListMu = ArrayListMultimap.create();
             Iterator iterator1 = obj1.asMap().entrySet().iterator();
             while (iterator1.hasNext()) {
                Collection value = iterator1.next().getValue();
                b = true;
                if (value.size() < b) {
                   b = false;
                }
                n.c(b, "Feeds should have at least one element");
                long l = 0;
                Iterator iterator2 = value.iterator();
                while (iterator2.hasNext()) {
                   b1 = iterator2.next().b;
                   long l1 = b1.leaveTimestamp - b1.enterTimestamp;
                   l = l + l1;
                }
                e$a uoa1 = this.f.min(value);
                b1 = uoa1.b;
                b1.coverExposureDuration = l;
                b1.leaveTimestamp = this.f.max(value).b.leaveTimestamp;
                uoa1.b.coverExposureTimes = value.size();
                uArrayListMu.put(uoa1.a, uoa1.b);
             }
             CoverShowLogs$CoverShowLog uCoverShowLo = new CoverShowLogs$CoverShowLog();
             Map map = uArrayListMu.asMap();
             CoverShowLogs$CoverShowPage[] uCoverShowPa = new CoverShowLogs$CoverShowPage[map.size()];
             uCoverShowLo.page = uCoverShowPa;
             iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                CoverShowLogs$CoverShowPage uCoverShowPa1 = new CoverShowLogs$CoverShowPage();
                uCoverShowPa1.llsid = uEntry.getKey().a;
                uCoverShowPa1.llsidFirstPage = uEntry.getKey().b;
                uCoverShowPa1.feed = y.v(uEntry.getValue(), CoverShowLogs$CoverShowFeed.class);
                b = i + 1;
                uCoverShowLo.page[i] = uCoverShowPa1;
                i = b;
             }
             Object obj2 = PatchProxy.applyTwoRefs(uCoverShowLo, obj, this, uoc, "5");
             if (obj2 != patchProxyRe) {
                obj1 = obj2;
             }else {
                HashMap hashMap = new HashMap();
                this.e(hashMap, MessageNano.toByteArray(uCoverShowLo));
                obj1 = a.a().b(e.e, hashMap).map(new e()).observeOn(d.c).observeOn(this.d).doOnNext(new p(this, obj));
             }
          }
          return obj1;
       }else {
          return t.just(Integer.valueOf(i));
       }
    }
}
