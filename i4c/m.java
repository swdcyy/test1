package i4c.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import z5c.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.List;
import android.view.View;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;

public class m extends PresenterV2	// class@002a71
{
    public List p;
    public boolean q;

    public void m(){
       super();
       this.p = new ArrayList();
    }
    public void E8(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       Configuration fontScale = this.getActivity().getResources().getConfiguration().fontScale;
       if (fontScale - 0x3f8ccccd <= 0) {
          return;
       }
       if (this.q == null) {
          Iterator iterator = this.p.iterator();
          while (iterator.hasNext()) {
             View view = iterator.next();
             float f = 0x3f800000;
             if (!PatchProxy.isSupport(uod) || (PatchProxy.applyVoidTwoRefs(Float.valueOf(fontScale), view, null, uod, "1") || (view != null && fontScale - f > 0))) {
                ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                   float f1 = d.a(fontScale) * (float)layoutParams.bottomMargin;
                   layoutParams.bottomMargin = (int)f1;
                   f1 = d.a(fontScale) * (float)layoutParams.topMargin;
                   layoutParams.topMargin = (int)f1;
                }
             }
             if (view instanceof TextView) {
                boolean b = 0x3f99999a;
                if (fontScale - b <= 0 || (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Float.valueOf(fontScale), view, null, uod, "2"))) {
                   continue ;
                }else {
                   boolean b1 = false;
                   view.setIncludeFontPadding(b1);
                   float textSize = view.getTextSize();
                   if (fontScale - b > 0) {
                      if (fontScale - 0x3fa66666 <= 0) {
                         f = 0x3f666666;
                      }else if(fontScale - 0x3fb33333 <= 0){
                         f = 0x3f59999a;
                      }else {
                         f = 0x3f4ccccd;
                      }
                   }
                   textSize = textSize * f;
                   view.setTextSize(b1, textSize);
                }
             }
          }
          this.q = true;
       }
       return;
    }
    public int[] P8(){
       int[] ointArray = new int[0];
       return ointArray;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       int[] ointArray = this.P8();
       if (ointArray == null) {
          return;
       }
       int len = ointArray.length;
       int i = 0;
       while (i < len) {
          View view = p0.findViewById(ointArray[i]);
          if (view != null) {
             this.p.add(view);
          }
          i = i + 1;
       }
       return;
    }
}
