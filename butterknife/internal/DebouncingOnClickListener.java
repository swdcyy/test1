package butterknife.internal.DebouncingOnClickListener;
import android.view.View$OnClickListener;
import butterknife.internal.a;
import java.lang.Object;
import android.view.View;
import java.lang.Runnable;

public abstract class DebouncingOnClickListener implements View$OnClickListener	// class@000ba3
{
    public static final Runnable ENABLE_AGAIN;
    public static boolean enabled;

    static {
       DebouncingOnClickListener.ENABLE_AGAIN = a.b;
    }
    public void DebouncingOnClickListener(){
       super();
    }
    public static void lambda$static$0(){
       DebouncingOnClickListener.enabled = true;
    }
    public abstract void doClick(View p0);
    public final void onClick(View p0){
       if (DebouncingOnClickListener.enabled) {
          DebouncingOnClickListener.enabled = false;
          p0.post(DebouncingOnClickListener.ENABLE_AGAIN);
          this.doClick(p0);
       }
       return;
    }
}
