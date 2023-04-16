package com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.vh.NormalLyricItemVH$progressBar$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public final class NormalLyricItemVH$progressBar$2 extends Lambda implements a	// class@0010dd
{
    public final View $itemView;

    public void NormalLyricItemVH$progressBar$2(View p0){
       this.$itemView = p0;
       super(0);
    }
    public final DownloadProgressBar invoke(){
       DownloadProgressBar obj = PatchProxy.apply(null, this, NormalLyricItemVH$progressBar$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$itemView.findViewById(R.id.download_progressbar);
       obj.setProgressArcColor(a1.a(R.color.arg_RES_7f0609ce));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
