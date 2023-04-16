package com.yxcorp.download.b$a;
import erd.g;
import com.yxcorp.download.b;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.DownloadManager;

public class b$a implements g	// class@0011b6
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else if(p0 == ActivityEvent.DESTROY){
          b$a tb = this.b;
          DownloadManager.n().B(tb.a, tb);
       }
       return;
    }
}
