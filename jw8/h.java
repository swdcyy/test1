package jw8.h;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;

public final class h implements Callable	// class@0029bf
{
    public final EncodeRequest$a b;
    public final KtvInfo c;

    public void h(EncodeRequest$a p0,KtvInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       h tb = this.b;
       h tc = this.c;
       File uFile = b.X(PostUtils.g("[>|52|>]"), "temp.mp4");
       uFile.delete();
       tb.c(uFile.getAbsolutePath());
       uFile = b.X(PostUtils.g("[>|53|>]"), ".mp4");
       uFile.delete();
       tc.mOutputAudioPath = uFile.getAbsolutePath();
       tc.mOutputCoverPath = tb.a;
       return tb;
    }
}
