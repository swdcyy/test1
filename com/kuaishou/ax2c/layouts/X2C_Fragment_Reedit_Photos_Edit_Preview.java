package com.kuaishou.ax2c.layouts.X2C_Fragment_Reedit_Photos_Edit_Preview;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout;
import com.kuaishou.ax2c.layouts.X2C_Pictures_Layout;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.widget.EditorCropImageView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationGuideContainer;
import com.yxcorp.gifshow.v3.editor.decoration.guideline.FakeFeedComponent;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import com.yxcorp.gifshow.v3.widget.EditorContainer;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import com.kwai.feature.post.api.flywheel.widget.FlyWheelFrameLayout;
import android.graphics.drawable.Drawable;

public class X2C_Fragment_Reedit_Photos_Edit_Preview implements IViewCreator	// class@0010ad
{

    public void X2C_Fragment_Reedit_Photos_Edit_Preview(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setBackgroundColor(resources.getColor(R.color.arg_RES_7f060073));
       relativeLayo.setClipToPadding(false);
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       RelativeLayout relativeLayo1 = new RelativeLayout(relativeLayo.getContext());
       relativeLayo1.setId(R.id.preview);
       relativeLayo1.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(relativeLayo1);
       EditorPreviewContainerLayout uEditorPrevi = new EditorPreviewContainerLayout(relativeLayo1.getContext());
       uEditorPrevi.setId(R.id.preview_player_container);
       uEditorPrevi.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo1.addView(uEditorPrevi);
       View view = new X2C_Pictures_Layout().createView(uEditorPrevi.getContext());
       view.setBackgroundColor(resources.getColor(R.color.arg_RES_7f060624));
       view.setLayoutParams(view.getLayoutParams());
       uEditorPrevi.addView(view);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(uEditorPrevi.getContext());
       uAppCompatIm.setId(R.id.photo_cover_showing_view);
       uAppCompatIm.setScaleType(ImageView$ScaleType.FIT_CENTER);
       uAppCompatIm.setVisibility(8);
       uAppCompatIm.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       uEditorPrevi.addView(uAppCompatIm);
       PassThroughEventView passThroughE = new PassThroughEventView(uEditorPrevi.getContext());
       passThroughE.setId(R.id.touch_view);
       passThroughE.setAlpha(0);
       passThroughE.setVisibility(false);
       passThroughE.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       uEditorPrevi.addView(passThroughE);
       EditDecorationContainerView uEditDecorat = new EditDecorationContainerView(uEditorPrevi.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 0, c.c(resources)), (int)TypedValue.applyDimension(1, 0, c.c(resources)));
       uEditDecorat.setId(R.id.decoration_editor_view);
       layoutParams.addRule(13, -1);
       uEditDecorat.setLayoutParams(layoutParams);
       uEditorPrevi.addView(uEditDecorat);
       uEditDecorat.onFinishInflate();
       EditDecorationContainerViewV2 uEditDecorat1 = new EditDecorationContainerViewV2(uEditorPrevi.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-1, -1);
       uEditDecorat1.setId(R.id.new_text_decoration_editor_view);
       layoutParams.addRule(13, -1);
       uEditDecorat1.setVisibility(8);
       uEditDecorat1.setLayoutParams(layoutParams);
       uEditorPrevi.addView(uEditDecorat1);
       uEditDecorat1.onFinishInflate();
       uEditDecorat = new EditDecorationContainerView(uEditorPrevi.getContext());
       uEditDecorat.setId(R.id.cover_decoration_editor_view);
       uEditDecorat.setVisibility(8);
       uEditDecorat.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       uEditorPrevi.addView(uEditDecorat);
       uEditDecorat.onFinishInflate();
       uEditDecorat = new EditDecorationContainerView(uEditorPrevi.getContext());
       uEditDecorat.setId(R.id.lyric_decoration_editor_view);
       uEditDecorat.setVisibility(8);
       uEditDecorat.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       uEditorPrevi.addView(uEditDecorat);
       uEditDecorat.onFinishInflate();
       EditorCropImageView uEditorCropI = new EditorCropImageView(uEditorPrevi.getContext());
       uEditorCropI.setId(R.id.photo_crop_view);
       uEditorCropI.setVisibility(4);
       uEditorCropI.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       uEditorPrevi.addView(uEditorCropI);
       KwaiImageView kwaiImageVie = new KwaiImageView(uEditorPrevi.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-1, c.b(resources, 0x7f070321));
       kwaiImageVie.setId(R.id.long_picture_bottom_blank_mask);
       kwaiImageVie.setBackgroundColor(resources.getColor(R.color.arg_RES_7f0600a6));
       layoutParams.addRule(12, -1);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.setLayoutParams(layoutParams);
       uEditorPrevi.addView(kwaiImageVie);
       EditDecorationGuideContainer uEditDecorat2 = new EditDecorationGuideContainer(relativeLayo1.getContext());
       uEditDecorat2.setId(R.id.decoration_guide_container);
       uEditDecorat2.setVisibility(8);
       uEditDecorat2.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo1.addView(uEditDecorat2);
       FakeFeedComponent uFakeFeedCom = new FakeFeedComponent(uEditDecorat2.getContext());
       uFakeFeedCom.setId(R.id.decoration_guide_fake_feed_component);
       uFakeFeedCom.setVisibility(8);
       uFakeFeedCom.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uEditDecorat2.addView(uFakeFeedCom);
       uEditDecorat2.onFinishInflate();
       SizeAdjustableTextView sizeAdjustab = new SizeAdjustableTextView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(-2, c.b(resources, 0x7f07010b));
       sizeAdjustab.setBackgroundResource(R.drawable.arg_RES_7f0801d6);
       sizeAdjustab.setTextColor(resources.getColor(R.color.arg_RES_7f061fbd));
       sizeAdjustab.setId(R.id.text_edit_done_button);
       layoutParams1.addRule(11, -1);
       layoutParams1.addRule(10, -1);
       layoutParams1.rightMargin = c.b(resources, 0x7f0702ab);
       layoutParams1.topMargin = c.b(resources, 0x7f0702e8);
       sizeAdjustab.setGravity(17);
       sizeAdjustab.setMaxLines(1);
       sizeAdjustab.setText(R.string.arg_RES_7f100f6b);
       sizeAdjustab.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070271));
       sizeAdjustab.setInitTextSize(TypedValue.applyDimension(false, (float)c.b(resources, R.dimen.arg_RES_7f070271), c.c(resources)));
       sizeAdjustab.setVisibility(8);
       sizeAdjustab.setTextSizeAdjustable(false);
       sizeAdjustab.setPadding(c.b(resources, R.dimen.arg_RES_7f070295), false, c.b(resources, R.dimen.arg_RES_7f070295), false);
       sizeAdjustab.setLayoutParams(layoutParams1);
       relativeLayo.addView(sizeAdjustab);
       EditorContainer uEditorConta = new EditorContainer(relativeLayo.getContext());
       layoutParams1 = new RelativeLayout$LayoutParams(-1, -2);
       uEditorConta.setId(R.id.container_other);
       layoutParams1.addRule(12, -1);
       uEditorConta.setClipChildren(false);
       uEditorConta.setClipToPadding(false);
       uEditorConta.setLayoutParams(layoutParams1);
       relativeLayo.addView(uEditorConta);
       View view1 = new View(relativeLayo.getContext());
       layoutParams1 = new RelativeLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 100.00f, c.c(resources)));
       view1.setBackgroundResource(R.drawable.arg_RES_7f080824);
       layoutParams1.addRule(12, -1);
       view1.setLayoutParams(layoutParams1);
       relativeLayo.addView(view1);
       RecyclerView recyclerView = new RecyclerView(relativeLayo.getContext());
       layoutParams1 = new RelativeLayout$LayoutParams(-1, -2);
       recyclerView.setId(R.id.action_recycler_view);
       layoutParams1.addRule(12, -1);
       layoutParams1.bottomMargin = (int)TypedValue.applyDimension(1, 18.00f, c.c(resources));
       recyclerView.setVisibility(4);
       recyclerView.setLayoutParams(layoutParams1);
       relativeLayo.addView(recyclerView);
       recyclerView = new RecyclerView(relativeLayo.getContext());
       layoutParams1 = new RelativeLayout$LayoutParams(-2, -2);
       recyclerView.setId(R.id.topright_action_recycler_view);
       layoutParams1.addRule(11, -1);
       layoutParams1.addRule(10, -1);
       layoutParams1.addRule(2, R.id.next_step_button);
       layoutParams1.bottomMargin = c.b(resources, 0x7f07025d);
       layoutParams1.topMargin = c.b(resources, 0x7f0702ac);
       layoutParams1.rightMargin = c.b(resources, 0x7f070356);
       recyclerView.setVisibility(8);
       recyclerView.setLayoutParams(layoutParams1);
       relativeLayo.addView(recyclerView);
       FlyWheelFrameLayout uFlyWheelFra = new FlyWheelFrameLayout(relativeLayo.getContext());
       layoutParams1 = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070268), c.b(resources, 0x7f070108));
       uFlyWheelFra.setId(R.id.next_step_button);
       uFlyWheelFra.setVisibility(4);
       layoutParams1.setMarginEnd(c.b(resources, R.dimen.arg_RES_7f070549));
       uFlyWheelFra.setBackgroundResource(R.drawable.arg_RES_7f0801a1);
       layoutParams1.addRule(12, -1);
       layoutParams1.addRule(21, -1);
       layoutParams1.bottomMargin = (int)TypedValue.applyDimension(1, 20.00f, c.c(resources));
       uFlyWheelFra.setTextViewId(R.id.next_step_button_text);
       uFlyWheelFra.setTKContainerId(R.id.next_step_button);
       uFlyWheelFra.setLayoutParams(layoutParams1);
       relativeLayo.addView(uFlyWheelFra);
       SizeAdjustableTextView sizeAdjustab1 = new SizeAdjustableTextView(uFlyWheelFra.getContext());
       FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(-2, c.b(resources, 0x7f070108));
       sizeAdjustab1.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070118));
       sizeAdjustab1.setInitTextSize(TypedValue.applyDimension(false, (float)c.b(resources, R.dimen.arg_RES_7f070118), c.c(resources)));
       sizeAdjustab1.setId(R.id.next_step_button_text);
       sizeAdjustab1.setBackgroundDrawable(null);
       sizeAdjustab1.setGravity(17);
       layoutParams2.gravity = 17;
       sizeAdjustab1.setMaxLines(1);
       sizeAdjustab1.setText(R.string.arg_RES_7f103937);
       sizeAdjustab1.setTextColor(resources.getColor(R.color.arg_RES_7f061fbd));
       sizeAdjustab1.setLayoutParams(layoutParams2);
       uFlyWheelFra.addView(sizeAdjustab1);
       return relativeLayo;
    }
}