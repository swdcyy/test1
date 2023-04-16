package fu2.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;

public final class h	// class@0029eb
{
    public static final int a = 2131371945;
    public static final int b = 2131371944;
    public static final int c = 1;
    public static final int d = 2;
    public static final h e;

    static {
       h.e = new h();
    }
    public void h(){
       super();
    }
    public static final boolean b(Object p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, h.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       if (!p0 instanceof Integer) {
          p0 = obj;
       }
       obj1 = 2;
       boolean b = true;
       if (p0 == null || p0.intValue() != obj1) {
          obj1 = 7;
          if (p0 == null || p0.intValue() != obj1) {
             int i = 4;
             if (p0 == null || (p0.intValue() != i && (p0 == null || p0.intValue() != b))) {
                i = 3;
                if (p0 != null && (p0.intValue() != i && (p0 == null || p0.intValue() != 5))) {
                   b = false;
                }
             }
          }
       }
       return b;
    }
    public static final boolean c(LiveVoicePartyPlayViewService p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "playViewService");
       int b = h.b;
       if (!a.g(p0.a(b), Integer.valueOf(h.c))) {
          return false;
       }
       p0.c(b, Integer.valueOf(h.d));
       return true;
    }
    public static final ViewGroup$MarginLayoutParams d(ViewGroup$LayoutParams p0,int p1,int p2,int p3,int p4,int p5,int p6){
       RelativeLayout$LayoutParams layoutParams;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, null, oh, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 instanceof RelativeLayout$LayoutParams) {
          layoutParams = new RelativeLayout$LayoutParams(p1, p2);
       }else if(p0 instanceof ConstraintLayout$LayoutParams){
          layoutParams = new ConstraintLayout$LayoutParams(p1, p2);
       }else if(p0 instanceof FrameLayout$LayoutParams){
          layoutParams = new FrameLayout$LayoutParams(p1, p2, 17);
       }else if(p0 instanceof LinearLayout$LayoutParams){
          layoutParams = new LinearLayout$LayoutParams(p1, p2);
       }else {
          layoutParams = new ViewGroup$MarginLayoutParams(p1, p2);
       }
       layoutParams.setMargins(p3, p4, p5, p6);
       return layoutParams;
    }
    public static ViewGroup$MarginLayoutParams e(ViewGroup$LayoutParams p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,Object p8){
       int i = (p7 & 0x08)? 0: p3;
       int i1 = (p7 & 0x10)? 0: p4;
       int i2 = (p7 & 0x20)? 0: p5;
       int i3 = (p7 & 0x40)? 0: p6;
       return h.d(p0, p1, p2, i, i1, i2, i3);
    }
    public final int a(){
       return h.a;
    }
}
