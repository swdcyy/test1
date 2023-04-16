package com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge$c;
import erd.g;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.pymk.log.h;
import java.lang.Object;
import java.lang.ref.WeakReference;
import ada.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g7c.g;

public class KSPymkBridge$c implements g	// class@001955
{
    public final WeakReference b;
    public final WeakReference c;

    public void KSPymkBridge$c(Fragment p0,h p1){
       super();
       this.b = new WeakReference(p0);
       this.c = new WeakReference(p1);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge$c.class, "1")) {
       }else if(this.c.get() != null && this.b.get() != null){
          this.c.get().e.a(this.b.get(), p0);
       }
       return;
    }
}
