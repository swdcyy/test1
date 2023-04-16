package com.yxcorp.gifshow.albumwrapper.imagecrop.h;
import erd.o;
import com.yxcorp.gifshow.albumwrapper.imagecrop.k;
import z79.h;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import java.util.Objects;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSupplierStyle;
import com.yxcorp.gifshow.albumwrapper.imagecrop.i;
import io.reactivex.g;
import brd.t;
import lz6.e$a;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import java.lang.Integer;
import xz6.d;
import com.yxcorp.gifshow.albumwrapper.imagecrop.j;

public class h implements o	// class@001b6a
{
    public final h b;
    public final k c;

    public void h(k p0,h p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (p0 != patchProxyRe) {
       }else {
          p0 = this.c;
          h a = this.b.a;
          Objects.requireNonNull(p0);
          Integer[] obj = PatchProxy.applyOneRefs(a, p0, k.class, "2");
          if (obj != patchProxyRe) {
             p0 = obj;
          }else if(a == ImageSupplierStyle.LIST){
             p0 = t.create(new i(p0));
          }else if(a == ImageSupplierStyle.GRID){
             e$a uoa = new e$a(p0.b.getActivity());
             obj = new Integer[]{Integer.valueOf(0x7f1010fe),Integer.valueOf(0x7f060b84),Integer.valueOf(0x7f080fd9)};
             uoa.a(obj);
             Integer[] integerArray = new Integer[]{Integer.valueOf(0x7f1010ff),Integer.valueOf(0x7f060b84),Integer.valueOf(0x7f080fd6)};
             uoa.a(integerArray);
             p0 = t.create(new j(p0, uoa));
          }else {
             p0 = t.empty();
          }
       }
       return p0;
    }
}
