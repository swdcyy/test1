package com.kuaishou.ax2c.layouts.X2C_Camera_Fullscreen_V3;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeView;
import android.widget.FrameLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.widget.ImageView;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import android.view.ViewStub;
import com.kuaishou.ax2c.layouts.X2C_Camera_Prettify_Text_Switch_View;
import com.kuaishou.ax2c.layouts.X2C_Camera_Actionbar_Fullscreen_V3;
import com.kuaishou.ax2c.layouts.X2C_Assistant_Magic_Emoji_Extra_Lay;
import com.kuaishou.ax2c.layouts.X2C_Camera_Action_Bar_Takepicture_Layout_V3;
import com.kwai.feature.post.api.flywheel.widget.FlyWheelFrameLayout;

public class X2C_Camera_Fullscreen_V3 implements IViewCreator	// class@001094
{

    public void X2C_Camera_Fullscreen_V3(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.preview_layout_content);
       uFrameLayout.setBackgroundDrawable(null);
       uFrameLayout.setClipChildren(false);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       SelectShapeView selectShapeV = new SelectShapeView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 200.00f, c.c(resources)));
       selectShapeV.setId(R.id.camera_hint_view);
       layoutParams.gravity = 48;
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(12, Integer.valueOf(resources.getColor(R.color.arg_RES_7f06202f)));
       xmlAttrHostI.addAttr(8, Integer.valueOf(90));
       xmlAttrHostI.addAttr(14, Integer.valueOf(resources.getColor(R.color.arg_RES_7f062036)));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeV.setAttrs(iAttrHostArr);
       selectShapeV.setLayoutParams(layoutParams);
       uFrameLayout.addView(selectShapeV);
       ViewStub viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.use_sample_view_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d164b);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-2, -2));
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       viewStub.setId(R.id.discern_panel_view_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0313);
       layoutParams.leftMargin = c.b(resources, 0x7f0702cc);
       layoutParams.rightMargin = c.b(resources, 0x7f0702cc);
       layoutParams.gravity = 81;
       viewStub.setLayoutParams(layoutParams);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new FrameLayout$LayoutParams(-1, -1);
       viewStub.setId(R.id.ktv_panel_stub_below);
       layoutParams.gravity = 80;
       viewStub.setClickable(1);
       viewStub.setLayoutParams(layoutParams);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new FrameLayout$LayoutParams(-1, -2);
       viewStub.setId(R.id.lyric_container_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0ebf);
       layoutParams.gravity = 49;
       layoutParams.leftMargin = (int)TypedValue.applyDimension(1, 60.00f, c.c(resources));
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 45.00f, c.c(resources));
       layoutParams.rightMargin = (int)TypedValue.applyDimension(1, 60.00f, c.c(resources));
       layoutParams.bottomMargin = (int)TypedValue.applyDimension(1, 150.00f, c.c(resources));
       viewStub.setLayoutParams(layoutParams);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       viewStub.setId(R.id.magic_emoji_tips_tv_stub);
       layoutParams.gravity = 17;
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0180);
       viewStub.setLayoutParams(layoutParams);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       viewStub.setId(R.id.magic_emoji_no_face_tips_stub);
       layoutParams.gravity = 17;
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d017f);
       viewStub.setLayoutParams(layoutParams);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       viewStub.setId(R.id.body_slimming_no_body_tip_stub);
       layoutParams.gravity = 17;
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d016a);
       viewStub.setLayoutParams(layoutParams);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new FrameLayout$LayoutParams(-1, -1);
       viewStub.setId(R.id.magic_emoji_cover_tips_stub);
       layoutParams.gravity = 17;
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d017e);
       viewStub.setLayoutParams(layoutParams);
       uFrameLayout.addView(viewStub);
       View view = new X2C_Camera_Prettify_Text_Switch_View().createView(uFrameLayout.getContext());
       view.setLayoutParams(view.getLayoutParams());
       uFrameLayout.addView(view);
       FrameLayout uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       uFrameLayout1.setId(R.id.magic_emoji_container);
       uFrameLayout1.setVisibility(8);
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1);
       uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       uFrameLayout1.setId(R.id.prettify_container);
       uFrameLayout1.setVisibility(8);
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new FrameLayout$LayoutParams(-1, -1);
       viewStub.setId(R.id.sameframe_container_stub);
       layoutParams.gravity = 81;
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d1331);
       viewStub.setLayoutParams(layoutParams);
       uFrameLayout.addView(viewStub);
       view = new View(uFrameLayout.getContext());
       view.setId(R.id.camera_touch_view);
       view.setVisibility(8);
       view.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(view);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.camera_assistant_kuaishan_pager_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0165);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       view = new X2C_Camera_Actionbar_Fullscreen_V3().createView(uFrameLayout.getContext());
       view.setId(R.id.action_bar_layout);
       view.setLayoutParams(view.getLayoutParams());
       uFrameLayout.addView(view);
       view = new X2C_Assistant_Magic_Emoji_Extra_Lay().createView(uFrameLayout.getContext());
       layoutParams = view.getLayoutParams();
       view.setId(R.id.assistant_magic_extra_container);
       layoutParams.gravity = 80;
       view.setLayoutParams(layoutParams);
       uFrameLayout.addView(view);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 290.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 38.00f, c.c(resources)));
       viewStub.setId(R.id.control_speed_stub);
       layoutParams.gravity = 81;
       layoutParams.bottomMargin = c.b(resources, 0x7f070eec);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d12df);
       viewStub.setLayoutParams(layoutParams);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new FrameLayout$LayoutParams(-1, c.b(resources, 0x7f070140));
       viewStub.setId(R.id.time_mode_stub);
       layoutParams.gravity = 81;
       layoutParams.bottomMargin = c.b(resources, 0x7f070145);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d019b);
       viewStub.setLayoutParams(layoutParams);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.breakpoint_panel_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d12d1);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       view = new X2C_Camera_Action_Bar_Takepicture_Layout_V3().createView(uFrameLayout.getContext());
       layoutParams = view.getLayoutParams();
       layoutParams.gravity = 81;
       layoutParams.bottomMargin = c.b(resources, 0x7f070323);
       view.setLayoutParams(layoutParams);
       uFrameLayout.addView(view);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       viewStub.setId(R.id.camera_assistant_tip_panel_stub);
       layoutParams.gravity = 53;
       layoutParams.rightMargin = c.b(resources, 0x7f070267);
       viewStub.setLayoutParams(layoutParams);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       viewStub.setId(R.id.camera_sidebar_right_shader_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d150e);
       layoutParams.gravity = 5;
       viewStub.setLayoutParams(layoutParams);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.camera_flash_bar_root_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d019c);
       viewStub.setPadding(c.b(resources, R.dimen.arg_RES_7f07012b), false, c.b(resources, R.dimen.arg_RES_7f07012b), false);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -2));
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(-2, -2);
       viewStub.setId(R.id.camera_sidebar_view_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d018e);
       layoutParams1.gravity = 5;
       layoutParams1.topMargin = c.b(resources, 0x7f070301);
       layoutParams1.rightMargin = c.b(resources, 0x7f07012b);
       viewStub.setLayoutParams(layoutParams1);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams1 = new FrameLayout$LayoutParams(-2, -2);
       viewStub.setId(R.id.take_picture_sidebar_view_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d15b6);
       layoutParams1.gravity = 5;
       layoutParams1.topMargin = (int)TypedValue.applyDimension(1, 54.00f, c.c(resources));
       layoutParams1.rightMargin = c.b(resources, 0x7f07012b);
       viewStub.setLayoutParams(layoutParams1);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams1 = new FrameLayout$LayoutParams(-2, c.b(resources, 0x7f07012a));
       viewStub.setId(R.id.fold_button_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d1510);
       layoutParams1.gravity = 5;
       layoutParams1.rightMargin = c.b(resources, 0x7f07012b);
       viewStub.setLayoutParams(layoutParams1);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams1 = new FrameLayout$LayoutParams(-1, c.b(resources, 0x7f07013b));
       viewStub.setId(R.id.camera_place_holder_view_stub);
       layoutParams1.gravity = 85;
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0186);
       viewStub.setClickable(1);
       viewStub.setLayoutParams(layoutParams1);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams1 = new FrameLayout$LayoutParams(-2, c.b(resources, 0x7f070f48));
       viewStub.setId(R.id.take_picture_multi_mode_stub);
       layoutParams1.gravity = 81;
       layoutParams1.bottomMargin = c.b(resources, 0x7f070f4a);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d15b4);
       viewStub.setLayoutParams(layoutParams1);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams1 = new FrameLayout$LayoutParams(-2, -2);
       viewStub.setId(R.id.debug_info_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d12d4);
       layoutParams1.gravity = 3;
       layoutParams1.leftMargin = (int)TypedValue.applyDimension(1, 10.00f, c.c(resources));
       layoutParams1.topMargin = (int)TypedValue.applyDimension(1, 50.00f, c.c(resources));
       viewStub.setLayoutParams(layoutParams1);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams1 = new FrameLayout$LayoutParams(-2, -2);
       viewStub.setId(R.id.imitation_timer_mask_stub);
       layoutParams1.gravity = 17;
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d12d8);
       viewStub.setLayoutParams(layoutParams1);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.ktv_panel_stub_above);
       viewStub.setClickable(1);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.ktv_panel_stub_song_selection);
       viewStub.setClickable(1);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams1 = new FrameLayout$LayoutParams(-2, -2);
       viewStub.setId(R.id.auto_download_panel_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d00e7);
       layoutParams1.gravity = 81;
       layoutParams1.bottomMargin = c.b(resources, 0x7f0702bc);
       viewStub.setLayoutParams(layoutParams1);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams1 = new FrameLayout$LayoutParams(-2, c.b(resources, 0x7f07030d));
       viewStub.setId(R.id.platform_refresh_stub);
       layoutParams1.bottomMargin = c.b(resources, 0x7f0702a7);
       layoutParams1.gravity = 81;
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d1160);
       viewStub.setLayoutParams(layoutParams1);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.flash_effect_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d016e);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams1 = new FrameLayout$LayoutParams(-1, c.b(resources, 0x7f070f4c));
       viewStub.setId(R.id.multi_take_picture_panel_stub);
       layoutParams1.gravity = 80;
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0fe5);
       viewStub.setLayoutParams(layoutParams1);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       layoutParams1 = new FrameLayout$LayoutParams(-1, c.b(resources, 0x7f070f4d));
       viewStub.setId(R.id.multi_take_picture_panel_stub_v3);
       layoutParams1.gravity = 80;
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0fe6);
       viewStub.setLayoutParams(layoutParams1);
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.album_slide_up_layout_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d00af);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       FlyWheelFrameLayout uFlyWheelFra = new FlyWheelFrameLayout(uFrameLayout.getContext());
       uFlyWheelFra.setId(R.id.guide_floating_view);
       uFlyWheelFra.setTKContainerId(R.id.guide_floating_view);
       uFlyWheelFra.setVisibility(8);
       uFlyWheelFra.setLayoutParams(new FrameLayout$LayoutParams(-1, -2));
       uFrameLayout.addView(uFlyWheelFra);
       uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       uFrameLayout1.setId(R.id.multi_take_preview_container);
       uFrameLayout1.setBackgroundColor(resources.getColor(R.color.arg_RES_7f0600a6));
       uFrameLayout1.setVisibility(8);
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1);
       ViewStub viewStub1 = new ViewStub(uFrameLayout.getContext());
       viewStub1.setInflatedId(-1);
       viewStub1.setId(R.id.permission_mask_layout_stub);
       viewStub1.setLayoutResource(R.layout.arg_RES_7f0d110c);
       viewStub1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub1);
       return uFrameLayout;
    }
}