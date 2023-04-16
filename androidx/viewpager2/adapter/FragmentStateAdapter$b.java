package androidx.viewpager2.adapter.FragmentStateAdapter$b;
import androidx.fragment.app.c$b;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.fragment.app.Fragment;
import android.widget.FrameLayout;
import androidx.fragment.app.c;
import android.view.View;
import android.os.Bundle;

public class FragmentStateAdapter$b extends c$b	// class@000a26
{
    public final Fragment a;
    public final FrameLayout b;
    public final FragmentStateAdapter c;

    public void FragmentStateAdapter$b(FragmentStateAdapter p0,Fragment p1,FrameLayout p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void m(c p0,Fragment p1,View p2,Bundle p3){
       if (p1 == this.a) {
          p0.unregisterFragmentLifecycleCallbacks(this);
          this.c.J0(p2, this.b);
       }
       return;
    }
}
