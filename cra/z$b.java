package cra.z$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import android.app.Activity;
import com.yxcorp.gifshow.model.response.dialog.KemDialog9Response;
import android.graphics.drawable.Drawable;
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
import java.lang.CharSequence;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.text.TextUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import cra.z$b$c;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.widget.Button;
import cra.z$b$a;
import cra.z$b$b;
import o07.n;

public final class z$b implements PopupInterface$f	// class@002399
{
    public final Activity b;
    public final KemDialog9Response c;
    public final Drawable d;

    public void z$b(Activity p0,KemDialog9Response p1,Drawable p2){
       a.p(p0, "activity");
       a.p(p1, "response");
       a.p(p2, "backgroundPic");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, z$b.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       View view = a.g(p1, R.layout.arg_RES_7f0d056c, p2, false);
       View view1 = view.findViewById(R.id.content_text);
       a.o(view1, "findViewById<TextView>\(R.id.content_text\)");
       view1.setText(this.c.mTitle);
       view1 = view.findViewById(R.id.text_amount_unit);
       a.o(view1, "findViewById<TextView>\(R.id.text_amount_unit\)");
       view1.setText(this.c.mAmountUnit);
       view1 = view.findViewById(R.id.text_cycle_time);
       a.o(view1, "findViewById<TextView>\(R.id.text_cycle_time\)");
       view1.setText(this.c.mBottomTips);
       TextView textView = view.findViewById(R.id.text_money_amount);
       a.o(textView, "amountText");
       textView.setTypeface(d0.a("alte-din.ttf", this.b));
       textView.setText(this.c.mAmount);
       KwaiImageView kwaiImageVie = view.findViewById(R.id.withDrawable_img);
       if (!TextUtils.isEmpty(this.c.mAmountRightTopPic)) {
          kwaiImageVie.M(this.c.mAmountRightTopPic, this.b);
       }
       kwaiImageVie = view.findViewById(R.id.img_bg);
       kwaiImageVie.M(this.c.mBackgroundPic, this.b);
       kwaiImageVie.setOnClickListener(z$b$c.b);
       Button uButton = view.findViewById(R.id.btn_immediately_withDraw);
       a.o(uButton, "mainButton");
       uButton.setBackground(this.d);
       uButton.setText(this.c.mMainButtonText);
       uButton.setOnClickListener(new z$b$a(view, this, p0));
       view.findViewById(R.id.img_close).setOnClickListener(new z$b$b(this, p0));
       a.o(view, "KwaiLayoutInflater.infla¡­      \)\n        }\n      }");
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
