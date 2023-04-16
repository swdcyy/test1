package g33.r;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import dx5.h$a;
import java.lang.Object;
import i33.d;

public final class r implements g	// class@002a5c
{
    public final GifshowActivity b;
    public final String c;
    public final ProfileTemplateCard d;
    public final h$a e;

    public void r(GifshowActivity p0,String p1,ProfileTemplateCard p2,h$a p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       p0.d3(this.b, this.c, this.d, this.e);
    }
}
