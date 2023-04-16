package nf.a$a;
import ff.d;
import nf.a;
import com.facebook.react.uimanager.ViewGroupManager;
import android.view.ViewGroup;
import android.view.View;
import android.util.SparseIntArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.Math;

public class a$a implements d	// class@0026ff
{
    public final ViewGroupManager a;
    public final ViewGroup b;
    public final View c;
    public final SparseIntArray d;
    public final int e;
    public final a f;

    public void a$a(a p0,ViewGroupManager p1,ViewGroup p2,View p3,SparseIntArray p4,int p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void onAnimationEnd(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.a.removeView(this.b, this.c);
       this.f.E(this.c);
       this.d.put(this.e, Math.max(0, (this.d.get(this.e, 0) - 1)));
       return;
    }
}
