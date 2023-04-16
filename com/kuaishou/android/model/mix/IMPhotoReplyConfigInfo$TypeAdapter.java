package com.kuaishou.android.model.mix.IMPhotoReplyConfigInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.IMPhotoReplyConfigInfo;
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
import com.google.gson.stream.b;

public final class IMPhotoReplyConfigInfo$TypeAdapter extends TypeAdapter	// class@000cb4
{
    public final Gson a;
    public static final a b;

    static {
       IMPhotoReplyConfigInfo$TypeAdapter.b = a.get(IMPhotoReplyConfigInfo.class);
    }
    public void IMPhotoReplyConfigInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public IMPhotoReplyConfigInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, IMPhotoReplyConfigInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       if (JsonToken.NULL == obj) {
          p0.A();
          return null;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return null;
       }else {
          p0.c();
          IMPhotoReplyConfigInfo iMPhotoReply = new IMPhotoReplyConfigInfo();
          while (p0.l()) {
             Objects.requireNonNull(p0.y());
             p0.Q();
          }
          p0.j();
          return iMPhotoReply;
       }
    }
    public void b(b p0,IMPhotoReplyConfigInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IMPhotoReplyConfigInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
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
