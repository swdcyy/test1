package com.yxcorp.gifshow.prettify.body.ui.a$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.prettify.body.ui.a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import com.kwai.library.widget.progressbar.DownloadProgressBar;

public class a$a extends RecyclerView$ViewHolder	// class@001139
{
    public View a;
    public KwaiImageView b;
    public TextView c;
    public View d;
    public ImageView e;
    public DownloadProgressBar f;
    public ImageView g;
    public final a h;

    public void a$a(a p0,View p1){
       a.p(p1, "itemView");
       this.h = p0;
       super(p1);
       this.b = p1.findViewById(0x7f0a130c);
       this.c = p1.findViewById(0x7f0a2d10);
       this.d = p1.findViewById(0x7f0a0be0);
       this.e = p1.findViewById(0x7f0a0c01);
    }
    public final ImageView a(){
       return this.e;
    }
    public final KwaiImageView b(){
       return this.b;
    }
    public final DownloadProgressBar c(){
       return this.f;
    }
    public final ImageView d(){
       return this.g;
    }
}
