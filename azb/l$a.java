package azb.l$a;
import java.lang.Runnable;
import azb.l;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.post.topic.TagSourceUtils;
import com.yxcorp.gifshow.upload.UploadInfo;

public final class l$a implements Runnable	// class@000377
{
    public final l b;
    public final String c;

    public void l$a(l p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "1")) {
          return;
       }
       TagSourceUtils.b.m(this.b.b.getCaption(), this.b.b.mTagSourceCollection, this.c);
       return;
    }
}
