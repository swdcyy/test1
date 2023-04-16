package com.kuaishou.android.model.mix.FansTopDisplayStyle$FansTopExtData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.FansTopDisplayStyle$FansTopExtData;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class FansTopDisplayStyle$FansTopExtData$TypeAdapter extends TypeAdapter	// class@000c6a
{
    public final Gson a;
    public static final a b;

    static {
       FansTopDisplayStyle$FansTopExtData$TypeAdapter.b = a.get(FansTopDisplayStyle$FansTopExtData.class);
    }
    public void FansTopDisplayStyle$FansTopExtData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public FansTopDisplayStyle$FansTopExtData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FansTopDisplayStyle$FansTopExtData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       FansTopDisplayStyle$FansTopExtData uFansTopExtD = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFansTopExtD;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFansTopExtD;
       }else {
          p0.c();
          FansTopDisplayStyle$FansTopExtData uFansTopExtD1 = new FansTopDisplayStyle$FansTopExtData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x96e803cd:
                   if (str.equals("fans_top_play_count")) {
                      i = 0;
                   }
                   break;
                 case 0xc14ff8fa:
                   if (str.equals("fans_top_boost_running")) {
                      i = 1;
                   }
                   break;
                 case 0xe20a6ea5:
                   if (str.equals("need_alert_for_operation")) {
                      i = 2;
                   }
                   break;
                 case 0xf5c411f0:
                   if (str.equals("fans_top_like_count")) {
                      i = 3;
                   }
                   break;
                 case 0x8ddd86e:
                   if (str.equals("supporter_style")) {
                      i = 4;
                   }
                   break;
                 case 0x6e22f7fb:
                   if (str.equals("fans_top_status")) {
                      i = 5;
                   }
                   break;
                 case 0x76278b06:
                   if (str.equals("fans_top_comment_count")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFansTopExtD1.mFansTopPlayCount = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uFansTopExtD1.mFanstopBoostRunning = KnownTypeAdapters$g.a(p0, uFansTopExtD1.mFanstopBoostRunning);
                   break;
                 case 2:
                   uFansTopExtD1.mNeedAlertForOperation = KnownTypeAdapters$g.a(p0, uFansTopExtD1.mNeedAlertForOperation);
                   break;
                 case 3:
                   uFansTopExtD1.mFansTopLikeCount = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uFansTopExtD1.mSupporter_style = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uFansTopExtD1.mFansTopStatus = KnownTypeAdapters$k.a(p0, uFansTopExtD1.mFansTopStatus);
                   break;
                 case 6:
                   uFansTopExtD1.mFansTopCommentCount = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFansTopExtD1;
       }
    }
    public void b(b p0,FansTopDisplayStyle$FansTopExtData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FansTopDisplayStyle$FansTopExtData$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mSupporter_style != null) {
             p0.r("supporter_style");
             TypeAdapters.A.write(p0, p1.mSupporter_style);
          }
          if (p1.mFansTopPlayCount != null) {
             p0.r("fans_top_play_count");
             TypeAdapters.A.write(p0, p1.mFansTopPlayCount);
          }
          if (p1.mFansTopLikeCount != null) {
             p0.r("fans_top_like_count");
             TypeAdapters.A.write(p0, p1.mFansTopLikeCount);
          }
          if (p1.mFansTopCommentCount != null) {
             p0.r("fans_top_comment_count");
             TypeAdapters.A.write(p0, p1.mFansTopCommentCount);
          }
          p0.r("need_alert_for_operation");
          p0.P(p1.mNeedAlertForOperation);
          p0.r("fans_top_status");
          p0.K((long)p1.mFansTopStatus);
          p0.r("fans_top_boost_running");
          p0.P(p1.mFanstopBoostRunning);
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
