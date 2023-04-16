package e63.o1;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import p91.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e63.n1;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import java.lang.Boolean;

public class o1	// class@002667
{
    public ViewGroup a;
    public KwaiImageView b;
    public KwaiImageView c;
    public boolean d;
    public LiveUserProfileExtraInfo e;
    public m f;

    public void o1(ViewGroup p0,KwaiImageView p1,KwaiImageView p2,m p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.f = p3;
       if (PatchProxy.applyVoid(null, this, o1.class, "2")) {
       }else {
          this.b.setOnClickListener(new n1(this));
       }
       return;
    }
    public void a(boolean p0){
       o1 oo1 = o1.class;
       if (PatchProxy.isSupport(oo1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo1, "1")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       oo1 = this.a;
       int i = (p0)? 0: 8;
       oo1.setVisibility(i);
       return;
    }
}
