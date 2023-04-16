package com.yxcorp.gifshow.pendant.response.WatchVideoStyle$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.pendant.response.WatchVideoStyle;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class WatchVideoStyle$TypeAdapter extends TypeAdapter	// class@00127d
{
    public final Gson a;
    public static final a b;

    static {
       WatchVideoStyle$TypeAdapter.b = a.get(WatchVideoStyle.class);
    }
    public void WatchVideoStyle$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, WatchVideoStyle$TypeAdapter.class, "2");
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
             obj = new WatchVideoStyle();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xb631005d:
                      if (str.equals("progressBarColor")) {
                         i = 0;
                      }
                      break;
                    case 0xc65d0d62:
                      if (str.equals("backgroundImageUrl")) {
                         i = 1;
                      }
                      break;
                    case 0xcb3dace8:
                      if (str.equals("progressBackgroundColor")) {
                         i = 2;
                      }
                      break;
                    case 0xf8f4125f:
                      if (str.equals("progressCycleMillis")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mProgressBarColor = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mBackgroundImageUrl = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mProgressBackgroundColor = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mProgressCycleMillis = KnownTypeAdapters$n.a(p0, obj.mProgressCycleMillis);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WatchVideoStyle$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mBackgroundImageUrl != null) {
             p0.r("backgroundImageUrl");
             TypeAdapters.A.write(p0, p1.mBackgroundImageUrl);
          }
          p0.r("progressCycleMillis");
          p0.K(p1.mProgressCycleMillis);
          if (p1.mProgressBarColor != null) {
             p0.r("progressBarColor");
             TypeAdapters.A.write(p0, p1.mProgressBarColor);
          }
          if (p1.mProgressBackgroundColor != null) {
             p0.r("progressBackgroundColor");
             TypeAdapters.A.write(p0, p1.mProgressBackgroundColor);
          }
          p0.j();
       }
       return;
    }
}
