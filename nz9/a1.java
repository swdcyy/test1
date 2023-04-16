package nz9.a1;
import z1.a;
import nz9.z0$g;
import java.lang.Object;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.util.Objects;
import as7.a;
import java.lang.String;
import q87.c;
import nz9.z0;
import com.yxcorp.gifshow.autoplay.live.g;

public final class a1 implements a	// class@00320f
{
    public final z0$g a;

    public void a1(z0$g p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       a1 ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = new Object[0];
       a.C().s("AvatarAndFollowBaseElement", "setLiveTexture", objArray);
       ta.a.W0.d0(p0);
    }
}
