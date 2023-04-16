package ai8.c;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.mini.rxintentapi.RxIntentApiFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import android.content.Intent;
import brd.t;
import java.lang.Integer;
import brd.x;
import com.mini.rxintentapi.b;

public class c	// class@0000a5
{
    public RxIntentApiFragment a;
    public static final Object b;
    public static String c;

    static {
       c.b = new Object();
    }
    public void c(FragmentActivity p0){
       super();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       RxIntentApiFragment rxIntentApiF = PatchProxy.applyOneRefs(p0, this, uoc, "1");
       if (rxIntentApiF != patchProxyRe) {
       }else {
          Fragment uFragment = PatchProxy.applyOneRefs(p0, this, uoc, "2");
          if (uFragment != patchProxyRe) {
          }else {
             uFragment = p0.getSupportFragmentManager().findFragmentByTag(c.c);
          }
          RxIntentApiFragment rxIntentApiF1 = (uFragment == null)? 1: null;
          if (rxIntentApiF1) {
             rxIntentApiF1 = new RxIntentApiFragment();
             c supportFragm = p0.getSupportFragmentManager();
             e uoe = supportFragm.beginTransaction();
             uoe.h(rxIntentApiF1, c.c);
             uoe.m();
             supportFragm.executePendingTransactions();
             rxIntentApiF = rxIntentApiF1;
          }else {
             rxIntentApiF = uFragment;
          }
       }
       this.a = rxIntentApiF;
       return;
    }
    public t a(Intent p0,int p1){
       t obj;
       b uob;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = t.just(c.b);
       if (PatchProxy.isSupport(uoc)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "4");
          if (uob != PatchProxyResult.class) {
          label_0039 :
             return obj.compose(uob);
          }
       }
       uob = new b(this, p1, p0);
       goto label_0039 ;
    }
}
