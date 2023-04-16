package ok0.j;
import android.view.View$OnClickListener;
import com.kuaishou.ksmvvm.command.KSCommand;
import java.lang.Object;
import android.view.View;
import ok0.m;

public final class j implements View$OnClickListener	// class@003516
{
    public final KSCommand[] b;

    public void j(KSCommand[] p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       m.f(this.b, p0);
    }
}
