package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterPanelFragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import dx2.h;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterPanelFragment$a;
import java.util.List;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterTab;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.a1;
import java.lang.Boolean;
import qu2.a;
import dx2.p;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.f2;
import mw2.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import k2b.u1;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import ix2.e;
import com.kuaishou.live.core.voiceparty.theater.tube.b;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.theater.tube.b$a;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.kuaishou.live.core.voiceparty.theater.tube.b$b;
import androidx.lifecycle.ViewModel;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import dx2.i;
import msd.l;
import androidx.core.view.ViewKt;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.widget.viewpager.tabstrip.a;
import java.lang.Math;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import dx2.j;
import android.view.View$OnClickListener;
import dx2.l;
import com.kuaishou.live.core.voiceparty.theater.tube.playlist.VoicePartyTheaterPlayListFragment;
import dx2.m;
import dx2.n;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment$a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class VoicePartyTheaterPanelFragment extends TabHostFragment	// class@0019fa
{
    public p B;
    public h C;
    public final ViewPager$i D;
    public static final String E;

    static {
       VoicePartyTheaterPanelFragment.E = VoicePartyTheaterPanelFragment.class.getName()+"_default_tag";
    }
    public void VoicePartyTheaterPanelFragment(){
       super();
       this.C = h.a;
       this.D = new VoicePartyTheaterPanelFragment$a(this);
    }
    public static List Qh(){
       LiveVoicePartyTheaterCommonConfig$TheaterTab theaterTab1;
       LiveVoicePartyTheaterCommonConfig obj = PatchProxy.apply(null, null, VoicePartyTheaterPanelFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.P(LiveVoicePartyTheaterCommonConfig.class);
       if (obj != null) {
          obj = obj.mTheaterTabs;
          if (obj != null) {
          label_0022 :
             Iterator iterator = obj.iterator();
             int i = 0;
             int i1 = 0;
             while (iterator.hasNext()) {
                LiveVoicePartyTheaterCommonConfig$TheaterTab theaterTab = iterator.next();
                if (theaterTab == null || TextUtils.isEmpty(theaterTab.mTabId)) {
                   iterator.remove();
                }else if(VoicePartyTheaterPanelFragment.Rh(theaterTab.mTabId)){
                   i1 = 1;
                }
             }
             if (obj.isEmpty() || (obj.size() == 1 && i1)) {
                theaterTab1 = new LiveVoicePartyTheaterCommonConfig$TheaterTab();
                theaterTab1.mTabId = "episodeListTab";
                theaterTab1.mTabName = a1.p(0x7f105106);
                theaterTab1.mSearchable = true;
                obj.add(i, theaterTab1);
             }
             if (!i1) {
                theaterTab1 = new LiveVoicePartyTheaterCommonConfig$TheaterTab();
                theaterTab1.mTabId = "playListTab";
                theaterTab1.mTabName = a1.p(0x7f102d13);
                obj.add(theaterTab1);
             }
             return obj;
          }
       }
       ArrayList uArrayList = new ArrayList();
       goto label_0022 ;
    }
    public static boolean Rh(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyTheaterPanelFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.equals(p0, "playListTab");
    }
    public void Sh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterPanelFragment.class, "9")) {
          return;
       }
       LiveVoicePartyTheaterCommonConfig$TheaterTab theaterTab = null;
       Iterator iterator = VoicePartyTheaterPanelFragment.Qh().iterator();
       while (iterator.hasNext()) {
          LiveVoicePartyTheaterCommonConfig$TheaterTab theaterTab1 = iterator.next();
          if (TextUtils.equals(p0, theaterTab1.mTabId)) {
             theaterTab = theaterTab1.mTabName;
          }
       }
       if (TextUtils.isEmpty(theaterTab)) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.B.d().a();
       f2 uof2 = this.B.g();
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, uof2, theaterTab, null, e.class, "18")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "THEATER_LIST_TAB";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("tab_name", theaterTab);
          uElementPack.params = jsonObject.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
          uContentWrap.liveVoicePartyPackage = n.g(uof2);
          u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       }
       return;
    }
    public void Th(h p0){
       this.C = p0;
    }
    public int getLayoutResId(){
       return 0x7f0d0e7a;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterPanelFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.B = p.c(this);
       p0 = this.getArguments();
       if (p0 != null) {
          String e = VoicePartyTheaterPanelFragment.E;
          this.Lh(p0.getString(e));
          this.Sh(p0.getString(e));
          e.c(p0.getString(e));
       }
       b$a h0 = b.h0;
       Objects.requireNonNull(h0);
       if (!PatchProxy.applyVoidOneRefs(this, h0, b$a.class, "1")) {
          a.p(this, "fragment");
          b$a.a = ViewModelProviders.of(this).get(b$b.class);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterPanelFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       ViewKt.b(this.s, new i(this));
       this.Oh(this.D);
       ClientContent$LiveStreamPackage liveStreamPa = this.B.d().a();
       f2 uof2 = this.B.g();
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, uof2, null, e.class, "17")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "THEATER_LIST_TAB";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
          uContentWrap.liveVoicePartyPackage = n.g(uof2);
          u1.v0(9, uElementPack, uContentPack, uContentWrap);
       }
       this.Nh(Math.min(3, (this.v.j() - 1)));
       return;
    }
    public List wh(){
       Bundle uBundle;
       l ol;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, VoicePartyTheaterPanelFragment.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       List list = VoicePartyTheaterPanelFragment.Qh();
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          LiveVoicePartyTheaterCommonConfig$TheaterTab theaterTab = iterator.next();
          PagerSlidingTabStrip$d obj1 = PatchProxy.applyOneRefs(theaterTab, this, VoicePartyTheaterPanelFragment.class, "5");
          if (obj1 != patchProxyRe) {
          }else if(VoicePartyTheaterPanelFragment.Rh(theaterTab.mTabId)){
             obj1 = PatchProxy.applyOneRefs(theaterTab, this, VoicePartyTheaterPanelFragment.class, "6");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = new PagerSlidingTabStrip$d(theaterTab.mTabId, theaterTab.mTabName);
                obj1.i(new j(this));
                VoicePartyTheaterPlayListFragment voicePartyTh = VoicePartyTheaterPlayListFragment.class;
                theaterTab = theaterTab.mTabName;
                uBundle = PatchProxy.applyOneRefs(theaterTab, objArray, VoicePartyTheaterPlayListFragment.class, "2");
                if (uBundle != patchProxyRe) {
                }else {
                   uBundle = new Bundle();
                   uBundle.putString(VoicePartyTheaterPlayListFragment.K, theaterTab);
                }
                ol = new l(this, obj1, voicePartyTh, uBundle);
             }
          }else {
             obj1 = PatchProxy.applyOneRefs(theaterTab, this, VoicePartyTheaterPanelFragment.class, "7");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = new PagerSlidingTabStrip$d(theaterTab.mTabId, theaterTab.mTabName);
                obj1.i(new m(this));
                VoicePartyTheaterTubeTabFragment voicePartyTh1 = VoicePartyTheaterTubeTabFragment.class;
                VoicePartyTheaterTubeTabFragment$a p = VoicePartyTheaterTubeTabFragment.p;
                Objects.requireNonNull(p);
                uBundle = PatchProxy.applyOneRefs(theaterTab, p, VoicePartyTheaterTubeTabFragment$a.class, "1");
                if (uBundle != patchProxyRe) {
                }else {
                   a.p(theaterTab, "tabConf");
                   uBundle = new Bundle();
                   SerializableHook.putSerializable(uBundle, VoicePartyTheaterTubeTabFragment.o, theaterTab);
                }
                ol = new n(this, obj1, voicePartyTh1, uBundle);
             }
          }
          obj1 = ol;
          obj.add(obj1);
       }
       if (!list.isEmpty() && (this.getArguments() == null || TextUtils.isEmpty(this.getArguments().getString(VoicePartyTheaterPanelFragment.E)))) {
          this.Sh(list.get(0).mTabId);
          e.c(list.get(0).mTabId);
       }
       return obj;
    }
}
