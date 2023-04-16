package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$b$b;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$b;
import zqa.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.Context;
import java.util.Objects;
import android.content.ClipboardManager;
import zqa.b$b;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;
import android.content.ClipData;
import e17.i;

public final class GrowthTestViewHolder$b$b implements View$OnLongClickListener	// class@00156f
{
    public final GrowthTestViewHolder$b b;
    public final b c;

    public void GrowthTestViewHolder$b$b(GrowthTestViewHolder$b p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final boolean onLongClick(View p0){
       CharSequence text;
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, GrowthTestViewHolder$b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.o(p0, "v");
       p0 = p0.getContext().getSystemService("clipboard");
       Objects.requireNonNull(p0, "null cannot be cast to non-null type android.content.ClipboardManager");
       String str = "";
       if (this.b.e != null && this.c.e()) {
          obj = "";
          GrowthTestViewHolder$b b = this.b.b;
          if (b != null) {
             text = b.getText();
             if (text != null) {
             label_004e :
                obj = obj+text+10;
                b = this.b.d;
                if (b != null) {
                   text = b.getText();
                   if (text != null) {
                      str = text;
                   }
                }
                str = obj+str;
             }
          }
          text = str;
          goto label_004e ;
       }else {
          GrowthTestViewHolder$b b1 = this.b.b;
          if (b1 != null) {
             CharSequence text1 = b1.getText();
             if (text1 != null) {
                str = text1;
             }
          }
       }
       p0.setPrimaryClip(ClipData.newPlainText(null, str));
       i.a(R.style.arg_RES_7f110669, 0x7f100833);
       return true;
    }
}
