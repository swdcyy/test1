package com.kuaishou.live.lite.adapter.component.chat.LiveLiteMultiChatPresenter$a;
import a73.c;
import com.kuaishou.live.lite.adapter.component.chat.LiveLiteMultiChatPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import a73.c$a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import vb3.n;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import w63.b;
import xp5.g;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import java.lang.StringBuilder;

public final class LiveLiteMultiChatPresenter$a implements c	// class@001d6b
{
    public final LiveLiteMultiChatPresenter a;

    public void LiveLiteMultiChatPresenter$a(LiveLiteMultiChatPresenter p0){
       this.a = p0;
       super();
    }
    public void d(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatPresenter$a.class, "4")) {
          return;
       }
       a.p(p0, "speakers");
       c$a.a(this, p0);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiChatPresenter$a.class, "3")) {
          return;
       }
       b.Z(LiveLiteLogTag.LITE_MULTI_CHAT, "onChatEnd");
       LiveLiteMultiChatPresenter.c9(this.a).c(LayoutViewType.MultiChat, null);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiChatPresenter$a.class, "1")) {
          return;
       }
       b.Z(LiveLiteLogTag.LITE_MULTI_CHAT, "onChatStart");
       n on = LiveLiteMultiChatPresenter.c9(this.a);
       LayoutViewType multiChat = LayoutViewType.MultiChat;
       LiveLiteMultiChatPresenter c = this.a.C;
       if (c == null) {
          a.S("multiChatModel");
       }
       LiveLiteMultiChatPresenter z = this.a.z;
       if (z == null) {
          a.S("liveInfoManager");
       }
       on.c(multiChat, new b(c, z.d()));
       return;
    }
    public void g(ChatInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatPresenter$a.class, "2")) {
          return;
       }
       a.p(p0, "chatInfo");
       b.Z(LiveLiteLogTag.LITE_MULTI_CHAT, "onChatInfoUpdate, "+p0);
       return;
    }
}
