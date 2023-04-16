package com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import eo3.f;
import tm3.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackInfo;
import java.lang.Object;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper$BottomAreaStatus;
import com.yxcorp.gifshow.util.rx.RxBus;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.CopyOnWriteArrayList;
import wkd.b;
import i62.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import mrd.c;
import brd.v;
import brd.g;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import tm3.d;
import io.reactivex.g;
import t45.d;
import brd.z;
import tm3.b;
import java.lang.Integer;
import g62.c;
import g62.b;
import cjd.e;
import erd.o;
import crd.b;
import tm3.e;
import erd.g;
import java.util.concurrent.TimeUnit;
import tm3.f;
import tm3.g;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.lang.Boolean;

public class RedPacketConditionRedPackInfoWrapper implements f, a	// class@000e71
{
    public SCLiveConditionRedPackInfo a;
    public RedPacketConditionRedPackInfoWrapper$BottomAreaStatus b;
    public final List c;
    public final RxBus d;
    public final List e;
    public final List f;
    public boolean g;
    public LiveConditionRedPacketCurrentInfoResponse h;
    public LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo i;
    public b j;
    public b k;
    public SCLiveConditionRedPackRollUserInfo l;
    public final c m;
    public int n;
    public String o;

    public void RedPacketConditionRedPackInfoWrapper(SCLiveConditionRedPackInfo p0){
       super();
       this.b = RedPacketConditionRedPackInfoWrapper$BottomAreaStatus.SHOW;
       this.d = new RxBus();
       this.m = PublishSubject.g();
       this.o = "";
       this.a = p0;
       this.c = new CopyOnWriteArrayList();
       this.e = new CopyOnWriteArrayList();
       this.f = new CopyOnWriteArrayList();
       this.g = b.a(0x4c63d520).b(this.a.redPackId);
       if (PatchProxy.applyVoid(null, this, RedPacketConditionRedPackInfoWrapper.class, "1")) {
       }else if(this.a.senderInfo != null){
          this.o = this.a.senderInfo.userId+"";
       }
       return;
    }
    public void a(f p0){
       if (!p0 instanceof RedPacketConditionRedPackInfoWrapper) {
          return;
       }
       this.a = p0.a;
       return;
    }
    public c b(){
       return this.m;
    }
    public final void c(v p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionRedPackInfoWrapper.class, "11")) {
          return;
       }
       if (!p0.isDisposed()) {
          p0.onNext(p1);
       }
       return;
    }
    public LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo d(){
       return this.i;
    }
    public RxBus e(){
       return this.d;
    }
    public LiveConditionRedPacketCurrentInfoResponse f(){
       return this.h;
    }
    public int g(){
       return this.n;
    }
    public t h(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionRedPackInfoWrapper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new d(this)).subscribeOn(d.a);
    }
    public t i(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionRedPackInfoWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new b(this)).subscribeOn(d.a);
    }
    public t j(String p0,int p1,String p2){
       if (PatchProxy.isSupport(RedPacketConditionRedPackInfoWrapper.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, RedPacketConditionRedPackInfoWrapper.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.b().a(p0, p1, p2, true).map(new e());
    }
    public SCLiveConditionRedPackInfo k(){
       return this.a;
    }
    public String l(){
       return this.o;
    }
    public boolean m(){
       return this.g;
    }
    public void n(String p0,int p1,String p2){
       if (PatchProxy.isSupport(RedPacketConditionRedPackInfoWrapper.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, RedPacketConditionRedPackInfoWrapper.class, "3")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper tj = this.j;
       if (tj != null) {
          tj.dispose();
       }
       this.j = b.b().c(p0, p1, p2).subscribeOn(d.b).doOnSubscribe(new e(this)).map(new e()).timeout(5000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new f(this), new g(this));
       return;
    }
    public final void o(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketConditionRedPackInfoWrapper.class, "14")) {
          return;
       }
       if (!q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             v ov = iterator.next();
             if (!ov.isDisposed()) {
                ov.onComplete();
             }
          }
       }
       p0.clear();
       return;
    }
    public RedPacketConditionRedPackInfoWrapper p(RedPacketConditionRedPackInfoWrapper$BottomAreaStatus p0){
       this.b = p0;
       return this;
    }
    public void q(int p0){
       this.n = p0;
    }
    public void r(boolean p0){
       RedPacketConditionRedPackInfoWrapper redPacketCon = RedPacketConditionRedPackInfoWrapper.class;
       if (PatchProxy.isSupport(redPacketCon) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, redPacketCon, "9")) {
          return;
       }
       this.g = p0;
       if (!q.f(this.f)) {
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             this.c(iterator.next(), Boolean.valueOf(this.g));
          }
       }
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionRedPackInfoWrapper.class, "8")) {
          return;
       }
       this.g = true;
       if (!q.f(this.f)) {
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             this.c(iterator.next(), Boolean.TRUE);
          }
       }
       return;
    }
}
