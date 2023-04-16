package com.kuaishou.merchant.live.lite.sidebar.a$a;
import com.kuaishou.merchant.live.lite.sidebar.a;
import android.view.ViewGroup;
import com.google.gson.JsonObject;
import java.lang.Object;
import fg6.a;
import com.kuaishou.merchant.live.lite.models.LiveLiteMerchantSideBarConfig;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.google.gson.Gson;
import android.view.View;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import java.lang.String;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import l64.b;
import w4.k;
import l64.a;
import w4.j;

public class a$a	// class@001a32
{
    public final ViewGroup a;
    public final KwaiImageView b;
    public final LiveLottieAnimationView c;
    public final TextView d;
    public LiveLiteMerchantSideBarConfig e;
    public final a f;

    public void a$a(a p0,ViewGroup p1,JsonObject p2){
       this.f = p0;
       super();
       this.a = p1;
       if (p2 != null) {
          this.e = a.a.c(p2, LiveLiteMerchantSideBarConfig.class);
       }
       TextView textView = p1.findViewById(R.id.live_lite_sidebar_cart_text);
       this.d = textView;
       KwaiImageView kwaiImageVie = p1.findViewById(R.id.live_lite_sidebar_cart_default_icon);
       this.b = kwaiImageVie;
       LiveLottieAnimationView liveLottieAn = p1.findViewById(R.id.live_lite_sidebar_cart_lottie_view);
       this.c = liveLottieAn;
       a$a te = this.e;
       String str = "¹ºÎï";
       if (te != null) {
          liveLottieAn.setAnimationFromUrl(te.mLottieAnimationUrl);
          if (!TextUtils.x(this.e.mText)) {
             str = this.e.mText;
          }
          textView.setText(str);
       }else {
          textView.setText(str);
          kwaiImageVie.setVisibility(0);
       }
       liveLottieAn.setAutoPlay(true);
       liveLottieAn.setRepeatCount(-1);
       liveLottieAn.d(new b(this));
       liveLottieAn.setFailureListener(new a(this));
       return;
    }
}
