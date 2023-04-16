package elb.p;
import erd.g;
import com.yxcorp.gifshow.model.h;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.util.concurrent.ConcurrentHashMap;
import io.reactivex.subjects.SingleSubject;

public final class p implements g	// class@002761
{
    public final h b;
    public final String c;

    public void p(h p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       SingleSubject singleSubjec = this.b.a.get(this.c);
       if (singleSubjec != null) {
          singleSubjec.onSuccess(p0);
       }
       return;
    }
}
