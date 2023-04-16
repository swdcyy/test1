package com.kuaishou.viewbinder.ViewStubViewBinder$a;
import android.view.ViewStub$OnInflateListener;
import com.kuaishou.viewbinder.ViewStubViewBinder;
import java.lang.Object;
import android.view.ViewStub;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.viewbinder.BaseViewBinder;

public final class ViewStubViewBinder$a implements ViewStub$OnInflateListener	// class@00119d
{
    public final ViewStubViewBinder a;

    public void ViewStubViewBinder$a(ViewStubViewBinder p0){
       this.a = p0;
       super();
    }
    public final void onInflate(ViewStub p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewStubViewBinder$a.class, "1")) {
          return;
       }
       this.a.bindViews(p1);
       return;
    }
}
