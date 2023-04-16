package com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class FollowSlideRecoGuide$TypeAdapter extends TypeAdapter	// class@0010ce
{
    public final Gson a;
    public static final a b;

    static {
       FollowSlideRecoGuide$TypeAdapter.b = a.get(FollowSlideRecoGuide.class);
    }
    public void FollowSlideRecoGuide$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FollowSlideRecoGuide$TypeAdapter.class, "2");
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
             obj = new FollowSlideRecoGuide();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xc42dea07:
                      if (str.equals("textType")) {
                         i = 0;
                      }
                      break;
                    case 0xc58b9b4b:
                      if (str.equals("toastReason")) {
                         i = 1;
                      }
                      break;
                    case 0xddec485b:
                      if (str.equals("showFromStart")) {
                         i = 2;
                      }
                      break;
                    case 0xef37d6e2:
                      if (str.equals("showInterval")) {
                         i = 3;
                      }
                      break;
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 4;
                      }
                      break;
                    case 0x567c3fb1:
                      if (str.equals("showDuration")) {
                         i = 5;
                      }
                      break;
                    case 0x6a3dc3e5:
                      if (str.equals("enableAutoNext")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mTextType = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mToastReason = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mShowFromStart = KnownTypeAdapters$g.a(p0, obj.mShowFromStart);
                      break;
                    case 3:
                      obj.mShowInterval = KnownTypeAdapters$n.a(p0, obj.mShowInterval);
                      break;
                    case 4:
                      obj.mType = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mShowDuration = KnownTypeAdapters$n.a(p0, obj.mShowDuration);
                      break;
                    case 6:
                      obj.mEnableAutoNext = KnownTypeAdapters$g.a(p0, obj.mEnableAutoNext);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowSlideRecoGuide$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("showFromStart");
          p0.P(p1.mShowFromStart);
          p0.r("showInterval");
          p0.K(p1.mShowInterval);
          p0.r("showDuration");
          p0.K(p1.mShowDuration);
          if (p1.mToastReason != null) {
             p0.r("toastReason");
             TypeAdapters.A.write(p0, p1.mToastReason);
          }
          if (p1.mTextType != null) {
             p0.r("textType");
             TypeAdapters.A.write(p0, p1.mTextType);
          }
          if (p1.mType != null) {
             p0.r("type");
             TypeAdapters.A.write(p0, p1.mType);
          }
          p0.r("enableAutoNext");
          p0.P(p1.mEnableAutoNext);
          p0.j();
       }
       return;
    }
}
