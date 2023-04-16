package com.yxcorp.gifshow.nebula.model.SideBarButton$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.nebula.model.SideBarButton;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class SideBarButton$TypeAdapter extends TypeAdapter	// class@002154
{
    public final Gson a;
    public static final a b;

    static {
       SideBarButton$TypeAdapter.b = a.get(SideBarButton.class);
    }
    public void SideBarButton$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SideBarButton$TypeAdapter.class, "2");
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
             obj = new SideBarButton();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 3355:
                      if (str.equals("id")) {
                         i = 0;
                      }
                      break;
                    case 0x313c79:
                      if (str.equals("icon")) {
                         i = 1;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 2;
                      }
                      break;
                    case 0x1c503083:
                      if (str.equals("showFloatWidget")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mId = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mIconUrl = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mTitle = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mShowFloatWidget = KnownTypeAdapters$g.a(p0, obj.mShowFloatWidget);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SideBarButton$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mIconUrl != null) {
             p0.r("icon");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mId);
          }
          p0.r("showFloatWidget");
          p0.P(p1.mShowFloatWidget);
          p0.j();
       }
       return;
    }
}
