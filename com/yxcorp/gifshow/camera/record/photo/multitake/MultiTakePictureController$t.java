package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$t;
import jg9.s;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import msd.a;
import msd.l;
import com.yxcorp.gifshow.camera.record.photo.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.io.File;
import com.yxcorp.gifshow.models.QMedia;

public final class MultiTakePictureController$t extends s	// class@000eed
{
    public final MultiTakePictureController t;
    public final a u;
    public final a v;
    public final l w;

    public void MultiTakePictureController$t(MultiTakePictureController p0,a p1,a p2,l p3,h p4,a p5){
       this.t = p0;
       this.u = p1;
       this.v = p2;
       this.w = p3;
       super(p4, p5);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController$t.class, "2")) {
          return;
       }
       super.k();
       this.v.invoke();
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController$t.class, "1")) {
          return;
       }
       this.t.C = null;
       this.u.invoke();
       return;
    }
    public void q(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$t.class, "3")) {
          return;
       }
       this.t.C = null;
       ArrayList uArrayList = new ArrayList();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             QMedia qMedia = new QMedia(0, iterator.next().getAbsolutePath(), 0, 0, 0);
             uArrayList.add(v11);
          }
       }
       this.w.invoke(uArrayList);
       return;
    }
}
