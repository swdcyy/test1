package f0a.c$a$a;
import java.lang.Runnable;
import f0a.c$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f0a.c;
import java.util.List;
import qvb.a;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import f0a.d;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class c$a$a implements Runnable	// class@002269
{
    public final c$a b;
    public final View c;

    public void c$a$a(c$a p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       int i;
       if (PatchProxy.applyVoid(null, this, c$a$a.class, "1")) {
          return;
       }
       c v = this.b.b.v;
       if (v != null) {
          List items = v.getItems();
          if (items != null) {
             Iterator iterator = items.iterator();
             i = 0;
             while (true) {
                if (iterator.hasNext()) {
                   QPhoto qPhoto = iterator.next();
                   String photoId = (qPhoto != null)? qPhoto.getPhotoId(): null;
                   c v1 = this.b.b.v;
                   d m = (v1 != null)? v1.m: null;
                   if (!a.g(photoId, m)) {
                      i = i + 1;
                   }
                }else {
                   i = -1;
                }
             }
          }else {
          label_004c :
             i = 0;
          }
       }else {
          goto label_004c ;
       }
       v = this.b.b.w;
       if (v != null) {
          v.k(i, false);
       }
       c$a$a tc = this.c;
       if (tc != null) {
          tc.setVisibility(false);
       }
       return;
    }
}
