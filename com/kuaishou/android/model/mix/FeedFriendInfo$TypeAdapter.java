package com.kuaishou.android.model.mix.FeedFriendInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.HyperTag$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.HyperTag;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class FeedFriendInfo$TypeAdapter extends TypeAdapter	// class@000c7c
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       FeedFriendInfo$TypeAdapter.c = a.get(FeedFriendInfo.class);
    }
    public void FeedFriendInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(HyperTag$TypeAdapter.g);
    }
    public FeedFriendInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FeedFriendInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       FeedFriendInfo uFeedFriendI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFeedFriendI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFeedFriendI;
       }else {
          p0.c();
          FeedFriendInfo uFeedFriendI1 = new FeedFriendInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xd00c7019:
                   if (str.equals("unreadFinishTip")) {
                      i = 0;
                   }
                   break;
                 case 0x19b09f3a:
                   if (str.equals("enableUnreadFinishTipBackToPrePage")) {
                      i = 1;
                   }
                   break;
                 case 0x29898350:
                   if (str.equals("hasRead")) {
                      i = 2;
                   }
                   break;
                 case 0x35b815f6:
                   if (str.equals("oldFeedTip")) {
                      i = 3;
                   }
                   break;
                 case 0x6c550cc7:
                   if (str.equals("unreadFinishTipHyperTag")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFeedFriendI1.mUnreadFinishTips = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uFeedFriendI1.mBackToPrePage = KnownTypeAdapters$g.a(p0, uFeedFriendI1.mBackToPrePage);
                   break;
                 case 2:
                   uFeedFriendI1.mHasRead = KnownTypeAdapters$g.a(p0, uFeedFriendI1.mHasRead);
                   break;
                 case 3:
                   uFeedFriendI1.mOldFeedTips = this.b.read(p0);
                   break;
                 case 4:
                   uFeedFriendI1.mUnreadFinishHyperTag = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFeedFriendI1;
       }
    }
    public void b(b p0,FeedFriendInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeedFriendInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hasRead");
          p0.P(p1.mHasRead);
          if (p1.mUnreadFinishTips != null) {
             p0.r("unreadFinishTip");
             TypeAdapters.A.write(p0, p1.mUnreadFinishTips);
          }
          if (p1.mUnreadFinishHyperTag != null) {
             p0.r("unreadFinishTipHyperTag");
             this.b.write(p0, p1.mUnreadFinishHyperTag);
          }
          if (p1.mOldFeedTips != null) {
             p0.r("oldFeedTip");
             this.b.write(p0, p1.mOldFeedTips);
          }
          p0.r("enableUnreadFinishTipBackToPrePage");
          p0.P(p1.mBackToPrePage);
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
