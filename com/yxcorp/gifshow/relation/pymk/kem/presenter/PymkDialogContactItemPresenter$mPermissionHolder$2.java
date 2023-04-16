package com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogContactItemPresenter$mPermissionHolder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xwb.b;
import xwb.c;
import xwb.d;

public final class PymkDialogContactItemPresenter$mPermissionHolder$2 extends Lambda implements a	// class@001942
{
    public static final PymkDialogContactItemPresenter$mPermissionHolder$2 INSTANCE;

    static {
       PymkDialogContactItemPresenter$mPermissionHolder$2.INSTANCE = new PymkDialogContactItemPresenter$mPermissionHolder$2();
    }
    public void PymkDialogContactItemPresenter$mPermissionHolder$2(){
       super(0);
    }
    public final ContactPermissionHolder invoke(){
       Object obj = PatchProxy.apply(null, this, PymkDialogContactItemPresenter$mPermissionHolder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ContactPermissionHolder(new b(new c()));
    }
    public Object invoke(){
       return this.invoke();
    }
}
