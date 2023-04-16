package mq9.a$d;
import cm5.d;
import android.app.Activity;
import ul5.g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import cm5.b;

public final class a$d implements d	// class@00306c
{
    public final Activity a;
    public final g b;
    public final PopupInterface$h c;

    public void a$d(Activity p0,g p1,PopupInterface$h p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(Exception p0){
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "1")) {
          return;
       }
       d.a(0x822e1c2).fQ(this.a, this.b, this.c);
       return;
    }
}
