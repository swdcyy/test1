package cg6.e;
import java.lang.Runnable;
import com.kwai.framework.ui.popupmanager.PopupConfigInitModule;
import java.lang.Object;

public final class e implements Runnable	// class@0006bc
{
    public final PopupConfigInitModule b;

    public void e(PopupConfigInitModule p0){
       this.b = p0;
    }
    public final void run(){
       PopupConfigInitModule.l0(this.b);
    }
}
