package d61.g;
import java.lang.Object;
import com.kuaishou.android.live.model.Race;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.l;
import java.util.ArrayList;
import com.kuaishou.android.live.model.Round;
import com.kuaishou.android.live.model.Horse;
import java.util.List;
import android.view.View;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.ViewParent;
import com.kwai.library.widget.popup.common.c;
import java.lang.Long;
import java.lang.Throwable;
import android.util.Log;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.exception.ServerException;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.QLivePlayConfig;
import io7.c;
import com.kwai.sdk.switchconfig.a;
import android.app.Activity;
import java.lang.Boolean;
import java.lang.Iterable;
import qk.m;
import d61.g$a;
import ok.h;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.CommonMeta;

public class g	// class@001f1d
{

    public void g(){
       super();
    }
    public static Race a(){
       Object obj = PatchProxy.apply(null, null, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Race race = new Race();
       race.mRounds = new ArrayList();
       Round round = new Round();
       round.mTimeout = 0x2710;
       round.mHorses = new ArrayList();
       Horse horse = new Horse();
       horse.mHostAndPort = l.g("long_connection_host", "");
       round.mHorses.add(horse);
       race.mRounds.add(round);
       return race;
    }
    public static void b(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "10")) {
          return;
       }
       if (p0 == null) {
          b.Z(LiveLogTag.LIVE_RECYCLER_VIEW_HOLDER, "view is null £º "+p1);
          return;
       }else if(p0.getParent() != null){
          b.Z(LiveLogTag.LIVE_RECYCLER_VIEW_HOLDER, "view parent is not null £º "+p1);
       }
       return;
    }
    public static void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "12")) {
          return;
       }
       if (p0 != null && p0.K()) {
          p0.q(0);
       }
       return;
    }
    public static String d(long p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, og, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = (p0 - 10 < 0)? "0"+p0: String.valueOf(p0);
       return str;
    }
    public static String e(Throwable p0){
       String obj = PatchProxy.applyOneRefs(p0, null, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Log.getStackTraceString(p0);
       if (p0 instanceof KwaiException) {
          obj = p0.getErrorCode()+"";
       }else if(p0 instanceof ServerException){
          obj = p0.errorCode+p0.errorMessage;
       }
       return obj;
    }
    public static int f(LiveStreamFeed p0){
       p0 = p0.mConfig;
       if (p0 == null) {
          return 0;
       }
       return p0.mPatternType;
    }
    public static c g(){
       Object obj = PatchProxy.apply(null, null, g.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().u("SOURCE_LIVE");
    }
    public static boolean h(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.isFinishing() || p0.isDestroyed()))? true: false;
       return b;
    }
    public static boolean i(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof KwaiException) {
          return b;
       }
       if (p0.getErrorCode() != 109 && (p0.getErrorCode() != 606 && (p0.getErrorCode() != 64 && (p0.getErrorCode() != 3 && (p0.getErrorCode() != 63 && (p0.getErrorCode() != 108 && (p0.getErrorCode() != 0x13957 && (p0.getErrorCode() != 0x13958 && (p0.getErrorCode() != 0x13c83 && (p0.getErrorCode() == 0x13c7d || p0.getErrorCode() == 0x15f78)))))))))) {
          b = true;
       }
       return b;
    }
    public static boolean j(LiveStreamFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (g.f(p0) == 5)? true: false;
       return b;
    }
    public static List k(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(m.s(p0).F(new g$a()).B());
    }
    public static void l(LiveStreamFeedWrapper p0,QLivePlayConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "2")) {
          return;
       }
       LiveStreamFeedWrapper mEntity = p0.mEntity;
       if (mEntity != null && (mEntity.mCommonMeta != null && !TextUtils.x(p1.mServerExpTag))) {
          p0.mEntity.mCommonMeta.mServerExpTag = p1.mServerExpTag;
       }
    label_0024 :
       if (TextUtils.x(p1.getLiveStreamId())) {
          return;
       }else if(TextUtils.n(p1.getLiveStreamId(), p0.getLiveStreamId())){
          return;
       }else {
          p0.setLiveStreamId(p1.getLiveStreamId());
          return;
       }
    }
}
