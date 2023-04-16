package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Anchor_Info_Living_Tag;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.kwai.library.widget.textview.KwaiSimpleMediumStyleTextView;
import android.widget.FrameLayout$LayoutParams;
import android.widget.TextView;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;

public class X2C_Live_Lite_Anchor_Info_Living_Tag implements IViewCreator	// class@0010ea
{

    public void X2C_Live_Lite_Anchor_Info_Living_Tag(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       SelectShapeFrameLayout selectShapeF = new SelectShapeFrameLayout(p0);
       ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-2, -2);
       marginLayout.setMarginStart((int)TypedValue.applyDimension(1, 4.00f, c.c(resources)));
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(29, Integer.valueOf(resources.getColor(R.color.arg_RES_7f0604d9)));
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(2, Integer.valueOf((int)TypedValue.applyDimension(1, 3.00f, c.c(resources))));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),xmlAttrHostI1};
       selectShapeF.setAttrs(iAttrHostArr);
       selectShapeF.setLayoutParams(marginLayout);
       KwaiSimpleMediumStyleTextView kwaiSimpleMe = new KwaiSimpleMediumStyleTextView(selectShapeF.getContext());
       kwaiSimpleMe.setId(R.id.live_lite_living_icon);
       kwaiSimpleMe.setGravity(17);
       kwaiSimpleMe.setText("Ö±²¥ÖÐ");
       kwaiSimpleMe.setTextSize(1, 11.00f);
       kwaiSimpleMe.setTextColor(resources.getColor(R.color.arg_RES_7f0620c7));
       kwaiSimpleMe.setPadding((int)TypedValue.applyDimension(1, 4.00f, c.c(resources)), 0, (int)TypedValue.applyDimension(1, 4.00f, c.c(resources)), 0);
       kwaiSimpleMe.setLayoutParams(new FrameLayout$LayoutParams(-2, c.b(resources, R.dimen.arg_RES_7f0702a4)));
       selectShapeF.addView(kwaiSimpleMe);
       return selectShapeF;
    }
}
