package dg2.f;
import erd.g;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.model.LiveQuizMyStatusResponse;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import t02.a0;
import p91.m;
import com.kuaishou.android.live.log.b;
import dg2.d;
import bg2.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.StringBuilder;
import android.util.Base64;
import java.lang.Throwable;
import eg2.b;
import java.util.Objects;
import java.lang.Boolean;

public final class f implements g	// class@002513
{
    public final j b;
    public final String c;

    public void f(j p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       String obj;
       boolean b;
       byte[] uobyteArray1;
       f tb = this.b;
       f tc = this.c;
       if (tb.f == null) {
       }else {
          b.U(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "getLiveQuizMyStatus\(n/live/quiz2/myStatus\)", "mLiveStreamId", tb.a.Z2.getLiveStreamId(), "liveQuizId", tc, "response:", p0);
          tb.d.i(p0.mInvitationCode);
          j d = tb.d;
          LiveQuizMyStatusResponse mEraserKey = p0.mEraserKey;
          c uoc = c.class;
          byte[] uobyteArray = PatchProxy.applyOneRefs(mEraserKey, null, uoc, "8");
          int i = 0;
          if (uobyteArray != PatchProxyResult.class) {
          }else if(TextUtils.x(mEraserKey)){
             obj = PatchProxy.apply(null, null, uoc, "9");
             if (obj != PatchProxyResult.class) {
             }else {
                obj = QCurrentUser.ME.getId();
                if (TextUtils.x(obj)) {
                   uobyteArray1 = null;
                }else {
                   int i1 = obj.length();
                   int i2 = 16;
                   if (i1 > i2) {
                      obj = obj.substring(i, i2);
                   }
                   uobyteArray1 = (("aBcBzKBHVH7zkS4Z").substring(i, (i2 - i1))+obj).getBytes();
                }
             }
             if (obj != null) {
                uobyteArray = c.a(obj, Base64.decode(mEraserKey, 2));
             }
          }
       label_009f :
          uobyteArray = null;
          d.g = uobyteArray;
          tb.j(p0.mTotalAvailableReviveCard, p0.mQuizAvailableReviveCard);
          if (p0.mLatestQuestionNumber == null) {
             b.P(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "getLiveQuizMyStatus has not answer any quetion");
          }else if(tb.d.b().a != null){
             d = 1;
          }else {
             d = null;
          }
          if (d) {
             d = tb.d;
             Objects.requireNonNull(d);
             obj = PatchProxy.applyOneRefs(p0, d, d.class, "5");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(p0.mLatestQuestionNumber > d.c() || (p0.mLatestQuestionNumber == d.c() && (!d.c.d() && !TextUtils.x(p0.mCorrectOptionId)))){
                i = 1;
             }
          label_0101 :
             b = i;
             if (!b) {
                b.P(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "getLiveQuizMyStatus local has question and do not need resume status");
             }
          }
          j d1 = tb.d;
          b uob = PatchProxy.applyOneRefs(p0, null, b.class, "6");
          if (uob != PatchProxyResult.class) {
          }else {
             uob = new b();
             uob.a = p0.mLatestQuestionNumber;
             uob.j = p0.mMyOptionId;
             uob.k = p0.mCorrectOptionId;
             uob.g = p0.mUseReviveCardInLastQuestion;
             uob.l = true;
          }
          d1.g(uob);
       }
       return;
    }
}
