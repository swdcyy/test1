package d89.j;
import java.lang.Runnable;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import com.kwai.feature.api.platform.antispam.model.FaceRecognitionNetworkException;
import java.lang.Throwable;

public final class j implements Runnable	// class@00208c
{
    public final PublishSubject b;
    public final int c;

    public void j(PublishSubject p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.onError(new FaceRecognitionNetworkException(this.c));
    }
}
