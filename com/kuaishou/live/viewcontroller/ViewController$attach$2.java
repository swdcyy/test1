package com.kuaishou.live.viewcontroller.ViewController$attach$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ViewController$attach$2 extends Lambda implements a	// class@000fe1
{
    public final ViewController this$0;

    public void ViewController$attach$2(ViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       Object obj = PatchProxy.apply(null, this, ViewController$attach$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.C2();
    }
    public Object invoke(){
       return this.invoke();
    }
}
