package com.yxcorp.gifshow.prettify.makeup.a$b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import lnc.a1;

public class a$b extends RecyclerView$ViewHolder	// class@001163
{
    public String a;
    public KwaiImageView b;
    public View c;
    public TextView d;
    public ImageView e;
    public ProgressBar f;
    public PrettifyTagView g;
    public ImageView h;

    public void a$b(View p0){
       super(p0);
       this.b = p0.findViewById(0x7f0a130c);
       this.d = p0.findViewById(0x7f0a2d10);
       this.e = p0.findViewById(0x7f0a4329);
       this.f = p0.findViewById(0x7f0a0c1b);
       this.c = p0.findViewById(0x7f0a381a);
       this.g = p0.findViewById(0x7f0a31c9);
       this.h = p0.findViewById(0x7f0a3819);
       a$b tf = this.f;
       if (tf instanceof DownloadProgressBar) {
          tf.setProgressArcColor(a1.a(R.color.arg_RES_7f061c92));
          this.f.setProgressArcBackgroundColor(a1.a(R.color.arg_RES_7f061c91));
       }
       return;
    }
}
