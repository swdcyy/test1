package com.kwai.android.common.utils.PushLogcat$i$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import com.kwai.android.common.utils.PushLogcat;
import msd.p;
import java.lang.StringBuilder;
import com.kwai.lib.interfacies.AzerothCodeAdapter;

public final class PushLogcat$i$1 extends Lambda implements a	// class@00099e
{
    public final String $msg;
    public final String $tag;

    public void PushLogcat$i$1(String p0,String p1){
       this.$tag = p0;
       this.$msg = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       PushLogcat iNSTANCE = PushLogcat.INSTANCE;
       char c = '_';
       if (iNSTANCE.getLogPropertiesSwitcher()) {
          PushLogcat.access$getLogI$p(iNSTANCE).invoke(this.$tag+c+iNSTANCE.getTailProcessName(), this.$msg);
       }
       AzerothCodeAdapter.b.logI(this.$tag+c+iNSTANCE.getTailProcessName(), ' '+this.$msg);
       return;
    }
}
