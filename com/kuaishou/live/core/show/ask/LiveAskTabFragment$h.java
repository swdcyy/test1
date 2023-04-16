package com.kuaishou.live.core.show.ask.LiveAskTabFragment$h;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.ask.model.LiveAskAndChatTabConfig;
import ok.x;
import java.lang.Boolean;

public final class LiveAskTabFragment$h implements View$OnClickListener	// class@0009c1
{
    public final LiveAskTabFragment b;

    public void LiveAskTabFragment$h(LiveAskTabFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       Boolean uBoolean;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAskTabFragment$h.class, "1")) {
          return;
       }
       LiveAskTabFragment$h tb = this.b;
       if (tb.M != null) {
          a.o(i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1002e4)), "KSToast.applyStyle\(R.sty¡­tring.author_locked_ask\)\)");
       }else {
          LiveAskTabFragment u0 = tb.U0;
          if (u0 != null) {
             LiveAskAndChatTabConfig mIsForbidden = u0.mIsForbiddenCommentSupplier;
             if (mIsForbidden != null) {
                uBoolean = mIsForbidden.get();
             label_0035 :
                a.m(uBoolean);
                if (uBoolean.booleanValue()) {
                   i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101e01));
                }
             }
          }
          uBoolean = null;
          goto label_0035 ;
       }
       return;
    }
}
