package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1;
import android.view.View;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannel;
import kotlin.jvm.internal.Ref$IntRef;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$f;
import com.google.android.material.tabs.TabLayout$c;
import gka.j;
import gka.i;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import h3.a;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import fx2.f;
import java.lang.Runnable;
import android.view.ViewGroup;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import dx2.p;
import qu2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.f2;
import mw2.e;

public final class VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$2 extends Lambda implements l	// class@001a22
{
    public final View $morePage;
    public final VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1 this$0;

    public void VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$2(VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1 p0,View p1){
       this.this$0 = p0;
       this.$morePage = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       String obj;
       VoicePartyTheaterTubeChannel mName;
       if (PatchProxy.isSupport(VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$2.class, "1")) {
          return;
       }
       this.$morePage.setVisibility(8);
       VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1 b = this.this$0.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.isSupport(VoicePartyTheaterTubeListTabFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), b, VoicePartyTheaterTubeListTabFragment.class, "16")) {
          VoicePartyTheaterTubeListTabFragment s = b.s;
          if (s == null) {
             a.S("mTubeChannels");
          }
          VoicePartyTheaterTubeChannel voicePartyTh = s.get(p0);
          Ref$IntRef intRef = new Ref$IntRef();
          int i = -1;
          intRef.element = i;
          int i1 = 0;
          TabHostFragmentV2 j = b.j;
          String str = "mTabLayout";
          a.o(j, str);
          int tabCount = j.getTabCount();
          while (i1 < tabCount) {
             TabLayout$f uof = b.j.v(i1);
             obj = (uof != null)? uof.d(): null;
             if (a.g(obj, Integer.valueOf(voicePartyTh.mChannelId))) {
                intRef.element = i1;
                break ;
             }
             i1 = i1 + 1;
          }
          b.j.A(b.A);
          if (intRef.element == i) {
             TabHostFragmentV2 j1 = b.j;
             a.o(j1, str);
             obj = ", Size=";
             String str1 = "Index=";
             String str2 = "channel.mName";
             if (j1.getTabCount() == b.t) {
                mName = voicePartyTh.mName;
                a.o(mName, str2);
                j oj = b.oh(voicePartyTh.mChannelId, mName);
                if (!PatchProxy.applyVoidOneRefs(oj, b, TabHostFragmentV2.class, "8")) {
                   tabCount = b.l.j();
                   if (!PatchProxy.isSupport(TabHostFragmentV2.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tabCount), oj, b, TabHostFragmentV2.class, "9")) {
                      if (tabCount >= 0 && tabCount <= b.l.j()) {
                         b.j.c(oj.c(), tabCount);
                         Fragment uFragment = b.hh(oj.b(), oj.a());
                         oj.d(tabCount, uFragment);
                         j1 = b.l;
                         Objects.requireNonNull(j1);
                         i oi = i.class;
                         if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tabCount), uFragment, j1, oi, "6")) {
                            j1.k.add(tabCount, uFragment);
                         }
                         b.l.q();
                      }else {
                         throw new IndexOutOfBoundsException(str1+tabCount+obj+b.l.j());
                      }
                   }
                }
                j1 = b.j;
                a.o(j1, str);
                intRef.element = j1.getTabCount() + i;
             }else {
                j1 = b.j;
                a.o(j1, str);
                if (j1.getTabCount() > b.t) {
                   j1 = b.j;
                   a.o(j1, str);
                   i1 = j1.getTabCount() + i;
                   intRef.element = i1;
                   mName = voicePartyTh.mName;
                   a.o(mName, str2);
                   j oj1 = b.oh(voicePartyTh.mChannelId, mName);
                   if (!PatchProxy.isSupport(TabHostFragmentV2.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), oj1, b, TabHostFragmentV2.class, "10")) {
                      if (i1 >= 0 && i1 < b.l.j()) {
                         b.j.B(i1);
                         b.j.c(oj1.c(), i1);
                         Fragment uFragment1 = b.hh(oj1.b(), oj1.a());
                         oj1.d(i1, uFragment1);
                         b.l.B(i1, uFragment1);
                         b.l.q();
                      }else {
                         throw new IndexOutOfBoundsException(str1+i1+obj+b.l.j());
                      }
                   }
                }
             }
          }
          b.k.post(new f(b, intRef));
          ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
          tagPackage.identity = String.valueOf(voicePartyTh.mChannelId);
          tagPackage.name = voicePartyTh.mName;
          tagPackage.index = (long)(intRef.element + 1);
          p op = b.rh();
          a.o(op, "mContext");
          p op1 = b.rh();
          a.o(op1, "mContext");
          e.f(op.d().a(), op1.g(), tagPackage);
       }
       return;
    }
}
