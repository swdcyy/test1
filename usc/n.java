package usc.n;
import usc.p;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;

public abstract class n implements p	// class@003f00
{
    public EditPrettifyFragment a;
    public EditorDelegate b;

    public void n(){
       super();
    }
    public abstract void b(VideoContext p0);
    public abstract Bundle c();
    public EditorDelegate d(){
       return this.b;
    }
    public void e(){
    }
    public void f(EditorDelegate p0){
       this.b = p0;
    }
}
