package com.kuaishou.android.model.mix.PhotoLiveRemindInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoLiveRemindInfo;
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

public final class PhotoLiveRemindInfo$TypeAdapter extends TypeAdapter	// class@000d52
{
    public final Gson a;
    public static final a b;

    static {
       PhotoLiveRemindInfo$TypeAdapter.b = a.get(PhotoLiveRemindInfo.class);
    }
    public void PhotoLiveRemindInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoLiveRemindInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoLiveRemindInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoLiveRemindInfo photoLiveRem = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoLiveRem;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoLiveRem;
       }else {
          p0.c();
          PhotoLiveRemindInfo photoLiveRem1 = new PhotoLiveRemindInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 0;
                   }
                   break;
                 case 0x50cb09e8:
                   if (str.equals("playbackText")) {
                      i = 1;
                   }
                   break;
                 case 0x54801439:
                   if (str.equals("liveText")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoLiveRem1.mJumpUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   photoLiveRem1.mPlaybackText = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   photoLiveRem1.mLiveText = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoLiveRem1;
       }
    }
    public void b(b p0,PhotoLiveRemindInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoLiveRemindInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLiveText != null) {
             p0.r("liveText");
             TypeAdapters.A.write(p0, p1.mLiveText);
          }
          if (p1.mJumpUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mJumpUrl);
          }
          if (p1.mPlaybackText != null) {
             p0.r("playbackText");
             TypeAdapters.A.write(p0, p1.mPlaybackText);
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
