package com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$createClickWidgetDialog$1;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ag6.a;
import apd.j;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.Button;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.kwai.feature.api.feed.growth.model.ClickWidgetDialogModel;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a$a;
import android.view.View$OnClickListener;
import o07.n;

public final class AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a implements PopupInterface$f	// class@001607
{
    public final AddGrowthWidgetTaskHelper$createClickWidgetDialog$1 b;

    public void AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a(AddGrowthWidgetTaskHelper$createClickWidgetDialog$1 p0){
       this.b = p0;
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p1, "inflater");
       View view = a.c(p1, R.layout.arg_RES_7f0d0551, p2, false);
       TextView textView = j.b(view, R.id.mainTitle);
       TextView textView1 = j.b(view, R.id.subTitle);
       KwaiImageView kwaiImageVie = j.b(view, R.id.guideImage);
       Button uButton = j.b(view, R.id.clickWidget);
       a.o(textView, "mMainTitle");
       textView.setTypeface(this.b.$fromAsset);
       TextPaint paint = textView.getPaint();
       a.o(paint, "mMainTitle.paint");
       paint.setFakeBoldText(true);
       a.o(uButton, "mClickWidget");
       uButton.setTypeface(this.b.$fromAsset);
       paint = uButton.getPaint();
       a.o(paint, "mClickWidget.paint");
       paint.setFakeBoldText(true);
       AddGrowthWidgetTaskHelper$createClickWidgetDialog$1 $clickWidget = this.b.$clickWidgetDialogModel;
       if ($clickWidget != null) {
          textView.setText($clickWidget.mTitle);
          a.o(textView1, "mSubTitle");
          textView1.setText(this.b.$clickWidgetDialogModel.mSubTitle);
          kwaiImageVie.L(this.b.$clickWidgetDialogModel.mPicUrl);
          uButton.setText(this.b.$clickWidgetDialogModel.mBtnText);
       }
       uButton.setOnClickListener(new AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a$a(this, p0));
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
