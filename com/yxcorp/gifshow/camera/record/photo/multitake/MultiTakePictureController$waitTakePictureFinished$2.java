package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$waitTakePictureFinished$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import jg9.t0;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import java.util.Collection;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$waitTakePictureFinished$2$a;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class MultiTakePictureController$waitTakePictureFinished$2 extends Lambda implements a	// class@000eef
{
    public final MultiTakePictureController this$0;

    public void MultiTakePictureController$waitTakePictureFinished$2(MultiTakePictureController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       ArrayList obj = PatchProxy.apply(null, this, MultiTakePictureController$waitTakePictureFinished$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       MultiTakePictureController x = this.this$0.x;
       if (x != null) {
          CopyOnWriteArrayList uCopyOnWrite = x.K0();
          if (uCopyOnWrite != null) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = uCopyOnWrite.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                Object obj2 = (obj1.b() > -1)? 1: null;
                if (obj2) {
                   uArrayList.add(obj1);
                }
             }
             List list = CollectionsKt___CollectionsKt.f5(uArrayList, new MultiTakePictureController$waitTakePictureFinished$2$a());
             if (list != null) {
                iterator = list.iterator();
                while (iterator.hasNext()) {
                   obj.add(iterator.next().c());
                }
             }
          }
       }
       return obj;
    }
}
