package com.kuaishou.android.model.mix.FusionPlayInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.FusionPlayInfo;
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

public final class FusionPlayInfo$TypeAdapter extends TypeAdapter	// class@000c95
{
    public final Gson a;
    public static final a b;

    static {
       FusionPlayInfo$TypeAdapter.b = a.get(FusionPlayInfo.class);
    }
    public void FusionPlayInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public FusionPlayInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FusionPlayInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       FusionPlayInfo uFusionPlayI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFusionPlayI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFusionPlayI;
       }else {
          p0.c();
          FusionPlayInfo uFusionPlayI1 = new FusionPlayInfo();
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
                 case 0xbc15d787:
                   if (str.equals("definition_id")) {
                      i = 1;
                   }
                   break;
                 case 0xc3893553:
                   if (str.equals("definition")) {
                      i = 2;
                   }
                   break;
                 case 0xcad54f80:
                   if (str.equals("stream")) {
                      i = 3;
                   }
                   break;
                 case 0xd436b77d:
                   if (str.equals("filesize")) {
                      i = 4;
                   }
                   break;
                 case 0xed2ff23a:
                   if (str.equals("stream_id")) {
                      i = 5;
                   }
                   break;
                 case 0xfaf4b8de:
                   if (str.equals("source_type")) {
                      i = 6;
                   }
                   break;
                 case 0x354ce0:
                   if (str.equals("rate")) {
                      i = 7;
                   }
                   break;
                 case 0x6be2dc6:
                   if (str.equals("width")) {
                      i = 8;
                   }
                   break;
                 case 0xdfb8d59:
                   if (str.equals("definition_code")) {
                      i = 9;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFusionPlayI1.mHeight = KnownTypeAdapters$k.a(p0, uFusionPlayI1.mHeight);
                   break;
                 case 1:
                   uFusionPlayI1.mDefinitionId = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uFusionPlayI1.mDefinition = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uFusionPlayI1.mStream = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uFusionPlayI1.mFilesize = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uFusionPlayI1.mStreamId = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uFusionPlayI1.mSourceType = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uFusionPlayI1.mRate = KnownTypeAdapters$k.a(p0, uFusionPlayI1.mRate);
                   break;
                 case 8:
                   uFusionPlayI1.mWidth = KnownTypeAdapters$k.a(p0, uFusionPlayI1.mWidth);
                   break;
                 case 9:
                   uFusionPlayI1.mDefinitionCode = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFusionPlayI1;
       }
    }
    public void b(b p0,FusionPlayInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FusionPlayInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mStreamId != null) {
             p0.r("stream_id");
             TypeAdapters.A.write(p0, p1.mStreamId);
          }
          if (p1.mStream != null) {
             p0.r("stream");
             TypeAdapters.A.write(p0, p1.mStream);
          }
          if (p1.mDefinitionId != null) {
             p0.r("definition_id");
             TypeAdapters.A.write(p0, p1.mDefinitionId);
          }
          if (p1.mDefinitionCode != null) {
             p0.r("definition_code");
             TypeAdapters.A.write(p0, p1.mDefinitionCode);
          }
          if (p1.mDefinition != null) {
             p0.r("definition");
             TypeAdapters.A.write(p0, p1.mDefinition);
          }
          if (p1.mSourceType != null) {
             p0.r("source_type");
             TypeAdapters.A.write(p0, p1.mSourceType);
          }
          p0.r("width");
          p0.K((long)p1.mWidth);
          p0.r("height");
          p0.K((long)p1.mHeight);
          if (p1.mFilesize != null) {
             p0.r("filesize");
             TypeAdapters.A.write(p0, p1.mFilesize);
          }
          p0.r("rate");
          p0.K((long)p1.mRate);
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
