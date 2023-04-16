package com.kuaishou.live.common.core.basic.widget.h$a;
import android.content.Context;
import java.lang.Object;
import android.app.Dialog;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.widget.h;

public class h$a	// class@000f3d
{
    public Context a;
    public int b;
    public String c;
    public int d;
    public String e;
    public DialogInterface$OnClickListener f;
    public DialogInterface$OnClickListener g;

    public void h$a(Context p0){
       super();
       this.a = p0;
    }
    public Dialog a(){
       Object obj = PatchProxy.apply(null, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(this.a, this);
    }
    public h$a b(int p0){
       this.e = null;
       this.d = p0;
       return this;
    }
}
