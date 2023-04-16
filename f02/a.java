package f02.a;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatCanvasSize;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatWindow;
import nh3.b;
import java.util.List;
import java.lang.Integer;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatExtraInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.HashMap;
import java.util.Iterator;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import java.util.LinkedList;
import pq1.d;
import pq1.b;
import com.kuaishou.live.common.core.component.multiline.model.a;
import java.util.Map;
import java.lang.Long;
import com.kuaishou.live.common.core.component.multiline.model.LiveLineUserExtraInfo;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatUserExtraInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.live.common.core.component.multiline.model.LiveLineExtraInfo$ExtraInfoUserInfo;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import e17.i;
import android.text.TextUtils;
import android.util.Base64;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLinePkWarmUpStartExtraInfo;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import e02.a;

public class a	// class@002263
{

    public void a(){
       super();
    }
    public static boolean a(InteractiveChatLayoutConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       InteractiveChatLayoutConfig canvasSize = p0.canvasSize;
       p0 = p0.windowInfo;
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (a.e(canvasSize, p0[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static List b(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c(p0, 1);
    }
    public static List c(b p0,int p1){
       LiveMultiLineChatExtraInfo obj2;
       int i2;
       int i3;
       LiveLineUserExtraInfo liveLineUser1;
       Object obj = p0;
       a uoa = a.class;
       object obj1 = null;
       if (PatchProxy.isSupport(uoa)) {
          obj2 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(p1), obj1, uoa, "5");
          if (obj2 != PatchProxyResult.class) {
             return obj2;
          }
       }
       if (obj != null && (p0.e() == null || p0.e().windowInfo == null)) {
          return obj1;
       }else if(p0.d() != null){
          try{
             obj2 = a.g(p0.d());
          label_0045 :
             HashMap hashMap = new HashMap();
             Iterator iterator = p0.f().iterator();
             while (iterator.hasNext()) {
                c uoc = iterator.next();
                hashMap.put(uoc.c().mId, uoc);
             }
             LinkedList linkedList = new LinkedList();
             InteractiveChatCanvasSize width = p0.e().canvasSize.width;
             InteractiveChatCanvasSize height = p0.e().canvasSize.height;
             InteractiveChatLayoutConfig windowInfo = p0.e().windowInfo;
             int len = windowInfo.length;
             int i = 0;
             int i1 = 0;
             while (i1 < len) {
                object oobject = windowInfo[i1];
                Object obj3 = hashMap.get(String.valueOf(oobject.userId));
                if (obj3 == null) {
                   if (i < p1) {
                      i = i + 1;
                      d uod = new d("pitBlank");
                      a.k(width, height, oobject, uod);
                      linkedList.add(uod);
                      i2 = i1;
                   label_0145 :
                      i1 = i2 + 1;
                      obj1 = null;
                   }else {
                      i3 = i;
                      i2 = i1;
                   }
                }else {
                   String str = p0.c();
                   Object obj4 = obj3;
                   obj1 = oobject;
                   i3 = i;
                   i2 = i1;
                   a uoa1 = PatchProxy.applyThreeRefs(str, obj2, obj3, null, a.class, "8");
                   if (uoa1 != PatchProxyResult.class) {
                   }else if(obj2 != null){
                      LiveMultiLineChatExtraInfo userExtraInf = obj2.userExtraInfo;
                      if (userExtraInf != null && (userExtraInf.size() > 0 && obj2.userExtraInfo.get(Long.valueOf(Long.parseLong(obj4.c().mId))) != null)) {
                         LiveLineUserExtraInfo liveLineUser = new LiveLineUserExtraInfo();
                         liveLineUser.mMatchType = obj2.userExtraInfo.get(Long.valueOf(Long.parseLong(obj4.c().mId))).matchType;
                         liveLineUser1 = liveLineUser;
                      label_0122 :
                         a uoa2 = new a(str, obj4.b(), UserInfo.convertToProto(obj4.c()), obj4.c, liveLineUser1, null);
                      }
                   }
                   liveLineUser1 = null;
                   goto label_0122 ;
                   a.k(width, height, obj1, uoa1);
                   linkedList.add(uoa1);
                }
                i = i3;
                goto label_0145 ;
             }
             return linkedList;
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
             b.Z(LiveLogTag.LIVE_MULTI_INTERACT, "parseToExtraInfoPb failed");
          }
          obj2 = obj1;
          goto label_0045 ;
       }else {
          goto label_0044 ;
       }
    }
    public static List d(b p0){
       b obj = null;
       LinkedList obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       List list = a.c(p0, 0);
       if (list == null) {
          return obj;
       }
       obj1 = new LinkedList();
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (obj instanceof a) {
             obj1.add(obj);
          }
       }
       return obj1;
    }
    public static boolean e(InteractiveChatCanvasSize p0,InteractiveChatWindow p1){
       boolean b = false;
       if (p1 != null && p0 != null) {
          float f = (float)p1.height / (float)p0.height;
          if ((double)((float)p1.x / (float)p0.width) - 0x3f847ae147ae147b < 0 && (double)f - 0x3fe999999999999a > 0) {
             b = true;
          }
       }
       return b;
    }
    public static SCLiveMultiLineChatOpened f(LiveMultiLineChatExtraInfo p0,String p1){
       SCLiveMultiLineChatOpened obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.d() && SystemUtil.I()) {
          i.d(R.style.arg_RES_7f11066a, "server没返回open信令！！error - 兜底执行");
       }
       obj = new SCLiveMultiLineChatOpened();
       obj.userExtraInfo = p0.userExtraInfo;
       obj.disableInviteOtherUser = p0.disableInviteOtherUser;
       obj.disableInviteOtherUserToastText = p0.disableInviteOtherUserToastText;
       LiveMultiLineChatExtraInfo chatMode = p0.chatMode;
       obj.chatMode = chatMode;
       obj.lastPkInfo = p0.lastPkInfo;
       obj.multiLineChatId = p0.multiLineChatId;
       obj.sellingChatInfo = p0.sellingChatInfo;
       obj.chatModeStartExtra = p0.subModeExtraInfo;
       if (chatMode == 2) {
          obj.subModeId = p1;
       }
       LiveLogTag lIVE_MULTI_L = LiveLogTag.LIVE_MULTI_LINE;
       lIVE_MULTI_L.appendTag("LiveMultiLineCoreModel_mock");
       LiveLogTag liveLogTag = lIVE_MULTI_L;
       b.V(liveLogTag, "mockSCLiveMultiLineChatOpened", "lineBizId", p1, "chatMode", Integer.valueOf(obj.chatMode), "subModeId", obj.subModeId, "multiLineChatId", obj.multiLineChatId);
       return obj;
    }
    public static LiveMultiLineChatExtraInfo g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          return LiveMultiLineChatExtraInfo.parseFrom(Base64.decode(p0, 0));
       }
       return null;
    }
    public static SCLiveMultiLineChatOpened h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          return SCLiveMultiLineChatOpened.parseFrom(Base64.decode(p0, 0));
       }
       return null;
    }
    public static LiveMultiLinePkWarmUpStartExtraInfo i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          byte[] uobyteArray = Base64.decode(p0, 0);
          try{
             return LiveMultiLinePkWarmUpStartExtraInfo.parseFrom(uobyteArray);
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
             b.Z(LiveLogTag.LIVE_MULTI_INTERACT, "parseWarmupStartExtraInfoPb failed");
          }
          return v1;
       }else {
          goto label_0027 ;
       }
    }
    public static b j(SCInteractiveChatRoomInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0);
    }
    public static void k(int p0,int p1,InteractiveChatWindow p2,b p3){
       float f = (float)p0;
       p3.a = (float)p2.x / f;
       float f1 = (float)p1;
       p3.b = (float)p2.y / f1;
       p3.c = (float)p2.width / f;
       p3.d = (float)p2.height / f1;
    }
}
