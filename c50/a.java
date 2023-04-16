package c50.a;
import yf6.h;
import java.lang.Object;
import android.view.View;
import yf6.g;
import java.lang.String;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.widget.ScrollView;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import com.yxcorp.utility.n;
import i2b.a;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.widget.selector.view.SelectShapeImageView;
import xf6.l;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import c50.a$a;
import android.view.View$OnClickListener;
import c50.a$b;
import c50.a$c;

public final class a implements h	// class@0002ef
{

    public void a(){
       super();
    }
    public void a(View p0,boolean p1){
       g.a(this, p0, p1);
    }
    public String getTitle(){
       return "端智能";
    }
    public View newPage(ViewGroup p0){
       ScrollView obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       obj = new ScrollView(p0.getContext());
       obj.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       LinearLayout linearLayout = new LinearLayout(p0.getContext());
       linearLayout.setOrientation(1);
       linearLayout.setPadding(n.c(p0.getContext(), 10.00f), n.c(p0.getContext(), 0x41f00000), n.c(p0.getContext(), 10.00f), n.c(p0.getContext(), 0x41f00000));
       View view = a.k(linearLayout, R.layout.arg_RES_7f0d03fe, 1);
       view.findViewById(R.id.har_show_test_config_title).setText("HAR 展示");
       SelectShapeImageView selectShapeI = view.findViewById(R.id.har_show_test_config_switch);
       a.o(selectShapeI, "showSwitcher");
       selectShapeI.setSelected(l.c("HAR_SHOW", false));
       ImageView$ScaleType fIT_END = (selectShapeI.isSelected())? ImageView$ScaleType.FIT_END: ImageView$ScaleType.FIT_START;
       selectShapeI.setScaleType(fIT_END);
       selectShapeI.setOnClickListener(new a$a(selectShapeI));
       SizeAdjustableTextView sizeAdjustab = view.findViewById(R.id.har_speak_test_config_title);
       a.o(sizeAdjustab, "speakTextView");
       sizeAdjustab.setText("HAR 播报");
       selectShapeI = view.findViewById(R.id.har_speak_test_config_switch);
       a.o(selectShapeI, "speakWwitcher");
       selectShapeI.setSelected(l.c("HAR_SPEAK", false));
       fIT_END = (selectShapeI.isSelected())? ImageView$ScaleType.FIT_END: ImageView$ScaleType.FIT_START;
       selectShapeI.setScaleType(fIT_END);
       selectShapeI.setOnClickListener(new a$b(selectShapeI));
       sizeAdjustab = view.findViewById(R.id.har_verify_test_config_title);
       a.o(sizeAdjustab, "verifyTextView");
       sizeAdjustab.setText("HAR 验证");
       SelectShapeImageView selectShapeI1 = view.findViewById(R.id.har_verify_test_config_switch);
       a.o(selectShapeI1, "verifySwitcher");
       selectShapeI1.setSelected(l.c("HAR_VERIFY", false));
       ImageView$ScaleType fIT_END1 = (selectShapeI1.isSelected())? ImageView$ScaleType.FIT_END: ImageView$ScaleType.FIT_START;
       selectShapeI1.setScaleType(fIT_END1);
       selectShapeI1.setOnClickListener(new a$c(selectShapeI1));
       obj.addView(linearLayout, new ViewGroup$LayoutParams(-1, -1));
       return obj;
    }
    public void onConfirm(){
    }
}
