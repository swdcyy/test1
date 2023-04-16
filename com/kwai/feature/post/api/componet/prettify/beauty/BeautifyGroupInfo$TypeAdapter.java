package com.kwai.feature.post.api.componet.prettify.beauty.BeautifyGroupInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import h16.g;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class BeautifyGroupInfo$TypeAdapter extends TypeAdapter	// class@0012cc
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       BeautifyGroupInfo$TypeAdapter.c = a.get(g.class);
    }
    public void BeautifyGroupInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, BeautifyGroupInfo$TypeAdapter.class, "2");
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
             obj = new g();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xc76f1cb2:
                      if (str.equals("displayNameKey")) {
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
                    case 0x145b4fef:
                      if (str.equals("logName")) {
                         i = 3;
                      }
                      break;
                    case 0x7e2266a5:
                      if (str.equals("itemIds")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDisplayNameKey = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mId = KnownTypeAdapters$k.a(p0, obj.mId);
                      break;
                    case 2:
                      obj.mName = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mLoggerName = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mItemIds = this.b.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BeautifyGroupInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("id");
          p0.K((long)p1.mId);
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mDisplayNameKey != null) {
             p0.r("displayNameKey");
             TypeAdapters.A.write(p0, p1.mDisplayNameKey);
          }
          if (p1.mLoggerName != null) {
             p0.r("logName");
             TypeAdapters.A.write(p0, p1.mLoggerName);
          }
          if (p1.mItemIds != null) {
             p0.r("itemIds");
             this.b.write(p0, p1.mItemIds);
          }
          p0.j();
       }
       return;
    }
}
