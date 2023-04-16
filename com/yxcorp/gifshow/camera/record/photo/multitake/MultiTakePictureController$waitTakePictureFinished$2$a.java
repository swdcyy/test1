package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$waitTakePictureFinished$2$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class MultiTakePictureController$waitTakePictureFinished$2$a implements Comparator	// class@000eee
{

    public void MultiTakePictureController$waitTakePictureFinished$2$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MultiTakePictureController$waitTakePictureFinished$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p0.b()), Integer.valueOf(p1.b()));
    }
}
