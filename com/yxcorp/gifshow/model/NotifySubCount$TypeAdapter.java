package com.yxcorp.gifshow.model.NotifySubCount$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.NotifySubCount;
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

public final class NotifySubCount$TypeAdapter extends TypeAdapter	// class@001e65
{
    public final Gson a;
    public static final a b;

    static {
       NotifySubCount$TypeAdapter.b = a.get(NotifySubCount.class);
    }
    public void NotifySubCount$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, NotifySubCount$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new NotifySubCount();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("subType")) {
                   if (!str1.equals("count")) {
                      p0.Q();
                   }else {
                      obj.mCount = KnownTypeAdapters$k.a(p0, obj.mCount);
                   }
                }else {
                   obj.mSubType = KnownTypeAdapters$k.a(p0, obj.mSubType);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NotifySubCount$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("subType");
          p0.K((long)p1.mSubType);
          p0.r("count");
          p0.K((long)p1.mCount);
          p0.j();
       }
       return;
    }
}
