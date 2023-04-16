package com.yxcorp.gifshow.activity.d$a;
import xn5.c;
import com.yxcorp.gifshow.activity.d;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tra.b;
import q87.c;
import xn5.a;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$ActivityTabConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class d$a extends c	// class@001340
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public boolean a(DynamicTabConfig p0){
       Object[] objArray1;
       DynamicTabConfig obj = PatchProxy.applyOneRefs(p0, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = "ActivityTabDataProcessor";
       if (this.b.d == null) {
          Object[] objArray = new Object[0];
          b.C().w(str, "switch key not allow, nebula:false", objArray);
          a.c.a(p0, "switch key not allow");
          return 0;
       }else {
          obj = p0.mActivityTabConfig;
          if (obj == null) {
             objArray1 = new Object[0];
             b.C().w(str, "tab activity config is empty :"+p0, objArray1);
             a.c.a(p0, "tab activity config is empty");
             return 0;
          }else if(TextUtils.x(obj.mTabUrl)){
             objArray1 = new Object[0];
             b.C().w(str, "tab url is empty :"+p0, objArray1);
             a.c.a(p0, "tab url is empty");
             return 0;
          }else if(TextUtils.x(p0.mTabName)){
             objArray1 = new Object[0];
             b.C().w(str, "tab text is empty :"+p0, objArray1);
             a.c.a(p0, "tab text is empty");
             return 0;
          }else {
             return super.a(p0);
          }
       }
    }
}
