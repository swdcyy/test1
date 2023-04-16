package com.kwai.framework.initmodule.b;
import android.content.DialogInterface$OnClickListener;
import java.lang.Object;
import android.content.DialogInterface;
import com.kwai.framework.initmodule.RxJavaErrorHandlerInitModule;

public final class b implements DialogInterface$OnClickListener	// class@00157f
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       p0.dismiss();
    }
}
