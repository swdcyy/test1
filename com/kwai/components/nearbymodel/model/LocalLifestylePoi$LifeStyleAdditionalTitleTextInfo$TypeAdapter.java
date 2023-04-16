package com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo;
import com.google.gson.stream.b;

public final class LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo$TypeAdapter extends TypeAdapter	// class@000c89
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo$TypeAdapter.c = a.get(LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo.class);
    }
    public void LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo$TypeAdapter.class, "2");
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
             obj = new LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("auxiliaryTitle")) {
                   if (!str1.equals("decisionTitle")) {
                      p0.Q();
                   }else {
                      obj.mDecisionTitle = this.b.read(p0);
                   }
                }else {
                   obj.mAuxiliaryTitle = this.b.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mAuxiliaryTitle != null) {
             p0.r("auxiliaryTitle");
             this.b.write(p0, p1.mAuxiliaryTitle);
          }
          if (p1.mDecisionTitle != null) {
             p0.r("decisionTitle");
             this.b.write(p0, p1.mDecisionTitle);
          }
          p0.j();
       }
       return;
    }
}
