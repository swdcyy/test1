package com.kuaishou.android.model.mix.CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$HeadUrlModel;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter$a;

public final class CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter extends TypeAdapter	// class@000c23
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter.c = a.get(CoverCommonTagLabelModel$HeadUrlModel.class);
    }
    public void CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public CoverCommonTagLabelModel$HeadUrlModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoverCommonTagLabelModel$HeadUrlModel headUrlModel = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return headUrlModel;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return headUrlModel;
       }else {
          p0.c();
          CoverCommonTagLabelModel$HeadUrlModel headUrlModel1 = new CoverCommonTagLabelModel$HeadUrlModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("headUrl")) {
                p0.Q();
             }else {
                headUrlModel1.mHeadUrl = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter$b(this)).a(p0);
             }
          }
          p0.j();
          return headUrlModel1;
       }
    }
    public void b(b p0,CoverCommonTagLabelModel$HeadUrlModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mHeadUrl != null) {
             p0.r("headUrl");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter$a(this)).b(p0, p1.mHeadUrl);
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
