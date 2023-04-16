package com.kuaishou.android.model.mix.SameFrameInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.SameFrameInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.mix.SameFrameModel$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.SameFrameModel;
import com.google.gson.stream.b;

public final class SameFrameInfo$TypeAdapter extends TypeAdapter	// class@000dea
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       SameFrameInfo$TypeAdapter.e = a.get(SameFrameInfo.class);
    }
    public void SameFrameInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(SameFrameModel$TypeAdapter.c);
    }
    public SameFrameInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SameFrameInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SameFrameInfo sameFrameInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return sameFrameInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return sameFrameInf;
       }else {
          p0.c();
          SameFrameInfo sameFrameInf1 = new SameFrameInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8410a57a:
                   if (str.equals("availableDepth")) {
                      i = 0;
                   }
                   break;
                 case 0xa3a73b68:
                   if (str.equals("tagInfo")) {
                      i = 1;
                   }
                   break;
                 case 0xdc8482ed:
                   if (str.equals("photoId")) {
                      i = 2;
                   }
                   break;
                 case 0xf01afcf6:
                   if (str.equals("userName")) {
                      i = 3;
                   }
                   break;
                 case 0x589a349:
                   if (str.equals("allow")) {
                      i = 4;
                   }
                   break;
                 case 0x1944ea21:
                   if (str.equals("lrcUrls")) {
                      i = 5;
                   }
                   break;
                 case 0x560aa0ca:
                   if (str.equals("currentDepth")) {
                      i = 6;
                   }
                   break;
                 case 0x5ebcb52b:
                   if (str.equals("showSameFrameCurrentTag")) {
                      i = 7;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   sameFrameInf1.mAvailableDepth = KnownTypeAdapters$k.a(p0, sameFrameInf1.mAvailableDepth);
                   break;
                 case 1:
                   sameFrameInf1.mSameFrameModel = this.d.read(p0);
                   break;
                 case 2:
                   sameFrameInf1.mOriginPhotoId = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   sameFrameInf1.mUserName = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   sameFrameInf1.mAllowSameFrame = KnownTypeAdapters$g.a(p0, sameFrameInf1.mAllowSameFrame);
                   break;
                 case 5:
                   sameFrameInf1.mLrcUrls = this.c.read(p0);
                   break;
                 case 6:
                   sameFrameInf1.mCurrentDepth = KnownTypeAdapters$k.a(p0, sameFrameInf1.mCurrentDepth);
                   break;
                 case 7:
                   sameFrameInf1.mShowSameFrameCurrentTag = KnownTypeAdapters$g.a(p0, sameFrameInf1.mShowSameFrameCurrentTag);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return sameFrameInf1;
       }
    }
    public void b(b p0,SameFrameInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SameFrameInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("allow");
          p0.P(p1.mAllowSameFrame);
          if (p1.mLrcUrls != null) {
             p0.r("lrcUrls");
             this.c.write(p0, p1.mLrcUrls);
          }
          if (p1.mOriginPhotoId != null) {
             p0.r("photoId");
             TypeAdapters.A.write(p0, p1.mOriginPhotoId);
          }
          if (p1.mUserName != null) {
             p0.r("userName");
             TypeAdapters.A.write(p0, p1.mUserName);
          }
          p0.r("availableDepth");
          p0.K((long)p1.mAvailableDepth);
          p0.r("currentDepth");
          p0.K((long)p1.mCurrentDepth);
          p0.r("showSameFrameCurrentTag");
          p0.P(p1.mShowSameFrameCurrentTag);
          if (p1.mSameFrameModel != null) {
             p0.r("tagInfo");
             this.d.write(p0, p1.mSameFrameModel);
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
