package com.kuaishou.android.model.mix.AggregateV6Model$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.AggregateV6Model;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$IconUrl$TypeAdapter;
import com.kuaishou.android.model.mix.AggregateV6Model$TagContent$TypeAdapter;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$AggregateContentInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.AggregateV6Model$TagContent;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$AggregateContentInfo;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$IconUrl;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class AggregateV6Model$TypeAdapter extends TypeAdapter	// class@000bbb
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       AggregateV6Model$TypeAdapter.f = a.get(AggregateV6Model.class);
    }
    public void AggregateV6Model$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(ContentAggregateWeakFeed$IconUrl$TypeAdapter.b);
       this.c = p0.j(AggregateV6Model$TagContent$TypeAdapter.c);
       this.d = p0.j(ContentAggregateWeakFeed$AggregateContentInfo$TypeAdapter.c);
       this.e = p0.j(a.get(User.class));
    }
    public AggregateV6Model a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, AggregateV6Model$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       AggregateV6Model uAggregateV6 = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAggregateV6;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAggregateV6;
       }else {
          p0.c();
          AggregateV6Model uAggregateV61 = new AggregateV6Model();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xac32c159:
                   if (str.equals("avatar")) {
                      i = 0;
                   }
                   break;
                 case 0x4281c8e:
                   if (str.equals("nickName")) {
                      i = 1;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 2;
                   }
                   break;
                 case 0x1f4bb8a6:
                   if (str.equals("titleBgColor")) {
                      i = 3;
                   }
                   break;
                 case 0x2bedbc57:
                   if (str.equals("avatarRightTag")) {
                      i = 4;
                   }
                   break;
                 case 0x48b410b5:
                   if (str.equals("rightBottomInfo")) {
                      i = 5;
                   }
                   break;
                 case 0x7fadb4ec:
                   if (str.equals("leftTopTag")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAggregateV61.mUser = this.e.read(p0);
                   break;
                 case 1:
                   uAggregateV61.mNickName = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uAggregateV61.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uAggregateV61.mTitleBgColor = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uAggregateV61.mAvatarRightTag = this.b.read(p0);
                   break;
                 case 5:
                   uAggregateV61.mRightBottomInfo = this.d.read(p0);
                   break;
                 case 6:
                   uAggregateV61.mLeftTopTag = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAggregateV61;
       }
    }
    public void b(b p0,AggregateV6Model p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AggregateV6Model$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mNickName != null) {
             p0.r("nickName");
             TypeAdapters.A.write(p0, p1.mNickName);
          }
          if (p1.mAvatarRightTag != null) {
             p0.r("avatarRightTag");
             this.b.write(p0, p1.mAvatarRightTag);
          }
          if (p1.mTitleBgColor != null) {
             p0.r("titleBgColor");
             TypeAdapters.A.write(p0, p1.mTitleBgColor);
          }
          if (p1.mLeftTopTag != null) {
             p0.r("leftTopTag");
             this.c.write(p0, p1.mLeftTopTag);
          }
          if (p1.mRightBottomInfo != null) {
             p0.r("rightBottomInfo");
             this.d.write(p0, p1.mRightBottomInfo);
          }
          if (p1.mUser != null) {
             p0.r("avatar");
             this.e.write(p0, p1.mUser);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
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
