package com.yxcorp.gifshow.albumwrapper.imagecrop.g;
import erd.o;
import com.yxcorp.gifshow.albumwrapper.imagecrop.k;
import z79.h;
import java.lang.Object;
import com.yxcorp.gifshow.albumwrapper.imagecrop.RxImageSupplierFragment$Type;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import android.app.Activity;
import android.app.Fragment;
import com.tbruyelle.rxpermissions2.g;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.f;

public class g implements o	// class@001b69
{
    public final h b;
    public final k c;

    public void g(k p0,h p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       String str;
       t ot = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (ot != PatchProxyResult.class) {
       }else if(p0 == RxImageSupplierFragment$Type.CAMERA){
          str = "android.permission.CAMERA";
       }else {
          str = "android.permission.WRITE_EXTERNAL_STORAGE";
       }
       g tc = this.c;
       ot = a.h(tc.a, tc.b.getActivity(), str).flatMap(new f(this, p0));
       return ot;
    }
}
