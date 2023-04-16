package com.kuaishou.android.model.mix.PostOperationEntranceInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PostOperationEntranceInfo;
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

public final class PostOperationEntranceInfo$TypeAdapter extends TypeAdapter	// class@000db6
{
    public final Gson a;
    public static final a b;

    static {
       PostOperationEntranceInfo$TypeAdapter.b = a.get(PostOperationEntranceInfo.class);
    }
    public void PostOperationEntranceInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PostOperationEntranceInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PostOperationEntranceInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PostOperationEntranceInfo postOperatio = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return postOperatio;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return postOperatio;
       }else {
          p0.c();
          PostOperationEntranceInfo postOperatio1 = new PostOperationEntranceInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("text")) {
                if (!str.equals("type")) {
                   p0.Q();
                }else {
                   postOperatio1.mType = TypeAdapters.A.read(p0);
                }
             }else {
                postOperatio1.mText = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return postOperatio1;
       }
    }
    public void b(b p0,PostOperationEntranceInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostOperationEntranceInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mType != null) {
             p0.r("type");
             TypeAdapters.A.write(p0, p1.mType);
          }
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
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
