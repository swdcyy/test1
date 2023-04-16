package com.kuaishou.android.model.mix.QuestionnaireInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.QuestionnaireInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class QuestionnaireInfo$TypeAdapter extends TypeAdapter	// class@000dd8
{
    public final Gson a;
    public static final a b;

    static {
       QuestionnaireInfo$TypeAdapter.b = a.get(QuestionnaireInfo.class);
    }
    public void QuestionnaireInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public QuestionnaireInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, QuestionnaireInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       QuestionnaireInfo questionnair = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return questionnair;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return questionnair;
       }else {
          p0.c();
          QuestionnaireInfo questionnair1 = new QuestionnaireInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xb7389127:
                   if (str.equals("height")) {
                      i = 0;
                   }
                   break;
                 case 0xb9a116cf:
                   if (str.equals("isBold")) {
                      i = 1;
                   }
                   break;
                 case 0xbe071a81:
                   if (str.equals("ksOrderId")) {
                      i = 2;
                   }
                   break;
                 case 0xc09b2e36:
                   if (str.equals("textColor")) {
                      i = 3;
                   }
                   break;
                 case 0xcf63261e:
                   if (str.equals("targetUrl")) {
                      i = 4;
                   }
                   break;
                 case 0xf3ca161e:
                   if (str.equals("bgColor")) {
                      i = 5;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 6;
                   }
                   break;
                 case 0x57bcd41:
                   if (str.equals("operationType")) {
                      i = 7;
                   }
                   break;
                 case 0x15caa0f0:
                   if (str.equals("fontSize")) {
                      i = 8;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   questionnair1.mHeight = KnownTypeAdapters$k.a(p0, questionnair1.mHeight);
                   break;
                 case 1:
                   questionnair1.mIsBold = KnownTypeAdapters$g.a(p0, questionnair1.mIsBold);
                   break;
                 case 2:
                   questionnair1.mKsOrderId = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   questionnair1.mTextColorStr = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   questionnair1.mTargetUrl = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   questionnair1.mBackgroundColorStr = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   questionnair1.mText = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   questionnair1.mOperationType = KnownTypeAdapters$k.a(p0, questionnair1.mOperationType);
                   break;
                 case 8:
                   questionnair1.mFontSize = KnownTypeAdapters$k.a(p0, questionnair1.mFontSize);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return questionnair1;
       }
    }
    public void b(b p0,QuestionnaireInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QuestionnaireInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("operationType");
          p0.K((long)p1.mOperationType);
          if (p1.mTargetUrl != null) {
             p0.r("targetUrl");
             TypeAdapters.A.write(p0, p1.mTargetUrl);
          }
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          if (p1.mTextColorStr != null) {
             p0.r("textColor");
             TypeAdapters.A.write(p0, p1.mTextColorStr);
          }
          if (p1.mBackgroundColorStr != null) {
             p0.r("bgColor");
             TypeAdapters.A.write(p0, p1.mBackgroundColorStr);
          }
          p0.r("height");
          p0.K((long)p1.mHeight);
          p0.r("fontSize");
          p0.K((long)p1.mFontSize);
          p0.r("isBold");
          p0.P(p1.mIsBold);
          if (p1.mKsOrderId != null) {
             p0.r("ksOrderId");
             TypeAdapters.A.write(p0, p1.mKsOrderId);
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
