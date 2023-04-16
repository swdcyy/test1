package com.yxcorp.gifshow.follow.common.data.FollowResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import nga.j;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.follow.common.data.UserRecommendResponse;
import com.yxcorp.gifshow.follow.common.data.FeedsResponse$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.yxcorp.gifshow.follow.common.data.FeedsResponse;
import com.google.gson.stream.b;

public final class FollowResponse$TypeAdapter extends TypeAdapter	// class@00101a
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       FollowResponse$TypeAdapter.d = a.get(j.class);
    }
    public void FollowResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(FeedsResponse$TypeAdapter.d);
       this.c = p0.j(a.get(UserRecommendResponse.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FollowResponse$TypeAdapter.class, "2");
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
             obj = new j();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("userRecommend")) {
                   if (!str1.equals("feedsResponse")) {
                      p0.Q();
                   }else {
                      obj.mFeedsResponse = this.b.read(p0);
                   }
                }else {
                   obj.mRecommendResponse = this.c.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mFeedsResponse != null) {
             p0.r("feedsResponse");
             this.b.write(p0, p1.mFeedsResponse);
          }
          if (p1.mRecommendResponse != null) {
             p0.r("userRecommend");
             this.c.write(p0, p1.mRecommendResponse);
          }
          p0.j();
       }
       return;
    }
}
