package com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.d$a;
import hka.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class d$a implements a	// class@001bdb
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public boolean onBackPressed(){
       d$a obj = PatchProxy.apply(null, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj.s == null) {
          return false;
       }
       obj.P8();
       return true;
    }
}
