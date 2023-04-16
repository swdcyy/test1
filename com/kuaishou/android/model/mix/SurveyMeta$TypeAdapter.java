package com.kuaishou.android.model.mix.SurveyMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.SurveyMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.SurveyReason$TypeAdapter;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class SurveyMeta$TypeAdapter extends TypeAdapter	// class@000e0b
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       SurveyMeta$TypeAdapter.e = a.get(SurveyMeta.class);
    }
    public void SurveyMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(SurveyReason$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(a.get(User.class));
    }
    public SurveyMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SurveyMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SurveyMeta surveyMeta = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return surveyMeta;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return surveyMeta;
       }else {
          p0.c();
          SurveyMeta surveyMeta1 = new SurveyMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x836c5bf8:
                   if (str.equals("subTitle")) {
                      i = 0;
                   }
                   break;
                 case 0xa0974215:
                   if (str.equals("surveyId")) {
                      i = 1;
                   }
                   break;
                 case 0xd7d46db4:
                   if (str.equals("surveyType")) {
                      i = 2;
                   }
                   break;
                 case 0x36ebcb:
                   if (str.equals("user")) {
                      i = 3;
                   }
                   break;
                 case 0xa8de315:
                   if (str.equals("linkUrl")) {
                      i = 4;
                   }
                   break;
                 case 0x155ef77f:
                   if (str.equals("buttonText")) {
                      i = 5;
                   }
                   break;
                 case 0x221bd886:
                   if (str.equals("surveyItems")) {
                      i = 6;
                   }
                   break;
                 case 0x22b2131e:
                   if (str.equals("surveyTitle")) {
                      i = 7;
                   }
                   break;
                 case 0x2d314842:
                   if (str.equals("surveyDescription")) {
                      i = 8;
                   }
                   break;
                 case 0x4d0b70cd:
                   if (str.equals("backgroundImage")) {
                      i = 9;
                   }
                   break;
                 case 0x519c89e9:
                   if (str.equals("createTime")) {
                      i = 10;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 11;
                   }
                   break;
                 case 0x6a01c65b:
                   if (str.equals("multipleSelectToast")) {
                      i = 12;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   surveyMeta1.mSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   surveyMeta1.mSurveyId = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   surveyMeta1.mSurveyType = KnownTypeAdapters$k.a(p0, surveyMeta1.mSurveyType);
                   break;
                 case 3:
                   surveyMeta1.mUser = this.d.read(p0);
                   break;
                 case 4:
                   surveyMeta1.mLinkUrl = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   surveyMeta1.mButtonText = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   surveyMeta1.mSurveyReasons = this.c.read(p0);
                   break;
                 case 7:
                   surveyMeta1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   surveyMeta1.mDescription = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   surveyMeta1.mBackgroundImage = TypeAdapters.A.read(p0);
                   break;
                 case 10:
                   surveyMeta1.mCreateTime = KnownTypeAdapters$n.a(p0, surveyMeta1.mCreateTime);
                   break;
                 case 11:
                   surveyMeta1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 12:
                   surveyMeta1.mMultipleSelectToast = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return surveyMeta1;
       }
    }
    public void b(b p0,SurveyMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SurveyMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mSurveyId != null) {
             p0.r("surveyId");
             TypeAdapters.A.write(p0, p1.mSurveyId);
          }
          if (p1.mTitle != null) {
             p0.r("surveyTitle");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          if (p1.mButtonText != null) {
             p0.r("buttonText");
             TypeAdapters.A.write(p0, p1.mButtonText);
          }
          p0.r("surveyType");
          p0.K((long)p1.mSurveyType);
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          if (p1.mBackgroundImage != null) {
             p0.r("backgroundImage");
             TypeAdapters.A.write(p0, p1.mBackgroundImage);
          }
          p0.r("createTime");
          p0.K(p1.mCreateTime);
          if (p1.mMultipleSelectToast != null) {
             p0.r("multipleSelectToast");
             TypeAdapters.A.write(p0, p1.mMultipleSelectToast);
          }
          if (p1.mDescription != null) {
             p0.r("surveyDescription");
             TypeAdapters.A.write(p0, p1.mDescription);
          }
          if (p1.mSurveyReasons != null) {
             p0.r("surveyItems");
             this.c.write(p0, p1.mSurveyReasons);
          }
          if (p1.mUser != null) {
             p0.r("user");
             this.d.write(p0, p1.mUser);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
