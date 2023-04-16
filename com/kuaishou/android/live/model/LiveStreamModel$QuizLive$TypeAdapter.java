package com.kuaishou.android.live.model.LiveStreamModel$QuizLive$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$QuizLive;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$b;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.ArrayList;
import com.google.gson.stream.b;

public final class LiveStreamModel$QuizLive$TypeAdapter extends TypeAdapter	// class@000814
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LiveStreamModel$QuizLive$TypeAdapter.c = a.get(LiveStreamModel$QuizLive.class);
    }
    public void LiveStreamModel$QuizLive$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$b());
    }
    public LiveStreamModel$QuizLive a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveStreamModel$QuizLive$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveStreamModel$QuizLive quizLive = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return quizLive;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return quizLive;
       }else {
          p0.c();
          LiveStreamModel$QuizLive quizLive1 = new LiveStreamModel$QuizLive();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("invitationTypes")) {
                p0.Q();
             }else {
                quizLive1.mInvitationTypes = this.b.read(p0);
             }
          }
          p0.j();
          return quizLive1;
       }
    }
    public void b(b p0,LiveStreamModel$QuizLive p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveStreamModel$QuizLive$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mInvitationTypes != null) {
             p0.r("invitationTypes");
             this.b.write(p0, p1.mInvitationTypes);
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
