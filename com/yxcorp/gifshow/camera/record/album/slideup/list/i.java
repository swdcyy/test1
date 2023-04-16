package com.yxcorp.gifshow.camera.record.album.slideup.list.i;
import wb9.l;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import tkd.b;
import tkd.d;
import ra0.d;
import java.util.List;
import wb9.m;
import erd.o;
import t45.d;
import brd.z;

public class i implements l	// class@001cdd
{

    public void i(){
       super();
    }
    public t a(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0x1bf6ff1d).UM(objArray, true, objArray).map(new m(a1.k())).observeOn(d.a);
    }
}
