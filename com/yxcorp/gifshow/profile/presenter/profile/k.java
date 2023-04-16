package com.yxcorp.gifshow.profile.presenter.profile.k;
import lkd.b;
import com.yxcorp.gifshow.profile.presenter.profile.l;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import lnc.a1;
import java.lang.StringBuilder;
import j4c.h;
import android.view.View$OnClickListener;
import l3c.g;

public final class k implements b	// class@00155f
{
    public final l a;

    public void k(l p0){
       this.a = p0;
    }
    public final Object get(){
       k ta = this.a;
       Objects.requireNonNull(ta);
       String str = PatchProxy.apply(null, ta, l.class, "16");
       if (str != PatchProxyResult.class) {
       }else if(ta.p != null){
          str = a1.p(R.string.arg_RES_7f10396b);
       }else {
          str = g.a(a1.p(R.string.arg_RES_7f103e91)+"\r\n"+a1.p(R.string.arg_RES_7f103f1b), false, new h(ta));
       }
       return str;
    }
}
