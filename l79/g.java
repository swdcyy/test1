package l79.g;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class g extends m	// class@002cbc
{
    public final AlbumSelectedContainer c;

    public void g(AlbumSelectedContainer p0,boolean p1,long p2){
       this.c = p0;
       super(p1, p2);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.c.R();
       return;
    }
}
