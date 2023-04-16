package fs2.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Number;
import kotlin.jvm.internal.a;
import qu2.a;
import co2.f2;
import java.lang.Boolean;
import yx2.d;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.utility.TextUtils;
import fs2.g;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveMusicPackage;
import yx2.n;
import qrd.l1;

public final class f	// class@0029ad
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public static final String a(int p0,int p1,int p2,int p3){
       i3 obj;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, f.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.c("first_tab", Integer.valueOf(p0));
       obj.c("second_label", Integer.valueOf(p1));
       obj.c("type", Integer.valueOf(p2));
       obj.c("live_voice_party_order_music_source", Integer.valueOf(p3));
       String str = obj.e();
       a.o(str, "JsonStringBuilder.newIns¡­\", source\)\n      .build\(\)");
       return str;
    }
    public static final void b(boolean p0,a p1,f2 p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, null, f.class, "3")) {
          return;
       }
       a.p(p1, "liveBasicContext");
       a.p(p2, "voicePartyContext");
       d uod = new d("VOICEPARTY_KTV_CHOOSE_SONG_PANEL_SEARCH_CARD", p2, p1);
       if (p0) {
          uod.f();
       }else {
          uod.g();
       }
       return;
    }
    public static final void c(int p0,int p1,a p2,f2 p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, null, f.class, "6")) {
          return;
       }
       a.p(p2, "liveContext");
       a.p(p3, "voicePartyContext");
       i3 oi3 = i3.f();
       oi3.c("first_tab", Integer.valueOf(p0));
       oi3.c("second_label", Integer.valueOf(p1));
       String str = oi3.e();
       a.o(str, "JsonStringBuilder.newIns¡­nelId\)\n          .build\(\)");
       new d("VOICEPARTY_KTV_CHOOSE_SONG_PANEL_SECOND_TAB", p3, p2).a(str).f();
       return;
    }
    public static final void d(int p0,a p1,f2 p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, f.class, "4")) {
          return;
       }
       a.p(p1, "liveBasicContext");
       a.p(p2, "voicePartyContext");
       i3 oi3 = i3.f();
       oi3.c("first_tab", Integer.valueOf(p0));
       String str = oi3.e();
       a.o(str, "JsonStringBuilder.newIns¡­st_tab\", tabType\).build\(\)");
       new d("VOICEPARTY_KTV_CHOOSE_SONG_PANEL_TAB", p2, p1).a(str).f();
       return;
    }
    public static final void e(boolean p0,Music p1,String p2,a p3,f2 p4){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uof, "7")) {
             return;
          }
       }
       a.p(p3, "liveContext");
       a.p(p4, "voicePartyContext");
       if (p1 == null) {
          return;
       }else {
          p2 = TextUtils.k(p2);
          a.o(p2, "TextUtils.emptyIfNull\(logParams\)");
          d uod = new d("VOICEPARTY_KTV_CHOOSE_SOOG_PANEL_SELECT", p4, p3).a(p2);
          p3 = PatchProxy.applyTwoRefs(uod, p1, null, g.class, "3");
          if (p3 != PatchProxyResult.class) {
             uod = p3;
          }else {
             a.p(uod, "$this$musicPackageFromMusic");
             a.p(p1, "music");
             p3.liveMusicPackage = n.f(p1);
          }
          if (p0) {
             uod.f();
          }else {
             uod.g();
          }
          return;
       }
    }
    public static final void f(f2 p0,a p1,int p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, f.class, "18")) {
          return;
       }
       a.p(p0, "voicePartyContext");
       a.p(p1, "liveBasicContext");
       d uod = g.a(new d("REVERBERATION_SUBCARD", p0, p1));
       i3 oi3 = i3.f();
       oi3.c("reverberation", Integer.valueOf(p2));
       String str = oi3.e();
       a.o(str, "JsonStringBuilder.newIns¡­Builder\)\n        .build\(\)");
       uod.a(str);
       uod.f();
       return;
    }
    public static final void g(boolean p0,f2 p1,a p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, null, f.class, "14")) {
          return;
       }
       a.p(p1, "voicePartyContext");
       a.p(p2, "liveBasicContext");
       d uod = g.a(new d("VOICE_PARTY_KTV_APPLAUD", p1, p2));
       if (p0) {
          uod.f();
       }else {
          uod.g();
       }
       return;
    }
}
