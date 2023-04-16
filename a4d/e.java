package a4d.e;
import java.lang.Runnable;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Object;
import android.view.View;

public final class e implements Runnable	// class@000088
{
    public final EmotionFloatEditorFragment b;

    public void e(EmotionFloatEditorFragment p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       if (tb.h1.getVisibility()) {
          tb.Ti(true);
       }
       return;
    }
}
