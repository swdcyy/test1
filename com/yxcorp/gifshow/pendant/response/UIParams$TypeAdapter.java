package com.yxcorp.gifshow.pendant.response.UIParams$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.pendant.response.UIParams;
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

public final class UIParams$TypeAdapter extends TypeAdapter	// class@00127b
{
    public final Gson a;
    public static final a b;

    static {
       UIParams$TypeAdapter.b = a.get(UIParams.class);
    }
    public void UIParams$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UIParams$TypeAdapter.class, "2");
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
             obj = new UIParams();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xb7389127:
                      if (str.equals("height")) {
                         i = 0;
                      }
                      break;
                    case 0xe7372142:
                      if (str.equals("taskTextBgBottom")) {
                         i = 1;
                      }
                      break;
                    case 0xf0e2183e:
                      if (str.equals("taskTextBgHeight")) {
                         i = 2;
                      }
                      break;
                    case 0x3b2cae6:
                      if (str.equals("moveDistance")) {
                         i = 3;
                      }
                      break;
                    case 0x6be2dc6:
                      if (str.equals("width")) {
                         i = 4;
                      }
                      break;
                    case 0x5d34edff:
                      if (str.equals("taskTextBgIconUrl")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mHeight = KnownTypeAdapters$k.a(p0, obj.mHeight);
                      break;
                    case 1:
                      obj.mTaskTextBgBottom = KnownTypeAdapters$k.a(p0, obj.mTaskTextBgBottom);
                      break;
                    case 2:
                      obj.mTaskTextBgHeight = KnownTypeAdapters$k.a(p0, obj.mTaskTextBgHeight);
                      break;
                    case 3:
                      obj.mMoveDistance = KnownTypeAdapters$k.a(p0, obj.mMoveDistance);
                      break;
                    case 4:
                      obj.mWidth = KnownTypeAdapters$k.a(p0, obj.mWidth);
                      break;
                    case 5:
                      obj.mTaskTextBgIconUrl = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UIParams$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("width");
          p0.K((long)p1.mWidth);
          p0.r("height");
          p0.K((long)p1.mHeight);
          p0.r("moveDistance");
          p0.K((long)p1.mMoveDistance);
          p0.r("taskTextBgHeight");
          p0.K((long)p1.mTaskTextBgHeight);
          p0.r("taskTextBgBottom");
          p0.K((long)p1.mTaskTextBgBottom);
          if (p1.mTaskTextBgIconUrl != null) {
             p0.r("taskTextBgIconUrl");
             TypeAdapters.A.write(p0, p1.mTaskTextBgIconUrl);
          }
          p0.j();
       }
       return;
    }
}
