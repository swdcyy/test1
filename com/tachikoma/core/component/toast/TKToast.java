package com.tachikoma.core.component.toast.TKToast;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import no8.e;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;

public class TKToast extends TKBaseNativeModule	// class@000dae
{
    public String content;

    public void TKToast(f p0){
       super(p0);
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, TKToast.class, "1")) {
          return;
       }
       Toast.makeText(e.k, this.content, 1).show();
       return;
    }
}
