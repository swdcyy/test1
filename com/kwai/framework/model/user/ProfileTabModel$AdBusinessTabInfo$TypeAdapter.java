package com.kwai.framework.model.user.ProfileTabModel$AdBusinessTabInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.ProfileTabModel$AdBusinessTabInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class ProfileTabModel$AdBusinessTabInfo$TypeAdapter extends TypeAdapter	// class@001715
{
    public final Gson a;
    public static final a b;

    static {
       ProfileTabModel$AdBusinessTabInfo$TypeAdapter.b = a.get(ProfileTabModel$AdBusinessTabInfo.class);
    }
    public void ProfileTabModel$AdBusinessTabInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ProfileTabModel$AdBusinessTabInfo$TypeAdapter.class, "2");
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
             obj = new ProfileTabModel$AdBusinessTabInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x909d8ceb:
                      if (str.equals("subName")) {
                         i = 0;
                      }
                      break;
                    case 0xc4a6040a:
                      if (str.equals("pageId")) {
                         i = 1;
                      }
                      break;
                    case 0x337a8b:
                      if (str.equals("name")) {
                         i = 2;
                      }
                      break;
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSubName = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mPageId = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mName = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mType = KnownTypeAdapters$k.a(p0, obj.mType);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileTabModel$AdBusinessTabInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mSubName != null) {
             p0.r("subName");
             TypeAdapters.A.write(p0, p1.mSubName);
          }
          if (p1.mPageId != null) {
             p0.r("pageId");
             TypeAdapters.A.write(p0, p1.mPageId);
          }
          p0.r("type");
          p0.K((long)p1.mType);
          p0.j();
       }
       return;
    }
}
