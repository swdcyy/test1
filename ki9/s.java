package ki9.s;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import cw9.c;

public class s extends ViewOutlineProvider	// class@002ca0
{
    public final SampleVideoView a;

    public void s(SampleVideoView p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)c.b(this.a.getResources(), R.dimen.arg_RES_7f07034b));
       return;
    }
}
