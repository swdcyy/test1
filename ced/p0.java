package ced.p0;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.plugin.search.result.hashtag.presenters.r;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.b;

public class p0 extends m	// class@000571
{
    public final r c;

    public void p0(r p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "1")) {
          return;
       }
       this.c.S8(b.H());
       return;
    }
}
