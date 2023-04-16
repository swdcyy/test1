package com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel;
import a73.a;
import hf3.a;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$b;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$a;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$c;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$d;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.Iterator;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$onChatEnd$1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import ae1.b;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveChatViewPostionMessage;
import java.util.List;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$onChatStart$1;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$tryUpdateChatState$1;
import a73.c;

public final class LiveLiteMultiChatModel implements a	// class@001d7e
{
    public final ArrayList a;
    public boolean b;
    public final List c;
    public ChatInfo d;
    public LiveFlvStream$LiveChatViewPostionMessage[] e;
    public final g f;
    public final g g;
    public final LivePlayerTypeChangeListener h;
    public final LiveLiteMultiChatModel$d i;
    public final a j;
    public final LivePlayerController k;

    public void LiveLiteMultiChatModel(a p0,LivePlayerController p1){
       a.p(p0, "longConnection");
       a.p(p1, "playerController");
       super();
       this.j = p0;
       this.k = p1;
       this.a = new ArrayList();
       this.c = new ArrayList();
       this.f = new LiveLiteMultiChatModel$b(this);
       this.g = new LiveLiteMultiChatModel$a(this);
       this.h = new LiveLiteMultiChatModel$c(this);
       this.i = new LiveLiteMultiChatModel$d(this);
    }
    public final void a(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatModel.class, "17")) {
          return;
       }
       Iterator iterator = new ArrayList(this.c).iterator();
       while (iterator.hasNext()) {
          p0.invoke(iterator.next());
       }
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatModel.class, "5")) {
          return;
       }
       if (this.b == null) {
          b.Z(LiveLiteLogTag.LITE_MULTI_CHAT, "onChat check end,  "+p0+" is not start");
          return;
       }else {
          this.b = false;
          b.Z(LiveLiteLogTag.LITE_MULTI_CHAT, "onChat did end, with chatId "+p0);
          this.a(LiveLiteMultiChatModel$onChatEnd$1.INSTANCE);
          this.d = null;
          this.e = null;
          return;
       }
    }
    public final boolean c(boolean p0){
       ChatInfo obj;
       boolean b;
       ChatInfo uChatInfo = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteMultiChatModel liveLiteMult = LiveLiteMultiChatModel.class;
       if (PatchProxy.isSupport(liveLiteMult)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), uChatInfo, liveLiteMult, "10");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = this.p();
       LiveLiteMultiChatModel e = uChatInfo.e;
       if (obj == null || e == null) {
          b.B(LiveLiteLogTag.LITE_MULTI_CHAT, "chatInfo or viewPositions is null");
          return false;
       }else {
          int len = e.length;
          ArrayList uArrayList = new ArrayList(len);
          for (int i = 0; i < len; i = i + 1) {
             object oobject = e[i];
             b uob = v15;
             b uob1 = v15;
             uob = new b(oobject.chatViewPositionTop, oobject.chatViewPositionLeft, oobject.chatViewPositionWidth, oobject.chatViewPositionHeight, oobject.chatGuestId);
             uArrayList.add(uob1);
          }
          if (!p0) {
             List list = obj.j();
             a.o(list, "chatInfo.viewPositionList");
             Object obj1 = PatchProxy.applyTwoRefs(list, uArrayList, uChatInfo, liveLiteMult, "11");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(list.size() != uArrayList.size()){
                Iterator iterator = list.iterator();
                int i1 = 0;
                while (true) {
                   if (iterator.hasNext()) {
                      obj1 = iterator.next();
                      i = i1 + 1;
                      if (i1 < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      i1 = a.g(obj1, uArrayList.get(i1)) ^ true;
                      if (!i1) {
                         i1 = i;
                      }
                   }else {
                      b = false;
                   }
                }
             }
             b = true;
             if (!b) {
                b.B(LiveLiteLogTag.LITE_MULTI_CHAT, "viewPositions not change, ignore");
                return false;
             }
          }
          if (!PatchProxy.applyVoidOneRefs(uArrayList, obj, ChatInfo.class, "8") && !uArrayList.isEmpty()) {
             obj.m.clear();
             obj.m.addAll(uArrayList);
          }
          uChatInfo.d = obj;
          if (uChatInfo.b == null && !PatchProxy.applyVoid(null, uChatInfo, liveLiteMult, "6")) {
             uChatInfo.b = true;
             b.Z(LiveLiteLogTag.LITE_MULTI_CHAT, "onChatStart");
             uChatInfo.a(LiveLiteMultiChatModel$onChatStart$1.INSTANCE);
          }
          b.B(LiveLiteLogTag.LITE_MULTI_CHAT, "update chatInfo: "+obj);
          uChatInfo.a(new LiveLiteMultiChatModel$tryUpdateChatState$1(obj));
          return true;
       }
    }
    public ChatInfo p(){
       return this.d;
    }
    public void q(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatModel.class, "15")) {
          return;
       }
       a.p(p0, "observer");
       this.r(p0);
       this.c.add(p0);
       return;
    }
    public void r(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatModel.class, "16")) {
          return;
       }
       a.p(p0, "observer");
       this.c.remove(p0);
       return;
    }
    public boolean s(){
       return this.b;
    }
}
