package com.kuaishou.commercial.tvc.TvcPluginImplWrapper;
import lm9.a;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper$a;
import nsd.u;
import java.lang.Object;
import com.smile.gifshow.annotation.plugin.a;
import java.lang.Class;
import com.smile.gifshow.annotation.plugin.Factory;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper$mShouldRequestTvcForAll$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper$mTvcStreamIdWhiteList$2;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper$mTvcUserIdWhiteList$2;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import zsd.u;
import ul9.e;
import brd.t;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper$b;
import erd.g;
import crd.b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import kotlin.jvm.internal.a;
import com.kuaishou.commercial.tvc.TvcTimeUtils;
import androidx.fragment.app.Fragment;
import jsa.c;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper$g;
import lm9.a$b;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper$i;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper$f;
import com.kwai.framework.model.feed.BaseFeed;
import pw6.d;
import java.lang.Integer;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper$e;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import lm9.a$c;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import pw6.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import t45.d;
import brd.z;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper$c;
import org.greenrobot.eventbus.a;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper$d;
import tkd.b;
import tkd.d;
import lm9.d;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper$h;
import sz5.b;
import yx.j0;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class TvcPluginImplWrapper implements a	// class@0016a3
{
    public final a b;
    public final p c;
    public final p d;
    public final p e;
    public static final TvcPluginImplWrapper$a f;

    static {
       TvcPluginImplWrapper.f = new TvcPluginImplWrapper$a(null);
    }
    public void TvcPluginImplWrapper(){
       super();
       this.b = new a(a.class).getInstance();
       this.c = s.c(TvcPluginImplWrapper$mShouldRequestTvcForAll$2.INSTANCE);
       this.d = s.c(TvcPluginImplWrapper$mTvcStreamIdWhiteList$2.INSTANCE);
       this.e = s.c(TvcPluginImplWrapper$mTvcUserIdWhiteList$2.INSTANCE);
    }
    public void AH(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TvcPluginImplWrapper tvcPluginImp = TvcPluginImplWrapper.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tvcPluginImp, "14")) {
          return;
       }
       int i = 1;
       int i1 = (p0 == null || !p0.length())? 1: 0;
       if (i1) {
          i = 0;
       }else {
          Boolean uBoolean = PatchProxy.apply(null, this, tvcPluginImp, "1");
          if (uBoolean == patchProxyRe) {
             uBoolean = this.c.getValue();
          }
          if (!uBoolean.booleanValue()) {
             List list = PatchProxy.apply(null, this, tvcPluginImp, "2");
             if (list == patchProxyRe) {
                list = this.d.getValue();
             }
             if (!list.contains(p0)) {
                Object obj = PatchProxy.apply(null, this, tvcPluginImp, "3");
                if (obj != patchProxyRe) {
                }else {
                   obj = this.e.getValue();
                }
                Iterator iterator = obj.iterator();
                boolean b = false;
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   int i2 = (str.length() > 0)? 1: 0;
                   if (i2 && u.H1(p0, str, false, 2, null)) {
                      b = true;
                   }
                }
                i = b;
             }
          }
       }
       if (i) {
          e a = e.a;
          if (!a.b()) {
             a.a().subscribe(new TvcPluginImplWrapper$b(this, p0));
          label_00a8 :
             return;
          }
       }
       this.n().AH(p0);
       goto label_00a8 ;
    }
    public final boolean F(LiveStreamFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TvcPluginImplWrapper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          LiveStreamFeed mLiveStreamM = p0.mLiveStreamModel;
          if (mLiveStreamM != null && mLiveStreamM.mTvcType == b) {
             String id = p0.getId();
             a.o(id, "liveStreamFeed.id");
             if (TvcTimeUtils.e(id)) {
             label_0030 :
                return b;
             }
          }
       }
       b = false;
       goto label_0030 ;
    }
    public boolean Hm(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TvcPluginImplWrapper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n().Hm(p0);
    }
    public void J60(LiveStreamFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper.class, "18")) {
          return;
       }
       a.p(p0, "liveStreamFeed");
       this.n().J60(p0);
       return;
    }
    public void Jl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper.class, "12")) {
          return;
       }
       if (p0 != null) {
          c a = p0.a;
          if (a != null) {
             List list = CollectionsKt___CollectionsKt.J5(a);
             if (list != null) {
                Iterator iterator = list.iterator();
                LiveStreamFeed liveStreamFe = null;
                while (iterator.hasNext()) {
                   Object obj = iterator.next();
                   QPhoto mEntity = obj.mEntity;
                   if (mEntity instanceof LiveStreamFeed) {
                      liveStreamFe = mEntity;
                   }
                   if (this.F(liveStreamFe)) {
                      liveStreamFe = obj;
                      break ;
                   }
                }
                if (liveStreamFe != null) {
                   e a1 = e.a;
                   if (!a1.b()) {
                      a1.a().subscribe(new TvcPluginImplWrapper$g(this, p0));
                   }else {
                      this.n().Jl(p0);
                   }
                }
             }
          }
       }
       return;
    }
    public void RI(LiveStreamFeed p0,a$b p1,boolean p2){
       e a;
       if (PatchProxy.isSupport(TvcPluginImplWrapper.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, TvcPluginImplWrapper.class, "16")) {
          return;
       }
       a.p(p1, "requestListener");
       if (this.F(p0)) {
          a = e.a;
          if (!a.b()) {
             a.a().subscribe(new TvcPluginImplWrapper$i(this, p0, p1, p2));
          label_0041 :
             return;
          }
       }
       this.n().RI(p0, p1, p2);
       goto label_0041 ;
    }
    public boolean SW(LiveStreamFeed p0,Boolean p1){
       boolean b;
       e obj = PatchProxy.applyTwoRefs(p0, p1, this, TvcPluginImplWrapper.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.F(p0)) {
          obj = e.a;
          if (!obj.b()) {
             obj.a().subscribe(TvcPluginImplWrapper$f.b);
             b = true;
          label_0034 :
             return b;
          }
       }
       b = this.n().SW(p0, p1);
       goto label_0034 ;
    }
    public void Tq(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper.class, "13")) {
          return;
       }
       this.n().Tq(p0);
       return;
    }
    public d YM(int p0){
       TvcPluginImplWrapper tvcPluginImp = TvcPluginImplWrapper.class;
       if (PatchProxy.isSupport(tvcPluginImp)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, tvcPluginImp, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.n().YM(p0);
    }
    public void YR(LiveStreamFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper.class, "19")) {
          return;
       }
       this.n().YR(p0);
       return;
    }
    public boolean Zg(LiveStreamFeed p0){
       boolean b;
       e obj = PatchProxy.applyOneRefs(p0, this, TvcPluginImplWrapper.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.F(p0)) {
          obj = e.a;
          if (!obj.b()) {
             obj.a().subscribe(TvcPluginImplWrapper$e.b);
             b = true;
          label_0034 :
             return b;
          }
       }
       b = this.n().Zg(p0);
       goto label_0034 ;
    }
    public d es(LiveAudienceParam p0,LiveStreamFeed p1,a$c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TvcPluginImplWrapper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p2, "showListener");
       return this.n().es(p0, p1, p2);
    }
    public a fz(LiveBizParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TvcPluginImplWrapper.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "liveBizParam");
       return this.n().fz(p0);
    }
    public void init(){
       if (PatchProxy.applyVoid(null, this, TvcPluginImplWrapper.class, "10")) {
          return;
       }
       RxBus.f.f(c.class).observeOn(d.a).subscribe(new TvcPluginImplWrapper$c(this));
       a.d().p(this);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean jm(LiveStreamFeed p0){
       boolean b;
       e obj = PatchProxy.applyOneRefs(p0, this, TvcPluginImplWrapper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.F(p0)) {
          obj = e.a;
          if (!obj.b()) {
             obj.a().subscribe(TvcPluginImplWrapper$d.b);
             b = false;
          label_0034 :
             return b;
          }
       }
       b = this.n().jm(p0);
       goto label_0034 ;
    }
    public final a n(){
       a obj = PatchProxy.apply(null, this, TvcPluginImplWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.a.b()) {
          obj = d.a(-831371341).bM();
       }else {
          TvcPluginImplWrapper tb = this.b;
          a.o(tb, "mDefaultImpl");
       }
       return obj;
    }
    public void nS(LiveAudienceParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper.class, "24")) {
          return;
       }
       this.n().nS(p0);
       return;
    }
    public void processFeedsListAsync(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper.class, "22")) {
          return;
       }
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          LiveStreamFeed liveStreamFe = null;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (obj instanceof QPhoto) {
                QPhoto mEntity = obj.mEntity;
                if (mEntity instanceof LiveStreamFeed) {
                   liveStreamFe = mEntity;
                }
             }else if(obj instanceof BaseFeed){
                if (obj instanceof LiveStreamFeed) {
                   liveStreamFe = obj;
                }
             }
             if (this.F(liveStreamFe)) {
                liveStreamFe = obj;
                break ;
             }
          }
          if (liveStreamFe != null) {
             e a = e.a;
             if (!a.b()) {
                a.a().subscribe(new TvcPluginImplWrapper$h(this, p0));
             }else {
                this.n().processFeedsListAsync(p0);
             }
          }
       }
       return;
    }
    public final void processFeedsListAsync(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper.class, "21")) {
          return;
       }
       a.p(p0, "photoStartupEvent");
       Object[] objArray = new Object[0];
       j0.a("TvcPluginImplWrapper", "photoStartupEvent received", objArray);
       this.processFeedsListAsync(p0.a);
       return;
    }
    public void sk(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper.class, "25")) {
          return;
       }
       this.n().sk(p0);
       return;
    }
    public void tH(String p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TvcPluginImplWrapper.class, "5")) {
          return;
       }
       this.n().tH(p0, p1);
       return;
    }
    public void uS(LiveAudienceParam p0,LiveStreamFeed p1,int p2,a$c p3,GifshowActivity p4){
       TvcPluginImplWrapper tvcPluginImp = TvcPluginImplWrapper.class;
       if (PatchProxy.isSupport(tvcPluginImp)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, tvcPluginImp, "8")) {
             return;
          }
       }
       a.p(p0, "liveAudienceParam");
       a.p(p1, "liveStreamFeed");
       a.p(p3, "showListener");
       a.p(p4, "activity");
       this.n().uS(p0, p1, p2, p3, p4);
       return;
    }
}
