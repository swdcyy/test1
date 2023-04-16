package ao4.a;
import android.view.View$OnClickListener;
import android.content.Context;
import java.lang.Object;
import android.view.View;
import android.content.Intent;
import com.kuaishou.network.testconfig.RegionInfoActivity;
import java.lang.Class;

public final class a implements View$OnClickListener	// class@0002ba
{
    public final Context b;

    public void a(Context p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       tb.startActivity(new Intent(tb, RegionInfoActivity.class));
    }
}
