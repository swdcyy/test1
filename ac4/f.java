package ac4.f;
import java.lang.Runnable;
import android.app.Activity;
import com.kuaishou.merchant.bridgecenter.params.ShowBottomSheetRNDialogParams;
import java.lang.Object;
import java.util.HashMap;
import tkd.b;
import tkd.d;
import vs3.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import java.lang.String;
import java.util.Map;
import androidx.fragment.app.KwaiDialogFragment;

public final class f implements Runnable	// class@000078
{
    public final Activity b;
    public final ShowBottomSheetRNDialogParams c;

    public void f(Activity p0,ShowBottomSheetRNDialogParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       HashMap hashMap = new HashMap();
       hashMap.put("hideDim", "true");
       d.a(0x7074b578).nl(this.b, this.c.mUrl, hashMap);
    }
}
