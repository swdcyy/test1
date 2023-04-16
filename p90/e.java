package p90.e;
import hka.a;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.KuaishanVideoClipFragment;
import java.lang.Object;
import com.kwai.video_clip.ui.VideoClipFragment;
import sw7.e;

public final class e implements a	// class@0028f2
{
    public final KuaishanVideoClipFragment b;

    public void e(KuaishanVideoClipFragment p0){
       this.b = p0;
    }
    public final boolean onBackPressed(){
       VideoClipFragment j = this.b.j;
       if (j != null) {
          j.h();
       }
       return true;
    }
}
