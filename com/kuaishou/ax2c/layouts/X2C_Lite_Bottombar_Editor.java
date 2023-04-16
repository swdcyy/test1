package com.kuaishou.ax2c.layouts.X2C_Lite_Bottombar_Editor;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import android.view.ViewGroup$LayoutParams;

public class X2C_Lite_Bottombar_Editor implements IViewCreator	// class@0010bb
{

    public void X2C_Lite_Bottombar_Editor(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       SelectShapeTextView selectShapeT = new SelectShapeTextView(p0);
       selectShapeT.setId(R.id.live_lite_bottom_editor_view);
       selectShapeT.setGravity(16);
       selectShapeT.setText("ºÍÖ÷²¥ÁÄÁÄÌì...");
       selectShapeT.setTextColor(resources.getColor(R.color.arg_RES_7f060874));
       selectShapeT.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f07028d));
       selectShapeT.setPadding(c.b(resources, R.dimen.arg_RES_7f070295), 0, c.b(resources, R.dimen.arg_RES_7f070295), 0);
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(30, Integer.valueOf(resources.getColor(R.color.arg_RES_7f060633)));
       xmlAttrHostI.addAttr(34, Integer.valueOf((int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources))));
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(2, Integer.valueOf(c.b(resources, R.dimen.arg_RES_7f07042c)));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),xmlAttrHostI1};
       selectShapeT.setAttrs(iAttrHostArr);
       selectShapeT.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, (int)TypedValue.applyDimension(1, 40.00f, c.c(resources))));
       return selectShapeT;
    }
}
