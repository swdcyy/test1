package d01.g;
import im8.g;
import k51.c;
import d01.g$a;
import d01.g$b;
import d01.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d01.m;
import mk1.a0;
import mk1.b;
import z1.k;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import d01.o;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import com.kuaishou.live.core.show.model.LiveGiftBoxTabRedDotResponse;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftTitleView;
import android.widget.RelativeLayout;
import java.util.Objects;
import d01.b;
import java.util.HashMap;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import d01.c;
import d01.d;
import d01.e;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Number;
import d01.p$a;
import java.lang.Enum;
import ow0.a;
import android.content.SharedPreferences;
import java.lang.Long;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import d01.l;
import mk1.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class g extends c implements g	// class@001eda
{
    public h p;
    public a0 q;
    public m r;
    public a0 s;
    public b t;
    public LiveGiftBoxTabRedDotResponse u;
    public boolean v;
    public a w;
    public n x;
    public p y;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxTabRedDotPresenter";

    public void g(){
       super();
       this.v = false;
       this.w = new g$a(this);
       this.x = new g$b(this);
       this.y = new p();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       m om = new m(this.s, this.t);
       this.r = om;
       om.b(this.W8(), this.S8());
       this.v = a.t().u("SOURCE_LIVE").d("noInvokeGiftBoxRedDotHide", false);
       return;
    }
    public final boolean P8(o p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.a() != null)? true: false;
       return b;
    }
    public void R8(GiftTab p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "11")) {
          return;
       }
       if (this.X8(p0, this.u)) {
          return;
       }
       o oo = this.V8(p0);
       if (!this.P8(oo)) {
          return;
       }
       LiveGiftTitleView liveGiftTitl = oo.a();
       if (p1.l() && (!liveGiftTitl.isSelected() && !this.r.b(this.W8(), this.S8()))) {
          liveGiftTitl.a();
       }
    label_0044 :
       liveGiftTitl.a();
       return;
    }
    public final k S8(){
       Object[] objArray = null;
       o obj = PatchProxy.apply(objArray, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.V8(GiftTab.PacketGift);
       if (!this.P8(obj)) {
          return objArray;
       }
       Objects.requireNonNull(obj);
       return new b(obj);
    }
    public final o V8(GiftTab p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.applyOneRefs(p0, this, g.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.y;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, p.class, "3");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.e.get(p0);
       }
       if (obj1 != null) {
          return obj1;
       }else {
          throw new RuntimeException("giftTitleRedDotInfo[ "+p0+"] is not register");
       }
    }
    public final boolean W8(){
       Object obj = PatchProxy.apply(null, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = k0.c(this.q.c.mEntity, c.a, d.a, e.a).or(Boolean.FALSE).booleanValue();
       if (b) {
          b.Z(LiveLogTag.GIFT, "disable gift red dot");
       }
       return b;
    }
    public final boolean X8(GiftTab p0,LiveGiftBoxTabRedDotResponse p1){
       long l;
       long l1;
       Object obj = this;
       Object obj1 = p0;
       LiveGiftTitleView obj2 = p1;
       p op = p.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, g.class, "6");
       if (obj3 != patchProxyRe) {
          return obj3.booleanValue();
       }
       obj3 = this.V8(p0);
       if (obj.P8(obj3) && obj2 != null) {
          g y = obj.y;
          Objects.requireNonNull(y);
          Object obj4 = PatchProxy.applyTwoRefs(obj1, obj2, y, op, "7");
          String str = 4;
          if (obj4 != patchProxyRe) {
             l = obj4.longValue();
          }else {
             int i1 = p$a.a[p0.ordinal()];
             if (i1 != 1) {
                if (i1 != 2) {
                   if (i1 != 3) {
                      l = (i1 != str)? 0: p1.getPropsLatestUpdateTime();
                   }else {
                      l = p1.getPrivilegeGiftLatestUpdateTime();
                   }
                }else {
                   l = p1.getFansGroupGiftLatestUpdateTime();
                }
             }else {
                l = p1.getPacketGiftLatestUpdateTime();
             }
          }
          obj2 = obj3.a();
          g y1 = obj.y;
          Objects.requireNonNull(y1);
          Object obj5 = PatchProxy.applyOneRefs(obj1, y1, op, "5");
          if (obj5 != patchProxyRe) {
             l1 = obj5.longValue();
          }else {
             int i = p$a.a[p0.ordinal()];
             if (i != 1) {
                if (i != 2) {
                   if (i != 3) {
                      l1 = (i != str)? 0: a.a.getLong("liveLatestUpdatePropsTime", 0);
                   }else {
                      l1 = a.a.getLong("liveLatestUpdatePrivilegeGiftTime", 0);
                   }
                }else {
                   l1 = a.a.getLong("liveLatestUpdateFansGroupGiftTime", 0);
                }
             }else {
                l1 = a.a.getLong("liveLatestUpdatePacketPrizeTime", 0);
             }
          }
          LiveLogTag gIFT = LiveLogTag.GIFT;
          b.h0(gIFT, "try set "+obj1+" red dot", ImmutableMap.of("isSelected", Boolean.valueOf(obj2.isSelected()), "localLatestUpdateTime", Long.valueOf(l1), "currentLatestUpdateTime", Long.valueOf(l)));
          if (!l) {
             return false;
          }else if(obj2.isSelected()){
             obj2.a();
             obj.y.a(obj1, l);
             return false;
          }else if(l1 - l){
             obj2.setTag(Long.valueOf(l));
             obj2.b();
             return true;
          }else if(obj.v != null){
             b.Z(gIFT, "[setTabRedDotIfNecessary] not invoke hide method");
          }else {
             obj2.a();
          }
       }
       return false;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       g ty = this.y;
       Objects.requireNonNull(ty);
       if (!PatchProxy.applyVoidOneRefs(p0, ty, p.class, "1")) {
          Iterator iterator = ty.e.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry != null && uEntry.getValue() != null) {
                uEntry.getValue().doBindView(p0);
             }
          }
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new l());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.q8(h.class);
       this.q = this.q8(a0.class);
       this.s = this.s8(a0.class);
       this.t = this.q8(b.class);
       return;
    }
}
