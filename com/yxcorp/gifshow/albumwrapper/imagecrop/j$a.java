package com.yxcorp.gifshow.albumwrapper.imagecrop.j$a;
import android.widget.AdapterView$OnItemClickListener;
import com.yxcorp.gifshow.albumwrapper.imagecrop.j;
import brd.v;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.yxcorp.gifshow.albumwrapper.imagecrop.RxImageSupplierFragment$Type;
import brd.g;

public class j$a implements AdapterView$OnItemClickListener	// class@001b6d
{
    public final v b;
    public final j c;

    public void j$a(j p0,v p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Long.valueOf(p3), this, j$a.class, "1")) {
          return;
       }
       if (!p2) {
          this.b.onNext(RxImageSupplierFragment$Type.CAMERA);
       }else if(p2 == 1){
          this.b.onNext(RxImageSupplierFragment$Type.GALLERY);
       }
       this.b.onComplete();
       return;
    }
}
