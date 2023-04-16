package com.kuaishou.live.core.show.test.r0;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import ia1.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uo3.l;
import java.util.Objects;
import vo3.a;
import java.lang.StringBuilder;
import dx1.a;

public final class r0 implements View$OnClickListener	// class@0011be
{
    public static final r0 b;

    static {
       r0.b = new r0();
    }
    public void r0(){
       super();
    }
    public final void onClick(View p0){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, j.class, "10")) {
       }else {
          l ol = j.d();
          Objects.requireNonNull(ol);
          if (!PatchProxy.applyVoid(objArray, ol, l.class, "6")) {
             ol.d.clear();
          }
          a.a("Çå³ı±¾µØ»º´æ->"+j.b);
       }
       return;
    }
}
