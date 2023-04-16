package com.kuaishou.ax2c.layouts.X2C_Vm_Slide_Play_Photo_Image_Tips_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import com.kwai.library.slide.base.widget.SlidePlayVerticalRelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.widget.LinearLayout$LayoutParams;
import cw9.c;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;

public class X2C_Vm_Slide_Play_Photo_Image_Tips_Layout implements IViewCreator	// class@001141
{

    public void X2C_Vm_Slide_Play_Photo_Image_Tips_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setOrientation(1);
       linearLayout.setLayoutParams(new SlidePlayVerticalRelativeLayout$LayoutParams(-1, -2));
       SelectShapeTextView selectShapeT = new SelectShapeTextView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, c.b(resources, 0x7f0702fe));
       selectShapeT.setId(R.id.open_long_atlas);
       layoutParams.bottomMargin = c.b(resources, 0x7f0702a4);
       layoutParams.gravity = 1;
       layoutParams.topMargin = c.b(resources, 0x7f070ead);
       selectShapeT.setBackgroundResource(R.drawable.arg_RES_7f08018f);
       selectShapeT.setGravity(17);
       selectShapeT.setText(R.string.arg_RES_7f104861);
       selectShapeT.setTextColor(resources.getColor(R.color.arg_RES_7f061ff3));
       selectShapeT.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f70));
       selectShapeT.setVisibility(8);
       int i = c.b(resources, R.dimen.arg_RES_7f070334);
       selectShapeT.setPadding((int)TypedValue.applyDimension(1, 16.00f, c.c(resources)), i, (int)TypedValue.applyDimension(1, 16.00f, c.c(resources)), c.b(resources, R.dimen.arg_RES_7f070334));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeT.setAttrs(iAttrHostArr);
       selectShapeT.setLayoutParams(layoutParams);
       linearLayout.addView(selectShapeT);
       return linearLayout;
    }
}
