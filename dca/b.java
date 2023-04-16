package dca.b;
import android.widget.ViewSwitcher$ViewFactory;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import android.content.Context;
import androidx.core.content.ContextCompat;

public final class b implements ViewSwitcher$ViewFactory	// class@001eee
{
    public final FragmentActivity a;

    public void b(FragmentActivity p0){
       this.a = p0;
       super();
    }
    public final View makeView(){
       TextView obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextView(this.a);
       obj.setTextSize(12.00f);
       obj.setGravity(17);
       obj.setTextColor(ContextCompat.getColor(this.a, R.color.arg_RES_7f061c3c));
       return obj;
    }
}
