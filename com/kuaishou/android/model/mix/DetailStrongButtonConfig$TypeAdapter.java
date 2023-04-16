package com.kuaishou.android.model.mix.DetailStrongButtonConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.DetailStrongButtonConfig;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class DetailStrongButtonConfig$TypeAdapter extends TypeAdapter	// class@000c5a
{
    public final Gson a;
    public static final a b;

    static {
       DetailStrongButtonConfig$TypeAdapter.b = a.get(DetailStrongButtonConfig.class);
    }
    public void DetailStrongButtonConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public DetailStrongButtonConfig a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, DetailStrongButtonConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       DetailStrongButtonConfig uDetailStron = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uDetailStron;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uDetailStron;
       }else {
          p0.c();
          DetailStrongButtonConfig uDetailStron1 = new DetailStrongButtonConfig();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9285adc2:
                   if (str.equals("animationShowAfterXSeconds")) {
                      i = 0;
                   }
                   break;
                 case 0xdb31107a:
                   if (str.equals("rightIconUrl")) {
                      i = 1;
                   }
                   break;
                 case 0xfa2ebeed:
                   if (str.equals("bizType")) {
                      i = 2;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 3;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 4;
                   }
                   break;
                 case 0x4b3c2db6:
                   if (str.equals("extraParams")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uDetailStron1.mAnimationShowAfterXSeconds = KnownTypeAdapters$k.a(p0, uDetailStron1.mAnimationShowAfterXSeconds);
                   break;
                 case 1:
                   uDetailStron1.mRightIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uDetailStron1.mBizType = KnownTypeAdapters$k.a(p0, uDetailStron1.mBizType);
                   break;
                 case 3:
                   uDetailStron1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uDetailStron1.mText = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uDetailStron1.mExtraParams = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uDetailStron1;
       }
    }
    public void b(b p0,DetailStrongButtonConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DetailStrongButtonConfig$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("bizType");
          p0.K((long)p1.mBizType);
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
          }
          if (p1.mRightIconUrl != null) {
             p0.r("rightIconUrl");
             TypeAdapters.A.write(p0, p1.mRightIconUrl);
          }
          if (p1.mExtraParams != null) {
             p0.r("extraParams");
             TypeAdapters.A.write(p0, p1.mExtraParams);
          }
          p0.r("animationShowAfterXSeconds");
          p0.K((long)p1.mAnimationShowAfterXSeconds);
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
