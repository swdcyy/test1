package androidx.fragment.app.FragmentManagerImpl$a;
import o0.b;
import androidx.fragment.app.FragmentManagerImpl;

public class FragmentManagerImpl$a extends b	// class@000783
{
    public final FragmentManagerImpl c;

    public void FragmentManagerImpl$a(FragmentManagerImpl p0,boolean p1){
       this.c = p0;
       super(p1);
    }
    public void b(){
       this.c.handleOnBackPressed();
    }
}
