package com.kuaishou.android.live.model.VoicePartyMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.live.model.VoicePartyMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.live.model.VoicePartyChannel;
import com.kuaishou.android.live.model.VoicePartyMeta$VoicePartyFeedBackgroundColor;
import com.kuaishou.android.live.model.VoicePartyMeta$VoicePartyPicture;
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
import java.util.List;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class VoicePartyMeta$TypeAdapter extends TypeAdapter	// class@00083a
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public static final a g;

    static {
       VoicePartyMeta$TypeAdapter.g = a.get(VoicePartyMeta.class);
    }
    public void VoicePartyMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(User.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(a.get(VoicePartyChannel.class));
       this.e = p0.j(a.get(VoicePartyMeta$VoicePartyFeedBackgroundColor.class));
       this.f = p0.j(a.get(VoicePartyMeta$VoicePartyPicture.class));
    }
    public VoicePartyMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, VoicePartyMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       VoicePartyMeta voicePartyMe = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return voicePartyMe;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return voicePartyMe;
       }else {
          p0.c();
          VoicePartyMeta voicePartyMe1 = new VoicePartyMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x87c405c0:
                   if (str.equals("voicePartyUserAge")) {
                      i = 0;
                   }
                   break;
                 case 0x9a5d6016:
                   if (str.equals("voicePartyPic")) {
                      i = 1;
                   }
                   break;
                 case 0x9a5d6e26:
                   if (str.equals("voicePartyTag")) {
                      i = 2;
                   }
                   break;
                 case 0xbc95058f:
                   if (str.equals("voicePartyChannel")) {
                      i = 3;
                   }
                   break;
                 case 0xc940bd05:
                   if (str.equals("voicePartyContent")) {
                      i = 4;
                   }
                   break;
                 case 0xc9f526d7:
                   if (str.equals("displayDistance")) {
                      i = 5;
                   }
                   break;
                 case 0xd36e5d0f:
                   if (str.equals("voicePartyId")) {
                      i = 6;
                   }
                   break;
                 case 0xe99f1869:
                   if (str.equals("isNearBy")) {
                      i = 7;
                   }
                   break;
                 case 0xf0a35d82:
                   if (str.equals("voicePartyPlayType")) {
                      i = 8;
                   }
                   break;
                 case 0x4685f2a7:
                   if (str.equals("voicePartyTopUsers")) {
                      i = 9;
                   }
                   break;
                 case 0x4a45ba77:
                   if (str.equals("musicStatus")) {
                      i = 10;
                   }
                   break;
                 case 0x4cb7f6d5:
                   if (str.equals("backgroundColor")) {
                      i = 11;
                   }
                   break;
                 case 0x7849ba80:
                   if (str.equals("voicePartyLabel")) {
                      i = 12;
                   }
                   break;
                 case 0x78be5de4:
                   if (str.equals("voicePartyTitle")) {
                      i = 13;
                   }
                   break;
                 case 0x78d0c994:
                   if (str.equals("voicePartyUsers")) {
                      i = 14;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   voicePartyMe1.mVoicePartyUserAge = KnownTypeAdapters$k.a(p0, voicePartyMe1.mVoicePartyUserAge);
                   break;
                 case 1:
                   voicePartyMe1.mVoicePartyPic = this.f.read(p0);
                   break;
                 case 2:
                   voicePartyMe1.mVoicePartyTag = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   voicePartyMe1.mVoicePartyChannel = this.d.read(p0);
                   break;
                 case 4:
                   voicePartyMe1.mVoicePartyContent = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   voicePartyMe1.mDisplayDistance = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   voicePartyMe1.mVoicePartyId = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   voicePartyMe1.mIsNearBy = KnownTypeAdapters$g.a(p0, voicePartyMe1.mIsNearBy);
                   break;
                 case 8:
                   voicePartyMe1.mVoicePartyPlayType = KnownTypeAdapters$k.a(p0, voicePartyMe1.mVoicePartyPlayType);
                   break;
                 case 9:
                   voicePartyMe1.mVoicePartyTopUsers = this.c.read(p0);
                   break;
                 case 10:
                   voicePartyMe1.mMusicStatus = KnownTypeAdapters$k.a(p0, voicePartyMe1.mMusicStatus);
                   break;
                 case 11:
                   voicePartyMe1.mBackgroundColor = this.e.read(p0);
                   break;
                 case 12:
                   voicePartyMe1.mVoicePartyLabel = TypeAdapters.A.read(p0);
                   break;
                 case 13:
                   voicePartyMe1.mVoicePartyTitle = TypeAdapters.A.read(p0);
                   break;
                 case 14:
                   voicePartyMe1.mUsers = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return voicePartyMe1;
       }
    }
    public void b(b p0,VoicePartyMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("voicePartyPlayType");
          p0.K((long)p1.mVoicePartyPlayType);
          if (p1.mVoicePartyTitle != null) {
             p0.r("voicePartyTitle");
             TypeAdapters.A.write(p0, p1.mVoicePartyTitle);
          }
          if (p1.mVoicePartyContent != null) {
             p0.r("voicePartyContent");
             TypeAdapters.A.write(p0, p1.mVoicePartyContent);
          }
          if (p1.mVoicePartyTag != null) {
             p0.r("voicePartyTag");
             TypeAdapters.A.write(p0, p1.mVoicePartyTag);
          }
          p0.r("musicStatus");
          p0.K((long)p1.mMusicStatus);
          if (p1.mUsers != null) {
             p0.r("voicePartyUsers");
             this.c.write(p0, p1.mUsers);
          }
          p0.r("voicePartyUserAge");
          p0.K((long)p1.mVoicePartyUserAge);
          p0.r("isNearBy");
          p0.P(p1.mIsNearBy);
          if (p1.mVoicePartyChannel != null) {
             p0.r("voicePartyChannel");
             this.d.write(p0, p1.mVoicePartyChannel);
          }
          if (p1.mVoicePartyId != null) {
             p0.r("voicePartyId");
             TypeAdapters.A.write(p0, p1.mVoicePartyId);
          }
          if (p1.mBackgroundColor != null) {
             p0.r("backgroundColor");
             this.e.write(p0, p1.mBackgroundColor);
          }
          if (p1.mDisplayDistance != null) {
             p0.r("displayDistance");
             TypeAdapters.A.write(p0, p1.mDisplayDistance);
          }
          if (p1.mVoicePartyLabel != null) {
             p0.r("voicePartyLabel");
             TypeAdapters.A.write(p0, p1.mVoicePartyLabel);
          }
          if (p1.mVoicePartyPic != null) {
             p0.r("voicePartyPic");
             this.f.write(p0, p1.mVoicePartyPic);
          }
          if (p1.mVoicePartyTopUsers != null) {
             p0.r("voicePartyTopUsers");
             this.c.write(p0, p1.mVoicePartyTopUsers);
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
