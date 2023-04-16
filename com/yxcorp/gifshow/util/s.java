package com.yxcorp.gifshow.util.s;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import lnc.s2;
import com.yxcorp.gifshow.model.response.DialogResponse$DialogData;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.View;
import android.widget.TextView;
import com.yxcorp.gifshow.model.response.DialogResponse$DialogButton;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import android.net.Uri;
import ekd.w0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.l0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import o07.o;
import lnc.p2;
import android.view.View$OnClickListener;

public class s implements PopupInterface$h	// class@001fad
{
    public final DialogResponse$DialogData b;
    public final s2 c;

    public void s(s2 p0,DialogResponse$DialogData p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       View view = p0.z();
       if (view == null) {
          return;
       }
       View view1 = view.findViewById(R.id.close);
       int i = (this.b.mWithCloseButton != null)? 0: 8;
       view1.setVisibility(i);
       s tb = this.b;
       this.a(view.findViewById(R.id.neutral), tb.mNeutralButton, tb.mKsOrderId);
       tb = this.b;
       this.a(view.findViewById(R.id.positive), tb.mPositiveButton, tb.mKsOrderId);
       tb = this.b;
       this.a(view.findViewById(R.id.negative), tb.mNegativeButton, tb.mKsOrderId);
       KwaiImageView kwaiImageVie = view.findViewById(R.id.icon);
       if (!TextUtils.x(this.b.mImageUrl)) {
          kwaiImageVie.setVisibility(0);
          kwaiImageVie.setImageURI(w0.f(this.b.mImageUrl));
       }else {
          kwaiImageVie.setVisibility(8);
       }
       if (!TextUtils.x(this.b.mKsOrderId)) {
          u1.u0(4, l0.c(""), l0.b(this.b.mKsOrderId));
       }
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
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
    public void a(TextView p0,DialogResponse$DialogButton p1,String p2){
       DialogResponse$DialogButton uDialogButto = 8;
       if (p1 != null) {
          if (!TextUtils.x(p1.mText)) {
             p0.setText(p1.mText);
             p0.setOnClickListener(new p2(p1, p2));
             p0.setVisibility(0);
          }else {
             p0.setVisibility(uDialogButto);
          }
       }else {
          p0.setVisibility(uDialogButto);
       }
       return;
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
