package com.yxcorp.gifshow.model.ExtractFrameVerify$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.ExtractFrameVerify;
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
import com.vimeo.stag.KnownTypeAdapters$j;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class ExtractFrameVerify$TypeAdapter extends TypeAdapter	// class@001e0e
{
    public final Gson a;
    public static final a b;

    static {
       ExtractFrameVerify$TypeAdapter.b = a.get(ExtractFrameVerify.class);
    }
    public void ExtractFrameVerify$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ExtractFrameVerify$TypeAdapter.class, "2");
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
             obj = new ExtractFrameVerify();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x839f370b:
                      if (str.equals("needExtract")) {
                         i = 0;
                      }
                      break;
                    case 0xb7389127:
                      if (str.equals("height")) {
                         i = 1;
                      }
                      break;
                    case 0x6be2dc6:
                      if (str.equals("width")) {
                         i = 2;
                      }
                      break;
                    case 0x1715dc5d:
                      if (str.equals("maxFrameNum")) {
                         i = 3;
                      }
                      break;
                    case 0x26d0c0ff:
                      if (str.equals("quality")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mNeedExtract = KnownTypeAdapters$k.a(p0, obj.mNeedExtract);
                      break;
                    case 1:
                      obj.mPhotoHeight = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mPhotoWidth = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mMaxFragmeNum = KnownTypeAdapters$k.a(p0, obj.mMaxFragmeNum);
                      break;
                    case 4:
                      obj.mQuality = KnownTypeAdapters$j.a(p0, obj.mQuality);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExtractFrameVerify$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("needExtract");
          p0.K((long)p1.mNeedExtract);
          p0.r("quality");
          p0.J((double)p1.mQuality);
          if (p1.mPhotoWidth != null) {
             p0.r("width");
             TypeAdapters.A.write(p0, p1.mPhotoWidth);
          }
          if (p1.mPhotoHeight != null) {
             p0.r("height");
             TypeAdapters.A.write(p0, p1.mPhotoHeight);
          }
          p0.r("maxFrameNum");
          p0.K((long)p1.mMaxFragmeNum);
          p0.j();
       }
       return;
    }
}
