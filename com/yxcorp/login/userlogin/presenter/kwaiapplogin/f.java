package com.yxcorp.login.userlogin.presenter.kwaiapplogin.f;
import com.yxcorp.login.util.LoginPageLauncher$b;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import oe6.e;
import oe6.b;

public final class f implements LoginPageLauncher$b	// class@001bc7
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final void a(Intent p0){
       p0.putExtra("start_enter_page_animation", R.anim.arg_RES_7f010105);
       p0.putExtra("activityCloseEnterAnimation", R.anim.arg_RES_7f01010d);
       boolean b = (!e.i() && b.A() == 2)? true: false;
       p0.putExtra("IS_PHONE_PASSWORD_LOGIN", b);
       return;
    }
}
