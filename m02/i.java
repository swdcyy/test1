package m02.i;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class i implements View$OnClickListener	// class@0030c2
{
    public final LivePlayActivity b;

    public void i(LivePlayActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LivePlayActivity.class, "22")) {
       }else {
          tb.onBackPressed();
       }
       return;
    }
}
