package com.yxcorp.gifshow.encode.o;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.utility.Log;
import com.kwai.video.editorsdk2.EditorSdk2Utils;

public final class o implements Runnable	// class@000d35
{
    public static final o b;

    static {
       o.b = new o();
    }
    public void o(){
       super();
    }
    public final void run(){
       Log.g("EncodeManager", "SuspendExportWorks in an asynchronous thread");
       EditorSdk2Utils.SuspendExportWorks();
    }
}
