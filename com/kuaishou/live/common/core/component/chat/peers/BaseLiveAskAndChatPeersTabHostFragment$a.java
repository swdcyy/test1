package com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatPeersTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatPeersTabHostFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ob1.c;
import ie1.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class BaseLiveAskAndChatPeersTabHostFragment$a extends ViewPager$l	// class@00104a
{
    public final BaseLiveAskAndChatPeersTabHostFragment b;

    public void BaseLiveAskAndChatPeersTabHostFragment$a(BaseLiveAskAndChatPeersTabHostFragment p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       BaseLiveAskAndChatPeersTabHostFragment$a uoa = BaseLiveAskAndChatPeersTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       int i = 0;
       String str = null;
       if (TextUtils.equals(this.b.vh(p0).c(), BaseLiveAskAndChatPeersTabHostFragment.K[i])) {
          c.j(this.b.C.a(), true, i, str, i);
       }
       this.b.Wh(p0);
       this.b.Th(p0);
       String str1 = (this.b.vh(p0).c()).toUpperCase();
       if (!PatchProxy.applyVoidOneRefs(str1, str, d.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLICK_ANCHOR_CHAT_RECOMMEND_LIST_TAB";
          i3 oi3 = i3.f();
          oi3.d("tab_name", str1);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = d.a;
          u1.u(true, uElementPack, uContentPack);
       }
       return;
    }
}
