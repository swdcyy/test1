package ej1.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem$LiveGiftGroupBtnInfo;
import z1.k;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.content.Context;
import java.lang.CharSequence;
import lnc.a1;
import android.graphics.drawable.GradientDrawable;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import ej1.a$a;
import android.view.View$OnClickListener;
import android.view.View;

public final class a extends ViewController	// class@002173
{
    public final GiftPanelItem$LiveGiftGroupBtnInfo j;
    public final k k;
    public final p l;

    public void a(GiftPanelItem$LiveGiftGroupBtnInfo p0,k p1,p p2){
       a.p(p0, "diyBtnInfo");
       a.p(p1, "layoutParams");
       a.p(p2, "btnClickListener");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       TextView textView = new TextView(this.D2());
       textView.setText(this.j.mText);
       textView.setTextSize(12.00f);
       textView.setTextColor(a1.a(R.color.arg_RES_7f061ff3));
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setShape(0);
       gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07031b));
       gradientDraw.setColor(ColorStateList.valueOf(a1.a(R.color.arg_RES_7f06026e)));
       textView.setBackground(gradientDraw);
       textView.setGravity(17);
       textView.setLayoutParams(this.k.get());
       textView.setOnClickListener(new a$a(this));
       this.R2(textView);
       return;
    }
}
