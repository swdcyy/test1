package jk.t;
import zq6.u;
import com.google.android.material.tabs.KCubeTabLayout;
import com.google.android.material.tabs.NasaTabView;
import wq6.h;
import java.lang.Object;
import sn5.g;

public final class t implements u	// class@00242f
{
    public final KCubeTabLayout a;
    public final int b;
    public final NasaTabView c;
    public final h d;

    public void t(KCubeTabLayout p0,int p1,NasaTabView p2,h p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void onChange(Object p0){
       KCubeTabLayout.R(this.a, this.b, this.c, this.d, p0);
    }
}
