package com.yxcorp.gifshow.ad.AdProcess$e;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.ad.AdProcess$b;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class AdProcess$e implements DialogInterface$OnClickListener	// class@0014e3
{
    public final AdProcess$b b;

    public void AdProcess$e(AdProcess$b p0){
       this.b = p0;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(AdProcess$e.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AdProcess$e.class, "1")) {
          return;
       }
       if (p1 == 0x7f1004b4) {
          this.b.a();
       }else if(p1 == 0x7f10081a){
          this.b.b();
       }
       return;
    }
}
