package kd1.c;
import bq5.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.sendgift.LiveAudienceSendGiftInfo;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import dp3.g;
import dp3.f;
import android.animation.Animator;
import bq5.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.bottombubble.notices.gift.LiveAudienceSendGiftPromptView;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import qrd.l1;

public final class c implements b	// class@002cf8
{
    public LiveAudienceSendGiftPromptView b;
    public final LiveAudienceSendGiftInfo c;
    public final a d;

    public void c(LiveAudienceSendGiftInfo p0,a p1){
       a.p(p0, "info");
       a.p(p1, "onSendGiftButtonClick");
       super();
       this.c = p0;
       this.d = p1;
    }
    public void A(int p0){
       f.b(this, p0);
    }
    public Animator a(){
       return a.b(this);
    }
    public int b(){
       return a.f(this);
    }
    public void c(){
       f.c(this);
    }
    public Animator d(){
       return a.a(this);
    }
    public void e(){
       f.d(this);
    }
    public View getView(){
       c obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("view");
       }
       return obj;
    }
    public int h(){
       return 2;
    }
    public void i(LayoutInflater p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d0a98, p1, false);
       Objects.requireNonNull(view, "null cannot be cast to non-null type com.kuaishou.live.common.core.component.bottombubble.notices.gift.LiveAudienceSendGiftPromptView");
       view.setNoticeInfo(this.c);
       view.setOnGiftPromptClickListener(this.d);
       this.b = view;
       return;
    }
    public int r(){
       return a.d(this);
    }
    public int z(){
       return a.e(this);
    }
}
