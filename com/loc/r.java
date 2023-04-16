package com.loc.r;
import com.loc.bl;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import android.net.Uri$Builder;
import java.lang.StringBuilder;

public abstract class r extends bl	// class@001463
{

    public void r(){
       super();
    }
    public String c(){
       Uri$Builder uBuilder;
       String str1;
       if (TextUtils.isEmpty(this.b())) {
          return this.b();
       }
       String str = this.b();
       Uri uri = Uri.parse(str);
       if ((uri.getAuthority()).startsWith("dualstack-")) {
          return str;
       }
       if ((uri.getAuthority()).startsWith("restsdk.amap.com")) {
          uBuilder = uri.buildUpon();
          str1 = "dualstack-arestapi.amap.com";
       }else {
          uBuilder = uri.buildUpon();
          str1 = "dualstack-"+uri.getAuthority();
       }
       return uBuilder.authority(str1).build().toString();
    }
}
