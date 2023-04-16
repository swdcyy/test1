package jk.g;
import android.view.View$OnClickListener;
import com.google.android.material.tabs.KCubeTabLayout;
import com.google.android.material.tabs.NasaTabView;
import java.lang.Object;
import android.view.View;

public final class g implements View$OnClickListener	// class@002422
{
    public final KCubeTabLayout b;
    public final int c;
    public final NasaTabView d;

    public void g(KCubeTabLayout p0,int p1,NasaTabView p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       KCubeTabLayout.T(this.b, this.c, this.d, p0);
    }
}
