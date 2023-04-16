package a9d.c$a;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import a9d.c;
import com.yxcorp.plugin.search.entity.BubbleConfig;
import com.kwai.library.widget.popup.common.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$a extends PopupInterface$g	// class@0000a4
{
    public final BubbleConfig c;
    public final c d;

    public void c$a(c p0,int p1,BubbleConfig p2){
       this.d = p0;
       this.c = p2;
       super(p1);
    }
    public void c(c p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "1")) {
          return;
       }
       this.d.e(p1, this.c);
       return;
    }
}
