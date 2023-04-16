package com.kuaishou.android.model.mix.FeedFriendEntranceInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.FeedFriendEntranceInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.User;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class FeedFriendEntranceInfo$TypeAdapter extends TypeAdapter	// class@000c78
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       FeedFriendEntranceInfo$TypeAdapter.d = a.get(FeedFriendEntranceInfo.class);
    }
    public void FeedFriendEntranceInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(User.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public FeedFriendEntranceInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FeedFriendEntranceInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       FeedFriendEntranceInfo uFeedFriendE = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFeedFriendE;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFeedFriendE;
       }else {
          p0.c();
          FeedFriendEntranceInfo uFeedFriendE1 = new FeedFriendEntranceInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x82024994:
                   if (str.equals("defaultLinkUrl")) {
                      i = 0;
                   }
                   break;
                 case 0xc029e2a0:
                   if (str.equals("unreadCount")) {
                      i = 1;
                   }
                   break;
                 case 0xd89e1c97:
                   if (str.equals("defaultTitle")) {
                      i = 2;
                   }
                   break;
                 case 0xfc44beb4:
                   if (str.equals("fetchIntervals")) {
                      i = 3;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 4;
                   }
                   break;
                 case 0x6a68e08:
                   if (str.equals("users")) {
                      i = 5;
                   }
                   break;
                 case 0xa8de315:
                   if (str.equals("linkUrl")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFeedFriendE1.mDefaultLinkUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uFeedFriendE1.mUnReadCount = KnownTypeAdapters$k.a(p0, uFeedFriendE1.mUnReadCount);
                   break;
                 case 2:
                   uFeedFriendE1.mDefaultTitle = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uFeedFriendE1.mFetchIntervals = KnownTypeAdapters$n.a(p0, uFeedFriendE1.mFetchIntervals);
                   break;
                 case 4:
                   uFeedFriendE1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uFeedFriendE1.mUsers = this.c.read(p0);
                   break;
                 case 6:
                   uFeedFriendE1.mLinkUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFeedFriendE1;
       }
    }
    public void b(b p0,FeedFriendEntranceInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeedFriendEntranceInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          p0.r("fetchIntervals");
          p0.K(p1.mFetchIntervals);
          if (p1.mUsers != null) {
             p0.r("users");
             this.c.write(p0, p1.mUsers);
          }
          p0.r("unreadCount");
          p0.K((long)p1.mUnReadCount);
          if (p1.mDefaultLinkUrl != null) {
             p0.r("defaultLinkUrl");
             TypeAdapters.A.write(p0, p1.mDefaultLinkUrl);
          }
          if (p1.mDefaultTitle != null) {
             p0.r("defaultTitle");
             TypeAdapters.A.write(p0, p1.mDefaultTitle);
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
