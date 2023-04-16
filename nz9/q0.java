package nz9.q0;
import msd.a;
import nz9.z0;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;

public final class q0 implements a	// class@00323e
{
    public final z0 b;

    public void q0(z0 p0){
       this.b = p0;
    }
    public final Object invoke(){
       q0 tb = this.b;
       AvatarInfoResponse mPhoto = (tb.Q != null)? tb.Q.mPhoto: null;
       return mPhoto;
    }
}
