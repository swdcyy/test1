package nz9.r0;
import msd.a;
import nz9.z0;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;

public final class r0 implements a	// class@003241
{
    public final z0 b;

    public void r0(z0 p0){
       this.b = p0;
    }
    public final Object invoke(){
       r0 tb = this.b;
       AvatarInfoResponse mPhoto = (tb.Q != null)? tb.Q.mPhoto: null;
       return mPhoto;
    }
}
