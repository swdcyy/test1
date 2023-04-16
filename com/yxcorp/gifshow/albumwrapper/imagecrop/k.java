package com.yxcorp.gifshow.albumwrapper.imagecrop.k;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import com.tbruyelle.rxpermissions2.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.albumwrapper.imagecrop.RxImageSupplierFragment;
import android.app.FragmentManager;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class k	// class@001b6f
{
    public final g a;
    public RxImageSupplierFragment b;
    public static final Object c;

    static {
       k.c = new Object();
    }
    public void k(FragmentActivity p0,g p1){
       super();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       String obj = PatchProxy.applyOneRefs(p0, this, ok, "3");
       if (obj != patchProxyRe) {
       }else {
          FragmentTransaction obj1 = PatchProxy.applyOneRefs(p0, this, ok, "4");
          obj = "RxImageSupplier";
          RxImageSupplierFragment rxImageSuppl = (obj1 != patchProxyRe)? obj1: p0.getFragmentManager().findFragmentByTag(obj);
          obj1 = (rxImageSuppl == null)? 1: null;
          if (obj1) {
             rxImageSuppl = new RxImageSupplierFragment();
             FragmentManager fragmentMana = p0.getFragmentManager();
             fragmentMana.beginTransaction().add(rxImageSuppl, obj).commitAllowingStateLoss();
             fragmentMana.executePendingTransactions();
          }
          obj = rxImageSuppl;
       }
       this.b = obj;
       this.a = p1;
       return;
    }
}
