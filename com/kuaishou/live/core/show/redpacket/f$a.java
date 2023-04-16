package com.kuaishou.live.core.show.redpacket.f$a;
import ng2.s;
import com.kuaishou.live.core.show.redpacket.f;
import java.lang.Object;
import zw1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import mt5.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.redpacket.pendant.LiveNormalRedPacketFloatTipsView;
import java.util.List;
import java.util.Iterator;
import ng2.r;
import android.view.View;
import java.lang.Long;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import xw1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.lang.Boolean;
import ng2.l;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket;
import java.util.ArrayList;
import androidx.viewpager.widget.ViewPager;
import rq5.a;
import pq5.c;
import java.util.Map;
import lv1.d;
import qq5.a;
import zw1.b;

public class f$a implements s	// class@000e7d
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void J4(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.a.D.add(p0);
       return;
    }
    public a O2(){
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f$a obj = PatchProxy.apply(objArray, this, f$a.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       if (obj.y == null) {
          return objArray;
       }
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.apply(objArray, obj, f.class, "12");
       if (objArray1 != patchProxyRe) {
       }else {
          f z = obj.z;
          if (z != null && z.size() > 0) {
             Iterator iterator = obj.z.iterator();
             objArray2 = objArray;
             while (iterator.hasNext()) {
                r or = iterator.next();
                if (or.f() instanceof LiveNormalRedPacketFloatTipsView && (objArray2 == null || objArray2.g() - or.g() > 0)) {
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
       }
       return objArray1;
    }
    public void R1(View p0,long p1,int p2){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, f$a.class, "1")) {
          return;
       }
       f$a ta = this.a;
       if (ta.y != null) {
          ta.P8(p0, p1);
       }
       return;
    }
    public void S3(View p0,long p1,int p2){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, f$a.class, "4")) {
          return;
       }
       f$a ta = this.a;
       if (ta.y != null) {
          Objects.requireNonNull(ta);
          f uof = f.class;
          if (!PatchProxy.isSupport(uof) || (!PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), ta, uof, "9") && p0 != null)) {
             if (ta.r == null || q.f(ta.z)) {
                ta.P8(p0, p1);
             }else {
                uof = 0;
                Iterator iterator = ta.z.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      r or = iterator.next();
                      if (or.f() == p0) {
                         uof = 1;
                         or.h(p1);
                      }
                   }
                   if (uof) {
                      ta.V8(ta.S8());
                      break ;
                   }else {
                      ta.P8(p0, p1);
                      break ;
                   }
                }
             }
          }
       }
       return;
    }
    public void T5(View p0,long p1,int p2,a p3,String p4){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       if (p0 == null) {
          b.Z(LiveLogTag.LIVE_RED_PACKET, "addPendant view == null");
          return;
       }else if(!TextUtils.isEmpty(p4)){
          p0.setTag(R.id.live_red_packet_pendant_view_log_msg, p4);
       }
       this.V5(p0, p1, p2, p3);
       return;
    }
    public void V5(View p0,long p1,int p2,a p3){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), p3, this, f$a.class, "3")) {
          return;
       }
       if (p0 == null) {
          b.Z(LiveLogTag.LIVE_RED_PACKET, "addPendant view == null");
          return;
       }else if(p3 != null){
          p0.setTag(R.id.live_red_packet_pendant_view_tag, p3);
       }
       this.R1(p0, p1, p2);
       return;
    }
    public int Y1(){
       f obj = PatchProxy.apply(null, this, f$a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.z;
       if (obj != null) {
          return obj.size();
       }
       return 0;
    }
    public void Z1(){
    }
    public void e4(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "15")) {
          return;
       }
       this.a.D.remove(p0);
       return;
    }
    public boolean f4(View p0){
       f obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.z;
       boolean b = (obj != null && y.y(obj, new l(p0)).isPresent())? true: false;
       return b;
    }
    public void h2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "9")) {
          return;
       }
       f$a ta = this.a;
       if (ta.y != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, f.class, "13")) {
             f z = ta.z;
             if (z != null && z.size() > 0) {
                r or = ta.S8();
                Iterator iterator = ta.z.iterator();
                while (iterator.hasNext()) {
                   if (iterator.next().f() instanceof LiveNormalRedPacketFloatTipsView) {
                      iterator.remove();
                   }
                }
                ta.V8(or);
             }
          }
       }
       return;
    }
    public boolean i4(){
       return false;
    }
    public List n4(RedPacket p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f$a obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       if (obj.y == null) {
          return null;
       }
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, obj, f.class, "11");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          f z = obj.z;
          if (z != null && z.size() > 0) {
             Iterator iterator = obj.z.iterator();
             while (iterator.hasNext()) {
                r or = iterator.next();
                if (or.f() instanceof LiveNormalRedPacketFloatTipsView) {
                   LiveNormalRedPacketFloatTipsView liveNormalRe = or.f();
                   RedPacket normalRedPac = liveNormalRe.getNormalRedPacket();
                   if (normalRedPac != null && TextUtils.equals(normalRedPac.mId, p0.mId)) {
                      uArrayList.add(liveNormalRe);
                   }
                }else {
                   b.B(LiveLogTag.RED_PACKET, "current view is not LiveNormalRedPacketFloatTipsView type");
                }
             }
          }
       }
       return uArrayList;
    }
    public void o2(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "6")) {
          return;
       }
       f$a ta = this.a;
       if (ta.y != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, f.class, "10") && p0 != null) {
             p0.setTag(R.id.live_red_packet_pendant_view_tag, null);
             if (!q.f(ta.z) && ta.R8(p0) != null) {
                r or = ta.S8();
                f z = ta.z;
                if (z != null) {
                   z.remove(ta.R8(p0));
                }
                ta.t.removeView(p0);
                ta.V8(or);
                f z1 = ta.z;
                if (z1 != null && z1.isEmpty()) {
                   ta.F.Jg(ta.H);
                }
             }
          }
       }
    label_0061 :
       return;
    }
    public void q3(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "12")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          this.a.C.clear();
       }else {
          this.a.C.remove(p0);
       }
       return;
    }
    public View w3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f$a obj = PatchProxy.apply(objArray, this, f$a.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       if (obj.y == null) {
          return objArray;
       }
       f b = obj.B;
       if (b == null) {
          b.Z(LiveLogTag.LIVE_RED_PACKET, "getCurrentShowPendent return null, because mLivePendantViewPagerController is null");
          return objArray;
       }else {
          Objects.requireNonNull(b);
          Object obj1 = PatchProxy.apply(objArray, b, d.class, "3");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else if(b.a() > 0){
             objArray = b.d.get((b.c.getCurrentItem() % b.a())).f();
          }
          return objArray;
       }
    }
    public void y3(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "11")) {
          return;
       }
       this.a.C.put(p0, p1);
       return;
    }
}
