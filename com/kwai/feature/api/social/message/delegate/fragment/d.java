package com.kwai.feature.api.social.message.delegate.fragment.d;
import erd.g;
import com.kwai.feature.api.social.message.delegate.fragment.MessageConversationLazyFragment;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yv5.b;
import com.kwai.library.widget.popup.common.c;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import hka.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import wv5.b;
import java.lang.Runnable;

public final class d implements g	// class@001148
{
    public final MessageConversationLazyFragment b;

    public void d(MessageConversationLazyFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, MessageConversationLazyFragment.class, "8")) {
       }else {
          tb.y.e(true);
          p0 = tb.u;
          if (p0 != null && p0.K()) {
             tb.u.o();
          }
          tb.s.setArguments(tb.getArguments());
          tb.s.bh(tb.K0());
          if (tb.s instanceof l) {
             tb.v = tb.s;
          }
          p0 = tb.getView();
          int i = 0x7f0a36a4;
          if (p0 != null) {
             p0 = p0.findViewById(i);
             if (p0 != null && p0 instanceof ViewGroup) {
                p0.removeAllViews();
             }
          }
          p0 = tb.getChildFragmentManager().beginTransaction();
          p0.w(i, tb.s, "MESSAGE_CONVERSATION_TAB_FRAGMENT");
          p0.x(new b(tb));
          p0.m();
       }
       return;
    }
}
