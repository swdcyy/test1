package androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a$e;
import android.view.View$OnLayoutChangeListener;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a;
import java.lang.Object;
import android.view.View;

public final class SlideVerticalAtlasPlayer$b$a$e implements View$OnLayoutChangeListener	// class@0008c7
{
    public final SlideVerticalAtlasPlayer$b$a b;

    public void SlideVerticalAtlasPlayer$b$a$e(SlideVerticalAtlasPlayer$b$a p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if ((p1 - p3) != (p5 - p7) || (p2 - p4) != (p6 - p8)) {
          this.b.a();
       }
       return;
    }
}
