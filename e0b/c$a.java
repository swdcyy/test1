package e0b.c$a;
import com.kwai.library.widget.popup.common.c$b;
import android.app.Activity;
import com.kwai.library.widget.popup.common.SystemBarInfo;
import com.kwai.library.widget.popup.common.f;

public class c$a extends c$b	// class@0025b1
{
    public String G;

    public void c$a(Activity p0){
       super(p0);
       SystemBarInfo systemBarInf = f.i(p0);
       int i = (systemBarInf.mIsExist == null)? 0: systemBarInf.mHeight;
       this.x(i);
       return;
    }
}
