package com.yxcorp.gifshow.model.config.UnLoginPopupConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.config.UnLoginPopupConfig;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class UnLoginPopupConfig$TypeAdapter extends TypeAdapter	// class@001ee3
{
    public final Gson a;
    public static final a b;

    static {
       UnLoginPopupConfig$TypeAdapter.b = a.get(UnLoginPopupConfig.class);
    }
    public void UnLoginPopupConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UnLoginPopupConfig$TypeAdapter.class, "2");
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
             obj = new UnLoginPopupConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x836c5bf8:
                      if (str.equals("subTitle")) {
                         i = 0;
                      }
                      break;
                    case 0xabba5058:
                      if (str.equals("amount")) {
                         i = 1;
                      }
                      break;
                    case 0xadd0e173:
                      if (str.equals("btnUrl")) {
                         i = 2;
                      }
                      break;
                    case 0xb6362ac4:
                      if (str.equals("explainText")) {
                         i = 3;
                      }
                      break;
                    case 0xbe071a81:
                      if (str.equals("ksOrderId")) {
                         i = 4;
                      }
                      break;
                    case 0xc0b4fa50:
                      if (str.equals("tkExtParams")) {
                         i = 5;
                      }
                      break;
                    case 0xf069d81f:
                      if (str.equals("mainTitle")) {
                         i = 6;
                      }
                      break;
                    case 0xf3ae1090:
                      if (str.equals("unLoginPopupSwitch")) {
                         i = 7;
                      }
                      break;
                    case 0xc4aa9a9:
                      if (str.equals("btnText")) {
                         i = 8;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSubTitle = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mAmount = KnownTypeAdapters$n.a(p0, obj.mAmount);
                      break;
                    case 2:
                      obj.mBtnUrl = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mExplainText = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mKsOrderId = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mTkExtParams = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mMainTitle = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mUnLoginPopupSwitch = KnownTypeAdapters$g.a(p0, obj.mUnLoginPopupSwitch);
                      break;
                    case 8:
                      obj.mBtnText = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UnLoginPopupConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("unLoginPopupSwitch");
          p0.P(p1.mUnLoginPopupSwitch);
          if (p1.mMainTitle != null) {
             p0.r("mainTitle");
             TypeAdapters.A.write(p0, p1.mMainTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          p0.r("amount");
          p0.K(p1.mAmount);
          if (p1.mBtnText != null) {
             p0.r("btnText");
             TypeAdapters.A.write(p0, p1.mBtnText);
          }
          if (p1.mBtnUrl != null) {
             p0.r("btnUrl");
             TypeAdapters.A.write(p0, p1.mBtnUrl);
          }
          if (p1.mExplainText != null) {
             p0.r("explainText");
             TypeAdapters.A.write(p0, p1.mExplainText);
          }
          if (p1.mKsOrderId != null) {
             p0.r("ksOrderId");
             TypeAdapters.A.write(p0, p1.mKsOrderId);
          }
          if (p1.mTkExtParams != null) {
             p0.r("tkExtParams");
             TypeAdapters.A.write(p0, p1.mTkExtParams);
          }
          p0.j();
       }
       return;
    }
}
