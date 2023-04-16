package com.yxcorp.gifshow.util.DynamicModuleDialogInstallActivity$onCreate$1;
import lnc.p1;
import com.yxcorp.gifshow.util.DynamicModuleDialogInstallActivity;
import java.lang.Object;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Exception;
import com.yxcorp.gifshow.util.DynamicModuleDialogInstallActivity$onCreate$1$onError$1;
import msd.l;
import com.yxcorp.gifshow.util.DynamicModuleDialogInstallActivity$onCreate$1$onSuccess$1;

public final class DynamicModuleDialogInstallActivity$onCreate$1 implements p1	// class@001ee4
{
    public final DynamicModuleDialogInstallActivity a;

    public void DynamicModuleDialogInstallActivity$onCreate$1(DynamicModuleDialogInstallActivity p0){
       this.a = p0;
       super();
    }
    public void a(){
       Iterator iterator = DynamicModuleDialogInstallActivity.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void b(int p0,Exception p1,boolean p2){
       this.a.E2(new DynamicModuleDialogInstallActivity$onCreate$1$onError$1(p0, p1, p2));
    }
    public void c(int p0){
       this.a.E2(new DynamicModuleDialogInstallActivity$onCreate$1$onSuccess$1(p0));
    }
}
