package com.facebook.react.uimanager.BaseViewManager$a;
import a2.a;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.String;
import android.view.View;
import b2.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class BaseViewManager$a extends a	// class@001312
{
    public final String d;
    public final BaseViewManager e;

    public void BaseViewManager$a(BaseViewManager p0,String p1){
       this.e = p0;
       this.d = p1;
       super();
    }
    public void f(View p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseViewManager$a.class, "1")) {
          return;
       }
       super.f(p0, p1);
       p1.D0(this.d);
       return;
    }
}
