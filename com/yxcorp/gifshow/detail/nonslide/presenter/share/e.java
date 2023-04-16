package com.yxcorp.gifshow.detail.nonslide.presenter.share.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.g;
import i2b.a;
import zf6.k;
import zf6.l;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import o07.n;

public final class e implements PopupInterface$f	// class@0015df
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View view = a.g(p1, R.layout.arg_RES_7f0d02d4, p2, false);
       String str = (k.d())? "https://static.yximgs.com/udata/pkg/kwai-client-image/fans_share_guide_reward_dark.webp": "https://static.yximgs.com/udata/pkg/kwai-client-image/fans_share_guide_reward_light.webp";
       KwaiImageView kwaiImageVie = view.findViewById(R.id.guide_image);
       kwaiImageVie.L(str);
       kwaiImageVie.setBackgroundResource(l.m(R.drawable.arg_RES_7f080958, 0x7f080959));
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
