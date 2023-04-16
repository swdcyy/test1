package al2.b;
import ps5.b;
import com.kuaishou.live.core.show.subscribe.profile.c;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import dx5.h$a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.core.show.subscribe.profile.LiveSubscibeDynamicButtonStatus;
import ps5.a;

public final class b implements b	// class@0000f9
{
    public final c b;
    public final ProfileTemplateCard c;
    public final h$a d;

    public void b(c p0,ProfileTemplateCard p1,h$a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Boolean p0){
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.b(tc, LiveSubscibeDynamicButtonStatus.BOOKED.getValue(), td);
       }
       return;
    }
    public void accept(Object p0){
       a.a(this, p0);
    }
}
