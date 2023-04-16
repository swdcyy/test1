package com.tachikoma.component.imageview.TKImageView$a;
import java.lang.Runnable;
import com.tachikoma.component.imageview.TKImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKImageView$a implements Runnable	// class@000cfd
{
    public final TKImageView b;

    public void TKImageView$a(TKImageView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKImageView$a.class, "1")) {
          return;
       }
       this.b.destroyOnUIThread();
       return;
    }
}
