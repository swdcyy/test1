package com.kwai.tokenshare.presenter.c;
import erd.o;
import fu7.c;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.tokenshare.presenter.a;
import io.reactivex.g;

public final class c implements o	// class@00193e
{
    public final c b;

    public void c(c p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       p0 = PatchProxy.apply(null, tb, c.class, "2");
       if (p0 != PatchProxyResult.class) {
       }else if(!QCurrentUser.ME.isLogined()){
          p0 = t.just(Boolean.FALSE);
       }else if(TextUtils.n(QCurrentUser.ME.getId(), tb.S8())){
          p0 = tb.W8();
          if (p0 == null) {
          }
       }else {
       }
       return p0;
    }
}
