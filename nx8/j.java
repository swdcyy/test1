package nx8.j;
import nx8.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.AdProcess;
import com.kwai.framework.model.feed.BaseFeed;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.ad.AdMainProcess;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.StringBuilder;
import yx.j0;

public abstract class j implements l	// class@0030a8
{
    public AdMainProcess a;

    public void j(){
       super();
    }
    public int a(){
       BaseFeed photo;
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj != null) {
          AdDataWrapper uAdDataWrapp = obj.d();
          if (uAdDataWrapp != null) {
             photo = uAdDataWrapp.getPhoto();
          label_0024 :
             j ta = this.a;
             Activity uActivity = (ta != null)? ta.c(): objArray;
             if (uActivity instanceof FragmentActivity) {
                objArray = uActivity;
             }
             if (photo == null || objArray == null) {
                this.c();
                return -3;
             }else {
                return this.e(objArray, photo);
             }
          }
       }
       photo = objArray;
       goto label_0024 ;
    }
    public void b(AdMainProcess p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
          return;
       }
       a.p(p0, "process");
       this.a = p0;
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       j ta = this.a;
       if (ta != null) {
          Object obj = PatchProxy.applyOneRefs(this, ta, AdMainProcess.class, "3");
          if (obj != PatchProxyResult.class) {
             obj.intValue();
          }else {
             a.p(this, "consumer");
             if (!ta.g().isEmpty()) {
                int i = ta.g().indexOf(this);
                int i1 = -1;
                if (i == i1) {
                   ta.m();
                }else if(i >= (ta.g().size() + i1)){
                   l ol = ta.g().get((i + 1));
                   ol.a();
                   Object[] objArray = new Object[0];
                   j0.f("AdMainProcess", "processed by : "+ol, objArray);
                   ta.r(i);
                }
             }
          }
       }
       return;
    }
    public final AdMainProcess d(){
       return this.a;
    }
    public abstract int e(FragmentActivity p0,BaseFeed p1);
}
