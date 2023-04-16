package com.kuaishou.ax2c.layouts.X2C_Assistant_Magic_Emoji_Extra_Lay;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import cw9.c;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewStub;

public class X2C_Assistant_Magic_Emoji_Extra_Lay implements IViewCreator	// class@00108a
{

    public void X2C_Assistant_Magic_Emoji_Extra_Lay(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -2);
       linearLayout.setId(R.id.assistant_magic_extra_container);
       layoutParams.gravity = 80;
       layoutParams.bottomMargin = c.b(resources, 0x7f070290);
       linearLayout.setOrientation(1);
       linearLayout.setVisibility(8);
       linearLayout.setPadding((int)TypedValue.applyDimension(1, 19.00f, c.c(resources)), 0, (int)TypedValue.applyDimension(1, 19.00f, c.c(resources)), 0);
       linearLayout.setLayoutParams(layoutParams);
       FrameLayout uFrameLayout = new FrameLayout(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(-1, -2);
       uFrameLayout.setId(R.id.assistant_magic_emoji_extra_btn_container);
       layoutParams1.bottomMargin = c.b(resources, 0x7f07034b);
       uFrameLayout.setLayoutParams(layoutParams1);
       linearLayout.addView(uFrameLayout);
       ViewStub viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(-2, c.b(resources, 0x7f070a6c));
       viewStub.setId(R.id.magic_emoji_wish_stub_v2);
       layoutParams2.gravity = 0x800053;
       viewStub.setInflatedId(R.id.magic_emoji_wish_tip);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0ed2);
       viewStub.setLayoutParams(layoutParams2);
       uFrameLayout.addView(viewStub);
       LinearLayout linearLayout1 = new LinearLayout(uFrameLayout.getContext());
       layoutParams2 = new FrameLayout$LayoutParams(-2, -2);
       layoutParams2.gravity = 0x800055;
       linearLayout1.setGravity(0x800005);
       linearLayout1.setOrientation(1);
       linearLayout1.setLayoutParams(layoutParams2);
       uFrameLayout.addView(linearLayout1);
       ViewStub viewStub1 = new ViewStub(linearLayout1.getContext());
       viewStub1.setInflatedId(-1);
       LinearLayout$LayoutParams layoutParams3 = new LinearLayout$LayoutParams(c.b(resources, 0x7f0704b5), c.b(resources, 0x7f0704b5));
       viewStub1.setId(R.id.magic_media_select_risk_tip_stub);
       viewStub1.setInflatedId(R.id.magic_media_select_risk_tip_btn);
       layoutParams3.bottomMargin = c.b(resources, 0x7f070334);
       viewStub1.setLayoutResource(R.layout.arg_RES_7f0d0eda);
       viewStub1.setLayoutParams(layoutParams3);
       linearLayout1.addView(viewStub1);
       viewStub1 = new ViewStub(linearLayout1.getContext());
       viewStub1.setInflatedId(-1);
       layoutParams3 = new LinearLayout$LayoutParams(-2, c.b(resources, 0x7f070a6c));
       viewStub1.setId(R.id.magic_swap_complete_btn_stub);
       layoutParams3.topMargin = c.b(resources, 0x7f070334);
       viewStub1.setInflatedId(R.id.magic_swap_complete_btn);
       viewStub1.setLayoutResource(R.layout.arg_RES_7f0d0ed7);
       viewStub1.setLayoutParams(layoutParams3);
       linearLayout1.addView(viewStub1);
       uFrameLayout = new FrameLayout(linearLayout.getContext());
       uFrameLayout.setId(R.id.assistant_camera_magic_picture_container);
       uFrameLayout.setLayoutParams(new LinearLayout$LayoutParams(-1, -2));
       linearLayout.addView(uFrameLayout);
       View view = new View(uFrameLayout.getContext());
       view.setLayoutParams(new FrameLayout$LayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f070316)));
       uFrameLayout.addView(view);
       ViewStub viewStub2 = new ViewStub(uFrameLayout.getContext());
       viewStub2.setInflatedId(-1);
       viewStub2.setId(R.id.camera_magic_picture_list_stub);
       viewStub2.setLayoutResource(R.layout.arg_RES_7f0d0183);
       viewStub2.setLayoutParams(new FrameLayout$LayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f07032b)));
       uFrameLayout.addView(viewStub2);
       return linearLayout;
    }
}
