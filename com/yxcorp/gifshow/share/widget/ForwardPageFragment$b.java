package com.yxcorp.gifshow.share.widget.ForwardPageFragment$b;
import xz6.d;
import com.yxcorp.gifshow.share.widget.ForwardPageFragment;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import mhc.p1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import msd.q;
import qrd.l1;
import com.yxcorp.gifshow.share.widget.ForwardPageFragment$b$a;
import android.view.View$OnClickListener;

public final class ForwardPageFragment$b extends d	// class@001ce9
{
    public final ForwardPageFragment d;

    public void ForwardPageFragment$b(ForwardPageFragment p0){
       this.d = p0;
       super();
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       KwaiImageView obj;
       if (PatchProxy.isSupport(ForwardPageFragment$b.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, ForwardPageFragment$b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "parent");
       if (p1 == null) {
          p1 = a.i(p2, R.layout.arg_RES_7f0d0488);
          a.o(p1, "KwaiLayoutInflater.infla¡­layout.forward_grid_item\)");
       }
       p1 item = this.getItem(p0);
       obj = p1.findViewById(R.id.share_to_button);
       TextView textView = p1.findViewById(R.id.share_to_text);
       String text = item.getText();
       int i = 0;
       int i1 = (text == null || !text.length())? 1: 0;
       if (i1) {
          textView.setText(item.e());
       }else {
          a.o(textView, "nameView");
          textView.setText(item.getText());
       }
       String str = item.o();
       if (str == null || !str.length()) {
          i = 1;
       }
       if (i) {
          obj.setImageResource(item.k());
       }else {
          obj.L(item.o());
       }
       a.o(obj, "iconView");
       obj.setSelected(true);
       ForwardPageFragment e = this.d.e;
       if (e != null) {
          a.o(item, "item");
          l1 ol1 = e.invoke(item, p1, Integer.valueOf(p0));
       }
       p1.setOnClickListener(new ForwardPageFragment$b$a(this, item, p0));
       return p1;
    }
}
