package com.kuaishou.android.model.mix.FeedSwitchesInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.FeedSwitchesInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class FeedSwitchesInfo$TypeAdapter extends TypeAdapter	// class@000c7e
{
    public final Gson a;
    public static final a b;

    static {
       FeedSwitchesInfo$TypeAdapter.b = a.get(FeedSwitchesInfo.class);
    }
    public void FeedSwitchesInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public FeedSwitchesInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FeedSwitchesInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       FeedSwitchesInfo uFeedSwitche = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFeedSwitche;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFeedSwitche;
       }else {
          p0.c();
          FeedSwitchesInfo uFeedSwitche1 = new FeedSwitchesInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8ce256ed:
                   if (str.equals("enablePictureCommentForPhoto")) {
                      i = 0;
                   }
                   break;
                 case 0xff03de2f:
                   if (str.equals("likeActivityResourceId")) {
                      i = 1;
                   }
                   break;
                 case 0x3b47cc96:
                   if (str.equals("disableCommentLikeAnimation")) {
                      i = 2;
                   }
                   break;
                 case 0x494653d2:
                   if (str.equals("disable61ActivityAnimation")) {
                      i = 3;
                   }
                   break;
                 case 0x6edc2620:
                   if (str.equals("enablePlayerPanel")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFeedSwitche1.mEnablePictureCommentForPhoto = KnownTypeAdapters$g.a(p0, uFeedSwitche1.mEnablePictureCommentForPhoto);
                   break;
                 case 1:
                   uFeedSwitche1.mLikeActivityResourceId = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uFeedSwitche1.mDisableCommentLikeAnimation = KnownTypeAdapters$g.a(p0, uFeedSwitche1.mDisableCommentLikeAnimation);
                   break;
                 case 3:
                   uFeedSwitche1.mDisable61ActivityAnimation = KnownTypeAdapters$g.a(p0, uFeedSwitche1.mDisable61ActivityAnimation);
                   break;
                 case 4:
                   uFeedSwitche1.mEnablePlayerPanel = KnownTypeAdapters$g.a(p0, uFeedSwitche1.mEnablePlayerPanel);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFeedSwitche1;
       }
    }
    public void b(b p0,FeedSwitchesInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeedSwitchesInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("enablePlayerPanel");
          p0.P(p1.mEnablePlayerPanel);
          if (p1.mLikeActivityResourceId != null) {
             p0.r("likeActivityResourceId");
             TypeAdapters.A.write(p0, p1.mLikeActivityResourceId);
          }
          p0.r("disable61ActivityAnimation");
          p0.P(p1.mDisable61ActivityAnimation);
          p0.r("enablePictureCommentForPhoto");
          p0.P(p1.mEnablePictureCommentForPhoto);
          p0.r("disableCommentLikeAnimation");
          p0.P(p1.mDisableCommentLikeAnimation);
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
