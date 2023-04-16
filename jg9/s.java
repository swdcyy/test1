package jg9.s;
import com.yxcorp.utility.AsyncTask;
import jg9.s$a;
import nsd.u;
import com.yxcorp.gifshow.camera.record.photo.h;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Void;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import j8c.a;
import q87.c;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.io.File;
import java.lang.StringBuilder;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.utility.AsyncTask$Status;

public abstract class s extends AsyncTask	// class@002ab3
{
    public CountDownLatch p;
    public final h q;
    public final a r;
    public static final s$a s;

    static {
       s.s = new s$a(null);
    }
    public void s(h p0,a p1){
       a.p(p0, "pictureCapture");
       a.p(p1, "filePathListProvider");
       super();
       this.q = p0;
       this.r = p1;
    }
    public Object b(Object[] p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, s.class, "2");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(p0, "params");
          this.p = new CountDownLatch(1);
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().s("MultiTakePictureWait", "doInBackground", objArray);
          this.r();
          s tp = this.p;
          a.m(tp);
          tp.await(4000, TimeUnit.MILLISECONDS);
          List list = this.r.invoke();
          if (list == null) {
             list = new ArrayList();
          }
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             File uFile = new File(iterator.next());
             if (!uFile.exists()) {
                continue ;
             }
             uArrayList1.add(uFile);
          }
          Object[] objArray1 = new Object[i];
          a.D().s("MultiTakePictureWait", "doInBackground finish "+uArrayList1, objArray1);
          uArrayList = uArrayList1;
       }
       return uArrayList;
    }
    public void j(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "3")) {
       }else if(this.g()){
          this.p();
       }else {
          this.q(p0);
       }
       return;
    }
    public void k(){
       PatchProxy.applyVoid(null, this, s.class, "1");
    }
    public abstract void p();
    public abstract void q(List p0);
    public final void r(){
       boolean b;
       Object[] objArray1;
       Object[] objArray = null;
       String str = "6";
       if (PatchProxy.applyVoid(objArray, this, s.class, str)) {
          return;
       }
       s tq = this.q;
       Objects.requireNonNull(tq);
       Object obj = PatchProxy.apply(objArray, tq, h.class, str);
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          h d = tq.d;
          b = (d == null || d.f() == AsyncTask$Status.FINISHED)? true: false;
       }
       if (b) {
          objArray1 = new Object[i];
          a.D().s("MultiTakePictureWait", "tryRefreshState success", objArray1);
          tq = this.p;
          if (tq != null) {
             tq.countDown();
          }
       }else {
          objArray1 = new Object[i];
          a.D().s("MultiTakePictureWait", "tryRefreshState failed", objArray1);
       }
       return;
    }
}
