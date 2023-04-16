package com.alipay.sdk.m.q.b$b;
import android.content.pm.PackageInfo;
import java.lang.String;
import java.lang.Object;
import s6.a;
import android.content.pm.Signature;
import com.alipay.sdk.m.q.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import k6.a;

public final class b$b	// class@000e9e
{
    public final PackageInfo a;
    public final int b;
    public final String c;

    public void b$b(PackageInfo p0,int p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean a(){
       boolean b = (this.a.versionCode < this.b)? true: false;
       return b;
    }
    public boolean b(a p0){
       PackageInfo signatures = this.a.signatures;
       boolean b = false;
       if (signatures != null && signatures.length) {
          int len = signatures.length;
          int i = 0;
          while (i < len) {
             String str = b.e(p0, signatures[i].toByteArray());
             if (str != null && !TextUtils.equals(str, this.c)) {
                Object[] objArray = new Object[]{str,this.c};
                a.h(p0, "biz", "PublicKeyUnmatch", String.format("Got %s, expected %s", objArray));
                b = true;
                break ;
             }
             i = i + 1;
          }
       }
       return b;
    }
}
