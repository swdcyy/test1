package com.kuaishou.android.model.mix.QComment$LabelExtra$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.QComment$LabelExtra;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.QComment$LabelExtraFansGroup$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.QComment$LabelExtraFansGroup;
import com.google.gson.stream.b;

public final class QComment$LabelExtra$TypeAdapter extends TypeAdapter	// class@000dcb
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       QComment$LabelExtra$TypeAdapter.c = a.get(QComment$LabelExtra.class);
    }
    public void QComment$LabelExtra$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(QComment$LabelExtraFansGroup$TypeAdapter.b);
    }
    public QComment$LabelExtra a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, QComment$LabelExtra$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       QComment$LabelExtra labelExtra = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return labelExtra;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return labelExtra;
       }else {
          p0.c();
          QComment$LabelExtra labelExtra1 = new QComment$LabelExtra();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("fansGroup")) {
                p0.Q();
             }else {
                labelExtra1.mFansGroup = this.b.read(p0);
             }
          }
          p0.j();
          return labelExtra1;
       }
    }
    public void b(b p0,QComment$LabelExtra p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QComment$LabelExtra$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mFansGroup != null) {
             p0.r("fansGroup");
             this.b.write(p0, p1.mFansGroup);
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
