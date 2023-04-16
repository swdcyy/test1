package com.kuaishou.android.security.base.perf.d;
import java.lang.Object;
import com.kuaishou.android.security.base.perf.d$b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import java.util.Locale;
import android.content.Context;
import com.kuaishou.android.security.base.util.j;
import com.kuaishou.android.security.base.perf.d$a;
import java.lang.Enum;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.base.perf.e$b;
import com.kuaishou.android.security.base.perf.e;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.kuaishou.android.security.base.exception.KSException;
import org.json.JSONObject;
import com.kuaishou.android.security.base.perf.b;

public class d	// class@000efc
{

    public void d(){
       super();
    }
    public static void a(d$b p0,String p1,int p2){
       KSecuritySdkILog kSecuritySdk;
       KSException kSException;
       e$b f;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, d.class, "1")) {
          return;
       }
       if (b.i().j() == null) {
          return;
       }
       Object[] objArray = new Object[]{j.a(b.i().j().c()).c(),p1,Integer.valueOf(p2)};
       String str = String.format(Locale.getDefault(), "apkmd5[%s] ed[%s] me[%d]", objArray);
       String str1 = "kwsecurity_custom_report_key_01";
       switch (d$a.a[p0.ordinal()]){
           case 1:
             b.i().j().e().report(str1, str);
             break;
           case 2:
             kSecuritySdk = b.i().j().e();
             kSException = new KSException(str, p2);
          label_00f2 :
             kSecuritySdk.onSeucrityError(kSException);
             break;
           case 3:
             b.i().j().e().report(str1, str);
             kSecuritySdk = b.i().j().e();
             kSException = new KSException(str, p2);
             goto label_00f2 ;
             break;
           case 4:
             e.a(e$b.f, b.i().j(), p1, p2);
             break;
           case 5:
             f = e$b.f;
             e.a(f, b.i().j(), p1, p2);
          label_00a6 :
             e.b(f, b.i().j(), p1, p2, null);
             break;
           case 6:
             f = e$b.f;
             e.a(f, b.i().j(), p1, p2);
             b.i().j().e().report(str1, str);
             b.i().j().e().onSeucrityError(new KSException(str, p2));
             goto label_00a6 ;
             break;
           default:
             d.d("Can\'t recognize report type!");
       }
       if (p2 != b.d && (p2 == b.f || p2 == b.e)) {
          j.d().a(p2);
          String str2 = j.d().b(b.v);
          if (j.c(str2)) {
             j.d().b(b.v, "1");
          }else {
             j.d().b(b.v, String.valueOf((Integer.parseInt(str2) + 1)));
          }
       }
       return;
    }
}
