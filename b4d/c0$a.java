package b4d.c0$a;
import java.lang.Runnable;
import b4d.c0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b4d.a0;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;

public final class c0$a implements Runnable	// class@00035a
{
    public final c0 b;

    public void c0$a(c0 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, c0$a.class, "1")) {
          return;
       }
       a0.R8(this.b.b).Ui(true);
       PatchProxy.onMethodExit(c0$a.class, "1");
       return;
    }
}
