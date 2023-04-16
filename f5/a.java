package f5.a;
import android.graphics.drawable.Drawable$Callback;
import a5.b;
import java.lang.Object;
import g5.h;
import java.util.HashMap;
import android.view.View;
import android.content.Context;
import android.content.res.AssetManager;

public class a	// class@001fd0
{
    public final h a;
    public final Map b;
    public final Map c;
    public final AssetManager d;
    public b e;
    public String f;

    public void a(Drawable$Callback p0,b p1){
       super();
       this.a = new h();
       this.b = new HashMap();
       this.c = new HashMap();
       this.f = ".ttf";
       if (!p0 instanceof View) {
          this.d = null;
          return;
       }else {
          this.d = p0.getContext().getAssets();
          return;
       }
    }
}
