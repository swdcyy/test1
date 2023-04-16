package com.kwai.written.view.IWrittenLayout$view$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.written.view.IWrittenLayout;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IWrittenLayout$view$2 extends Lambda implements a	// class@00114f
{
    public final IWrittenLayout this$0;

    public void IWrittenLayout$view$2(IWrittenLayout p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       Object obj = PatchProxy.apply(null, this, IWrittenLayout$view$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.k1();
    }
    public Object invoke(){
       return this.invoke();
    }
}
