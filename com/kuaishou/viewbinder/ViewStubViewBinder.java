package com.kuaishou.viewbinder.ViewStubViewBinder;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.c;
import android.view.ViewStub;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.viewbinder.ViewStubViewBinder$a;
import android.view.ViewStub$OnInflateListener;

public abstract class ViewStubViewBinder extends BaseViewBinder	// class@00119e
{
    public ViewStub e;

    public void ViewStubViewBinder(c p0){
       super(p0);
    }
    public final void A(ViewStub p0){
       this.e = p0;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ViewStubViewBinder.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       return this.y();
    }
    public final View y(){
       Object[] objArray = null;
       ViewStubViewBinder obj = PatchProxy.apply(objArray, this, ViewStubViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj != null) {
          obj.setOnInflateListener(new ViewStubViewBinder$a(this));
       }
       obj = this.e;
       if (obj != null) {
          obj.setLayoutResource(this.z());
       }
       obj = this.e;
       if (obj != null) {
          objArray = obj.inflate();
       }
       this.d = objArray;
       return this.d;
    }
    public abstract int z();
}
