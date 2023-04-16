package com.yxcorp.gifshow.util.cdnresource.a$a;
import we6.b;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.util.cdnresource.a;
import r85.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import te6.b;

public class a$a implements b	// class@001f66
{
    public final String a;
    public final String b;

    public void a$a(String p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0,String p1){
       a.b(p1, this.a, this.b);
       if (PatchProxy.applyVoidTwoRefs(p0, this, null, b.class, "4")) {
       }else {
          b.a(-1427269270).b(p0, this);
       }
       return;
    }
}
