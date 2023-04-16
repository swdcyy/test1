package jca.c;
import java.lang.Runnable;
import jca.a$e;
import gca.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jca.a;
import com.kwai.feature.post.api.widget.RecordSeekBar;
import gca.c;
import ica.c;
import com.kuaishou.edit.draft.FineTuningParam;
import gca.a;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import jca.c$a;
import android.widget.SeekBar;

public final class c implements Runnable	// class@002a52
{
    public final a$e b;
    public final b c;

    public void c(a$e p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       if (this.b.b.d.getProgress() == this.c.d().b()) {
          this.b.b.d.setProgress(((int)c.a.a(this.c.b(), this.c.a()) - 1));
       }else {
          this.b.b.d.setProgress(((int)c.a.a(this.c.b(), this.c.a()) + 1));
       }
       this.b.b.d.post(new c$a(this));
       return;
    }
}
