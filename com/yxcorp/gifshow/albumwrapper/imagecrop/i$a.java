package com.yxcorp.gifshow.albumwrapper.imagecrop.i$a;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.albumwrapper.imagecrop.i;
import brd.v;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.albumwrapper.imagecrop.RxImageSupplierFragment$Type;
import brd.g;

public class i$a implements DialogInterface$OnClickListener	// class@001b6b
{
    public final v b;
    public final i c;

    public void i$a(i p0,v p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(i$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, i$a.class, "1")) {
          return;
       }
       if (p1 == 0x7f1010fe) {
          this.b.onNext(RxImageSupplierFragment$Type.CAMERA);
       }else if(p1 == 0x7f1010ff){
          this.b.onNext(RxImageSupplierFragment$Type.GALLERY);
       }
       this.b.onComplete();
       return;
    }
}
