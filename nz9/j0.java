package nz9.j0;
import java.lang.Runnable;
import nz9.z0;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.lang.Object;

public final class j0 implements Runnable	// class@003229
{
    public final z0 b;
    public final AvatarInfoResponse c;

    public void j0(z0 p0,AvatarInfoResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.p0(this.c);
    }
}
