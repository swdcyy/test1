package com.tbruyelle.rxpermissions2.g$a;
import erd.o;
import com.tbruyelle.rxpermissions2.g;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.ArrayList;
import zq8.a;
import brd.t;
import android.app.Activity;
import android.app.Fragment;
import android.content.pm.PackageManager;
import com.tbruyelle.rxpermissions2.RxPermissionsFragment;
import java.util.Map;
import io.reactivex.subjects.PublishSubject;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Iterable;
import brd.w;

public class g$a implements o	// class@000e0c
{
    public final String[] b;
    public final g c;

    public void g$a(g p0,String[] p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       p0 = this.c;
       g$a tb = this.b;
       Objects.requireNonNull(p0);
       ArrayList uArrayList = new ArrayList(tb.length);
       ArrayList uArrayList1 = new ArrayList();
       int len = tb.length;
       int i = 0;
       while (i < len) {
          object oobject = tb[i];
          Objects.requireNonNull(p0.a);
          boolean b = true;
          if (p0.a(oobject)) {
             uArrayList.add(t.just(new a(oobject, b, false)));
          }else if(p0.b()){
             g a = p0.a;
             if (a.getActivity().getPackageManager().isPermissionRevokedByPolicy(oobject, a.getActivity().getPackageName())) {
             label_0052 :
                if (b) {
                   uArrayList.add(t.just(new a(oobject, false, false)));
                }else {
                   PublishSubject publishSubje = p0.a.b.get(oobject);
                   if (publishSubje == null) {
                      uArrayList1.add(oobject);
                      publishSubje = PublishSubject.g();
                      PublishSubject publishSubje1 = p0.a.b.put(oobject, publishSubje);
                   }
                   uArrayList.add(publishSubje);
                }
             }
          }
          b = false;
          goto label_0052 ;
          i = i + 1;
       }
       if (!uArrayList1.isEmpty()) {
          String[] stringArray = new String[uArrayList1.size()];
          stringArray = uArrayList1.toArray(stringArray);
          TextUtils.join(", ", stringArray);
          Objects.requireNonNull(p0.a);
          p0.a.requestPermissions(stringArray, 42);
       }
       return t.concat(t.fromIterable(uArrayList));
    }
}
