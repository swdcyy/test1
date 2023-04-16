package ok0.k;
import android.view.View$OnClickListener;
import com.kuaishou.ksmvvm.command.KSCommand;
import java.lang.Object;
import android.view.View;
import ok0.m;

public final class k implements View$OnClickListener	// class@003517
{
    public final KSCommand[] b;

    public void k(KSCommand[] p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       m.g(this.b, p0);
    }
}
