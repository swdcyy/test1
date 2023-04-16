package com.kwai.components.nearbymodel.model.LocalLifestylePoi$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo;
import com.google.gson.stream.b;

public final class LocalLifestylePoi$TypeAdapter extends TypeAdapter	// class@000c8f
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LocalLifestylePoi$TypeAdapter.c = a.get(LocalLifestylePoi.class);
    }
    public void LocalLifestylePoi$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(LocalLifestylePoi$LifestyleSubTitleInfo$TypeAdapter.c);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalLifestylePoi$TypeAdapter.class, "2");
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
             obj = new LocalLifestylePoi();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x852f4c18:
                      if (str.equals("subtitle")) {
                         i = 0;
                      }
                      break;
                    case 0xd1d01e37:
                      if (str.equals("tagStyle")) {
                         i = 1;
                      }
                      break;
                    case 0x313c79:
                      if (str.equals("icon")) {
                         i = 2;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 3;
                      }
                      break;
                    case 0x516f87f1:
                      if (str.equals("newStyle")) {
                         i = 4;
                      }
                      break;
                    case 0x67c0f50f:
                      if (str.equals("darkIcon")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSubtitle = this.b.read(p0);
                      break;
                    case 1:
                      obj.mTagStyle = KnownTypeAdapters$k.a(p0, obj.mTagStyle);
                      break;
                    case 2:
                      obj.mIcon = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mTitle = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mIsNewStyle = KnownTypeAdapters$g.a(p0, obj.mIsNewStyle);
                      break;
                    case 5:
                      obj.mDarkIcon = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalLifestylePoi$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("newStyle");
          p0.P(p1.mIsNewStyle);
          if (p1.mIcon != null) {
             p0.r("icon");
             TypeAdapters.A.write(p0, p1.mIcon);
          }
          if (p1.mDarkIcon != null) {
             p0.r("darkIcon");
             TypeAdapters.A.write(p0, p1.mDarkIcon);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          p0.r("tagStyle");
          p0.K((long)p1.mTagStyle);
          if (p1.mSubtitle != null) {
             p0.r("subtitle");
             this.b.write(p0, p1.mSubtitle);
          }
          p0.j();
       }
       return;
    }
}
