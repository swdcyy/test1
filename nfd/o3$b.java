package nfd.o3$b;
import ub.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nfd.o3;

public class o3$b extends a	// class@001dec
{
    public final KwaiImageView b;
    public final int c;

    public void o3$b(KwaiImageView p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o3$b.class, "1")) {
       }else if(p1 != null){
          o3.M(this.b, p1.getWidth(), p1.getHeight(), this.c);
       }
       return;
    }
}
