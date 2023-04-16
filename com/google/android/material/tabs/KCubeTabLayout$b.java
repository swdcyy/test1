package com.google.android.material.tabs.KCubeTabLayout$b;
import fr6.i;
import com.google.android.material.tabs.KCubeTabLayout;
import java.lang.Object;
import wq6.h;
import fr6.h;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$f;

public class KCubeTabLayout$b implements i	// class@0016b5
{
    public final KCubeTabLayout a;

    public void KCubeTabLayout$b(KCubeTabLayout p0){
       this.a = p0;
       super();
    }
    public void a(h p0,int p1){
       h.a(this, p0, p1);
    }
    public void b(h p0,h p1,int p2,int p3,float p4){
       h.b(this, p0, p1, p2, p3, p4);
    }
    public void c(h p0,int p1){
       KCubeTabLayout$b ta = this.a;
       if (p1 != ta.o) {
          ta.o = -1;
       }
       if (ta.getSelectedTabPosition() != p1 && p1 < this.a.getTabCount()) {
          ta = this.a;
          ta.D(ta.v(p1), false);
       }
       return;
    }
}
