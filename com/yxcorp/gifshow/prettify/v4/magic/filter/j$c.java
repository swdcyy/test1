package com.yxcorp.gifshow.prettify.v4.magic.filter.j$c;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import android.widget.RelativeLayout;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import lnc.a1;

public class j$c extends RecyclerView$ViewHolder	// class@0011c2
{
    public final KwaiImageView a;
    public final View b;
    public final PrettifyTagView c;
    public final TextView d;
    public final ImageView e;
    public final ProgressBar f;
    public final RelativeLayout g;
    public final ImageView h;
    public int i;
    public String j;
    public boolean k;

    public void j$c(View p0){
       super(p0);
       this.a = p0.findViewById(0x7f0a130c);
       this.d = p0.findViewById(0x7f0a2d10);
       this.b = p0.findViewById(0x7f0a381a);
       this.e = p0.findViewById(0x7f0a4329);
       ProgressBar progressBar = p0.findViewById(R.id.download_progressbar);
       this.f = progressBar;
       this.c = p0.findViewById(0x7f0a31c9);
       this.g = p0.findViewById(0x7f0a07d1);
       this.h = p0.findViewById(0x7f0a3819);
       if (progressBar instanceof DownloadProgressBar) {
          progressBar.setProgressArcColor(a1.a(R.color.arg_RES_7f061c92));
          progressBar.setProgressArcBackgroundColor(a1.a(R.color.arg_RES_7f061c91));
       }
       return;
    }
}
