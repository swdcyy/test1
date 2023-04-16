package com.yxcorp.login.bind.fragment.a;
import android.view.View$OnClickListener;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import brd.t;
import com.kwai.framework.accountsecurity.d;
import d1d.p;
import java.util.Map;
import erd.o;
import cjd.e;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import d1d.o;
import com.yxcorp.login.bind.fragment.b;
import erd.g;
import crd.b;

public final class a implements View$OnClickListener	// class@001a5a
{
    public final ChangePhoneFragment b;

    public void a(ChangePhoneFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, ChangePhoneFragment.class, "11")) {
       }else {
          String str = TextUtils.G(tb.p).toString();
          o oo = new o(tb, str);
          d.b().flatMap(new p(tb, new HashMap(), str, TextUtils.G(tb.n).toString())).map(new e()).compose(c.c(tb.m(), FragmentEvent.DESTROY_VIEW)).subscribe(oo, new b(tb));
       }
       return;
    }
}
