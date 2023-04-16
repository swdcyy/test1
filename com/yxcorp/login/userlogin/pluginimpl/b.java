package com.yxcorp.login.userlogin.pluginimpl.b;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.yxcorp.login.userlogin.pluginimpl.c;
import java.lang.String;
import com.yxcorp.login.bind.fragment.WebViewChangeVerifyFragment;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import d2d.v;

public class b implements DialogContainerFragment$b	// class@001b96
{
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final WebViewChangeVerifyFragment j;
    public final DialogContainerFragment k;
    public final c l;

    public void b(c p0,boolean p1,String p2,String p3,String p4,boolean p5,int p6,boolean p7,boolean p8,boolean p9,WebViewChangeVerifyFragment p10,DialogContainerFragment p11){
       this.l = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       this.h = p8;
       this.i = p9;
       this.j = p10;
       this.k = p11;
       super();
    }
    public Fragment a(){
       Bundle obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       obj.putBoolean("showResetMobileLink", this.a);
       obj.putString("title", this.b);
       obj.putString("prompt", this.c);
       obj.putString("submit_text", this.d);
       obj.putBoolean("pop_back_submit", this.e);
       obj.putInt("type", this.f);
       obj.putBoolean("need_mobile", this.g);
       obj.putBoolean("mAccountSecurityVerify", this.h);
       obj.putBoolean("need_verify", this.i);
       b tj = this.j;
       tj.G = new v(this.k);
       tj.setArguments(obj);
       return this.j;
    }
}
