package jk.j;
import zq6.u;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.Object;
import wn5.b;
import com.google.android.material.tabs.KCubeTabLayout;

public final class j implements u	// class@002425
{
    public final TabLayout$f a;
    public final boolean b;

    public void j(TabLayout$f p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onChange(Object p0){
       KCubeTabLayout.X(this.a, this.b, p0);
    }
}
