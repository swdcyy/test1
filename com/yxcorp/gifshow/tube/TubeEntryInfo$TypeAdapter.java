package com.yxcorp.gifshow.tube.TubeEntryInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.tube.TubeEntryInfo;
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
import com.google.gson.stream.b;

public final class TubeEntryInfo$TypeAdapter extends TypeAdapter	// class@001e0f
{
    public final Gson a;
    public static final a b;

    static {
       TubeEntryInfo$TypeAdapter.b = a.get(TubeEntryInfo.class);
    }
    public void TubeEntryInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, TubeEntryInfo$TypeAdapter.class, "2");
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
             obj = new TubeEntryInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xd466b664:
                      if (str.equals("handpickTubeIds")) {
                         i = 0;
                      }
                      break;
                    case 0x19f85:
                      if (str.equals("koi")) {
                         i = 1;
                      }
                      break;
                    case 0x6f415f8:
                      if (str.equals("hasEntry")) {
                         i = 2;
                      }
                      break;
                    case 0x333a8669:
                      if (str.equals("pageType")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mHandpickTubeIds = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mKoi = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mHasEntry = KnownTypeAdapters$g.a(p0, obj.mHasEntry);
                      break;
                    case 3:
                      obj.mPageType = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TubeEntryInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("hasEntry");
          p0.P(p1.mHasEntry);
          if (p1.mHandpickTubeIds != null) {
             p0.r("handpickTubeIds");
             TypeAdapters.A.write(p0, p1.mHandpickTubeIds);
          }
          if (p1.mPageType != null) {
             p0.r("pageType");
             TypeAdapters.A.write(p0, p1.mPageType);
          }
          if (p1.mKoi != null) {
             p0.r("koi");
             TypeAdapters.A.write(p0, p1.mKoi);
          }
          p0.j();
       }
       return;
    }
}
