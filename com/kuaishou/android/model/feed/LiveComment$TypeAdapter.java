package com.kuaishou.android.model.feed.LiveComment$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.feed.LiveComment;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.UserInfo;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LiveComment$TypeAdapter extends TypeAdapter	// class@000afd
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LiveComment$TypeAdapter.c = a.get(LiveComment.class);
    }
    public void LiveComment$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(UserInfo.class));
    }
    public LiveComment a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveComment$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveComment liveComment = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return liveComment;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return liveComment;
       }else {
          p0.c();
          LiveComment liveComment1 = new LiveComment();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("userInfo")) {
                if (!str.equals("content")) {
                   p0.Q();
                }else {
                   liveComment1.mContent = TypeAdapters.A.read(p0);
                }
             }else {
                liveComment1.mUserInfo = this.b.read(p0);
             }
          }
          p0.j();
          return liveComment1;
       }
    }
    public void b(b p0,LiveComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveComment$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mUserInfo != null) {
             p0.r("userInfo");
             this.b.write(p0, p1.mUserInfo);
          }
          if (p1.mContent != null) {
             p0.r("content");
             TypeAdapters.A.write(p0, p1.mContent);
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
