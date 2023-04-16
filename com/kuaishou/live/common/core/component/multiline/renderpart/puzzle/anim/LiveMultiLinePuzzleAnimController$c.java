package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$c;
import as1.j;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController;
import java.lang.Object;
import as1.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$showAnswerStartAnim$1;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnswerAnimKt;
import com.kwai.robust.PatchProxyResult;
import yr1.c;
import ls1.d;
import java.lang.Boolean;
import msd.l;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleWebpAnim;
import com.yxcorp.gifshow.image.KwaiImageView;
import yr1.d;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle$State;
import as1.d;
import as1.a;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import java.util.ArrayList;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.util.List;
import android.view.ViewGroup;

public final class LiveMultiLinePuzzleAnimController$c implements j	// class@00159b
{
    public final LiveMultiLinePuzzleAnimController b;

    public void LiveMultiLinePuzzleAnimController$c(LiveMultiLinePuzzleAnimController p0){
       this.b = p0;
       super();
    }
    public void G1(){
       i.e(this);
    }
    public void P1(){
       i.a(this);
    }
    public void Q(){
       i.d(this);
    }
    public void g0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiLinePuzzleAnimController$c.class, "1")) {
          return;
       }
       LiveMultiLinePuzzleAnimController$c tb = this.b;
       LiveMultiLinePuzzleAnimController k = tb.k;
       if (k == null) {
          a.S("animView");
       }
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(k, tb, LiveMultiLinePuzzleAnimController.class, "7")) {
          b.Z(LiveLogTag.LIVE_LINE_PUZZLE, "showAnswerStartAnim");
          LiveMultiLinePuzzleAnimController r = tb.r;
          LiveMultiLinePuzzleAnimController$showAnswerStartAnim$1 oshowAnswerS = new LiveMultiLinePuzzleAnimController$showAnswerStartAnim$1(tb);
          Object[] objArray1 = PatchProxy.applyThreeRefs(k, r, oshowAnswerS, null, LiveMultiLinePuzzleAnswerAnimKt.class, "1");
          if (objArray1 != PatchProxyResult.class) {
          }else {
             a.p(k, "targetView");
             a.p(r, "resourceManager");
             a.p(oshowAnswerS, "animationCallBack");
             String str = "start_animation.webp";
             if (!r.c(str, objArray)) {
                oshowAnswerS.invoke(Boolean.TRUE);
             }else {
                objArray = new LiveMultiLinePuzzleWebpAnim(k, r, str, oshowAnswerS);
             }
             objArray1 = objArray;
          }
          if (objArray1 != null) {
             tb.W2().b(objArray1);
          }
       }
       return;
    }
    public void o1(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiLinePuzzleAnimController$c.class, "2")) {
          return;
       }
       i.f(this);
       if (this.b.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.RESUMED)) {
          LiveMultiLinePuzzleAnimController$c tb = this.b;
          d uod = tb.q.r();
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(uod, tb, LiveMultiLinePuzzleAnimController.class, "9") || (tb.q.j() == 2 && uod != null)) {
             String str = uod.a();
             String str1 = "";
             if (str == null) {
                str = str1;
             }
             LivePuzzleUserInfo livePuzzleUs = uod.c(str);
             i = 0;
             LivePuzzleUserInfo livePuzzleUs1 = (livePuzzleUs != null)? livePuzzleUs.answerIdThisTime: 0;
             if (livePuzzleUs != null) {
                LivePuzzleUserInfo thisTimeBeWo = livePuzzleUs.thisTimeBeWonAuthorId;
                if (thisTimeBeWo != null) {
                   objArray = new ArrayList(thisTimeBeWo.length);
                   int len = thisTimeBeWo.length;
                   for (; i < len; i = i + 1) {
                      objArray.add(String.valueOf(thisTimeBeWo[i]));
                   }
                }
             }
             b.e0(LiveLogTag.LIVE_LINE_PUZZLE, "observeAnswerQuestion", "answererId", str, "answerIdThisTime", Integer.valueOf(livePuzzleUs1), "winUserIds", objArray);
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             if (!TextUtils.n(str, qCurrentUser.getId()) && livePuzzleUs1) {
                LiveMultiLinePuzzleAnimController j = tb.j;
                if (j == null) {
                   a.S("container");
                }
                if (livePuzzleUs != null) {
                   livePuzzleUs = livePuzzleUs.player;
                   if (livePuzzleUs != null) {
                      UserInfos$UserInfo userName = livePuzzleUs.userName;
                      if (userName != null) {
                         str1 = userName;
                      }
                   }
                }
                c uoc = LiveMultiLinePuzzleAnswerAnimKt.a(j, str1, String.valueOf(livePuzzleUs1), tb.r, tb.Y2(objArray));
                if (uoc != null) {
                   tb.W2().b(uoc);
                }
             }
          }
       }
    label_00c9 :
       return;
    }
    public void u2(){
       i.b(this);
    }
}
