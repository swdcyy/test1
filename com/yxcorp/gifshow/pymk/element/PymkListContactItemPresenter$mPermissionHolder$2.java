package com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$mPermissionHolder$2;
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

public final class PymkListContactItemPresenter$mPermissionHolder$2 extends Lambda implements a	// class@0016ba
{
    public static final PymkListContactItemPresenter$mPermissionHolder$2 INSTANCE;

    static {
       PymkListContactItemPresenter$mPermissionHolder$2.INSTANCE = new PymkListContactItemPresenter$mPermissionHolder$2();
    }
    public void PymkListContactItemPresenter$mPermissionHolder$2(){
       super(0);
    }
    public final ContactPermissionHolder invoke(){
       Object obj = PatchProxy.apply(null, this, PymkListContactItemPresenter$mPermissionHolder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ContactPermissionHolder(new b(new c()));
    }
    public Object invoke(){
       return this.invoke();
    }
}
