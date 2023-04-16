package com.yxcorp.gifshow.util.DynamicModuleDialogInstallActivity$onCreate$1$onError$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Exception;
import java.lang.Object;
import lnc.p1;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class DynamicModuleDialogInstallActivity$onCreate$1$onError$1 extends Lambda implements l	// class@001ee2
{
    public final boolean $clickCancelButton;
    public final Exception $failException;
    public final int $retryCount;

    public void DynamicModuleDialogInstallActivity$onCreate$1$onError$1(int p0,Exception p1,boolean p2){
       this.$retryCount = p0;
       this.$failException = p1;
       this.$clickCancelButton = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(p1 p0){
       a.p(p0, "it");
       p0.b(this.$retryCount, this.$failException, this.$clickCancelButton);
    }
}
