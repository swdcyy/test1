package com.kwai.component.kcube.model.model.BarInfo$Background$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.component.kcube.model.model.BarInfo$Background;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
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
import com.vimeo.stag.KnownTypeAdapters;
import java.lang.Integer;
import com.google.gson.stream.b;

public final class BarInfo$Background$TypeAdapter extends TypeAdapter	// class@000989
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       BarInfo$Background$TypeAdapter.d = a.get(BarInfo$Background.class);
    }
    public void BarInfo$Background$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, BarInfo$Background$TypeAdapter.class, "2");
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
             obj = new BarInfo$Background();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x94d80044:
                      if (str.equals("bgLottie")) {
                         i = 0;
                      }
                      break;
                    case 0xc04bf346:
                      if (str.equals("focusBgImg")) {
                         i = 1;
                      }
                      break;
                    case 0xcbad613c:
                      if (str.equals("focusBgLottie")) {
                         i = 2;
                      }
                      break;
                    case 0xf4ae046c:
                      if (str.equals("bgStyle")) {
                         i = 3;
                      }
                      break;
                    case 0xfb625958:
                      if (str.equals("lottieDisplayLimit")) {
                         i = 4;
                      }
                      break;
                    case 0x594f13e:
                      if (str.equals("bgImg")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.bgLottie = this.c.read(p0);
                      break;
                    case 1:
                      obj.focusBgImg = this.c.read(p0);
                      break;
                    case 2:
                      obj.focusBgLottie = this.c.read(p0);
                      break;
                    case 3:
                      obj.bgStyle = KnownTypeAdapters.c.read(p0);
                      break;
                    case 4:
                      obj.lottieDisplayLimit = KnownTypeAdapters.c.read(p0);
                      break;
                    case 5:
                      obj.bgImg = this.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BarInfo$Background$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.lottieDisplayLimit != null) {
             p0.r("lottieDisplayLimit");
             KnownTypeAdapters.c.write(p0, p1.lottieDisplayLimit);
          }
          if (p1.bgStyle != null) {
             p0.r("bgStyle");
             KnownTypeAdapters.c.write(p0, p1.bgStyle);
          }
          if (p1.bgImg != null) {
             p0.r("bgImg");
             this.c.write(p0, p1.bgImg);
          }
          if (p1.bgLottie != null) {
             p0.r("bgLottie");
             this.c.write(p0, p1.bgLottie);
          }
          if (p1.focusBgImg != null) {
             p0.r("focusBgImg");
             this.c.write(p0, p1.focusBgImg);
          }
          if (p1.focusBgLottie != null) {
             p0.r("focusBgLottie");
             this.c.write(p0, p1.focusBgLottie);
          }
          p0.j();
       }
       return;
    }
}
