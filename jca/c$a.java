package jca.c$a;
import java.lang.Runnable;
import jca.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jca.a$e;
import jca.a;
import ica.c;
import com.kuaishou.edit.draft.FineTuningParam;
import gca.a;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import com.kwai.feature.post.api.widget.RecordSeekBar;

public final class c$a implements Runnable	// class@002a51
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       c$a tb = this.b;
       tb.b.b.d.setProgress((int)c.a.a(tb.c.b(), this.b.c.a()));
       return;
    }
}
