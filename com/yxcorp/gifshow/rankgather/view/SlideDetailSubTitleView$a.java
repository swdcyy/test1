package com.yxcorp.gifshow.rankgather.view.SlideDetailSubTitleView$a;
import com.yxcorp.gifshow.rankgather.view.SlideDetailSubTitleView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import android.view.View;
import com.yxcorp.utility.n;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class SlideDetailSubTitleView$a	// class@0016ef
{
    public SlideDetailSubTitleView a;
    public String b;
    public String c;
    public String d;
    public String e;

    public void SlideDetailSubTitleView$a(SlideDetailSubTitleView p0){
       super();
       this.a = p0;
    }
    public void a(){
       View[] viewArray;
       SlideDetailSubTitleView$a ta;
       SlideDetailSubTitleView$a ta1;
       if (PatchProxy.applyVoid(null, this, SlideDetailSubTitleView$a.class, "1")) {
          return;
       }
       this.a.b.setText(this.b);
       if (!TextUtils.x(this.e)) {
          this.a.b.setTextColor(TextUtils.J(this.e, a1.a(R.color.arg_RES_7f061c32)));
       }
       int i = 8;
       int i1 = 1;
       int i2 = 2;
       int i3 = 0;
       if (!TextUtils.x(this.c)) {
          viewArray = new View[i2];
          ta = this.a;
          viewArray[i3] = ta.e;
          viewArray[i1] = ta.c;
          n.Z(i3, viewArray);
          this.a.c.setText(this.c);
          this.a.d.setVisibility(i);
       }else if(!TextUtils.x(this.d)){
          viewArray = new View[i2];
          ta = this.a;
          viewArray[i3] = ta.e;
          viewArray[i1] = ta.c;
          n.Z(i, viewArray);
          this.a.d.setVisibility(i3);
          this.a.d.L(this.d);
       }else {
          viewArray = new View[]{ta1.e,ta1.d,ta1.c};
          ta1 = this.a;
          n.Z(i, viewArray);
       }
       return;
    }
    public SlideDetailSubTitleView$a b(String p0){
       this.c = p0;
       return this;
    }
    public SlideDetailSubTitleView$a c(String p0){
       this.b = p0;
       return this;
    }
}
