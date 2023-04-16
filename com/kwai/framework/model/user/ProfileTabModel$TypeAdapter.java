package com.kwai.framework.model.user.ProfileTabModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.ProfileTabModel;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.ProfileTabModel$AdBusinessTabInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kwai.framework.model.user.ProfileTabModel$AdBusinessTabInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class ProfileTabModel$TypeAdapter extends TypeAdapter	// class@001717
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       ProfileTabModel$TypeAdapter.c = a.get(ProfileTabModel.class);
    }
    public void ProfileTabModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(ProfileTabModel$AdBusinessTabInfo$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ProfileTabModel$TypeAdapter.class, "2");
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
             obj = new ProfileTabModel();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x337a8b:
                      if (str.equals("name")) {
                         i = 0;
                      }
                      break;
                    case 0x35dafd:
                      if (str.equals("show")) {
                         i = 1;
                      }
                      break;
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 2;
                      }
                      break;
                    case 0x5bbe760:
                      if (str.equals("adBusinessTabInfo")) {
                         i = 3;
                      }
                      break;
                    case 0x1afc669a:
                      if (str.equals("tabLogName")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mName = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mShowStatus = KnownTypeAdapters$k.a(p0, obj.mShowStatus);
                      break;
                    case 2:
                      obj.mType = KnownTypeAdapters$k.a(p0, obj.mType);
                      break;
                    case 3:
                      obj.mAdBusinessTabInfo = this.b.read(p0);
                      break;
                    case 4:
                      obj.mTabLogName = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileTabModel$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          p0.r("show");
          p0.K((long)p1.mShowStatus);
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mTabLogName != null) {
             p0.r("tabLogName");
             TypeAdapters.A.write(p0, p1.mTabLogName);
          }
          if (p1.mAdBusinessTabInfo != null) {
             p0.r("adBusinessTabInfo");
             this.b.write(p0, p1.mAdBusinessTabInfo);
          }
          p0.j();
       }
       return;
    }
}
