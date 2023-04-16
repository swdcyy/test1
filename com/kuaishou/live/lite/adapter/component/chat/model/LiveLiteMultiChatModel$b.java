package com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$b;
import lf3.g;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatUserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import fq1.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import com.google.gson.JsonElement;
import com.google.gson.c;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import java.lang.Throwable;
import java.util.Objects;
import java.util.ArrayList;
import ae1.d;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo$RoleType;
import com.yxcorp.utility.TextUtils;
import rd1.e0;
import java.util.List;
import lf3.f;

public final class LiveLiteMultiChatModel$b implements g	// class@001d77
{
    public final LiveLiteMultiChatModel b;

    public void LiveLiteMultiChatModel$b(LiveLiteMultiChatModel p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatModel$b.class, "1")) {
       }else {
          StringBuilder str = 1;
          if (str != p0.bizIdentity.bizType) {
             b.Z(LiveLiteLogTag.LITE_MULTI_CHAT, "receive update signal, but type is "+p0.bizIdentity.bizType);
          }else {
             SCInteractiveChatUserInfo extraInfo = p0.extraInfo;
             SCInteractiveChatUserInfo obj = PatchProxy.applyOneRefs(extraInfo, null, b.class, "5");
             int i = 0;
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(b.c()){
                b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "LiveMultiChatSwitch LiteAudienceExtraInfo", "extraInfo", extraInfo);
                JsonElement jsonElement = c.d(extraInfo);
                a.o(jsonElement, "JsonParser.parseString\(extraInfo\)");
                jsonElement = jsonElement.r().e0("enableUpdateLayoutTheme");
                a.o(jsonElement, "jsonObject[\"enableUpdateLayoutTheme\"]");
                b = jsonElement.d();
             }
             if (b) {
                b.Z(LiveLiteLogTag.LITE_MULTI_CHAT, "receive update signal, but need use new multi chat");
             }else {
                LiveLiteMultiChatModel$b tb = this.b;
                obj = p0.userInfo;
                a.o(obj, "chatUserInfo.userInfo");
                SCInteractiveChatUserInfo extraInfo1 = p0.extraInfo;
                Objects.requireNonNull(tb);
                LiveLiteMultiChatModel liveLiteMult = LiveLiteMultiChatModel.class;
                if (!PatchProxy.applyVoidTwoRefs(obj, extraInfo1, tb, liveLiteMult, "8")) {
                   ArrayList uArrayList = new ArrayList();
                   int len = obj.length;
                   for (; i < len; i = i + 1) {
                      uArrayList.add(new d(obj[i]));
                   }
                   if (!PatchProxy.applyVoidTwoRefs(uArrayList, extraInfo1, tb, liveLiteMult, "9")) {
                      ChatInfo uChatInfo = new ChatInfo(ChatInfo$RoleType.AUDIENCE);
                      b.c0(LiveLiteLogTag.LITE_MULTI_CHAT, " audience onChatUserInfoUpdate", "extraInfo ", TextUtils.k(extraInfo1));
                      e0.c(uChatInfo, extraInfo1);
                      uChatInfo.o(uArrayList);
                      tb.d = uChatInfo;
                      tb.c(str);
                   }
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
