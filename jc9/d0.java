package jc9.d0;
import com.yxcorp.gifshow.bubble.a;
import jc9.b0;
import java.lang.Runnable;
import java.lang.Object;
import ra9.a;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import brd.t;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.kwai.library.widget.popup.common.c;

public class d0 implements a	// class@00293b
{
    public final Runnable b;
    public final b0 c;

    public void d0(b0 p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean c(){
       return a.e(this);
    }
    public c d(){
       return RecordBubbleItem.AUTO_DOWNLOAD_PANEL;
    }
    public void dismiss(){
       a.b(this);
    }
    public t e(){
       return a.a(this);
    }
    public boolean f(){
       return a.d(this);
    }
    public boolean g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(p0, "android.permission.RECORD_AUDIO");
    }
    public boolean i(FragmentActivity p0,PostBubbleManager$c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, d0.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b.run();
       if (p1 != null) {
          p1.b(this, null);
       }
       d0 tc = this.c;
       tc.j = this;
       tc.k = p1;
       return true;
    }
}
