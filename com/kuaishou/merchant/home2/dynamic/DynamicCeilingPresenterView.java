package com.kuaishou.merchant.home2.dynamic.DynamicCeilingPresenterView;
import ho4.p;
import com.kuaishou.merchant.home2.dynamic.DynamicPresenterView;
import android.content.Context;
import hx3.b;
import hx3.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import android.view.View;

public final class DynamicCeilingPresenterView extends DynamicPresenterView implements p	// class@0016fb
{
    public final b e;
    public HashMap f;

    public void DynamicCeilingPresenterView(Context p0,b p1){
       super(p0, p1);
       this.e = p1;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, DynamicCeilingPresenterView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.e.o();
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, DynamicCeilingPresenterView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.p();
    }
    public View d(){
       Object obj = PatchProxy.apply(null, this, DynamicCeilingPresenterView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.q();
    }
}
