package com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog$DialogOnViewStateCallback;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.model.response.dialog.KemCommonConfirmCancelDialogResponse;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import android.widget.TextView;
import x9a.t;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import lnc.a1;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.model.response.dialog.KemCommonConfirmCancelDialogResponse$Buttons;
import com.yxcorp.gifshow.model.response.dialog.KemCommonConfirmCancelDialogResponse$Button;
import com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog$DialogOnViewStateCallback$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog$DialogOnViewStateCallback$onCreateView$confirmAction$1;
import com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog$DialogOnViewStateCallback$b;
import msd.l;
import com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog$DialogOnViewStateCallback$c;
import o07.n;

public final class KemCommonConfirmCancelDialog$DialogOnViewStateCallback implements PopupInterface$f	// class@001aa5
{
    public final KemCommonConfirmCancelDialogResponse b;
    public final Bitmap c;

    public void KemCommonConfirmCancelDialog$DialogOnViewStateCallback(KemCommonConfirmCancelDialogResponse p0,Bitmap p1){
       a.p(p0, "mResponse");
       a.p(p1, "mBitmap");
       super();
       this.b = p0;
       this.c = p1;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View this;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, KemCommonConfirmCancelDialog$DialogOnViewStateCallback.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       int i = 1;
       int i1 = (this.b.mButtonStyle == i)? 0x7f0d02e5: 0x7f0d02e6;
       boolean b = false;
       View view = a.g(p1, i1, p2, b);
       i1 = 2;
       TextView[] textViewArra = new TextView[i1];
       this = view.findViewById(R.id.title);
       a.o(this, "view.findViewById\(R.id.title\)");
       textViewArra[b] = this;
       View view1 = view.findViewById(R.id.cancel);
       a.o(view1, "view.findViewById\(R.id.cancel\)");
       textViewArra[i] = view1;
       KemCommonConfirmCancelDialogResponse$Button uButton = null;
       if (!PatchProxy.applyVoidOneRefs(textViewArra, uButton, t.class, "1")) {
          int i3 = 0;
          while (i3 < i1) {
             object oobject = textViewArra[i3];
             if (a.g(oobject.getTypeface(), Typeface.DEFAULT_BOLD)) {
                oobject.setTypeface(Typeface.DEFAULT);
                TextPaint paint = oobject.getPaint();
                a.o(paint, "it.paint");
                paint.setFakeBoldText(i);
             }
             i3 = i3 + 1;
          }
       }
       KwaiImageView kwaiImageVie = view.findViewById(R.id.thumbnail);
       a.o(kwaiImageVie, "imageView");
       ViewGroup$LayoutParams layoutParams = kwaiImageVie.getLayoutParams();
       layoutParams.width = a1.e(280.00f);
       layoutParams.height = a1.e((((float)this.c.getHeight() * 280.00f) / (float)this.c.getWidth()));
       kwaiImageVie.getHierarchy().f(new BitmapDrawable(p2.getResources(), this.c), 0x3f800000, i);
       TextView textView = view.findViewById(R.id.title);
       i1 = (TextUtils.isEmpty(this.b.mTitle))? 8: 0;
       textView.setVisibility(i1);
       textView.setText(this.b.mTitle);
       textView = view.findViewById(R.id.content);
       if (TextUtils.isEmpty(this.b.mContent)) {
          b = 8;
       }
       textView.setVisibility(b);
       textView.setText(this.b.mContent);
       int i2 = 0x7f0a08fa;
       View view2 = view.findViewById(i2);
       a.o(view2, "view.findViewById<TextView>\(R.id.confirm\)");
       KemCommonConfirmCancelDialogResponse$Buttons mConfirm = this.b.mButtons.mConfirm;
       KemCommonConfirmCancelDialogResponse$Button mText = (mConfirm != null)? mConfirm.mText: uButton;
       view2.setText(mText);
       view2 = view.findViewById(R.id.cancel);
       a.o(view2, "view.findViewById<TextView>\(R.id.cancel\)");
       mConfirm = this.b.mButtons.mCancel;
       if (mConfirm != null) {
          uButton = mConfirm.mText;
       }
       view2.setText(uButton);
       view.findViewById(R.id.cancel).setOnClickListener(new KemCommonConfirmCancelDialog$DialogOnViewStateCallback$a(p0));
       KemCommonConfirmCancelDialog$DialogOnViewStateCallback$onCreateView$confirmAction$1 uDialogOnVie = new KemCommonConfirmCancelDialog$DialogOnViewStateCallback$onCreateView$confirmAction$1(this, p0);
       view.setOnClickListener(new KemCommonConfirmCancelDialog$DialogOnViewStateCallback$b(uDialogOnVie));
       view.findViewById(i2).setOnClickListener(new KemCommonConfirmCancelDialog$DialogOnViewStateCallback$c(uDialogOnVie));
       a.o(view, "view");
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
    public final KemCommonConfirmCancelDialogResponse c(){
       return this.b;
    }
}
