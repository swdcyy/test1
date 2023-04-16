package jca.a$e;
import androidx.lifecycle.Observer;
import jca.a;
import java.lang.Object;
import gca.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.widget.RecordSeekBar;
import android.view.View;
import gca.c;
import android.widget.SeekBar;
import ica.c;
import com.kuaishou.edit.draft.FineTuningParam;
import gca.a;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import jca.c;
import java.lang.Runnable;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class a$e implements Observer	// class@002a4b
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else if(p0 == null){
          this.b.d.setVisibility(8);
          this.b.e.setVisibility(8);
       }else {
          this.b.d.setExtOffset(p0.d().c());
          this.b.d.setDefaultIndicatorProgress(p0.d().f);
          this.b.d.setMax((p0.d().b() - p0.d().c()));
          this.b.d.setProgress((int)c.a.a(p0.b(), p0.a()));
          int i = 0;
          this.b.d.setVisibility(i);
          this.b.e.setVisibility(i);
          a$e tb = this.b;
          if (tb.j != null) {
             tb.d.post(new c(this, p0));
             this.b.j = i;
          }
          Object[] objArray = new Object[i];
          a.D().w("FineTuningPanelViewBinder", "mSelectedFineTuningItemUiData it:"+p0, objArray);
       }
       return;
    }
}
