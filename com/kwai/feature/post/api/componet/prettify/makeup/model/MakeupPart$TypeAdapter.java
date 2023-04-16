package com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import m16.j;
import com.vimeo.stag.KnownTypeAdapters$f;
import java.util.List;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
import com.google.gson.internal.bind.TypeAdapters;
import m16.i;
import com.google.gson.stream.b;
import m16.g;
import m16.h;

public final class MakeupPart$TypeAdapter extends TypeAdapter	// class@0012fc
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       MakeupPart$TypeAdapter.f = a.get(MakeupPart.class);
    }
    public void MakeupPart$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
       TypeAdapter typeAdapter = p0.j(MakeupMaterial$TypeAdapter.i);
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.e = p0.j(ItemNameStyle$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, MakeupPart$TypeAdapter.class, "2");
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
             obj = new MakeupPart();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xcba8e0df:
                      if (str.equals("imageUrls")) {
                         i = 0;
                      }
                      break;
                    case 3355:
                      if (str.equals("id")) {
                         i = 1;
                      }
                      break;
                    case 0x337a8b:
                      if (str.equals("name")) {
                         i = 2;
                      }
                      break;
                    case 0x48e291e6:
                      if (str.equals("nameStyle")) {
                         i = 3;
                      }
                      break;
                    case 0x5c326009:
                      if (str.equals("magicFaces")) {
                         i = 4;
                      }
                      break;
                    case 0x671ccc84:
                      if (str.equals("selectedImageUrls")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mImageUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new i(this)).a(p0);
                      break;
                    case 1:
                      obj.mId = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mName = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mItemNameStyle = this.e.read(p0);
                      break;
                    case 4:
                      obj.mMaterials = this.d.read(p0);
                      break;
                    case 5:
                      obj.mSelectedImageUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new j(this)).a(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MakeupPart$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mId);
          }
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mImageUrls != null) {
             p0.r("imageUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new g(this)).b(p0, p1.mImageUrls);
          }
          if (p1.mSelectedImageUrls != null) {
             p0.r("selectedImageUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new h(this)).b(p0, p1.mSelectedImageUrls);
          }
          if (p1.mMaterials != null) {
             p0.r("magicFaces");
             this.d.write(p0, p1.mMaterials);
          }
          if (p1.mItemNameStyle != null) {
             p0.r("nameStyle");
             this.e.write(p0, p1.mItemNameStyle);
          }
          p0.j();
       }
       return;
    }
}
