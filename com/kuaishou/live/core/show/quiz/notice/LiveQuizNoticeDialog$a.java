package com.kuaishou.live.core.show.quiz.notice.LiveQuizNoticeDialog$a;
import sfc.a;
import com.kuaishou.live.core.show.quiz.notice.LiveQuizNoticeDialog;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import lnc.a1;
import fg2.a;
import android.view.View;
import java.lang.CharSequence;
import android.view.View$OnClickListener;
import mkc.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LiveQuizNoticeDialog$a extends a	// class@000e2a
{
    public final LiveQuizNoticeDialog c;

    public void LiveQuizNoticeDialog$a(LiveQuizNoticeDialog p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuizNoticeDialog$a.class, "1")) {
          return;
       }
       super.b(p0);
       LiveQuizNoticeDialog$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, LiveQuizNoticeDialog.class, "14")) {
          c.f(tc.O, a1.p(R.string.arg_RES_7f1038e4), new a(tc));
       }
       b.I(LiveLogTag.LIVE_QUIZ, "accept failed", p0);
       return;
    }
}
