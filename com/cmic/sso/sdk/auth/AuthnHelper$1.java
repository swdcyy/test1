package com.cmic.sso.sdk.auth.AuthnHelper$1;
import com.cmic.sso.sdk.e.o$a;
import com.cmic.sso.sdk.auth.AuthnHelper;
import java.lang.String;
import com.cmic.sso.sdk.e.k;
import java.lang.StringBuilder;
import com.cmic.sso.sdk.e.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import com.cmic.sso.sdk.e.b;

public class AuthnHelper$1 extends o$a	// class@000f25
{
    public final AuthnHelper a;

    public void AuthnHelper$1(AuthnHelper p0){
       this.a = p0;
       super();
    }
    public void a(){
       String str = k.b("AID", "");
       c.b("AuthnHelper", "aid = "+str);
       if (TextUtils.isEmpty(str)) {
          AuthnHelper.a(this.a);
       }
       if (b.a(AuthnHelper.b(this.a), true)) {
          c.b("AuthnHelper", "����androidkeystore�ɹ�");
       }else {
          c.b("AuthnHelper", "����androidkeystoreʧ��");
       }
       return;
    }
}
