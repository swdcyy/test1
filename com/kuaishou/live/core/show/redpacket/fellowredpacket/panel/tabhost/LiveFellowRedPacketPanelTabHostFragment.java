package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.tabhost.LiveFellowRedPacketPanelTabHostFragment;
import ml8.d;
import com.kuaishou.live.core.basic.widget.tabhost.LiveTabHostFragment;
import zg2.c;
import ok.x;
import com.google.common.base.Suppliers;
import zg2.b;
import zg2.a;
import p91.m;
import zg2.g;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$g;
import mrd.c;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.tabhost.LiveFellowRedPacketPanelTabHostFragment$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.tabhost.LiveFellowRedPacketPanelTabHostFragment$b;
import java.util.List;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import e22.b;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.widget.TextView;
import android.content.res.ColorStateList;
import android.util.StateSet;
import lnc.a1;
import java.util.ArrayList;
import e22.a;
import zg2.e;
import android.database.Observable;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import brd.t;
import t45.d;
import brd.z;
import zg2.d;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.tabhost.a;
import erd.g;
import crd.b;

public class LiveFellowRedPacketPanelTabHostFragment extends LiveTabHostFragment implements d	// class@000ebd
{
    public final x A;
    public m q;
    public g r;
    public LiveFellowRedPacketPanelFragment$g s;
    public LiveBizParam t;
    public View u;
    public View v;
    public boolean w;
    public c x;
    public final x y;
    public final x z;
    public static final String B;

    static {
       LiveFellowRedPacketPanelTabHostFragment.B = "LiveFellowRedPacketPanelTabHostFragment";
    }
    public void LiveFellowRedPacketPanelTabHostFragment(){
       super();
       this.w = false;
       this.y = Suppliers.a(new c(this));
       this.z = Suppliers.a(new b(this));
       this.A = Suppliers.a(new a(this));
    }
    public static LiveFellowRedPacketPanelTabHostFragment lh(m p0,g p1,LiveFellowRedPacketPanelFragment$g p2,c p3,LiveBizParam p4){
       LiveFellowRedPacketPanelTabHostFragment obj;
       if (PatchProxy.isSupport(LiveFellowRedPacketPanelTabHostFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, LiveFellowRedPacketPanelTabHostFragment.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveFellowRedPacketPanelTabHostFragment();
       obj.q = p0;
       obj.r = p1;
       obj.s = p2;
       obj.x = p3;
       obj.t = p4;
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketPanelTabHostFragment.class, "3")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a36be);
       this.v = m1.f(p0, 0x7f0a34bf);
       m1.a(p0, new LiveFellowRedPacketPanelTabHostFragment$a(this), R.id.record_textview);
       m1.a(p0, new LiveFellowRedPacketPanelTabHostFragment$b(this), R.id.rule_textview);
       return;
    }
    public List eh(){
       return null;
    }
    public Fragment fh(Class p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveFellowRedPacketPanelTabHostFragment.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p1 == null || !("tag_intelligent_delivery_tab").equals(p1.getString("tab_tag"))) {
          return super.fh(p0, p1);
       }
       LiveFellowRedPacketPanelTabHostFragment tr = this.r;
       String str = PatchProxy.apply(null, this, LiveFellowRedPacketPanelTabHostFragment.class, "7");
       if (str != patchProxyRe) {
       }else {
          str = this.r.h();
          String source = this.r.getSource();
          String str1 = this.r.d();
          LiveLogTag lIVE_RED_PAC = LiveLogTag.LIVE_RED_PACKET;
          String b = LiveFellowRedPacketPanelTabHostFragment.B;
          lIVE_RED_PAC.appendTag(b);
          b.U(lIVE_RED_PAC, "newFragmentInstance", "targetTabTag", str, "source", source, "url", str1);
          if (!TextUtils.x(str) && (!TextUtils.x(source) && !TextUtils.x(str1))) {
             str = "source=";
             str = (str1.contains(str))? str1.replaceAll("\(source=[^&]*\)", str+source): str1+"&source="+source;
             lIVE_RED_PAC.appendTag(b);
             b.S(lIVE_RED_PAC, "newFragmentInstance, replace source", "url", str);
          }else {
             str = str1;
          }
       }
       return tr.e(str);
    }
    public int getLayoutResId(){
       return 0x7f0d0dbf;
    }
    public final boolean ih(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketPanelTabHostFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.r.f())? this.jh("tag_intelligent_delivery_tab"): this.jh("tag_quick_send_tab");
       return b;
    }
    public final boolean jh(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFellowRedPacketPanelTabHostFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       while (true) {
          if (i >= this.j.i) {
             return false;
          }
          PagerSlidingTabStrip$d uod = this.l.b(i);
          if (uod != null && (uod.c() instanceof String && TextUtils.n(uod.c(), p0))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       this.k.setCurrentItem(i);
       return true;
    }
    public final PagerSlidingTabStrip$d kh(Context p0,String p1,String p2){
       int[] this;
       TextView obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveFellowRedPacketPanelTabHostFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextView(p0);
       obj.setText(p1);
       obj.setGravity(17);
       int[][] ointArray = new int[][3]{this,this,StateSet.WILD_CARD};
       this = new int[]{0x10100a1};
       this = new int[]{-16842913};
       int[] ointArray1 = new int[]{a1.a(0x7f061dc4),a1.a(0x7f061da4),a1.a(0x7f061da4)};
       obj.setTextColor(new ColorStateList(ointArray, ointArray1));
       return new PagerSlidingTabStrip$d(p2, obj);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFellowRedPacketPanelTabHostFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveFellowRedPacketPanelTabHostFragment.class, "5") && this.getContext() != null) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(this.y.get());
          if (this.r.f()) {
             uArrayList.add(this.A.get());
          }
          if (this.r.i()) {
             uArrayList.add(this.z.get());
          }
          this.hh(uArrayList);
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveFellowRedPacketPanelTabHostFragment.class, "8")) {
          e uoe = new e(this);
          if (!PatchProxy.applyVoidOneRefs(uoe, this, LiveTabHostFragment.class, "18")) {
             this.m.registerObserver(uoe);
          }
          LiveFellowRedPacketPanelTabHostFragment tx = this.x;
          if (tx != null) {
             tx.compose(this.Ug(FragmentEvent.DESTROY)).observeOn(d.a).subscribe(new d(this), a.b);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveFellowRedPacketPanelTabHostFragment.class, "10")) {
          String str = this.r.h();
          if (this.jh(str)) {
             b.S(LiveLogTag.LIVE_RED_PACKET.appendTag(LiveFellowRedPacketPanelTabHostFragment.B), "applyDefaultTabSelection", "targetTabTag", str);
          }else if(this.r.g()){
             b.P(LiveLogTag.LIVE_RED_PACKET.appendTag(LiveFellowRedPacketPanelTabHostFragment.B), "applyDefaultTabSelection, isEnableSelectNonDefaultTab");
             this.ih();
          }
       }
       return;
    }
}
