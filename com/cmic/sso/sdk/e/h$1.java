package com.cmic.sso.sdk.e.h$1;
import com.cmic.sso.sdk.e.o$a;
import android.content.Context;
import java.lang.String;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.e.h;

public final class h$1 extends o$a	// class@000f60
{
    public final Context a;
    public final String b;
    public final String c;

    public void h$1(Context p0,String p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(){
       c.b("PhoneScripUtils", "start save scrip to sp in sub thread");
       h.a(this.a, this.b, h.c(), this.c);
    }
}
