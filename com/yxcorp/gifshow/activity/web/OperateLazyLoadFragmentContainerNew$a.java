package com.yxcorp.gifshow.activity.web.OperateLazyLoadFragmentContainerNew$a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Rect;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class OperateLazyLoadFragmentContainerNew$a extends ColorDrawable	// class@0014b3
{
    public final int a;

    public void OperateLazyLoadFragmentContainerNew$a(int p0,int p1){
       super(p0);
       this.a = p1;
    }
    public void onBoundsChange(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperateLazyLoadFragmentContainerNew$a.class, "1")) {
          return;
       }
       p0.set(p0.left, this.a, p0.right, p0.bottom);
       return;
    }
}
