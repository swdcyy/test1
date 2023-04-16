package com.yxcorp.gifshow.permission.ContactPermissionHolder$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wwb.b;
import java.lang.Runnable;
import t45.c;

public class ContactPermissionHolder$1 implements LifecycleObserver	// class@000ec3
{
    public final ContactPermissionHolder b;

    public void ContactPermissionHolder$1(ContactPermissionHolder p0){
       this.b = p0;
       super();
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, ContactPermissionHolder$1.class, "1")) {
          return;
       }
       c.a(new b(this));
       return;
    }
}
