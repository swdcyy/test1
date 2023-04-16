package com.yxcorp.gifshow.prettify.v4.magic.filter.j$e;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$c;
import android.view.View;
import com.kwai.feature.post.api.widget.PrettifyLoadingView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;

public class j$e extends j$c	// class@0011c4
{
    public final PrettifyLoadingView l;
    public final View m;

    public void j$e(View p0){
       super(p0);
       this.l = p0.findViewById(0x7f0a28fe);
       this.m = p0.findViewById(0x7f0a1478);
       this.e.setVisibility(8);
       this.f.setVisibility(8);
       this.a.setForegroundDrawable(null);
       this.a.getHierarchy().x(0);
       this.a.getHierarchy().v(null);
       this.a.getHierarchy().F(null);
    }
}
