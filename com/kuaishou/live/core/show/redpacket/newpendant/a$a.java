package com.kuaishou.live.core.show.redpacket.newpendant.a$a;
import ng2.s;
import com.kuaishou.live.core.show.redpacket.newpendant.a;
import java.lang.Object;
import zw1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import mt5.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.util.List;
import java.util.Iterator;
import ng2.r;
import android.view.View;
import java.lang.Long;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import xw1.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.lang.Boolean;
import dh2.d;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import dh2.c;
import java.util.Map;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketPendantContainerView;
import zw1.b;

public class a$a implements s	// class@000eea
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void J4(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.a.t.add(p0);
       return;
    }
    public a O2(){
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a$a obj = PatchProxy.apply(objArray, this, a$a.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       if (obj.q == null) {
          return objArray;
       }
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.apply(objArray, obj, a.class, "7");
       if (objArray1 != patchProxyRe) {
       }else if(obj.r.size() > 0){
          Iterator iterator = obj.r.iterator();
          objArray2 = objArray;
          while (iterator.hasNext()) {
             r or = iterator.next();
             if (or.f() instanceof a && (objArray2 == null || objArray2.g() - or.g() > 0)) {
                objArray2 = or;
             }
          }
       }else {
          objArray2 = objArray;
       }
       if (objArray2 != null) {
          objArray = objArray2.f();
       }
       objArray1 = objArray;
       return objArray1;
    }
    public void R1(View p0,long p1,int p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, a$a.class, "1")) {
          return;
       }
       b.U(a.A, "addPendant", "view", p0, "openTime", Long.valueOf(p1), "redPacketCount", Integer.valueOf(p2));
       a$a ta = this.a;
       if (ta.q != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), ta, a.class, "3") && p0 != null)) {
             ta.S8(p0, p1, p2);
          }
       }
       return;
    }
    public void S3(View p0,long p1,int p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, a$a.class, "4")) {
          return;
       }
       LiveLogTag lIVE_RED_PAC = LiveLogTag.LIVE_RED_PACKET;
       lIVE_RED_PAC.appendTag("LiveRedPacketNewPendantPresenter");
       b.U(lIVE_RED_PAC, "updatePendant", "view", p0, "openTime", Long.valueOf(p1), "redPacketCount", Integer.valueOf(p2));
       a$a ta = this.a;
       if (ta.q != null) {
          ta.S8(p0, p1, p2);
       }
       return;
    }
    public void T5(View p0,long p1,int p2,a p3,String p4){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       if (p0 == null) {
          return;
       }else if(!TextUtils.isEmpty(p4)){
          p0.setTag(R.id.live_red_packet_pendant_view_log_msg, p4);
       }
       this.V5(p0, p1, p2, p3);
       return;
    }
    public void V5(View p0,long p1,int p2,a p3){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), p3, this, a$a.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p3 != null) {
          p0.setTag(R.id.live_red_packet_pendant_view_tag, p3);
       }
       this.R1(p0, p1, p2);
       return;
    }
    public int Y1(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.r.size();
    }
    public void Z1(){
       this.a.p = true;
    }
    public void e4(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "15")) {
          return;
       }
       this.a.t.remove(p0);
       return;
    }
    public boolean f4(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return y.y(this.a.r, new d(p0)).isPresent();
    }
    public void h2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "9")) {
          return;
       }
       b.P(LiveLogTag.LIVE_RED_PACKET.appendTag("LiveRedPacketNewPendantPresenter"), "removeAllNormalRedPacketPendants");
       a$a ta = this.a;
       if (ta.q != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, a.class, "8") && ta.r.size() > 0) {
             Iterator iterator = ta.r.iterator();
             while (iterator.hasNext()) {
                if (iterator.next().f() instanceof a) {
                   iterator.remove();
                }
             }
             ta.R8(false);
          }
       }
       return;
    }
    public boolean i4(){
       return false;
    }
    public List n4(RedPacket p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$a obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       if (obj.q == null) {
          return null;
       }
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, obj, a.class, "6");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          if (obj.r.size() > 0) {
             Iterator iterator = obj.r.iterator();
             while (iterator.hasNext()) {
                r or = iterator.next();
                if (or.f() instanceof a) {
                   a uoa = or.f();
                   RedPacket normalRedPac = uoa.getNormalRedPacket();
                   if (normalRedPac != null && TextUtils.equals(normalRedPac.mId, p0.mId)) {
                      uArrayList.add(uoa);
                   }
                }else {
                   b.B(LiveLogTag.RED_PACKET, "current view is not LiveNormalRedPacketNewFloatTipsView type");
                }
             }
          }
       }
       return uArrayList;
    }
    public void o2(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "6")) {
          return;
       }
       b.S(LiveLogTag.LIVE_RED_PACKET.appendTag("LiveRedPacketNewPendantPresenter"), "removePendant", "view", p0);
       a$a ta = this.a;
       if (ta.q != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "5") && p0 != null) {
             p0.setTag(R.id.live_red_packet_pendant_view_tag, null);
             if (!q.f(ta.r)) {
                y.q(ta.r, new c(p0));
                ta.R8(false);
             }
          }
       }
       return;
    }
    public void q3(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "12")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          this.a.s.clear();
       }else {
          this.a.s.remove(p0);
       }
       return;
    }
    public View w3(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj.q != null) {
          a v = obj.v;
          if (v != null) {
             return v.getTopView();
          }
       }
       return null;
    }
    public void y3(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "11")) {
          return;
       }
       this.a.s.put(p0, p1);
       return;
    }
}
