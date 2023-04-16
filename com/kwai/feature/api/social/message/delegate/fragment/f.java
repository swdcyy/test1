package com.kwai.feature.api.social.message.delegate.fragment.f;
import erd.o;
import com.kwai.feature.api.social.message.delegate.fragment.MessageConversationLazyFragment;
import java.lang.Object;
import java.io.Serializable;
import java.util.Objects;
import xv5.c;
import yv5.b;
import vv5.k1;
import java.lang.Class;
import brd.a0;
import xv5.e;
import xp6.m;
import brd.z;
import wv5.e;
import brd.t;
import com.kwai.feature.api.social.message.delegate.fragment.e;
import erd.g;
import java.lang.Boolean;

public final class f implements o	// class@00114a
{
    public final MessageConversationLazyFragment b;

    public void f(MessageConversationLazyFragment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (!c.d()) {
          tb.y.g();
       }
       return e.i(k1.class, 40).G(m.a).C(new e(tb)).d0().doOnError(new e(tb)).onErrorReturnItem(Boolean.FALSE);
    }
}
