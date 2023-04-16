package com.kuaishou.android.model.mix.CashTag$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CashTag;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.CashTag$Icon$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.Map;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.CashTag$Icon;
import com.google.gson.stream.b;

public final class CashTag$TypeAdapter extends TypeAdapter	// class@000bde
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       CashTag$TypeAdapter.d = a.get(CashTag.class);
    }
    public void CashTag$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(CashTag$Icon$TypeAdapter.c);
       this.c = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.A, new KnownTypeAdapters$e());
    }
    public CashTag a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CashTag$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CashTag uCashTag = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCashTag;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCashTag;
       }else {
          p0.c();
          CashTag uCashTag1 = new CashTag();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa685dfb8:
                   if (str.equals("paddingLeft")) {
                      i = 0;
                   }
                   break;
                 case 0xa7ca82d3:
                   if (str.equals("txtColor")) {
                      i = 1;
                   }
                   break;
                 case 0xb098552e:
                   if (str.equals("background")) {
                      i = 2;
                   }
                   break;
                 case 0xc594b292:
                   if (str.equals("prefix")) {
                      i = 3;
                   }
                   break;
                 case 0xcaddf751:
                   if (str.equals("suffix")) {
                      i = 4;
                   }
                   break;
                 case 0xebcdcdca:
                   if (str.equals("showText")) {
                      i = 5;
                   }
                   break;
                 case 3355:
                   if (str.equals("id")) {
                      i = 6;
                   }
                   break;
                 case 0x32affa:
                   if (str.equals("link")) {
                      i = 7;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 8;
                   }
                   break;
                 case 0x2a8c788b:
                   if (str.equals("paddingRight")) {
                      i = 9;
                   }
                   break;
                 case 0x2b7b2c99:
                   if (str.equals("trackInfo")) {
                      i = 10;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCashTag1.mPaddingLeft = KnownTypeAdapters$j.a(p0, uCashTag1.mPaddingLeft);
                   break;
                 case 1:
                   uCashTag1.mTextColor = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uCashTag1.mBackground = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uCashTag1.mPrefix = this.b.read(p0);
                   break;
                 case 4:
                   uCashTag1.mSuffix = this.b.read(p0);
                   break;
                 case 5:
                   uCashTag1.mShowText = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uCashTag1.mId = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uCashTag1.mLink = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uCashTag1.mType = KnownTypeAdapters$k.a(p0, uCashTag1.mType);
                   break;
                 case 9:
                   uCashTag1.mPaddingRight = KnownTypeAdapters$j.a(p0, uCashTag1.mPaddingRight);
                   break;
                 case 10:
                   uCashTag1.tack = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCashTag1;
       }
    }
    public void b(b p0,CashTag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CashTag$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mId);
          }
          if (p1.mShowText != null) {
             p0.r("showText");
             TypeAdapters.A.write(p0, p1.mShowText);
          }
          if (p1.mTextColor != null) {
             p0.r("txtColor");
             TypeAdapters.A.write(p0, p1.mTextColor);
          }
          if (p1.mBackground != null) {
             p0.r("background");
             TypeAdapters.A.write(p0, p1.mBackground);
          }
          p0.r("paddingLeft");
          p0.J((double)p1.mPaddingLeft);
          p0.r("paddingRight");
          p0.J((double)p1.mPaddingRight);
          if (p1.mPrefix != null) {
             p0.r("prefix");
             this.b.write(p0, p1.mPrefix);
          }
          if (p1.mSuffix != null) {
             p0.r("suffix");
             this.b.write(p0, p1.mSuffix);
          }
          if (p1.mLink != null) {
             p0.r("link");
             TypeAdapters.A.write(p0, p1.mLink);
          }
          if (p1.tack != null) {
             p0.r("trackInfo");
             this.c.write(p0, p1.tack);
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
