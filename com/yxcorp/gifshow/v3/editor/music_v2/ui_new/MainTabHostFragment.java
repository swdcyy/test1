package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.MainTabHostFragment;
import vrc.d;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msc.q;
import lsc.f0;
import urc.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import urc.f;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.SwitchTab;
import android.os.Bundle;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.MainTabInfo;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import java.util.HashMap;
import android.view.View;
import esc.g;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.MainTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import java.util.ArrayList;
import java.lang.CharSequence;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.EditMusicRecommendFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.collect.EditMusicCollectFragment;
import qrc.r;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.local.EditMusicLocalFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.history.EditMusicHistoryFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.voice.EditMusicVoiceFragment;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import esc.f;
import android.view.View$OnClickListener;

public final class MainTabHostFragment extends TabHostFragment implements d	// class@001102
{
    public final q B;
    public boolean C;
    public g D;
    public final Fragment E;
    public HashMap F;

    public void MainTabHostFragment(Fragment p0){
       a.p(p0, "fragment");
       super();
       this.E = p0;
       this.B = f0.i(p0);
    }
    public void Mb(e p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MainTabHostFragment.class, "4")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       SwitchTab switchTab = p0.s().c();
       if (switchTab != this.Qh(this.ph())) {
          this.C = true;
          this.Gh(switchTab.getValue(), null);
       }
       return;
    }
    public final SwitchTab Qh(int p0){
       PagerSlidingTabStrip$d obj;
       SwitchTab rECOMMEND;
       if (PatchProxy.isSupport(MainTabHostFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, MainTabHostFragment.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.wh().get(p0).c();
       a.o(obj, "tabFragmentDelegates[position].tab");
       String str = obj.c();
       if (a.g(str, MainTabInfo.RECOMMEND.getTabName())) {
          rECOMMEND = SwitchTab.RECOMMEND;
       }else if(a.g(str, MainTabInfo.COLLECT.getTabName())){
          rECOMMEND = SwitchTab.COLLECTED;
       }else if(a.g(str, MainTabInfo.HISTORY.getTabName())){
          rECOMMEND = SwitchTab.HISTORY;
       }else if(a.g(str, MainTabInfo.LOCAL.getTabName())){
          rECOMMEND = SwitchTab.LOCAL;
       }else if(a.g(str, MainTabInfo.VOICE.getTabName())){
          rECOMMEND = SwitchTab.VOICE;
       }else {
          throw new IllegalArgumentException("unknown position "+p0);
       }
       return rECOMMEND;
    }
    public int getLayoutResId(){
       return 0x7f0d0352;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, MainTabHostFragment.class, "6")) {
       }else {
          MainTabHostFragment tF = this.F;
          if (tF != null) {
             tF.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MainTabHostFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       this.D = new g(this);
       super.onViewCreated(p0, p1);
       this.zh().A(0, 1);
       this.Nh(3);
       this.Oh(new MainTabHostFragment$a(this));
       return;
    }
    public List wh(){
       Bundle obj = PatchProxy.apply(null, this, MainTabHostFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getArguments();
       ArrayList uArrayList = new ArrayList();
       MainTabInfo rECOMMEND = MainTabInfo.RECOMMEND;
       String tabName = rECOMMEND.getTabName();
       PagerSlidingTabStrip$d uod = new PagerSlidingTabStrip$d(tabName, rECOMMEND.getTabName());
       MainTabInfo cOLLECT = MainTabInfo.COLLECT;
       String tabName1 = cOLLECT.getTabName();
       PagerSlidingTabStrip$d uod1 = new PagerSlidingTabStrip$d(tabName1, cOLLECT.getTabName());
       MainTabInfo hISTORY = MainTabInfo.HISTORY;
       String tabName2 = hISTORY.getTabName();
       PagerSlidingTabStrip$d uod2 = new PagerSlidingTabStrip$d(tabName2, hISTORY.getTabName());
       MainTabInfo lOCAL = MainTabInfo.LOCAL;
       String tabName3 = lOCAL.getTabName();
       PagerSlidingTabStrip$d uod3 = new PagerSlidingTabStrip$d(tabName3, lOCAL.getTabName());
       MainTabInfo vOICE = MainTabInfo.VOICE;
       String tabName4 = vOICE.getTabName();
       PagerSlidingTabStrip$d uod4 = new PagerSlidingTabStrip$d(tabName4, vOICE.getTabName());
       EditMusicRecommendFragment uEditMusicRe = EditMusicRecommendFragment.class;
       Bundle uBundle = (obj != null)? obj: new Bundle();
       uArrayList.add(new b(uod, uEditMusicRe, uBundle));
       EditMusicCollectFragment uEditMusicCo = EditMusicCollectFragment.class;
       Bundle uBundle1 = (obj != null)? obj: new Bundle();
       uArrayList.add(new b(uod1, uEditMusicCo, uBundle1));
       if (f0.l(this).b()) {
          EditMusicLocalFragment uEditMusicLo = EditMusicLocalFragment.class;
          Bundle uBundle2 = (obj != null)? obj: new Bundle();
          uArrayList.add(new b(uod3, uEditMusicLo, uBundle2));
       }
       if (f0.l(this).d()) {
          EditMusicHistoryFragment uEditMusicHi = EditMusicHistoryFragment.class;
          Bundle uBundle3 = (obj != null)? obj: new Bundle();
          uArrayList.add(new b(uod2, uEditMusicHi, uBundle3));
       }
       if (f0.l(this).c != null) {
          EditMusicVoiceFragment uEditMusicVo = EditMusicVoiceFragment.class;
          if (obj == null) {
             obj = new Bundle();
          }
          uArrayList.add(new b(uod4, uEditMusicVo, obj));
       }
       MainTabHostFragment tD = this.D;
       if (tD == null) {
          a.S("viewBinder");
       }
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoidOneRefs(uArrayList, tD, g.class, "1")) {
          a.p(uArrayList, "delegates");
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (uob.c() != null) {
                uod2 = uob.c();
                a.o(uod2, "it.tab");
                if (PatchProxy.applyVoidOneRefs(uod2, tD, g.class, "2")) {
                   continue ;
                }
             }
             uod2.i(new f(tD, uod2));
          }
       }
       return uArrayList;
    }
}
