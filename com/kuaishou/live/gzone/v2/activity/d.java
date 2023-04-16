package com.kuaishou.live.gzone.v2.activity.d;
import erd.g;
import com.kuaishou.live.gzone.v2.activity.c;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y43.a;
import m02.o;
import h63.i;

public class d implements g	// class@001cb9
{
    public final c b;

    public void d(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else if(p0 == FragmentEvent.RESUME && this.b.t.E.a()){
          this.b.L.c();
       }else if(p0 == FragmentEvent.PAUSE){
          this.b.L.b();
       }
       return;
    }
}
