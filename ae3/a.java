package ae3.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.liteend.baseinfo.a;
import java.lang.Object;
import android.view.View;
import java.lang.Runnable;

public final class a implements View$OnClickListener	// class@00009c
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.k.run();
    }
}
