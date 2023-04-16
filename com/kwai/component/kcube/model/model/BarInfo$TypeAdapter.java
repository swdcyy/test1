package com.kwai.component.kcube.model.model.BarInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.component.kcube.model.model.BarInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.component.kcube.model.model.BarInfo$Invalid$TypeAdapter;
import com.kwai.component.kcube.model.model.BarInfo$Bubble$TypeAdapter;
import com.kwai.component.kcube.model.model.BarInfo$Background$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kwai.component.kcube.model.model.BarInfo$Invalid;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters;
import java.lang.Integer;
import com.kwai.component.kcube.model.model.BarInfo$Background;
import com.kwai.component.kcube.model.model.BarInfo$Bubble;
import com.google.gson.stream.b;

public final class BarInfo$TypeAdapter extends TypeAdapter	// class@00098f
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       BarInfo$TypeAdapter.e = a.get(BarInfo.class);
    }
    public void BarInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(BarInfo$Invalid$TypeAdapter.b);
       this.c = p0.j(BarInfo$Bubble$TypeAdapter.b);
       this.d = p0.j(BarInfo$Background$TypeAdapter.d);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, BarInfo$TypeAdapter.class, "2");
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
             obj = new BarInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa362dbc0:
                      if (str.equals("tabName")) {
                         i = 0;
                      }
                      break;
                    case 0xadd9b48c:
                      if (str.equals("bubble")) {
                         i = 1;
                      }
                      break;
                    case 0xb098552e:
                      if (str.equals("background")) {
                         i = 2;
                      }
                      break;
                    case 0x32affa:
                      if (str.equals("link")) {
                         i = 3;
                      }
                      break;
                    case 0x5519ab0:
                      if (str.equals("dynamicEffect")) {
                         i = 4;
                      }
                      break;
                    case 0x6903790:
                      if (str.equals("tabId")) {
                         i = 5;
                      }
                      break;
                    case 0x561af489:
                      if (str.equals("tabNameEn")) {
                         i = 6;
                      }
                      break;
                    case 0x561af64f:
                      if (str.equals("tabNameTc")) {
                         i = 7;
                      }
                      break;
                    case 0x69bf22f7:
                      if (str.equals("enterSubPage")) {
                         i = 8;
                      }
                      break;
                    case 0x74cff1f7:
                      if (str.equals("invalid")) {
                         i = 9;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.tabName = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.bubble = this.c.read(p0);
                      break;
                    case 2:
                      obj.background = this.d.read(p0);
                      break;
                    case 3:
                      obj.link = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.dynamicEffect = KnownTypeAdapters$g.a(p0, obj.dynamicEffect);
                      break;
                    case 5:
                      obj.tabId = KnownTypeAdapters.c.read(p0);
                      break;
                    case 6:
                      obj.tabNameEn = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.tabNameTc = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.enterSubPage = KnownTypeAdapters$g.a(p0, obj.enterSubPage);
                      break;
                    case 9:
                      obj.invalid = this.b.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BarInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.tabId != null) {
             p0.r("tabId");
             KnownTypeAdapters.c.write(p0, p1.tabId);
          }
          if (p1.tabName != null) {
             p0.r("tabName");
             TypeAdapters.A.write(p0, p1.tabName);
          }
          if (p1.tabNameEn != null) {
             p0.r("tabNameEn");
             TypeAdapters.A.write(p0, p1.tabNameEn);
          }
          if (p1.tabNameTc != null) {
             p0.r("tabNameTc");
             TypeAdapters.A.write(p0, p1.tabNameTc);
          }
          if (p1.link != null) {
             p0.r("link");
             TypeAdapters.A.write(p0, p1.link);
          }
          p0.r("enterSubPage");
          p0.P(p1.enterSubPage);
          if (p1.invalid != null) {
             p0.r("invalid");
             this.b.write(p0, p1.invalid);
          }
          if (p1.bubble != null) {
             p0.r("bubble");
             this.c.write(p0, p1.bubble);
          }
          if (p1.background != null) {
             p0.r("background");
             this.d.write(p0, p1.background);
          }
          p0.r("dynamicEffect");
          p0.P(p1.dynamicEffect);
          p0.j();
       }
       return;
    }
}
