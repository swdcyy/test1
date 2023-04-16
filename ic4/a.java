package ic4.a;
import xs3.g;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import qvb.i;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import nu5.a$a;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import tkd.b;
import tkd.d;
import nu5.a;
import android.view.View;
import n3d.a$a;
import w69.i;
import n3d.a;
import x79.e;
import android.content.Context;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import brd.t;
import com.kwai.robust.PatchProxyResult;

public class a implements g	// class@002197
{

    public void a(){
       super();
    }
    public void AU(GifshowActivity p0,Fragment p1,i p2,QPhoto p3,int p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       a$a uoa1 = new a$a();
       uoa1.a = p4;
       String str = f.b(p1);
       b.g(j.e(p2, str, SlideMediaType.ALL));
       d.a(-977155072).yV(p0, 0, p3, str, uoa1, null, 0, 0);
       return;
    }
    public void MF(a$a p0,i p1,int p2,a p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "2")) {
          return;
       }
       e.f().i(p0, p1, p2, p3);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public t lb(Context p0,int p1,int p2,AlbumLimitOption p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return e.f().g(p0, p1, p2, p3);
    }
}
