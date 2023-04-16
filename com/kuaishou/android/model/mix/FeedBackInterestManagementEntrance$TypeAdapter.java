package com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance;
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

public final class FeedBackInterestManagementEntrance$TypeAdapter extends TypeAdapter	// class@000c74
{
    public final Gson a;
    public static final a b;

    static {
       FeedBackInterestManagementEntrance$TypeAdapter.b = a.get(FeedBackInterestManagementEntrance.class);
    }
    public void FeedBackInterestManagementEntrance$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public FeedBackInterestManagementEntrance a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FeedBackInterestManagementEntrance$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       FeedBackInterestManagementEntrance uFeedBackInt = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFeedBackInt;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFeedBackInt;
       }else {
          p0.c();
          FeedBackInterestManagementEntrance uFeedBackInt1 = new FeedBackInterestManagementEntrance();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x932ef43c:
                   if (str.equals("TCText")) {
                      i = 0;
                   }
                   break;
                 case 0xcb38370b:
                   if (str.equals("ENGText")) {
                      i = 1;
                   }
                   break;
                 case 0xa8de315:
                   if (str.equals("linkUrl")) {
                      i = 2;
                   }
                   break;
                 case 0x57d7c6db:
                   if (str.equals("CHSText")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFeedBackInt1.mTCText = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uFeedBackInt1.mENGText = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uFeedBackInt1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uFeedBackInt1.mCHSText = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFeedBackInt1;
       }
    }
    public void b(b p0,FeedBackInterestManagementEntrance p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeedBackInterestManagementEntrance$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCHSText != null) {
             p0.r("CHSText");
             TypeAdapters.A.write(p0, p1.mCHSText);
          }
          if (p1.mTCText != null) {
             p0.r("TCText");
             TypeAdapters.A.write(p0, p1.mTCText);
          }
          if (p1.mENGText != null) {
             p0.r("ENGText");
             TypeAdapters.A.write(p0, p1.mENGText);
          }
          if (p1.mUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mUrl);
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
