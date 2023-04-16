package a4d.r;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.plugin.emotion.fragment.f0;
import java.lang.Runnable;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import android.os.Handler;

public final class r implements View$OnLayoutChangeListener	// class@000095
{
    public final f0 b;
    public final Runnable c;

    public void r(f0 p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       r tb = this.b;
       r tc = this.c;
       tb.c.x1.removeCallbacks(tc);
       tb.c.x1.postDelayed(tc, 20);
    }
}
