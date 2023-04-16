package com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonStatusInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class ProfileTemplateCard$ButtonInfo$TypeAdapter extends TypeAdapter	// class@001e7a
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ProfileTemplateCard$ButtonInfo$TypeAdapter.d = a.get(ProfileTemplateCard$ButtonInfo.class);
    }
    public void ProfileTemplateCard$ButtonInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(ProfileTemplateCard$ButtonStatusInfo$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ProfileTemplateCard$ButtonInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new ProfileTemplateCard$ButtonInfo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("currentStatus")) {
                   if (!str1.equals("buttonStatusInfos")) {
                      p0.Q();
                   }else {
                      obj.mButtonStatusInfos = this.c.read(p0);
                   }
                }else {
                   obj.mCurrentStatus = KnownTypeAdapters$k.a(p0, obj.mCurrentStatus);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileTemplateCard$ButtonInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("currentStatus");
          p0.K((long)p1.mCurrentStatus);
          if (p1.mButtonStatusInfos != null) {
             p0.r("buttonStatusInfos");
             this.c.write(p0, p1.mButtonStatusInfos);
          }
          p0.j();
       }
       return;
    }
}
