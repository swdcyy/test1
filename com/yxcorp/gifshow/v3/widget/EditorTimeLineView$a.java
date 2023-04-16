package com.yxcorp.gifshow.v3.widget.EditorTimeLineView$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;

public class EditorTimeLineView$a implements Runnable	// class@00163d
{
    public final EditorTimeLineView b;

    public void EditorTimeLineView$a(EditorTimeLineView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, EditorTimeLineView$a.class, "1")) {
          return;
       }
       EditorTimeLineView g = this.b.g;
       if (g != null) {
          g.invalidate();
       }
       return;
    }
}
