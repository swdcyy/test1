package com.kwai.performance.stability.leak.monitor.message.NativeLeakMessage;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.performance.stability.leak.monitor.message.NativeLeakMessage$NativeLeakItem;
import kotlin.jvm.internal.a;

public final class NativeLeakMessage	// class@00123d
{
    public String errorMessage;
    public List leakItems;
    public String logUUID;

    public void NativeLeakMessage(){
       super();
       this.leakItems = new ArrayList();
       this.logUUID = "";
       this.errorMessage = "";
    }
    public String toString(){
       String str = "============== Native Leak "+this.leakItems.size()+" items ==============\n";
       Iterator iterator = this.leakItems.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          str = str+"---------------- LeakItem "+i+" ----------------\n"+iterator.next().toString()+"\n";
          i = i + 1;
       }
       str = str;
       a.h(str, "StringBuilder\(\).apply {\n¡­\\n\"\)\n    }\n  }.toString\(\)");
       return str;
    }
}
