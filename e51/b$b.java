package e51.b$b;
import androidx.viewpager.widget.ViewPager$l;
import e51.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;
import xq5.c;
import java.lang.Float;
import k51.a;
import e51.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;

public class b$b extends ViewPager$l	// class@0020a3
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (!p0) {
          b$b tb = this.b;
          if (tb.e != LiveWillShowType.NONE) {
             tb.b.y1();
          }
          this.b.a();
          tb.d = 0;
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       b$b obj;
       int b;
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, b$b.class, "2")) {
          return;
       }
       b$b uob1 = -1;
       if (a.e()) {
          uob1 = this.b.a.e();
       }
       int i = 0;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(uob1), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(a.e()){
             obj = uob1;
          }else {
             b = this.b.a.e();
          }
          b$b tb1 = this.b;
          if (tb1.c == null && (tb1.e != LiveWillShowType.NONE || Math.abs((p0 - obj)) > 1)) {
             b = true;
          }else {
             b = false;
          }
       }else {
          goto label_0050 ;
       }
       if (b) {
          return;
       }else {
          obj = this.b;
          if (obj.d <= 0) {
             obj.d = p1;
             return;
          }else if(PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(uob1), this, b$b.class, "4")){
             if (!a.e()) {
                uob1 = this.b.a.e();
             }
             p1 = p1 - this.b.d;
             if (Math.abs(p1) - 0x3d4ccccd > 0) {
                if (p1 > 0) {
                   i = 1;
                }
                if (i && uob1 == (p0 + 1)) {
                   p0.e = LiveWillShowType.UP_SLIDE;
                }else if(!i && uob1 == p0){
                   p0.e = LiveWillShowType.DOWN_SLIDE;
                }
             }
          }
       label_00e0 :
          b$b tb = this.b;
          b e = tb.e;
          if (e != LiveWillShowType.NONE) {
             tb.b.t4(e);
          }
          return;
       }
    }
}
