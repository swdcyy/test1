package a2.d0;
import java.lang.Object;
import android.content.Context;
import android.os.Build$VERSION;
import android.view.PointerIcon;

public final class d0	// class@000052
{
    public Object a;

    public void d0(Object p0){
       super();
       this.a = p0;
    }
    public static d0 b(Context p0,int p1){
       if (Build$VERSION.SDK_INT >= 24) {
          return new d0(PointerIcon.getSystemIcon(p0, p1));
       }
       return new d0(null);
    }
    public Object a(){
       return this.a;
    }
}
