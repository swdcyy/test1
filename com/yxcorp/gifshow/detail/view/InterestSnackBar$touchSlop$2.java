package com.yxcorp.gifshow.detail.view.InterestSnackBar$touchSlop$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.view.InterestSnackBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import android.widget.TableLayout;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class InterestSnackBar$touchSlop$2 extends Lambda implements a	// class@001a45
{
    public final InterestSnackBar this$0;

    public void InterestSnackBar$touchSlop$2(InterestSnackBar p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       ViewConfiguration obj = PatchProxy.apply(null, this, InterestSnackBar$touchSlop$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = ViewConfiguration.get(this.this$0.getContext());
       a.o(obj, "ViewConfiguration.get\(getContext\(\)\)");
       return obj.getScaledTouchSlop();
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
