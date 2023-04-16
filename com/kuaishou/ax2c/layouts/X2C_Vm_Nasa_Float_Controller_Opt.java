package com.kuaishou.ax2c.layouts.X2C_Vm_Nasa_Float_Controller_Opt;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import com.kwai.library.slide.base.widget.SlidePlayVerticalRelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewStub;
import cw9.c;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.yxcorp.gifshow.detail.view.SlidePlaySeekBar;
import android.view.ContextThemeWrapper;
import android.util.AttributeSet;
import android.os.Looper;
import java.lang.Thread;
import android.widget.ProgressBar;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Long;
import java.lang.Exception;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;
import androidx.core.content.ContextCompat;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;

public class X2C_Vm_Nasa_Float_Controller_Opt implements IViewCreator	// class@00113a
{

    public void X2C_Vm_Nasa_Float_Controller_Opt(){
       super();
    }
    public View createView(Context p0){
       long id;
       float f;
       RelativeLayout$LayoutParams layoutParams1;
       float f1;
       SlidePlayVideoLoadingProgressBar slidePlayVid;
       long id1;
       SelectShapeTextView selectShapeT;
       RelativeLayout$LayoutParams layoutParams2;
       XmlAttrHostImpl xmlAttrHostI;
       XmlAttrHostImpl xmlAttrHostI1;
       IAttrHost[] iAttrHostArr;
       Context uContext = p0;
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(uContext);
       int i = -1;
       relativeLayo.setLayoutParams(new SlidePlayVerticalRelativeLayout$LayoutParams(i, i));
       RelativeLayout relativeLayo1 = new RelativeLayout(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(i, i);
       relativeLayo1.setId(R.id.slide_play_like_image);
       layoutParams.addRule(15, i);
       relativeLayo1.setLayoutParams(layoutParams);
       relativeLayo.addView(relativeLayo1);
       ViewStub viewStub = new ViewStub(relativeLayo.getContext());
       viewStub.setInflatedId(i);
       int i1 = -2;
       layoutParams = new RelativeLayout$LayoutParams(i1, c.b(resources, 0x7f0702cc));
       viewStub.setId(R.id.slide_play_count_down_view_stub);
       layoutParams.addRule(11, i);
       layoutParams.topMargin = c.b(resources, 0x7f07034b);
       layoutParams.rightMargin = (int)TypedValue.applyDimension(1, 73.00f, c.c(resources));
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d1523);
       viewStub.setLayoutParams(layoutParams);
       relativeLayo.addView(viewStub);
       viewStub = new ViewStub(relativeLayo.getContext());
       viewStub.setInflatedId(i);
       layoutParams = new RelativeLayout$LayoutParams(i1, c.b(resources, 0x7f0702cc));
       viewStub.setId(R.id.sildebar_collapse_count_down_view_stub);
       viewStub.setInflatedId(R.id.slide_play_count_down_layout);
       layoutParams.addRule(11, i);
       layoutParams.topMargin = c.b(resources, 0x7f070271);
       layoutParams.rightMargin = (int)TypedValue.applyDimension(1, 77.00f, c.c(resources));
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d1523);
       viewStub.setLayoutParams(layoutParams);
       relativeLayo.addView(viewStub);
       viewStub = new ViewStub(relativeLayo.getContext());
       viewStub.setInflatedId(i);
       layoutParams = new RelativeLayout$LayoutParams(i1, c.b(resources, 0x7f0702cc));
       viewStub.setId(R.id.slide_auto_play_count_down_view_stub);
       viewStub.setInflatedId(R.id.slide_auto_play_count_down_layout);
       layoutParams.addRule(11, i);
       layoutParams.topMargin = c.b(resources, 0x7f070271);
       layoutParams.rightMargin = (int)TypedValue.applyDimension(1, 77.00f, c.c(resources));
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d151b);
       viewStub.setLayoutParams(layoutParams);
       relativeLayo.addView(viewStub);
       int i2 = 0x7f110413;
       AttributeSet uAttributeSe = null;
       SlidePlaySeekBar slidePlaySee = new SlidePlaySeekBar(new ContextThemeWrapper(relativeLayo.getContext(), i2), uAttributeSe, 0);
       id = Looper.getMainLooper().getThread().getId();
       if (id - Thread.currentThread().getId()) {
          try{
             Field declaredFiel = ProgressBar.class.getDeclaredField("mUiThreadId");
             declaredFiel.setAccessible(1);
             declaredFiel.set(slidePlaySee, Long.valueOf(id));
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
}
