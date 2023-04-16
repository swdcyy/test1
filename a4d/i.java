package a4d.i;
import android.view.ViewTreeObserver$OnWindowFocusChangeListener;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Object;

public final class i implements ViewTreeObserver$OnWindowFocusChangeListener	// class@00008c
{
    public final EmotionFloatEditorFragment a;

    public void i(EmotionFloatEditorFragment p0){
       this.a = p0;
    }
    public final void onWindowFocusChanged(boolean p0){
       i ta = this.a;
       if (ta.G1 != null && p0) {
          ta.Vi();
       }
       return;
    }
}
