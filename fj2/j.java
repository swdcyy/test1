package fj2.j;
import erd.g;
import fj2.o;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import z12.e;

public final class j implements g	// class@002972
{
    public final o b;

    public void j(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       String[] stringArray = new String[0];
       e.c("LiveAudienceScreencastPresenter", "onBind\(\) enable£º"+p0.mEnableLiveScreencast, stringArray);
       tb.F = p0;
       tb.j9();
    }
}
