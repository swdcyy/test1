package com.kwai.feature.api.social.message.delegate.fragment.e;
import erd.g;
import com.kwai.feature.api.social.message.delegate.fragment.MessageConversationLazyFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import xv5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xv5.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.framework.activitycontext.ActivityContext;
import u07.t$a;
import android.app.Activity;
import u07.f;
import java.lang.CharSequence;
import lnc.a1;
import kotlin.jvm.internal.a;
import wv5.a;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import wv5.h;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class e implements g	// class@001149
{
    public final MessageConversationLazyFragment b;

    public void e(MessageConversationLazyFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, MessageConversationLazyFragment.class, "9")) {
       }else {
          a.b("load MessageConversationLazyFragment onFailed", p0);
          if (tb.t == null) {
             p0 = tb.getActivity();
             if (p0 != null && (tb.Ke() && (tb.x != null && ActivityContext.g().h()))) {
                p0 = f.e(new t$a(p0));
                p0.z0(b.a());
                String str = PatchProxy.apply(null, null, uob, "3");
                if (str != patchProxyRe) {
                }else {
                   str = a1.p(R.string.arg_RES_7f1042cc);
                   a.o(str, "CommonUtil.string\(R.string.retry\)");
                }
                p0.T0(str);
                String str1 = PatchProxy.apply(null, null, uob, "4");
                if (str1 != patchProxyRe) {
                }else {
                   str1 = a1.p(R.string.cancel);
                   a.o(str1, "CommonUtil.string\(R.string.cancel\)");
                }
                p0.R0(str1);
                p0.u0(new a(tb));
                p0.z(true);
                p0.A(false);
                tb.u = p0.Y(new h(tb));
             }
          }
       }
       return;
    }
}
