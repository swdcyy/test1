package com.kuaishou.ax2c.layouts.X2C_Live_Line_Peer_Info_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.common.core.component.line.widget.LiveLinePeerInfoView;
import android.widget.RelativeLayout$LayoutParams;
import cw9.c;
import android.widget.LinearLayout;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.lsjwzh.widget.text.FastTextView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;

public class X2C_Live_Line_Peer_Info_Layout implements IViewCreator	// class@0010e8
{

    public void X2C_Live_Line_Peer_Info_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LiveLinePeerInfoView liveLinePeer = new LiveLinePeerInfoView(p0);
       liveLinePeer.setOrientation(0);
       liveLinePeer.setBackgroundResource(R.drawable.arg_RES_7f080245);
       liveLinePeer.setPadding(0, 0, (int)TypedValue.applyDimension(1, 2.00f, c.c(resources)), 0);
       liveLinePeer.setLayoutParams(new RelativeLayout$LayoutParams(-2, c.b(resources, R.dimen.arg_RES_7f0708d2)));
       KwaiImageView kwaiImageVie = new KwaiImageView(liveLinePeer.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(c.b(resources, 0x7f0708d0), c.b(resources, 0x7f0708d0));
       kwaiImageVie.setId(R.id.line_peer_avatar);
       layoutParams.gravity = 16;
       layoutParams.leftMargin = c.b(resources, 0x7f0702e3);
       kwaiImageVie.setImageResource(R.drawable.detail_avatar_secret);
       kwaiImageVie.getHierarchy().L(RoundingParams.a());
       kwaiImageVie.setLayoutParams(layoutParams);
       liveLinePeer.addView(kwaiImageVie);
       FastTextView uFastTextVie = new FastTextView(liveLinePeer.getContext());
       layoutParams = new LinearLayout$LayoutParams(-2, -2);
       uFastTextVie.setId(R.id.line_peer_name);
       uFastTextVie.setMaxWidth((int)TypedValue.applyDimension(1, 74.00f, c.c(resources)));
       layoutParams.leftMargin = c.b(resources, 0x7f07031b);
       layoutParams.rightMargin = c.b(resources, 0x7f07031b);
       layoutParams.gravity = 16;
       uFastTextVie.setGravity(17);
       uFastTextVie.setEllipsize(3);
       uFastTextVie.setMaxLines(1);
       uFastTextVie.setTextColor(resources.getColor(R.color.arg_RES_7f061c32));
       uFastTextVie.j(12.00f, 1);
       uFastTextVie.setLayoutParams(layoutParams);
       liveLinePeer.addView(uFastTextVie);
       LiveLottieAnimationView liveLottieAn = new LiveLottieAnimationView(liveLinePeer.getContext());
       int i = c.b(resources, R.dimen.arg_RES_7f0708d1);
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(i, c.b(resources, 0x7f0708d1));
       liveLottieAn.setId(R.id.line_peer_follow_button);
       layoutParams1.gravity = 16;
       liveLottieAn.setVisibility(8);
       liveLottieAn.setAutoPlay(0);
       liveLottieAn.setProgress(0);
       liveLottieAn.setAnimation(R.raw.arg_RES_7f0f0039);
       liveLottieAn.setLayoutParams(layoutParams1);
       liveLinePeer.addView(liveLottieAn);
       liveLinePeer.onFinishInflate();
       return liveLinePeer;
    }
}
