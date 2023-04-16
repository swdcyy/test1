package com.yxcorp.gifshow.reminder.friend.kcube.e$a;
import com.yxcorp.gifshow.reminder.friend.kcube.e$b;
import com.yxcorp.gifshow.reminder.friend.kcube.e;
import java.lang.String;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class e$a implements e$b	// class@001ab8
{
    public final int a;
    public final int b;
    public final String c;
    public final e d;

    public void e$a(e p0,int p1,int p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       this.d.u(this.a, this.b, p0, this.c);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "2")) {
          return;
       }
       this.d.u(this.a, this.b, null, null);
       return;
    }
}
