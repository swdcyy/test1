package g93.i;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import g93.i$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class i extends ViewController	// class@002ae0
{
    public final LiveData j;

    public void i(LiveData p0){
       a.p(p0, "dataProvider");
       super();
       this.j = p0;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0976);
       this.j.observe(this, new i$a(this.A2(R.id.lite_benefit_card_tag_icon), this.A2(R.id.lite_benefit_card_tag_text_view)));
       return;
    }
}
