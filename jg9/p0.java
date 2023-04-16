package jg9.p0;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import java.io.File;

public final class p0 implements Callable	// class@002aaa
{
    public final CopyOnWriteArrayList b;

    public void p0(CopyOnWriteArrayList p0){
       this.b = p0;
       super();
    }
    public Object call(){
       HashSet hashSet = PatchProxy.apply(null, this, p0.class, "1");
       if (hashSet != PatchProxyResult.class) {
       }else {
          hashSet = new HashSet();
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             MultiTakePictrueItem multiTakePic = iterator.next();
             if (!new File(multiTakePic.c()).exists()) {
                hashSet.add(multiTakePic.c());
             }
          }
       }
       return hashSet;
    }
}
