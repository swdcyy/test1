package com.kuaishou.android.security.internal.plugin.b;
import com.kuaishou.android.security.internal.plugin.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.security.internal.dispatch.d;
import java.lang.StringBuffer;
import com.kuaishou.android.security.base.log.d;

public class b implements d	// class@000f5d
{

    public void b(){
       super();
    }
    public boolean a(){
       byte[] obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = d.a(new byte[5]{0x01,0x01,0x01,0x01,0x01});
       StringBuffer str = "";
       String str1 = (obj[0] == 1)? "\r\nroot detected \n": "no root\n";
       str = str+str1;
       str1 = (obj[1] == 1)? "malware detected \n": "no malware\n";
       str = str+str1;
       str1 = (obj[2] == 1)? "hook detected \n": "no hook\n";
       str = str+str1;
       str1 = (obj[3] == 1)? "emulator detected \n": "no emulator\n";
       str = str+str1;
       if (obj[4] == 1) {
          str = str+"antidebug \n";
       }
       d.d(str);
       return 0;
    }
}
