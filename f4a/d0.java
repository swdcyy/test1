package f4a.d0;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.detail.plc.PlcPhotoType;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;

public final class d0	// class@00229f
{
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;

    static {
       d0.a = a1.p(0x7f103ce3);
       d0.b = a1.p(0x7f103ce6);
       d0.c = a1.p(0x7f1016d0);
       d0.d = a1.p(0x7f103ce5);
       d0.e = a1.p(0x7f10110c);
    }
    public void d0(){
       super();
    }
    public static View a(ViewGroup p0,View p1,int p2,PlcPhotoType p3){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(d0.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, d0.class, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p0 instanceof RelativeLayout) {
          if (PatchProxy.isSupport(d0.class) && PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, d0.class, "1") != patchProxyRe) {
          }else {
             p1.setId(p2);
             RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
             layoutParams.addRule(12);
             layoutParams.addRule(9);
             layoutParams.bottomMargin = a1.d(0x7f07025d);
             layoutParams.leftMargin = a1.d(0x7f07025d);
             p0.addView(p1, layoutParams);
          }
       }else if(p0 instanceof FrameLayout){
          p1.setId(p2);
          FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(-2, -2);
          if (p3 == PlcPhotoType.ATLAS) {
             layoutParams1.bottomMargin = a1.d(0x7f07031b);
             layoutParams1.leftMargin = a1.d(0x7f0702ab);
          }else {
             layoutParams1.bottomMargin = a1.d(0x7f070271);
             layoutParams1.leftMargin = a1.d(0x7f070271);
          }
          layoutParams1.gravity = 83;
          p0.addView(p1, layoutParams1);
       }
       return p1;
    }
}
