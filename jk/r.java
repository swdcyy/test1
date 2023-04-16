package jk.r;
import zq6.u;
import com.google.android.material.tabs.KCubeTabLayout;
import java.lang.Object;
import java.lang.Float;

public final class r implements u	// class@00242d
{
    public final KCubeTabLayout a;

    public void r(KCubeTabLayout p0){
       this.a = p0;
    }
    public final void onChange(Object p0){
       KCubeTabLayout.W(this.a, p0.floatValue());
    }
}
