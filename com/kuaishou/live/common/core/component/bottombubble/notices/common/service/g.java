package com.kuaishou.live.common.core.component.bottombubble.notices.common.service.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.i;
import lp3.a;
import java.util.HashMap;
import nc1.c;
import nc1.d;
import java.util.Set;
import com.google.common.collect.o;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.i$a;
import lc1.f;
import java.lang.Integer;
import java.util.HashSet;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import lc1.d;
import java.util.List;
import java.lang.StringBuilder;
import nc1.f;
import io.reactivex.g;
import brd.t;
import brd.z;
import lrd.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.f;
import erd.o;
import io.reactivex.android.schedulers.a;
import nc1.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.e;
import erd.g;
import crd.b;
import lp3.e;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import qx1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import com.google.protobuf.nano.MessageNano;
import java.util.Objects;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.i$b;

public class g extends a implements i	// class@000f9f
{
    public final HashMap d;
    public b e;
    public final g f;
    public final g g;
    public a h;
    public Set i;
    public final c j;

    public void g(){
       super();
       this.d = new HashMap();
       this.f = new c(this);
       this.g = new d(this);
       this.i = o.g();
       this.j = d.b;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       this.Zo();
       return;
    }
    public void So(i$a p0,f p1){
       g og = g.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, og, "2")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, og, "3")) {
          HashSet hashSet = this.d.get(Integer.valueOf(p1.c()));
          if (hashSet == null) {
             hashSet = new HashSet();
             this.d.put(Integer.valueOf(p1.c()), hashSet);
          }
          hashSet.add(p0);
       }
       return;
    }
    public final void To(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       HashSet obj;
       boolean b;
       g og = g.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, og, "12")) {
          return;
       }
       b.c0(this.j, "dispatchNotice", "noticeInfo", p1);
       if (this.Wo()) {
          return;
       }
       if (this.Xo(p1)) {
          return;
       }
       LiveCommentNoticeBaseInfo mNoticeType = p1.mNoticeType;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(mNoticeType), this, og, "15");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
          label_003f :
             f uof = f.a(mNoticeType);
             b = (uof != null)? uof.d(p0): false;
          }
       }else {
          goto label_003f ;
       }
       if (!b) {
          b.Z(this.j, "ignore unsupported channel comment notice");
          return;
       }else {
          obj = this.d.get(Integer.valueOf(p1.mNoticeType));
          if (obj != null && !obj.isEmpty()) {
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(p0, p1);
             }
          }
          return;
       }
    }
    public final d Uo(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       f uof = f.a(p0);
       if (uof != null) {
          return uof.c;
       }else {
          return null;
       }
    }
    public void Vo(List p0,LiveCommentNoticeChannelType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "9")) {
          return;
       }
       b.Z(this.j, "handleCommentNoticeInfoList: "+p0);
       this.e = t.create(new f(p0)).subscribeOn(b.a()).flatMap(new f(this)).observeOn(a.c()).subscribe(new g(this, p1), e.b);
       return;
    }
    public boolean Wo(){
       Object obj = PatchProxy.apply(null, this, g.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.Po() == null)? true: false;
       return b;
    }
    public boolean Xo(LiveCommentNoticeBaseInfo p0){
       return false;
    }
    public void Yo(LiveCommentNoticeChannelType p0,SCCommentNotice p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "13")) {
          return;
       }
       String str = 1;
       String str1 = (p0 == LiveCommentNoticeChannelType.LONG_CONNECTION)? 1: null;
       g th = this.h;
       if (th == null || (p1 == null || !th.g6(2, String.valueOf(p1.bizType)))) {
          str = null;
       }
       if (str1 && str) {
          b.c0(LiveLogTag.LIVE_SERVER_SIGNAL_BLOCK, "LiveBaseReceiveCommentNoticeServiceImpl ServerSignalBlocked", "data", p1.toString());
          return;
       }else {
          b.c0(this.j, "onReceiveScCommentNotice", "scCommentNotice", p1);
          HashSet hashSet = this.d.get(Integer.valueOf(p1.type));
          if (hashSet != null && !hashSet.isEmpty()) {
             d uod = this.Uo(p1.type);
             Objects.requireNonNull(uod);
             LiveCommentNoticeBaseInfo liveCommentN = uod.b(p1);
             if (liveCommentN != null) {
                this.To(p0, liveCommentN);
             }
          }
          return;
       }
    }
    public void Zj(LiveCommentNoticeBaseInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       this.To(LiveCommentNoticeChannelType.LONG_CONNECTION, p0);
       return;
    }
    public void Zo(){
       if (PatchProxy.applyVoid(null, this, g.class, "16")) {
          return;
       }
       g te = this.e;
       if (te != null && !te.isDisposed()) {
          this.e.dispose();
       }
       return;
    }
    public void mm(i$a p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "4")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          f uof = iterator.next();
          HashSet hashSet = this.d.get(Integer.valueOf(uof.c()));
          if (hashSet != null) {
             hashSet.remove(p0);
             if (hashSet.isEmpty()) {
                this.d.remove(Integer.valueOf(uof.c()));
             }
          }
       }
       if (this.d.isEmpty()) {
          this.Zo();
       }
       return;
    }
    public void th(i$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          return;
       }
       this.i.add(p0);
       return;
    }
    public final void xa(i$a p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "1")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          this.So(p0, iterator.next());
       }
       return;
    }
    public Set y7(){
       return this.i;
    }
    public void yl(i$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "7")) {
          return;
       }
       this.i.remove(p0);
       return;
    }
}
