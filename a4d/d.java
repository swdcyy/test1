package a4d.d;
import java.lang.Runnable;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Object;

public final class d implements Runnable	// class@000087
{
    public final EmotionFloatEditorFragment b;

    public void d(EmotionFloatEditorFragment p0){
       this.b = p0;
    }
    public final void run(){
       this.b.Ui(true);
    }
}
