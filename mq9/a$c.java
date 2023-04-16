package mq9.a$c;
import cm5.d;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import k2b.e0;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import cm5.c;

public final class a$c implements d	// class@00306b
{
    public final QPhoto a;
    public final Activity b;
    public final e0 c;
    public final boolean d;

    public void a$c(QPhoto p0,Activity p1,e0 p2,boolean p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(Exception p0){
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       d.a(-241623919).dw(this.a, this.b, this.c, this.d);
       return;
    }
}
