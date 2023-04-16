package com.kuaishou.live.gzone.v2.activity.f$a;
import erd.g;
import com.kuaishou.live.gzone.v2.activity.f;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v53.i;

public class f$a implements g	// class@001cbc
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
       }else {
          f t = this.b.t;
          if (t != null) {
             if (p0 == FragmentEvent.RESUME) {
                t.c();
             }else if(p0 == FragmentEvent.PAUSE){
                t.b();
             }
          }
       }
       return;
    }
}
