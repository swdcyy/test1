package com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LeftIconWh$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LeftIconWh;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class CoverCommonTagLabelModel$LeftIconWh$TypeAdapter extends TypeAdapter	// class@000c2b
{
    public final Gson a;
    public static final a b;

    static {
       CoverCommonTagLabelModel$LeftIconWh$TypeAdapter.b = a.get(CoverCommonTagLabelModel$LeftIconWh.class);
    }
    public void CoverCommonTagLabelModel$LeftIconWh$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public CoverCommonTagLabelModel$LeftIconWh a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoverCommonTagLabelModel$LeftIconWh$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoverCommonTagLabelModel$LeftIconWh leftIconWh = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return leftIconWh;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return leftIconWh;
       }else {
          p0.c();
          CoverCommonTagLabelModel$LeftIconWh leftIconWh1 = new CoverCommonTagLabelModel$LeftIconWh();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("h")) {
                if (!str.equals("w")) {
                   p0.Q();
                }else {
                   leftIconWh1.mWidth = KnownTypeAdapters$k.a(p0, leftIconWh1.mWidth);
                }
             }else {
                leftIconWh1.mHeight = KnownTypeAdapters$k.a(p0, leftIconWh1.mHeight);
             }
          }
          p0.j();
          return leftIconWh1;
       }
    }
    public void b(b p0,CoverCommonTagLabelModel$LeftIconWh p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverCommonTagLabelModel$LeftIconWh$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("w");
          p0.K((long)p1.mWidth);
          p0.r("h");
          p0.K((long)p1.mHeight);
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
