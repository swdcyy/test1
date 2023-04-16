package com.kuaishou.android.model.mix.QRecoTag$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.QRecoTag;
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

public final class QRecoTag$TypeAdapter extends TypeAdapter	// class@000dd3
{
    public final Gson a;
    public static final a b;

    static {
       QRecoTag$TypeAdapter.b = a.get(QRecoTag.class);
    }
    public void QRecoTag$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public QRecoTag a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, QRecoTag$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       QRecoTag qRecoTag = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return qRecoTag;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return qRecoTag;
       }else {
          p0.c();
          QRecoTag qRecoTag1 = new QRecoTag();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa3a95145:
                   if (str.equals("tagName")) {
                      i = 0;
                   }
                   break;
                 case 3355:
                   if (str.equals("id")) {
                      i = 1;
                   }
                   break;
                 case 0x337a8b:
                   if (str.equals("name")) {
                      i = 2;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 3;
                   }
                   break;
                 case 0x6904a55:
                   if (str.equals("tagId")) {
                      i = 4;
                   }
                   break;
                 case 0x38b73479:
                   if (str.equals("content")) {
                      i = 5;
                   }
                   break;
                 case 0x3e45514c:
                   if (str.equals("detailId")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 5:
                   qRecoTag1.mName = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                 case 6:
                 case 4:
                   qRecoTag1.mId = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return qRecoTag1;
       }
    }
    public void b(b p0,QRecoTag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QRecoTag$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mId);
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
