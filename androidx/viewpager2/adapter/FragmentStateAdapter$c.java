package androidx.viewpager2.adapter.FragmentStateAdapter$c;
import java.lang.Runnable;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.lang.Object;

public class FragmentStateAdapter$c implements Runnable	// class@000a27
{
    public final FragmentStateAdapter b;

    public void FragmentStateAdapter$c(FragmentStateAdapter p0){
       this.b = p0;
       super();
    }
    public void run(){
       FragmentStateAdapter$c tb = this.b;
       tb.k = false;
       tb.O0();
    }
}
