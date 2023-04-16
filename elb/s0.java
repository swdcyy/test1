package elb.s0;
import java.lang.Object;
import elb.p0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.YcnnScenesObject;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.List;
import elb.r0;

public final class s0	// class@002767
{
    public YcnnScenesObject mScenesObjects;

    public void s0(){
       super();
    }
    public final p0 a(){
       Object[] objArray = null;
       s0 obj = PatchProxy.apply(objArray, this, s0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mScenesObjects;
       YcnnScenesObject mScenes = (obj != null)? obj.mScenes: objArray;
       boolean b = (mScenes == null || mScenes.isEmpty())? true: false;
       if (b) {
          return objArray;
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = mScenes.iterator();
          while (iterator.hasNext()) {
             p0 op0 = iterator.next();
             List list = op0.d();
             list = (list == null || list.isEmpty())? 1: null;
             if (list) {
                uArrayList.add(op0);
             }else {
                Iterator iterator1 = op0.d().iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().f(op0.b());
                }
                uArrayList.addAll(op0.d());
             }
          }
          return r0.a(uArrayList);
       }
    }
    public final void b(YcnnScenesObject p0){
       this.mScenesObjects = p0;
    }
}
