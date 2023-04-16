package com.yxcorp.login.userlogin.pluginimpl.a;
import io.reactivex.g;
import com.yxcorp.login.userlogin.pluginimpl.c;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.yxcorp.login.bind.fragment.WebViewChangeVerifyFragment;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import com.yxcorp.login.userlogin.pluginimpl.b;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import d2d.n;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import androidx.fragment.app.c;
import java.lang.IllegalStateException;
import d2d.o;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams$b;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams;
import android.content.Context;
import n3d.d;
import d2d.f;
import n3d.a;

public final class a implements g	// class@001b95
{
    public final c b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final FragmentActivity l;
    public final String m;

    public void a(c p0,boolean p1,boolean p2,String p3,String p4,String p5,int p6,boolean p7,boolean p8,boolean p9,FragmentActivity p10,String p11){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
       this.l = p10;
       this.m = p11;
    }
    public final void subscribe(v p0){
       a uoa = this;
       v ov = p0;
       a b = uoa.b;
       a c = uoa.c;
       a d = uoa.d;
       a e = uoa.e;
       a f = uoa.f;
       a g = uoa.g;
       a h = uoa.h;
       a i = uoa.i;
       a j = uoa.j;
       a k = uoa.k;
       a l = uoa.l;
       a m = uoa.m;
       Objects.requireNonNull(b);
       if (c != null) {
          DialogContainerFragment uDialogConta = new DialogContainerFragment();
          uDialogConta.Jh(false);
          WebViewChangeVerifyFragment webViewChang = new WebViewChangeVerifyFragment();
          b uob = v14;
          b uob1 = v14;
          a uoa1 = l;
          uob = new b(b, d, e, f, g, c, h, i, j, k, webViewChang, uDialogConta);
          uDialogConta.Lh(uob1);
          uDialogConta.k0(new n(ov));
          boolean b1 = true;
          try{
             uDialogConta.zh(b1);
             uDialogConta.show(uoa1.getSupportFragmentManager(), "verify_phone");
          }catch(java.lang.IllegalStateException e0){
             e0.printStackTrace();
          }
          webViewChang.F = new o(uoa1, ov);
       }else {
          PhoneVerifyParams$b uob2 = new PhoneVerifyParams$b();
          uob2.i(e);
          uob2.h(m);
          uob2.j(h);
          uob2.f = d;
          uob2.b(true);
          uob2.i = i;
          b.ZD(l, uob2.a()).K(7).w(new f(ov)).h();
       }
       return;
    }
}
