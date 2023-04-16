package com.kuaishou.android.model.mix.CoverCommonTagLabelModel$RightSideExtraText$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$RightSideExtraText;
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
import com.google.gson.stream.b;

public final class CoverCommonTagLabelModel$RightSideExtraText$TypeAdapter extends TypeAdapter	// class@000c2d
{
    public final Gson a;
    public static final a b;

    static {
       CoverCommonTagLabelModel$RightSideExtraText$TypeAdapter.b = a.get(CoverCommonTagLabelModel$RightSideExtraText.class);
    }
    public void CoverCommonTagLabelModel$RightSideExtraText$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public CoverCommonTagLabelModel$RightSideExtraText a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoverCommonTagLabelModel$RightSideExtraText$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoverCommonTagLabelModel$RightSideExtraText rightSideExt = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return rightSideExt;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return rightSideExt;
       }else {
          p0.c();
          CoverCommonTagLabelModel$RightSideExtraText rightSideExt1 = new CoverCommonTagLabelModel$RightSideExtraText();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("text")) {
                p0.Q();
             }else {
                rightSideExt1.text = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return rightSideExt1;
       }
    }
    public void b(b p0,CoverCommonTagLabelModel$RightSideExtraText p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverCommonTagLabelModel$RightSideExtraText$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.text != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.text);
          }
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
