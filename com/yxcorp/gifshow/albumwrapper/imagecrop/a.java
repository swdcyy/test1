package com.yxcorp.gifshow.albumwrapper.imagecrop.a;
import erd.o;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import w69.i;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import java.lang.Object;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;
import java.util.Objects;
import com.kwai.framework.ui.popupmanager.dialog.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.tbruyelle.rxpermissions2.g;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import z79.b;

public final class a implements o	// class@001b63
{
    public final ImageSelectSupplier b;
    public final i c;
    public final ImageSelectSupplier$ImageSelectType d;

    public void a(ImageSelectSupplier p0,i p1,ImageSelectSupplier$ImageSelectType p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       t ot;
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       Objects.requireNonNull(tb);
       ImageSelectSupplier$Type cAMERA = ImageSelectSupplier$Type.CAMERA;
       String str = (p0 == cAMERA)? "android.permission.CAMERA": "android.permission.WRITE_EXTERNAL_STORAGE";
       String str1 = str;
       int i = (p0 == cAMERA)? 0x7f100494: 0x7f103bd5;
       int i1 = (p0 == cAMERA)? 0x7f100493: 0x7f103bcf;
       ImageSelectSupplier l = tb.l;
       ImageSelectSupplier m = tb.m;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{l,m,str1,Integer.valueOf(i),Integer.valueOf(i1)};
          ot = PatchProxy.apply(objArray, null, uoa, "4");
          if (ot != PatchProxyResult.class) {
          label_006c :
             return ot.flatMap(new b(tb, tc, p0, td));
          }
       }
       ot = a.i(l, m, str1, i, i1, null);
       goto label_006c ;
    }
}
