package com.kuaishou.tuna.plc.plc2.PlcImpl$mLongVideoClickLnr$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tuna.plc.plc2.PlcImpl;
import android.view.View$OnClickListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tuna.plc.plc2.PlcImpl$mLongVideoClickLnr$2$a;

public final class PlcImpl$mLongVideoClickLnr$2 extends Lambda implements a	// class@001041
{
    public final PlcImpl this$0;

    public void PlcImpl$mLongVideoClickLnr$2(PlcImpl p0){
       this.this$0 = p0;
       super(0);
    }
    public final View$OnClickListener invoke(){
       Object obj = PatchProxy.apply(null, this, PlcImpl$mLongVideoClickLnr$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PlcImpl$mLongVideoClickLnr$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}