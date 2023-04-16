package androidx.viewpager2.adapter.FragmentStateAdapter$a;
import android.view.View$OnLayoutChangeListener;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import android.widget.FrameLayout;
import i3.a;
import java.lang.Object;
import android.view.View;
import android.view.ViewParent;

public class FragmentStateAdapter$a implements View$OnLayoutChangeListener	// class@000a25
{
    public final FrameLayout b;
    public final a c;
    public final FragmentStateAdapter d;

    public void FragmentStateAdapter$a(FragmentStateAdapter p0,FrameLayout p1,a p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (this.b.getParent() != null) {
          this.b.removeOnLayoutChangeListener(this);
          this.d.X0(this.c);
       }
       return;
    }
}
