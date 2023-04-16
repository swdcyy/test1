package com.kuaishou.android.model.mix.FansTopDisplayStyle$FansTopRecommendUsers$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.FansTopDisplayStyle$FansTopRecommendUsers;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class FansTopDisplayStyle$FansTopRecommendUsers$TypeAdapter extends TypeAdapter	// class@000c6c
{
    public final Gson a;
    public static final a b;

    static {
       FansTopDisplayStyle$FansTopRecommendUsers$TypeAdapter.b = a.get(FansTopDisplayStyle$FansTopRecommendUsers.class);
    }
    public void FansTopDisplayStyle$FansTopRecommendUsers$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public FansTopDisplayStyle$FansTopRecommendUsers a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FansTopDisplayStyle$FansTopRecommendUsers$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       FansTopDisplayStyle$FansTopRecommendUsers uFansTopReco = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFansTopReco;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFansTopReco;
       }else {
          p0.c();
          FansTopDisplayStyle$FansTopRecommendUsers uFansTopReco1 = new FansTopDisplayStyle$FansTopRecommendUsers();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("user_id")) {
                p0.Q();
             }else {
                uFansTopReco1.mFansTopRecommendUserId = KnownTypeAdapters$n.a(p0, uFansTopReco1.mFansTopRecommendUserId);
             }
          }
          p0.j();
          return uFansTopReco1;
       }
    }
    public void b(b p0,FansTopDisplayStyle$FansTopRecommendUsers p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FansTopDisplayStyle$FansTopRecommendUsers$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("user_id");
          p0.K(p1.mFansTopRecommendUserId);
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
