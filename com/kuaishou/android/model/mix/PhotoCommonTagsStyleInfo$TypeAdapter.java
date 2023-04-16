package com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PhotoCommonTagInfo$TypeAdapter;
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
import com.kuaishou.android.model.mix.PhotoCommonTagInfo;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PhotoCommonTagsStyleInfo$TypeAdapter extends TypeAdapter	// class@000d45
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoCommonTagsStyleInfo$TypeAdapter.d = a.get(PhotoCommonTagsStyleInfo.class);
    }
    public void PhotoCommonTagsStyleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoCommonTagInfo$TypeAdapter.c);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public PhotoCommonTagsStyleInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoCommonTagsStyleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoCommonTagsStyleInfo photoCommonT = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoCommonT;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoCommonT;
       }else {
          p0.c();
          PhotoCommonTagsStyleInfo photoCommonT1 = new PhotoCommonTagsStyleInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xb220f2a9:
                   if (str.equals("extJson")) {
                      i = 0;
                   }
                   break;
                 case 0xd68cc77a:
                   if (str.equals("tailWord")) {
                      i = 1;
                   }
                   break;
                 case 0x79edcd3:
                   if (str.equals("frontWord")) {
                      i = 2;
                   }
                   break;
                 case 0x6ebaa3e4:
                   if (str.equals("matchWords")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoCommonT1.mExtJson = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   photoCommonT1.mTailWord = this.b.read(p0);
                   break;
                 case 2:
                   photoCommonT1.mFrontWord = this.b.read(p0);
                   break;
                 case 3:
                   photoCommonT1.mMatchWords = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoCommonT1;
       }
    }
    public void b(b p0,PhotoCommonTagsStyleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoCommonTagsStyleInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mFrontWord != null) {
             p0.r("frontWord");
             this.b.write(p0, p1.mFrontWord);
          }
          if (p1.mMatchWords != null) {
             p0.r("matchWords");
             this.c.write(p0, p1.mMatchWords);
          }
          if (p1.mTailWord != null) {
             p0.r("tailWord");
             this.b.write(p0, p1.mTailWord);
          }
          if (p1.mExtJson != null) {
             p0.r("extJson");
             TypeAdapters.A.write(p0, p1.mExtJson);
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
