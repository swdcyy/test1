package com.yxcorp.gifshow.util.ChildLockDialogUtils$d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.util.ChildLockDialogUtils;
import com.kwai.component.uiconfig.childlock.model.DialogTopInfo;
import com.kwai.component.uiconfig.childlock.model.Content;
import android.view.View;
import android.widget.TextView;
import com.kwai.component.uiconfig.childlock.model.Title;
import java.lang.CharSequence;
import zf6.k;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import com.kwai.component.uiconfig.childlock.model.Subtitle;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Color;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.PointF;
import android.widget.RelativeLayout;
import lnc.k0;
import android.view.View$OnClickListener;
import java.util.List;
import android.text.TextPaint;
import lnc.i0;
import vj9.b;
import vj9.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import wh5.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.b;
import com.yxcorp.gifshow.util.g;
import o07.o;

public class ChildLockDialogUtils$d implements PopupInterface$h	// class@001ed8
{
    public final TeenageModeConfig b;

    public void ChildLockDialogUtils$d(TeenageModeConfig p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       ChildLockDialogUtils$d tb = this.b;
       TeenageModeConfig dialogTopInf = tb.dialogTopInfo;
       if (dialogTopInf != null) {
          DialogTopInfo mContent = dialogTopInf.mContent;
          if (mContent == null || (mContent.mSubTitle != null && mContent.mTitle != null)) {
             TextView textView = p0.z().findViewById(R.id.title);
             textView.setText(mContent.mTitle.mText);
             Title mTextDarkCol = (k.d())? mContent.mTitle.mTextDarkColor: mContent.mTitle.mTextLightColor;
             int i = 0x7f0606b3;
             textView.setTextColor(TextUtils.J(mTextDarkCol, i));
             textView = p0.z().findViewById(R.id.subtitle_text);
             textView.setText(mContent.mSubTitle.mText);
             Subtitle mTextDarkCol1 = (k.d())? mContent.mSubTitle.mTextDarkColor: mContent.mSubTitle.mTextLightColor;
             textView.setTextColor(TextUtils.J(mTextDarkCol1, i));
             GradientDrawable background = p0.z().findViewById(R.id.subTitle).getBackground();
             mTextDarkCol1 = (k.d())? mContent.mSubTitle.mBackgroundDarkColor: mContent.mSubTitle.mBackgroundLightColor;
             background.setColor(Color.parseColor(mTextDarkCol1));
             KwaiImageView kwaiImageVie = p0.z().findViewById(R.id.icon);
             Content mArrowDarkUr = (k.d())? mContent.mArrowDarkUrl: mContent.mArrowLightUrl;
             kwaiImageVie.L(mArrowDarkUr);
             kwaiImageVie = p0.z().findViewById(R.id.background);
             kwaiImageVie.getHierarchy().t(new PointF(0x3f800000, 0));
             Content mImageDarkUr = (k.d())? mContent.mImageDarkUrl: mContent.mImageLightUrl;
             kwaiImageVie.L(mImageDarkUr);
             p0.z().findViewById(R.id.type).setOnClickListener(new k0(p0, tb));
             dialogTopInf = tb.dialogNewContent;
             if (dialogTopInf != null && dialogTopInf.size() >= 4) {
                ChildLockDialogUtils.c(p0, tb);
             }
             TextView textView1 = p0.z().findViewById(R.id.set_teenage_mode);
             textView1.getPaint().setFakeBoldText(true);
             textView1.setText(tb.mDialogConfirmText);
             textView1.setOnClickListener(new i0(tb, p0));
             boolean b = (tb.mMode == null)? true: false;
             p0.V(b);
             p0.X(b);
             a.a().g(RequestTiming.ON_BACKGROUND).subscribe(Functions.d(), Functions.d());
             a.i(true);
             RxBus.f.b(new b(true, tb.mEnablePhotoContinue));
             p0.z().findViewById(R.id.child_lock_panel).setOnClickListener(g.b);
             ChildLockDialogUtils.f(b, tb.mCanVerifyIdCard, true);
          }
       }
       return;
    }
    public void H(c p0,int p1){
       ChildLockDialogUtils.d = false;
       ChildLockDialogUtils.a = false;
       a.i(false);
       RxBus.f.b(new b(false, this.b.mEnablePhotoContinue));
       if (p1 == 2) {
          ChildLockDialogUtils.d("OTHER");
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
