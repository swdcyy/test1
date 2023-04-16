package ek2.s;
import erd.g;
import com.kuaishou.live.core.show.stayinfo.c;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import com.yxcorp.plugin.live.widget.LiveBreathAvatarView;

public final class s implements g	// class@00275b
{
    public final c b;

    public void s(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.PAUSE || p0 == FragmentEvent.STOP) {
          tb.v.M();
       }else if(p0 == FragmentEvent.RESUME){
          tb.v.L();
       }
       return;
    }
}
