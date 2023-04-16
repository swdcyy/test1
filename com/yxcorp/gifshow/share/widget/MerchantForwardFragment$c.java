package com.yxcorp.gifshow.share.widget.MerchantForwardFragment$c;
import y8c.r;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nl8.p;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import mhc.p1;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import msd.q;
import qrd.l1;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$c$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$e;
import android.widget.ImageView;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$c$b;

public final class MerchantForwardFragment$c extends r	// class@001d12
{
    public final MerchantForwardFragment i;

    public void MerchantForwardFragment$c(MerchantForwardFragment p0){
       this.i = p0;
       super();
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, MerchantForwardFragment$c.class, "1")) {
          return;
       }
       Object obj = this.t();
       if (obj != null) {
          View view = this.y();
          if (view != null) {
             KwaiImageView kwaiImageVie = view.findViewById(R.id.share_to_button);
             int i = 0x7f0a3916;
             TextView textView = view.findViewById(i);
             if (obj instanceof p1) {
                Object obj1 = obj;
                String str = obj1.o();
                int i1 = 0;
                int i2 = (str == null || !str.length())? 1: 0;
                if (i2) {
                   kwaiImageVie.setImageResource(obj1.k());
                }else {
                   kwaiImageVie.L(obj1.o());
                }
                TextView textView1 = view.findViewById(i);
                str = obj1.getText();
                if (str == null || !str.length()) {
                   i1 = 1;
                }
                if (i1) {
                   textView1.setText(obj1.e());
                }else {
                   a.o(textView1, "textView");
                   textView1.setText(obj1.getText());
                }
                MerchantForwardFragment h = this.i.H;
                if (h != null) {
                   a.o(kwaiImageVie, "imageView");
                   l1 ol1 = h.invoke(obj, kwaiImageVie, Integer.valueOf(this.F()));
                }
                view.setOnClickListener(new MerchantForwardFragment$c$a(this, obj));
             }else if(obj instanceof MerchantForwardFragment$e){
                Object obj2 = obj;
                kwaiImageVie.setBackgroundResource(obj2.a);
                textView.setText(obj2.b);
                view.setOnClickListener(new MerchantForwardFragment$c$b(this, obj));
             }
          }
       }
       return;
    }
}
