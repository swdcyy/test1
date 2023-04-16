package e19.b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import e19.c;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class b implements IMediaPlayer$OnInfoListener	// class@00211c
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       b tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       boolean b = false;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), tb, uoc, "8");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(tb.w == null && !tb.getActivity().isFinishing()){
             if (p1 == 701) {
                tb.z = true;
                if (tb.y != null) {
                   tb.W8();
                }
             }else if(p1 == 702){
                if (tb.x != null) {
                   tb.P8();
                }
                tb.z = b;
             }else if(p1 == 0x2775){
                tb.w = true;
             }
          }
       }else {
          goto label_0023 ;
       }
       return b;
    }
}
