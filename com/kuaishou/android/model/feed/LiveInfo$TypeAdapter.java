package com.kuaishou.android.model.feed.LiveInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.feed.LiveInfo;
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

public final class LiveInfo$TypeAdapter extends TypeAdapter	// class@000b0b
{
    public final Gson a;
    public static final a b;

    static {
       LiveInfo$TypeAdapter.b = a.get(LiveInfo.class);
    }
    public void LiveInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public LiveInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveInfo liveInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return liveInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return liveInfo;
       }else {
          p0.c();
          LiveInfo liveInfo1 = new LiveInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 0;
                   }
                   break;
                 case 0x3007ee6a:
                   if (str.equals("contentColor")) {
                      i = 1;
                   }
                   break;
                 case 0x38b73479:
                   if (str.equals("content")) {
                      i = 2;
                   }
                   break;
                 case 0x6667f520:
                   if (str.equals("leftIcon")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   liveInfo1.mType = KnownTypeAdapters$k.a(p0, liveInfo1.mType);
                   break;
                 case 1:
                   liveInfo1.mColor = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   liveInfo1.mContent = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   liveInfo1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return liveInfo1;
       }
    }
    public void b(b p0,LiveInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mIconUrl != null) {
             p0.r("leftIcon");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mContent != null) {
             p0.r("content");
             TypeAdapters.A.write(p0, p1.mContent);
          }
          if (p1.mColor != null) {
             p0.r("contentColor");
             TypeAdapters.A.write(p0, p1.mColor);
          }
          p0.r("type");
          p0.K((long)p1.mType);
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
