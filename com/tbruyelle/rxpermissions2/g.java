package com.tbruyelle.rxpermissions2.g;
import java.lang.Object;
import android.app.Activity;
import android.app.FragmentManager;
import java.lang.String;
import android.app.Fragment;
import com.tbruyelle.rxpermissions2.RxPermissionsFragment;
import android.app.FragmentTransaction;
import android.os.Build$VERSION;
import brd.t;
import java.util.Map;
import brd.w;
import com.tbruyelle.rxpermissions2.g$a;
import erd.o;
import java.lang.IllegalArgumentException;
import com.tbruyelle.rxpermissions2.e;
import brd.x;
import zq8.b;
import com.tbruyelle.rxpermissions2.f;

public class g	// class@000e0d
{
    public RxPermissionsFragment a;
    public static final Object b;

    static {
       g.b = new Object();
    }
    public void g(Activity p0){
       super();
       String str = "RxPermissions";
       RxPermissionsFragment rxPermission = p0.getFragmentManager().findFragmentByTag(str);
       FragmentTransaction uFragmentTra = (rxPermission == null)? 1: null;
       if (uFragmentTra) {
          rxPermission = new RxPermissionsFragment();
          FragmentManager fragmentMana = p0.getFragmentManager();
          fragmentMana.beginTransaction().add(rxPermission, str).commitAllowingStateLoss();
          fragmentMana.executePendingTransactions();
       }
       this.a = rxPermission;
       return;
    }
    public boolean a(String p0){
       boolean b = false;
       if (this.b()) {
          int i = (!this.a.getActivity().checkSelfPermission(p0))? 1: 0;
          if (!i) {
          label_001a :
             return b;
          }
       }
       b = true;
       goto label_001a ;
    }
    public boolean b(){
       boolean b = (Build$VERSION.SDK_INT >= 23)? true: false;
       return b;
    }
    public t c(t p0,String[] p1){
       t ot;
       if (p1 == null || !p1.length) {
          throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
       }
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i < len) {
             if (!this.a.b.containsKey(p1[i])) {
                ot = t.empty();
             label_0023 :
                p0 = (p0 == null)? t.just(g.b): t.merge(p0, ot);
                break ;
             }else {
                i = i + 1;
             }
          }else {
             ot = t.just(g.b);
             goto label_0023 ;
          }
       }
       return p0.flatMap(new g$a(this, p1));
    }
    public t d(String[] p0){
       return t.just(g.b).compose(new e(this, p0));
    }
    public t e(String[] p0){
       return t.just(g.b).compose(new b(this, p0));
    }
    public t f(String[] p0){
       return t.just(g.b).compose(new f(this, p0));
    }
}
