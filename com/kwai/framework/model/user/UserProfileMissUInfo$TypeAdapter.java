package com.kwai.framework.model.user.UserProfileMissUInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserProfileMissUInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class UserProfileMissUInfo$TypeAdapter extends TypeAdapter	// class@001769
{
    public final Gson a;
    public static final a b;

    static {
       UserProfileMissUInfo$TypeAdapter.b = a.get(UserProfileMissUInfo.class);
    }
    public void UserProfileMissUInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserProfileMissUInfo$TypeAdapter.class, "2");
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
             obj = new UserProfileMissUInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x93b9c298:
                      if (str.equals("showMissYouButton")) {
                         i = 0;
                      }
                      break;
                    case 0xd5dac5b6:
                      if (str.equals("missUCount")) {
                         i = 1;
                      }
                      break;
                    case 0x11b189e9:
                      if (str.equals("showBubble")) {
                         i = 2;
                      }
                      break;
                    case 0x34717290:
                      if (str.equals("showAlreadyMissUStatus")) {
                         i = 3;
                      }
                      break;
                    case 0x65ed2e62:
                      if (str.equals("showMissYouButtonUnFollow")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mShowMissYouButton = KnownTypeAdapters$g.a(p0, obj.mShowMissYouButton);
                      break;
                    case 1:
                      obj.mMissUCount = KnownTypeAdapters$k.a(p0, obj.mMissUCount);
                      break;
                    case 2:
                      obj.mShowBubble = KnownTypeAdapters$g.a(p0, obj.mShowBubble);
                      break;
                    case 3:
                      obj.mShowAlreadyMissUStatus = KnownTypeAdapters$g.a(p0, obj.mShowAlreadyMissUStatus);
                      break;
                    case 4:
                      obj.mShowMissYouButtonUnFollow = KnownTypeAdapters$g.a(p0, obj.mShowMissYouButtonUnFollow);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserProfileMissUInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("showAlreadyMissUStatus");
          p0.P(p1.mShowAlreadyMissUStatus);
          p0.r("showMissYouButton");
          p0.P(p1.mShowMissYouButton);
          p0.r("showBubble");
          p0.P(p1.mShowBubble);
          p0.r("missUCount");
          p0.K((long)p1.mMissUCount);
          p0.r("showMissYouButtonUnFollow");
          p0.P(p1.mShowMissYouButtonUnFollow);
          p0.j();
       }
       return;
    }
}
