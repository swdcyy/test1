package com.kuaishou.android.model.mix.QComment$LabelExtraFansGroup$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.QComment$LabelExtraFansGroup;
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

public final class QComment$LabelExtraFansGroup$TypeAdapter extends TypeAdapter	// class@000dcd
{
    public final Gson a;
    public static final a b;

    static {
       QComment$LabelExtraFansGroup$TypeAdapter.b = a.get(QComment$LabelExtraFansGroup.class);
    }
    public void QComment$LabelExtraFansGroup$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public QComment$LabelExtraFansGroup a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, QComment$LabelExtraFansGroup$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       QComment$LabelExtraFansGroup labelExtraFa = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return labelExtraFa;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return labelExtraFa;
       }else {
          p0.c();
          QComment$LabelExtraFansGroup labelExtraFa1 = new QComment$LabelExtraFansGroup();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("userLevel")) {
                p0.Q();
             }else {
                labelExtraFa1.mFansGroupUserLevel = KnownTypeAdapters$k.a(p0, labelExtraFa1.mFansGroupUserLevel);
             }
          }
          p0.j();
          return labelExtraFa1;
       }
    }
    public void b(b p0,QComment$LabelExtraFansGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QComment$LabelExtraFansGroup$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("userLevel");
          p0.K((long)p1.mFansGroupUserLevel);
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
