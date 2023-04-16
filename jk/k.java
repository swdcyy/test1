package jk.k;
import erd.g;
import java.lang.Runnable;
import java.lang.Object;
import com.google.android.material.tabs.KCubeTabLayout;

public final class k implements g	// class@002426
{
    public final Runnable b;

    public void k(Runnable p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       KCubeTabLayout.P(this.b, p0);
    }
}
