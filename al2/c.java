package al2.c;
import erd.g;
import com.kuaishou.live.core.show.subscribe.profile.c;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import dx5.h$a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.core.show.subscribe.profile.LiveSubscibeDynamicButtonStatus;

public final class c implements g	// class@0000fa
{
    public final c b;
    public final ProfileTemplateCard c;
    public final h$a d;

    public void c(c p0,ProfileTemplateCard p1,h$a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       Objects.requireNonNull(tb);
       int value = (p0.booleanValue())? LiveSubscibeDynamicButtonStatus.NOT_BOOK.getValue(): LiveSubscibeDynamicButtonStatus.BOOKED.getValue();
       tb.b(tc, value, td);
       return;
    }
}
