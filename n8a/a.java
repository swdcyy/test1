package n8a.a;
import java.lang.Object;
import java.util.LinkedHashSet;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import qvb.a;
import java.util.Iterator;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import uw9.o;
import q87.c;
import r8a.a;
import java.util.Set;
import java.lang.StringBuilder;
import qvb.n0;
import fm5.a;
import java.lang.Math;
import n8a.a$b;

public final class a	// class@003105
{
    public a a;
    public QPhoto b;
    public a$a c;
    public PhotoDetailParam d;
    public final Set e;
    public a$b f;

    public void a(){
       super();
       this.e = new LinkedHashSet();
    }
    public final QPhoto a(boolean p0){
       List obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoa = this.a;
       int i = 0;
       if (uoa != null) {
          obj = uoa.getItems();
          if (obj != null) {
             Iterator iterator = obj.iterator();
             int i1 = 0;
             while (true) {
                if (iterator.hasNext()) {
                   QPhoto qPhoto = iterator.next();
                   a.o(qPhoto, "it");
                   String photoId = qPhoto.getPhotoId();
                   a tb = this.b;
                   String photoId1 = (tb != null)? tb.getPhotoId(): null;
                   if (TextUtils.n(photoId, photoId1)) {
                   label_0055 :
                      if (p0) {
                         while (i1 > -1) {
                            int i2 = obj.size() - 1;
                            if (i1 < i2) {
                               i1 = i1 + 1;
                               Object obj1 = obj.get(i1);
                               a.o(obj1, "\(items[index + 1]\)");
                               if (!obj1.isSerialPayPhoto()) {
                                  return obj.get(i1);
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }else if(i1 > -1 && i1 < (obj.size() - 1)){
                         return obj.get((i1 + 1));
                      }
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   i1 = -1;
                   goto label_0055 ;
                }
             }
          }
       }
       Object[] objArray = new Object[i];
       o.C().w("NasaSerialAutoPlayPageList", " ---------getNextPhoto: next is null ", objArray);
       return null;
    }
    public final a b(){
       return this.a;
    }
    public final boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "id");
       return this.e.contains(p0);
    }
    public final void d(){
       a ta;
       int i1;
       int i2;
       int i3;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "16")) {
          return;
       }
       o oo = o.C();
       StringBuilder str = "preloadEpisode curPhoto Id : ";
       a tb = this.b;
       String photoId = (tb != null)? tb.getPhotoId(): objArray;
       str = str+photoId+"  caption : ";
       tb = this.b;
       if (tb != null) {
          objArray = tb.getCaption();
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       oo.w("NasaSerialAutoPlayPageList", str+objArray, objArray1);
       a tb1 = this.b;
       if (tb1 != null) {
          boolean b = true;
          if (tb1 != null) {
             tb = this.a;
             if (tb != null) {
                a.m(tb);
                if (tb.isEmpty()) {
                   tb = this.a;
                   a.m(tb);
                   if (tb.isLoading()) {
                   }
                }else {
                }
             }
          }
       label_00cd :
          boolean b1 = true;
       label_00ce :
          Object[] objArray2 = new Object[i];
          o.C().w("NasaSerialAutoPlayPageList", "preloadEpisode cur="+a.m(tb1)+"  needReCreatePageList = "+b+" needLoadPageList = "+b1, objArray2);
          if (b) {
             ta = this.a;
             if (ta != null) {
                ta.release();
             }
             this.a = new a(tb1);
             ta = this.f;
             if (ta != null) {
                ta.a();
             }
          }
          if (b1) {
             ta = this.a;
             if (ta != null && !PatchProxy.applyVoidOneRefs(tb1, ta, a.class, "3")) {
                a.p(tb1, "photo");
                ta.q = tb1;
             }
             tb1 = this.a;
             if (tb1 != null) {
                tb1.load();
             }
          }
       }
    label_0132 :
       return;
    }
}
