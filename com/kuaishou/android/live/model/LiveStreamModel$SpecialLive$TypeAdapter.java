package com.kuaishou.android.live.model.LiveStreamModel$SpecialLive$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$SpecialLive;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.model.LiveStreamModel$QuizLive$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$WishRoom$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.live.model.LiveStreamModel$QuizLive;
import com.kuaishou.android.live.model.LiveStreamModel$WishRoom;
import com.kuaishou.android.live.model.LiveStreamModel$WinterOlympicSimpleLive;
import com.google.gson.stream.b;

public final class LiveStreamModel$SpecialLive$TypeAdapter extends TypeAdapter	// class@000816
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       LiveStreamModel$SpecialLive$TypeAdapter.e = a.get(LiveStreamModel$SpecialLive.class);
    }
    public void LiveStreamModel$SpecialLive$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(LiveStreamModel$QuizLive$TypeAdapter.c);
       this.c = p0.j(LiveStreamModel$WishRoom$TypeAdapter.b);
       this.d = p0.j(LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter.c);
    }
    public LiveStreamModel$SpecialLive a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveStreamModel$SpecialLive$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveStreamModel$SpecialLive specialLive = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return specialLive;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return specialLive;
       }else {
          p0.c();
          LiveStreamModel$SpecialLive specialLive1 = new LiveStreamModel$SpecialLive();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xada3e2c0:
                   if (str.equals("winterOlympicLive")) {
                      i = 0;
                   }
                   break;
                 case 0xc6468602:
                   if (str.equals("wishroom")) {
                      i = 1;
                   }
                   break;
                 case 0x352255:
                   if (str.equals("quiz")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   specialLive1.mOlympicLive = this.d.read(p0);
                   break;
                 case 1:
                   specialLive1.mWishRoom = this.c.read(p0);
                   break;
                 case 2:
                   specialLive1.mQuizLive = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return specialLive1;
       }
    }
    public void b(b p0,LiveStreamModel$SpecialLive p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveStreamModel$SpecialLive$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mQuizLive != null) {
             p0.r("quiz");
             this.b.write(p0, p1.mQuizLive);
          }
          if (p1.mWishRoom != null) {
             p0.r("wishroom");
             this.c.write(p0, p1.mWishRoom);
          }
          if (p1.mOlympicLive != null) {
             p0.r("winterOlympicLive");
             this.d.write(p0, p1.mOlympicLive);
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
