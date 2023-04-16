package com.kwai.framework.model.user.ProfileDynamicPendant$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.ProfileDynamicPendant;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.google.gson.stream.b;

public final class ProfileDynamicPendant$TypeAdapter extends TypeAdapter	// class@001710
{
    public final Gson a;
    public static final a b;

    static {
       ProfileDynamicPendant$TypeAdapter.b = a.get(ProfileDynamicPendant.class);
    }
    public void ProfileDynamicPendant$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ProfileDynamicPendant$TypeAdapter.class, "2");
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
             obj = new ProfileDynamicPendant();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa0a6a1d5:
                      if (str.equals("widthRadio")) {
                         i = 0;
                      }
                      break;
                    case 0xc1b83314:
                      if (str.equals("heightRadio")) {
                         i = 1;
                      }
                      break;
                    case 0x5bbd2550:
                      if (str.equals("lottieUrl")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.setWidthRadio(KnownTypeAdapters$j.a(p0, obj.getWidthRadio()));
                      break;
                    case 1:
                      obj.setHeightRadio(KnownTypeAdapters$j.a(p0, obj.getHeightRadio()));
                      break;
                    case 2:
                      obj.setLottieUrl(TypeAdapters.A.read(p0));
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileDynamicPendant$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.getLottieUrl() != null) {
             p0.r("lottieUrl");
             TypeAdapters.A.write(p0, p1.getLottieUrl());
          }
          p0.r("widthRadio");
          p0.J((double)p1.getWidthRadio());
          p0.r("heightRadio");
          p0.J((double)p1.getHeightRadio());
          p0.j();
       }
       return;
    }
}
