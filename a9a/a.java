package a9a.a;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import vq4.c;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import vq4.d;

public final class a implements g	// class@000077
{
    public final QPhoto b;

    public void a(QPhoto p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0.F.o = this.b.mEntity.getId();
       p0.o0 = 1;
    }
}
