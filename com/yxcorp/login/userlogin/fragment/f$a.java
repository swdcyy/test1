package com.yxcorp.login.userlogin.fragment.f$a;
import java.lang.String;
import java.lang.Object;
import android.os.Bundle;

public class f$a	// class@001b50
{
    public final Bundle a;

    public void f$a(int p0,String p1){
       super();
       Bundle uBundle = new Bundle();
       this.a = uBundle;
       uBundle.putInt("SOURCE_LOGIN", p0);
       uBundle.putString("SOURCE_EXTRA_INFO", p1);
    }
    public Bundle a(){
       return this.a;
    }
}