package bh.q;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.gifshow.kanim.a;
import android.view.View;
import bh.c;
import java.lang.Thread;
import android.os.Looper;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalThreadStateException;

public class q	// class@000b3f
{
    public final ConcurrentHashMap a;
    public static q b;

    public void q(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public static q b(){
       q oq = q.class;
       Object obj = PatchProxy.apply(null, null, oq, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.b == null) {
          _monitor_enter(oq);
          if (q.b == null) {
             q.b = new q();
          }
          _monitor_exit(oq);
       }
       return q.b;
    }
    public void a(int p0,int p1){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oq, "3")) {
          return;
       }
       ConcurrentHashMap uConcurrentH = this.a.get(Integer.valueOf(p0));
       if (uConcurrentH == null) {
          return;
       }
       a uoa = uConcurrentH.get(Integer.valueOf(p1));
       if (uoa == null) {
          return;
       }
       uoa.b();
       uoa.clear();
       uConcurrentH.remove(Integer.valueOf(p1), uoa);
       return;
    }
    public final a c(View p0,String p1,String p2,c p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, q.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e(p0, p1, p2, -1, p3);
    }
    public final a d(View p0,String p1,String p2,c p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, q.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e(p0, p1, p2, 1, p3);
    }
    public final a e(View p0,String p1,String p2,int p3,c p4){
       a obj;
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, oq, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
          obj = null;
          if (p0 == null) {
             return obj;
          }else if(TextUtils.isEmpty(p1) || TextUtils.isEmpty(p2)){
             obj = new a(p0, p1, p2);
             if (p4 != null) {
                obj.e(p4);
             }
             obj.f(p3);
          }
          return obj;
       }else {
          throw new IllegalThreadStateException("must be call on main thread !!!");
       }
    }
}
