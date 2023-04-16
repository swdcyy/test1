package com.yxcorp.login.userlogin.presenter.accountsecurity.h;
import erd.g;
import com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import q2b.h$b;
import o1d.b;
import k2b.u1;
import com.yxcorp.retrofit.model.KwaiException;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u07.t$a;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import java.lang.CharSequence;
import f2d.t;
import u07.u;
import com.yxcorp.login.userlogin.presenter.accountsecurity.k;
import f2d.v;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.network.exception.AntispamException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class h implements g	// class@001bac
{
    public final BindThirdPlatformPresenter b;
    public final String c;
    public final String d;
    public final String e;

    public void h(BindThirdPlatformPresenter p0,String p1,String p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       h te = this.e;
       Objects.requireNonNull(tb);
       u1.r0(b.b(tc, 8, 826, p0));
       if (p0 instanceof KwaiException && 544 == p0.mErrorCode) {
          p0 = tb.getContext();
          String str = "qq2.0";
          int i = (tc.equals(str))? 0x7f10409e: 0x7f105185;
          p0 = p0.getString(i);
          str = (tc.equals(str))? "qq": "wechat";
          String str1 = str;
          t$a uoa = new t$a(tb.getActivity());
          uoa.z(false);
          t$a uoa1 = f.e(uoa);
          Object[] objArray = new Object[]{p0};
          uoa1.z0(tb.getContext().getString(R.string.arg_RES_7f101cd5, objArray));
          uoa1.Q0(R.string.arg_RES_7f104b7d);
          uoa1.S0(R.string.arg_RES_7f1007f1);
          uoa1.t0(new t(str1));
          k ok = new k(tb, str1, tc, td, te);
          uoa1.u0(new t(str1));
          uoa1.Y(new v(tb, str1));
       }else if(!p0 instanceof AntispamException){
          ExceptionHandler.handleException(tb.getActivity(), p0);
       }
       return;
    }
}
