package com.yxcorp.gifshow.widget.ExtensibleRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.ExtensibleRecyclerView$a;
import com.kwai.robust.PatchProxyResult;

public final class ExtensibleRecyclerView extends RecyclerView	// class@001842
{
    public ExtensibleRecyclerView$a b;
    public HashMap c;

    public void ExtensibleRecyclerView(Context p0){
       super(p0, null);
    }
    public void ExtensibleRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExtensibleRecyclerView.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       ExtensibleRecyclerView tb = this.b;
       if (tb == null) {
          super.dispatchDraw(p0);
       }else {
          tb.b(p0);
          if (tb.c()) {
             super.dispatchDraw(p0);
          }
          tb.a(p0);
       }
       return;
    }
    public final ExtensibleRecyclerView x(ExtensibleRecyclerView$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExtensibleRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b = p0;
       this.invalidate();
       return this;
    }
}
