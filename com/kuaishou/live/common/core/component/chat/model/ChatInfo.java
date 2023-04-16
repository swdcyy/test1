package com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import xd1.c;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo$RoleType;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.SortedSet;
import java.util.TreeSet;
import com.kuaishou.live.common.core.component.chat.model.a;
import java.util.Comparator;
import java.util.Set;
import java.util.Collection;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo$1;
import com.kuaishou.live.core.show.chat.model.LiveMultiChatGuestWidgetConfig;
import rd1.e0;
import java.lang.Number;
import java.util.Iterator;
import ae1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.chat.model.LiveMultiChatConfig;
import java.lang.reflect.Type;
import wg3.a;
import ekd.q;
import com.kuaishou.live.common.core.component.chat.c;
import java.util.Collections;
import java.util.Map$Entry;
import ie1.e;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.user.UserInfo;
import java.util.LinkedHashMap;
import java.util.HashMap;
import ae1.d;
import java.lang.StringBuilder;

public class ChatInfo implements c	// class@001042
{
    public final ChatInfo$RoleType b;
    public String c;
    public String d;
    public String e;
    public Throwable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public Map l;
    public List m;

    public void ChatInfo(ChatInfo$RoleType p0){
       super();
       this.e = "0";
       this.m = new ArrayList();
       this.b = p0;
    }
    public int B(){
       return 0;
    }
    public String I1(String p0){
       return this.d;
    }
    public Map O0(){
       Object obj = PatchProxy.apply(null, this, ChatInfo.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b();
    }
    public int W(){
       return 0;
    }
    public boolean Z0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChatInfo.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b().containsKey(p0);
    }
    public final SortedSet a(Map p0){
       TreeSet obj = PatchProxy.applyOneRefs(p0, this, ChatInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TreeSet(a.b);
       obj.addAll(p0.entrySet());
       return obj;
    }
    public Map b(){
       Object obj = PatchProxy.apply(null, this, ChatInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          this.l = new ChatInfo$1(this);
       }
       return this.l;
    }
    public LiveMultiChatGuestWidgetConfig c(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "2";
       e0 obj = PatchProxy.apply(objArray, this, ChatInfo.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = e0.class;
       LiveMultiChatGuestWidgetConfig liveMultiCha = PatchProxy.applyOneRefs(this, objArray, obj, "1");
       if (liveMultiCha != patchProxyRe) {
       }else {
          String str1 = "LiveMultiChatUtils";
          Map map = this.b();
          if (map != null) {
             Object obj1 = PatchProxy.applyOneRefs(map, objArray, obj, str);
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else {
                i = 0;
                Iterator iterator1 = map.values().iterator();
                while (iterator1.hasNext()) {
                   a uoa = iterator1.next();
                   if (uoa != null && uoa.d == 4) {
                      i = i + 1;
                   }
                }
                if (i <= 1) {
                   b.S(LiveLogTag.MULTI_CHAT.appendTag(str1), "getMultiChatGuestCount  ", "guestCount: ", Integer.valueOf(i));
                }
                i = i - 1;
             }
             if (PatchProxy.isSupport(obj)) {
                Object obj2 = PatchProxy.applyOneRefs(Integer.valueOf(i), objArray, obj, "3");
                if (obj2 != patchProxyRe) {
                   objArray = obj2;
                }
             }
             LiveMultiChatConfig liveMultiCha2 = a.z(LiveMultiChatConfig.class);
             if (liveMultiCha2 == null || q.f(liveMultiCha2.mGuestWidgetConfig)) {
                b.P(LiveLogTag.MULTI_CHAT.appendTag(str1), "get config from startUp, config is null");
             }else {
                Collections.sort(liveMultiCha2.mGuestWidgetConfig, c.b);
                Iterator iterator = liveMultiCha2.mGuestWidgetConfig.iterator();
                while (iterator.hasNext()) {
                   objArray = iterator.next();
                   if (objArray.mSupportMultiChatCount < i) {
                   }
                }
             }
          }
          if (objArray == null) {
             LiveMultiChatGuestWidgetConfig liveMultiCha1 = new LiveMultiChatGuestWidgetConfig();
             liveMultiCha1.mSupportMultiChatCount = 3;
             liveMultiCha1.mWidgetAspectRatio = 0x3f400000;
             liveMultiCha1.mChatViewPositionLeft = 0x3f420c4a;
             liveMultiCha1.mChatViewPositionTop = 0x3f3b645a;
             liveMultiCha1.mChatViewPositionWidth = 0x3e6353f8;
             liveMultiCha1.mChatViewPositionHeight = 0.17f;
             b.P(LiveLogTag.MULTI_CHAT.appendTag(str1), "getLiveMultiChatWidgetConfig  widget is null, use default config ");
             liveMultiCha = liveMultiCha1;
          }else {
             liveMultiCha = objArray;
          }
       }
       return liveMultiCha;
    }
    public a d(){
       Object[] objArray = null;
       Iterator obj = PatchProxy.apply(objArray, this, ChatInfo.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b().entrySet().iterator();
       if (obj.hasNext()) {
          objArray = obj.next().getValue();
       }
       return objArray;
    }
    public String e(){
       Object[] objArray = null;
       Iterator obj = PatchProxy.apply(objArray, this, ChatInfo.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b().entrySet().iterator();
       while (obj.hasNext()) {
          a value = obj.next().getValue();
          if (value.d == 1) {
             objArray = value.c;
             break ;
          }
       }
       return objArray;
    }
    public String f(){
       return this.c;
    }
    public int g(boolean p0){
       ChatInfo uChatInfo = ChatInfo.class;
       if (PatchProxy.isSupport(uChatInfo)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uChatInfo, "19");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a uoa = (p0)? this.d(): this.i();
       int i = (uoa == null)? 0: uoa.f;
       return i;
    }
    public a h(Set p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChatInfo.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.a(this.b(), p0);
    }
    public a i(){
       Object obj = PatchProxy.apply(null, this, ChatInfo.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b().get(QCurrentUser.me().getId());
    }
    public List j(){
       return this.m;
    }
    public boolean k(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ChatInfo.class, "16");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.g == null && !TextUtils.isEmpty(this.e()))? true: false;
       return b;
    }
    public boolean l(Set p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChatInfo.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h(p0) != null)? true: false;
       return b;
    }
    public boolean m(){
       Object obj = PatchProxy.apply(null, this, ChatInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.c) || !TextUtils.isEmpty(this.e))? true: false;
       return b;
    }
    public Map n(UserInfo p0,int p1){
       LinkedHashMap obj;
       ChatInfo uChatInfo = ChatInfo.class;
       if (PatchProxy.isSupport(uChatInfo)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uChatInfo, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LinkedHashMap(this.b());
       a uoa = this.b().get(p0.mId);
       if (uoa == null) {
          this.b().put(p0.mId, new a(p0.mId, p0, p1));
       }else {
          uoa.d = p1;
       }
       return obj;
    }
    public void o(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChatInfo.class, "4")) {
          return;
       }
       b.d0(LiveLogTag.MULTI_CHAT, "updateChatUser start", "userInfo", p0, "this", this);
       Map map = this.b();
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          UserInfo mId = uod.a.mId;
          a uoa = map.get(mId);
          int i = 4;
          if (uoa == null) {
             uoa = new a(mId, uod.a, i);
             map.put(mId, uoa);
          }
          if (TextUtils.isEmpty(this.d)) {
             this.d = uod.b;
          }
          uoa.d = i;
          uoa.e = uod.a;
          uoa.f = uod.c;
          hashMap.put(mId, uoa);
       }
       iterator = map.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!hashMap.containsKey(uEntry.getKey()) && uEntry.getValue().d != 1) {
             iterator.remove();
          }
       }
       map.clear();
       iterator = this.a(new LinkedHashMap(map)).iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry1 = iterator.next();
          String key = uEntry1.getKey();
          map.put(key, uEntry1.getValue());
       }
       b.c0(LiveLogTag.MULTI_CHAT, "updateChatUser end", "this", this);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ChatInfo.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ChatInfo{mChatId=\'"+this.c+'''+", mSessionId=\'"+this.d+'''+", mRoomId=\'"+this.e+'''+", mRoleType="+this.b+", error="+this.f+", mFromAudienceApply="+this.g+", mIsNewGuest="+this.h+", mIsInviteGuestNewVersion="+this.i+", mCanShowGuestGift="+this.j+", audienceChatRoomId="+this.k+", mChatUserInfoList="+this.l+", mViewPositionList="+this.m+'}';
    }
    public boolean v(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChatInfo.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a uoa = this.b().get(p0);
       boolean b = (uoa != null && uoa.d == 4)? true: false;
       return b;
    }
    public boolean v2(){
       return this.j;
    }
    public String y(){
       Object obj = PatchProxy.apply(null, this, ChatInfo.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g == null) {
          return this.e();
       }
       return null;
    }
}
