package kx8.u;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class u	// class@002c4b
{

    public void u(){
       super();
    }
    public static void a(View p0,ViewGroup p1,int p2,int p3){
       ViewGroup$MarginLayoutParams layoutParams;
       if (PatchProxy.isSupport(u.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, u.class, "1")) {
          return;
       }
       if (p0 != null && p1 != null) {
          int height = p1.getHeight();
          int width = p1.getWidth();
          int i = width * p2;
          int i1 = height * p3;
          if (i > i1) {
             i = i / p3;
             layoutParams = p0.getLayoutParams();
             layoutParams.width = width;
             layoutParams.height = i;
             layoutParams.leftMargin = 0;
             layoutParams.topMargin = (height - i) / 2;
             p0.setLayoutParams(layoutParams);
          }else if(i < i1){
             i1 = i1 / p2;
             layoutParams = p0.getLayoutParams();
             layoutParams.width = i1;
             layoutParams.height = height;
             layoutParams.leftMargin = (width - i1) / 2;
             layoutParams.topMargin = 0;
             p0.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}
