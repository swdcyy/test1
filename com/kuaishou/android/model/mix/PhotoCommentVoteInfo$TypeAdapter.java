package com.kuaishou.android.model.mix.PhotoCommentVoteInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCommentVoteInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PhotoCommentVoteInfo$Option;
import com.kuaishou.android.model.mix.PhotoCommentVoteInfo$UserVoteStatus;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.List;
import com.google.gson.stream.b;

public final class PhotoCommentVoteInfo$TypeAdapter extends TypeAdapter	// class@000d34
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       PhotoCommentVoteInfo$TypeAdapter.e = a.get(PhotoCommentVoteInfo.class);
    }
    public void PhotoCommentVoteInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(PhotoCommentVoteInfo$Option.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(a.get(PhotoCommentVoteInfo$UserVoteStatus.class));
    }
    public PhotoCommentVoteInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoCommentVoteInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoCommentVoteInfo photoComment = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoComment;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoComment;
       }else {
          p0.c();
          PhotoCommentVoteInfo photoComment1 = new PhotoCommentVoteInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8eeb408f:
                   if (str.equals("starter")) {
                      i = 0;
                   }
                   break;
                 case 0xb586869e:
                   if (str.equals("options")) {
                      i = 1;
                   }
                   break;
                 case 0xeac6867b:
                   if (str.equals("endTimestamp")) {
                      i = 2;
                   }
                   break;
                 case 3355:
                   if (str.equals("id")) {
                      i = 3;
                   }
                   break;
                 case 0x343cd4:
                   if (str.equals("over")) {
                      i = 4;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 5;
                   }
                   break;
                 case 0x696cd2f:
                   if (str.equals("topic")) {
                      i = 6;
                   }
                   break;
                 case 0x1018172e:
                   if (str.equals("nParticipants")) {
                      i = 7;
                   }
                   break;
                 case 0x5ede639d:
                   if (str.equals("userStatus")) {
                      i = 8;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoComment1.mStarter = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   photoComment1.mOptionList = this.c.read(p0);
                   break;
                 case 2:
                   photoComment1.mEndTimeStamp = KnownTypeAdapters$n.a(p0, photoComment1.mEndTimeStamp);
                   break;
                 case 3:
                   photoComment1.mId = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   photoComment1.mIsVoteFinish = KnownTypeAdapters$g.a(p0, photoComment1.mIsVoteFinish);
                   break;
                 case 5:
                   photoComment1.mType = KnownTypeAdapters$k.a(p0, photoComment1.mType);
                   break;
                 case 6:
                   photoComment1.mTopic = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   photoComment1.mParticipants = KnownTypeAdapters$k.a(p0, photoComment1.mParticipants);
                   break;
                 case 8:
                   photoComment1.mUserVoteStatus = this.d.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoComment1;
       }
    }
    public void b(b p0,PhotoCommentVoteInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoCommentVoteInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mId);
          }
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mTopic != null) {
             p0.r("topic");
             TypeAdapters.A.write(p0, p1.mTopic);
          }
          if (p1.mStarter != null) {
             p0.r("starter");
             TypeAdapters.A.write(p0, p1.mStarter);
          }
          p0.r("nParticipants");
          p0.K((long)p1.mParticipants);
          p0.r("endTimestamp");
          p0.K(p1.mEndTimeStamp);
          p0.r("over");
          p0.P(p1.mIsVoteFinish);
          if (p1.mOptionList != null) {
             p0.r("options");
             this.c.write(p0, p1.mOptionList);
          }
          if (p1.mUserVoteStatus != null) {
             p0.r("userStatus");
             this.d.write(p0, p1.mUserVoteStatus);
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
