package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jg9.a1;
import java.util.concurrent.CopyOnWriteArrayList;
import jg9.t0;
import nsd.u;

public final class MultiTakePictureController$a implements b$a	// class@000ecc
{
    public final MultiTakePictureController a;

    public void MultiTakePictureController$a(MultiTakePictureController p0){
       this.a = p0;
       super();
    }
    public Object getData(){
       int i1;
       a1 uoa1 = PatchProxy.apply(null, this, MultiTakePictureController$a.class, "1");
       if (uoa1 != PatchProxyResult.class) {
       }else {
          boolean b = this.a.c1();
          MultiTakePictureController$a ta = this.a;
          MultiTakePictureController v = ta.v;
          int i = ta.g2() ^ 0x01;
          ta = this.a;
          MultiTakePictureController v1 = ta.v;
          MultiTakePictureController w = ta.w;
          MultiTakePictureController x = ta.x;
          if (x != null) {
             CopyOnWriteArrayList uCopyOnWrite = x.K0();
             if (uCopyOnWrite != null) {
                i1 = uCopyOnWrite.size();
             label_003c :
                a1 uoa11 = new a1(b, v, i, v1, true, w, false, i1, 64, null);
             }
          }
          i1 = 0;
          goto label_003c ;
       }
       return uoa1;
    }
}
