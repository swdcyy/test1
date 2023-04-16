package c42.k;
import java.lang.Runnable;
import c42.m;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;

public final class k implements Runnable	// class@0004bb
{
    public final m b;

    public void k(m p0){
       this.b = p0;
    }
    public final void run(){
       k tb = this.b;
       Objects.requireNonNull(tb);
       tb.Y8(new QPhoto(tb.v), false);
    }
}
