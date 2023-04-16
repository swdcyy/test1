package a4d.f;
import java.lang.Runnable;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Object;
import android.view.View;

public final class f implements Runnable	// class@000089
{
    public final EmotionFloatEditorFragment b;

    public void f(EmotionFloatEditorFragment p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       if (tb.f1.getVisibility() == 8) {
          tb.Ui(true);
       }
       return;
    }
}
