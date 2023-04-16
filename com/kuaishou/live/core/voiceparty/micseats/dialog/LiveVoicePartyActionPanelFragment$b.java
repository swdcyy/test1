package com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment$b;
import xz6.b;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment;
import xz6.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import xz6.d;
import com.kuaishou.live.core.voiceparty.emoji.model.VoicePartyEmojiListResponse$VoicePartyEmoji;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment$c;
import android.view.View$OnClickListener;
import android.view.View;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import brd.t;
import bn.a;
import java.util.concurrent.TimeUnit;
import ys2.f;
import erd.g;
import com.kuaishou.live.core.voiceparty.d0;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;
import android.content.Context;
import i2b.a;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import pt2.b;
import com.kwai.framework.model.user.UserInfo;

public class LiveVoicePartyActionPanelFragment$b extends b	// class@001596
{
    public final LiveVoicePartyActionPanelFragment f;

    public void LiveVoicePartyActionPanelFragment$b(LiveVoicePartyActionPanelFragment p0){
       this.f = p0;
       super();
    }
    public void g(int p0,e p1){
       if (PatchProxy.isSupport(LiveVoicePartyActionPanelFragment$b.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, LiveVoicePartyActionPanelFragment$b.class, "2")) {
          return;
       }
       VoicePartyEmojiListResponse$VoicePartyEmoji item = this.getItem(p0);
       if (p1 instanceof LiveVoicePartyActionPanelFragment$c) {
          if (item == null) {
             p1.b.setOnClickListener(null);
             return;
          }else {
             p1.f.P(item.mEmojiRes);
             a.b(p1.b).throttleFirst(350, TimeUnit.MILLISECONDS).subscribe(new f(this, item, p0), d0.s("VoicePartySelectEmojiFragment", "onBindViewHolder"));
          }
       }
       return;
    }
    public int getCount(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyActionPanelFragment$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int count = super.getCount();
       if (count <= 0) {
          count = 12;
       }
       return count;
    }
    public e h(int p0,ViewGroup p1){
       if (PatchProxy.isSupport(LiveVoicePartyActionPanelFragment$b.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, LiveVoicePartyActionPanelFragment$b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveVoicePartyActionPanelFragment$c(a.c(p1.getContext(), 0x7f0d0e2f, null));
    }
    public final int i(VoicePartyMicSeatData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyActionPanelFragment$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Integer integer = (p0 == null)? null: Integer.valueOf(p0.mId);
       return integer.intValue();
    }
    public final String j(VoicePartyMicSeatData p0){
       if (p0 == null) {
          return null;
       }
       p0 = p0.mMicUser;
       if (p0 == null) {
          return null;
       }
       b a = p0.a;
       if (a == null) {
          return null;
       }
       return a.mId;
    }
}
