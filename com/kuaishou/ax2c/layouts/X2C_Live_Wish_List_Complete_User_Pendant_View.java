package com.kuaishou.ax2c.layouts.X2C_Live_Wish_List_Complete_User_Pendant_View;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import cw9.c;
import android.widget.RelativeLayout;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView;
import com.kuaishou.live.basic.widget.LiveUserView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.facebook.drawee.generic.RoundingParams;

public class X2C_Live_Wish_List_Complete_User_Pendant_View implements IViewCreator	// class@001116
{

    public void X2C_Live_Wish_List_Complete_User_Pendant_View(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setLayoutParams(new FrameLayout$LayoutParams(-2, -2));
       SelectShapeRelativeLayout selectShapeR = new SelectShapeRelativeLayout(uFrameLayout.getContext());
       selectShapeR.setId(R.id.live_wish_list_gift_container);
       IAttrHost[] iAttrHostArr = new IAttrHost[]{new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeR.setAttrs(iAttrHostArr);
       selectShapeR.setLayoutParams(new FrameLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f070319), c.b(resources, R.dimen.arg_RES_7f070977)));
       uFrameLayout.addView(selectShapeR);
       KwaiImageView kwaiImageVie = new KwaiImageView(selectShapeR.getContext());
       kwaiImageVie.setId(R.id.live_wish_list_gift_container_bg);
       kwaiImageVie.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       selectShapeR.addView(kwaiImageVie);
       kwaiImageVie = new KwaiImageView(selectShapeR.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0702da), c.b(resources, 0x7f0702da));
       kwaiImageVie.setId(R.id.live_wish_list_user_border);
       layoutParams.addRule(14, -1);
       layoutParams.addRule(10, -1);
       kwaiImageVie.setLayoutParams(layoutParams);
       selectShapeR.addView(kwaiImageVie);
       LiveUserView liveUserView = new LiveUserView(selectShapeR.getContext());
       layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0702be), c.b(resources, 0x7f0702be));
       liveUserView.setId(R.id.live_wish_list_user_view);
       layoutParams.addRule(14, -1);
       layoutParams.topMargin = c.b(resources, 0x7f07030a);
       liveUserView.getHierarchy().F(ContextCompat.getDrawable(p0, R.drawable.detail_avatar_secret));
       liveUserView.getHierarchy().L(RoundingParams.a());
       liveUserView.setLayoutParams(layoutParams);
       selectShapeR.addView(liveUserView);
       return uFrameLayout;
    }
}
