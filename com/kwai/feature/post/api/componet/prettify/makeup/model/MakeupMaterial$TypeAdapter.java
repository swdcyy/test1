package com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.PassThroughParams;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.internal.bind.TypeAdapters;
import com.yxcorp.gifshow.model.OperationMaskTag$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.OperationMaskTag;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import m16.e;
import com.vimeo.stag.KnownTypeAdapters$f;
import m16.d;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;
import m16.b;
import m16.c;

public final class MakeupMaterial$TypeAdapter extends TypeAdapter	// class@0012fa
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public static final a i;

    static {
       MakeupMaterial$TypeAdapter.i = a.get(MakeupMaterial.class);
    }
    public void MakeupMaterial$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(a.get(PassThroughParams.class));
       this.e = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
       this.f = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       this.g = p0.j(OperationMaskTag$TypeAdapter.b);
       this.h = p0.j(ItemNameStyle$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, MakeupMaterial$TypeAdapter.class, "2");
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
             obj = new MakeupMaterial();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa3b20de3:
                      if (str.equals("offline")) {
                         i = 0;
                      }
                      break;
                    case 0xcba8e0df:
                      if (str.equals("imageUrls")) {
                         i = 1;
                      }
                      break;
                    case 0xce19381a:
                      if (str.equals("passThroughParams")) {
                         i = 2;
                      }
                      break;
                    case 0xe9176a12:
                      if (str.equals("resourceUrls")) {
                         i = 3;
                      }
                      break;
                    case 0xebabc40e:
                      if (str.equals("resource")) {
                         i = 4;
                      }
                      break;
                    case 0xf959b194:
                      if (str.equals("magicEmojiId")) {
                         i = 5;
                      }
                      break;
                    case 3355:
                      if (str.equals("id")) {
                         i = 6;
                      }
                      break;
                    case 0x1bf9a:
                      if (str.equals("tag")) {
                         i = 7;
                      }
                      break;
                    case 0x337a8b:
                      if (str.equals("name")) {
                         i = 8;
                      }
                      break;
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 9;
                      }
                      break;
                    case 0x5d17e04:
                      if (str.equals("fonts")) {
                         i = 10;
                      }
                      break;
                    case 0x5faa95b:
                      if (str.equals("image")) {
                         i = 11;
                      }
                      break;
                    case 0x115f08da:
                      if (str.equals("unSupportReason")) {
                         i = 12;
                      }
                      break;
                    case 0x14f51cd8:
                      if (str.equals("version")) {
                         i = 13;
                      }
                      break;
                    case 0x2c7b2757:
                      if (str.equals("childId")) {
                         i = 14;
                      }
                      break;
                    case 0x2cb3cf43:
                      if (str.equals("hdImageUrls")) {
                         i = 15;
                      }
                      break;
                    case 0x37ac75e8:
                      if (str.equals("dependSo")) {
                         i = 16;
                      }
                      break;
                    case 0x48e291e6:
                      if (str.equals("nameStyle")) {
                         i = 17;
                      }
                      break;
                    case 0x4aeb7db1:
                      if (str.equals("makeUpTag")) {
                         i = 18;
                      }
                      break;
                    case 0x55793fb1:
                      if (str.equals("magicFacePlayCount")) {
                         i = 19;
                      }
                      break;
                    case 0x5b9b5c43:
                      if (str.equals("checksum")) {
                         i = 20;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mIsOffline = KnownTypeAdapters$g.a(p0, obj.mIsOffline);
                      break;
                    case 1:
                      obj.mImages = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new d(this)).a(p0);
                      break;
                    case 2:
                      obj.mPassThroughParams = this.d.read(p0);
                      break;
                    case 3:
                      obj.mResources = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new e(this)).a(p0);
                      break;
                    case 4:
                      obj.mResource = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                    case 6:
                      obj.mId = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mTag = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mName = TypeAdapters.A.read(p0);
                      break;
                    case 9:
                      obj.mResourceType = KnownTypeAdapters$k.a(p0, obj.mResourceType);
                      break;
                    case 10:
                      obj.mFonts = this.e.read(p0);
                      break;
                    case 11:
                      obj.mImage = TypeAdapters.A.read(p0);
                      break;
                    case 12:
                      obj.mUnSupportReason = TypeAdapters.A.read(p0);
                      break;
                    case 13:
                      obj.mVersion = KnownTypeAdapters$k.a(p0, obj.mVersion);
                      break;
                    case 14:
                      obj.mChildId = TypeAdapters.A.read(p0);
                      break;
                    case 15:
                      obj.mHdImageUrls = this.c.read(p0);
                      break;
                    case 16:
                      obj.mDependSo = this.f.read(p0);
                      break;
                    case 17:
                      obj.mItemNameStyle = this.h.read(p0);
                      break;
                    case 18:
                      obj.mOperationMaskTag = this.g.read(p0);
                      break;
                    case 19:
                      obj.magicFacePlayCount = KnownTypeAdapters$n.a(p0, obj.magicFacePlayCount);
                      break;
                    case 20:
                      obj.mChecksum = KnownTypeAdapters$n.a(p0, obj.mChecksum);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MakeupMaterial$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mId);
          }
          if (p1.mChildId != null) {
             p0.r("childId");
             TypeAdapters.A.write(p0, p1.mChildId);
          }
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mImages != null) {
             p0.r("imageUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new b(this)).b(p0, p1.mImages);
          }
          if (p1.mImage != null) {
             p0.r("image");
             TypeAdapters.A.write(p0, p1.mImage);
          }
          p0.r("magicFacePlayCount");
          p0.K(p1.magicFacePlayCount);
          p0.r("version");
          p0.K((long)p1.mVersion);
          p0.r("offline");
          p0.P(p1.mIsOffline);
          p0.r("type");
          p0.K((long)p1.mResourceType);
          if (p1.mUnSupportReason != null) {
             p0.r("unSupportReason");
             TypeAdapters.A.write(p0, p1.mUnSupportReason);
          }
          if (p1.mHdImageUrls != null) {
             p0.r("hdImageUrls");
             this.c.write(p0, p1.mHdImageUrls);
          }
          if (p1.mResource != null) {
             p0.r("resource");
             TypeAdapters.A.write(p0, p1.mResource);
          }
          if (p1.mResources != null) {
             p0.r("resourceUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new c(this)).b(p0, p1.mResources);
          }
          if (p1.mTag != null) {
             p0.r("tag");
             TypeAdapters.A.write(p0, p1.mTag);
          }
          if (p1.mPassThroughParams != null) {
             p0.r("passThroughParams");
             this.d.write(p0, p1.mPassThroughParams);
          }
          p0.r("checksum");
          p0.K(p1.mChecksum);
          if (p1.mFonts != null) {
             p0.r("fonts");
             this.e.write(p0, p1.mFonts);
          }
          if (p1.mDependSo != null) {
             p0.r("dependSo");
             this.f.write(p0, p1.mDependSo);
          }
          if (p1.mOperationMaskTag != null) {
             p0.r("makeUpTag");
             this.g.write(p0, p1.mOperationMaskTag);
          }
          if (p1.mItemNameStyle != null) {
             p0.r("nameStyle");
             this.h.write(p0, p1.mItemNameStyle);
          }
          p0.j();
       }
       return;
    }
}
