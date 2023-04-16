package fr1.b$c;
import androidx.lifecycle.Observer;
import fr1.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel$MemberCountdownState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaTagLayoutConfig;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView$a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaTagLayoutConfig$a;
import androidx.lifecycle.MutableLiveData;
import lnc.a1;
import dr1.a;
import dr1.a$a;
import er1.a;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import yh3.a;
import java.lang.Boolean;

public final class b$c implements Observer	// class@00238c
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       boolean b;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, str)) {
       }else {
          b$c tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "3")) {
             if (tb.v0()) {
                tb.w0();
                tb.h.setValue(LiveMultiLineArenaTagLayoutConfig.h.a());
             }else {
                String str1 = null;
                if (p0 == LiveMultiLineArenaLineMemberModel$MemberCountdownState.TIMEOUT) {
                   String str2 = a1.p(R.string.arg_RES_7f101df3);
                   a.o(str2, "CommonUtil.string\(R.stri¡­e_arena_line_perform_end\)");
                   tb.u0(R.string.arg_RES_7f1025b4, str1, str2, a.f.b());
                   tb.h.setValue(LiveMultiLineArenaTagLayoutConfig.h.a());
                }else if(p0 == LiveMultiLineArenaLineMemberModel$MemberCountdownState.RUNNING){
                   b h = tb.h;
                   LiveMultiLineArenaTagLayoutConfig$a h1 = LiveMultiLineArenaTagLayoutConfig.h;
                   Objects.requireNonNull(h1);
                   LiveMultiLineIconTextView$a uoa = PatchProxy.apply(str1, h1, LiveMultiLineArenaTagLayoutConfig$a.class, str);
                   if (uoa == PatchProxyResult.class) {
                      uoa = LiveMultiLineArenaTagLayoutConfig.a.getValue();
                   }
                   h.setValue(uoa);
                }
             }
             MutableLiveData mutableLiveD = tb.r0(tb.g);
             b = (p0 == LiveMultiLineArenaLineMemberModel$MemberCountdownState.RUNNING || p0 == LiveMultiLineArenaLineMemberModel$MemberCountdownState.TIMEOUT)? true: false;
             mutableLiveD.setValue(Boolean.valueOf(b));
          }
       }
       return;
    }
}
