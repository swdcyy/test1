package com.yxcorp.gifshow.v3.editor.relay.a;
import erd.g;
import java.lang.String;
import java.lang.Object;
import retrofit2.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wsc.h;
import k2b.v1$h;
import faa.a;
import q87.c;

public final class a implements g	// class@0011a8
{
    public final String b;
    public final String c;

    public void a(String p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          h.a.d("kuaiying", this.b, this.c).a();
          Object[] objArray = new Object[0];
          a.D().w("PostRelayActivity", "2579 saveVideoRelaySessionToServer success", objArray);
       }
       return;
    }
}
