package com.kuaishou.growth.pendant.entrance.widget.EntrancePendant$b$a;
import java.lang.Runnable;
import com.kuaishou.growth.pendant.entrance.widget.EntrancePendant$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.widget.FrameLayout;
import xh7.b;
import com.kuaishou.growth.pendant.entrance.widget.EntrancePendant$b$a$a;
import qh7.b;
import qh7.a;

public final class EntrancePendant$b$a implements Runnable	// class@00065c
{
    public final EntrancePendant$b b;
    public final String c;

    public void EntrancePendant$b$a(EntrancePendant$b p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EntrancePendant$b$a.class, "1")) {
          return;
       }
       a.b(b.j(this.b.c.getContext(), this.c), EntrancePendant$b$a$a.a);
       return;
    }
}
