package com.tachikoma.component.imageview.TKImage$a;
import java.lang.Runnable;
import com.tachikoma.component.imageview.TKImage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKImage$a implements Runnable	// class@000cfa
{
    public final TKImage b;

    public void TKImage$a(TKImage p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKImage$a.class, "1")) {
          return;
       }
       this.b.destroyOnMainThread();
       return;
    }
}
