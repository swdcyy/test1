package cg3.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import cw9.c;
import java.lang.Object;
import yf3.a;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import cg3.a;
import java.lang.Runnable;
import android.view.ViewGroup;

public class b	// class@000502
{
    public static final int a;

    static {
       b.a = c.b(a.a().a().getResources(), 0x7f070c56);
    }
    public void b(){
       super();
    }
    public static void a(a p0,RecyclerView p1,Activity p2,QPhoto p3){
       boolean b;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "5")) {
          return;
       }
       if (p0 != null) {
          QPhoto qPhoto = p0.r1();
          p0.w = p3;
          if (qPhoto != null) {
             p0.m0(p0.s1(qPhoto), "");
          }
          b = (qPhoto != null && !(qPhoto.getPhotoId()).equals(p3.getPhotoId()))? true: false;
          int i = p0.s1(p3);
          p0.m0(i, "");
          if (i > -1) {
             p1.post(new a(p1, i, p2, b));
          }
       }
       return;
    }
}
