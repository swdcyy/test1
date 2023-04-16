package com.kuaishou.live.core.show.chat.model.LiveChatBetweenAnchorsConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.chat.model.LiveChatBetweenAnchorsConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$m;
import com.google.gson.stream.b;

public final class LiveChatBetweenAnchorsConfig$TypeAdapter extends TypeAdapter	// class@000a16
{
    public final Gson a;
    public static final a b;

    static {
       LiveChatBetweenAnchorsConfig$TypeAdapter.b = a.get(LiveChatBetweenAnchorsConfig.class);
    }
    public void LiveChatBetweenAnchorsConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveChatBetweenAnchorsConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LiveChatBetweenAnchorsConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xda648f3e:
                      if (str.equals("popGuidePromptDelayTimeGaps")) {
                         i = 0;
                      }
                      break;
                    case 0xf097c433:
                      if (str.equals("waitConnectedTimeoutMs")) {
                         i = 1;
                      }
                      break;
                    case 0xf3a56977:
                      if (str.equals("inviteWindowDismissMs")) {
                         i = 2;
                      }
                      break;
                    case 0x3882de0f:
                      if (str.equals("commonGuideTipContent")) {
                         i = 3;
                      }
                      break;
                    case 0x52182f23:
                      if (str.equals("popGuidePromptDuration")) {
                         i = 4;
                      }
                      break;
                    case 0x69227344:
                      if (str.equals("waitEstablishedTimeoutMs")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mPopGuidePromptDelayTimeGaps = KnownTypeAdapters$m.a(p0);
                      break;
                    case 1:
                      obj.mEstablishedStateTimeoutDuration = KnownTypeAdapters$n.a(p0, obj.mEstablishedStateTimeoutDuration);
                      break;
                    case 2:
                      obj.mInvitationDialogCountDownDuration = KnownTypeAdapters$n.a(p0, obj.mInvitationDialogCountDownDuration);
                      break;
                    case 3:
                      obj.mChatChooseApplyUserTipContent = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mPopGuidePromptDuration = KnownTypeAdapters$n.a(p0, obj.mPopGuidePromptDuration);
                      break;
                    case 5:
                      obj.mConnectingStateTimeoutDuration = KnownTypeAdapters$n.a(p0, obj.mConnectingStateTimeoutDuration);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveChatBetweenAnchorsConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPopGuidePromptDelayTimeGaps != null) {
             p0.r("popGuidePromptDelayTimeGaps");
             KnownTypeAdapters$m.b(p0, p1.mPopGuidePromptDelayTimeGaps);
          }
          p0.r("popGuidePromptDuration");
          p0.K(p1.mPopGuidePromptDuration);
          p0.r("waitEstablishedTimeoutMs");
          p0.K(p1.mConnectingStateTimeoutDuration);
          p0.r("waitConnectedTimeoutMs");
          p0.K(p1.mEstablishedStateTimeoutDuration);
          p0.r("inviteWindowDismissMs");
          p0.K(p1.mInvitationDialogCountDownDuration);
          if (p1.mChatChooseApplyUserTipContent != null) {
             p0.r("commonGuideTipContent");
             TypeAdapters.A.write(p0, p1.mChatChooseApplyUserTipContent);
          }
          p0.j();
       }
       return;
    }
}
