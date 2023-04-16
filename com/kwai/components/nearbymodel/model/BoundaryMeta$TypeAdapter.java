package com.kwai.components.nearbymodel.model.BoundaryMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.BoundaryMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.nearbymodel.model.BoundaryText;
import com.kwai.components.nearbymodel.model.BoundaryBlankCard;
import com.kwai.components.nearbymodel.model.BoundaryButton;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.stream.b;

public final class BoundaryMeta$TypeAdapter extends TypeAdapter	// class@000c64
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       BoundaryMeta$TypeAdapter.f = a.get(BoundaryMeta.class);
    }
    public void BoundaryMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(BoundaryText.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(a.get(BoundaryBlankCard.class));
       this.e = p0.j(a.get(BoundaryButton.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, BoundaryMeta$TypeAdapter.class, "2");
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
             obj = new BoundaryMeta();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xade22732:
                      if (str.equals("button")) {
                         i = 0;
                      }
                      break;
                    case 0x2efe91:
                      if (str.equals("desc")) {
                         i = 1;
                      }
                      break;
                    case 0x68b1db1:
                      if (str.equals("style")) {
                         i = 2;
                      }
                      break;
                    case 0x6226b684:
                      if (str.equals("blankCard")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mButton = this.e.read(p0);
                      break;
                    case 1:
                      obj.mDesc = this.c.read(p0);
                      break;
                    case 2:
                      obj.mStyle = KnownTypeAdapters$k.a(p0, obj.mStyle);
                      break;
                    case 3:
                      obj.mBlankCard = this.d.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BoundaryMeta$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mDesc != null) {
             p0.r("desc");
             this.c.write(p0, p1.mDesc);
          }
          p0.r("style");
          p0.K((long)p1.mStyle);
          if (p1.mBlankCard != null) {
             p0.r("blankCard");
             this.d.write(p0, p1.mBlankCard);
          }
          if (p1.mButton != null) {
             p0.r("button");
             this.e.write(p0, p1.mButton);
          }
          p0.j();
       }
       return;
    }
}
