package n90.e;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.album.KSPostAlbumProcessActivity;
import java.lang.Object;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.logic.o1;

public final class e implements Runnable	// class@0026d2
{
    public final KSPostAlbumProcessActivity b;

    public void e(KSPostAlbumProcessActivity p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       tb.P = true;
       tb.A3(tb.S.k0(), false);
    }
}
