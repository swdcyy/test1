package cpd.b;
import android.view.View$OnClickListener;
import com.yxcrop.plugin.kwaiui.widget.KwaiTokenGalleryView;
import java.lang.Object;
import android.view.View;
import cpd.a;

public class b implements View$OnClickListener	// class@000c7b
{
    public final int b;
    public final KwaiTokenGalleryView c;

    public void b(KwaiTokenGalleryView p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       KwaiTokenGalleryView c = this.c.c;
       if (c != null) {
          c.j4(this.b);
       }
       return;
    }
}
