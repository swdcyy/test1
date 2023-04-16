package com.tbruyelle.rxpermissions2.RxPermissionsFragment;
import android.app.Fragment;
import java.util.HashMap;
import android.os.Bundle;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import io.reactivex.subjects.PublishSubject;
import zq8.a;

public class RxPermissionsFragment extends Fragment	// class@000e03
{
    public Map b;
    public boolean c;

    public void RxPermissionsFragment(){
       super();
       this.b = new HashMap();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       this.setRetainInstance(true);
    }
    public void onRequestPermissionsResult(int p0,String[] p1,int[] p2){
       super.onRequestPermissionsResult(p0, p1, p2);
       if (p0 != 42) {
          return;
       }
       boolean[] uobooleanArr = new boolean[p1.length];
       for (int i = 0; i < p1.length; i = i + 1) {
          uobooleanArr[i] = this.shouldShowRequestPermissionRationale(p1[i]);
       }
       i = p1.length;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          PublishSubject publishSubje = this.b.get(p1[i1]);
          if (publishSubje == null) {
             break ;
          }else {
             this.b.remove(p1[i1]);
             boolean b = (!p2[i1])? true: false;
             publishSubje.onNext(new a(p1[i1], b, uobooleanArr[i1]));
             publishSubje.onComplete();
          }
       }
       return;
    }
}
