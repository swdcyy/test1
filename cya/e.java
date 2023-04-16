package cya.e;
import com.kwai.plugin.dva.work.c$c;
import cya.d;
import android.view.View;
import java.lang.Object;
import java.lang.Exception;
import sj7.d;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class e implements c$c	// class@002405
{
    public final View a;
    public final d b;

    public void e(d p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailed(Exception p0){
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          this.b.a(this.a);
       }
       return;
    }
}
