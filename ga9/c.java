package ga9.c;
import ga9.c$a;
import nsd.u;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumFragmentViewBinder;
import java.lang.Class;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumHomeFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumHomeFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumAssetFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumListFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumListFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumListItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumListItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumTakePhotoItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumTakePhotoItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultSelectedContainerViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultSelectedItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultPreviewFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultPreviewItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFooterItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumFooterItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumHeaderItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumHeaderItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewSelectViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultPreviewSelectViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumDividerItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumDividerItemViewBinder;
import java.lang.Integer;
import java.util.Collection;
import androidx.fragment.app.Fragment;
import ga9.b;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Constructor;
import kotlin.TypeCastException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.util.List;
import java.util.Map;
import android.os.Bundle;
import ic7.c;

public final class c	// class@002460
{
    public final HashMap a;
    public final ArrayList b;
    public boolean c;
    public static final c$a d;

    static {
       c.d = new c$a(null);
    }
    public void c(){
       super(null, null, false, 7, null);
    }
    public void c(HashMap p0,ArrayList p1,boolean p2,int p3,u p4){
       ArrayList uArrayList1;
       p1 = null;
       p0 = (p3 & 0x01)? new HashMap(): p1;
       if (p3 & 0x02) {
          p1 = new ArrayList();
       }
       int i = 0;
       if (p3 & 0x04) {
          p2 = false;
       }
       a.q(p0, "mViewBinderMap");
       a.q(p1, "mPreLoadLayoutList");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       if (p0.size() <= 0) {
          this.e(AbsAlbumFragmentViewBinder.class, DefaultAlbumFragmentViewBinder.class);
          this.e(AbsAlbumHomeFragmentViewBinder.class, DefaultAlbumHomeFragmentViewBinder.class);
          this.e(AbsAlbumAssetFragmentViewBinder.class, DefaultAlbumAssetFragmentViewBinder.class);
          this.e(AbsAlbumAssetItemViewBinder.class, DefaultAlbumAssetItemViewBinder.class);
          this.e(AbsAlbumListFragmentViewBinder.class, DefaultAlbumListFragmentViewBinder.class);
          this.e(AbsAlbumListItemViewBinder.class, DefaultAlbumListItemViewBinder.class);
          this.e(AbsAlbumTakePhotoItemViewBinder.class, DefaultAlbumTakePhotoItemViewBinder.class);
          this.e(AbsSelectedContainerViewBinder.class, DefaultSelectedContainerViewBinder.class);
          this.e(AbsSelectedItemViewBinder.class, DefaultSelectedItemViewBinder.class);
          this.e(AbsPreviewFragmentViewBinder.class, DefaultPreviewFragmentViewBinder.class);
          this.e(AbsPreviewItemViewBinder.class, DefaultPreviewItemViewBinder.class);
          this.e(AbsAlbumFooterItemViewBinder.class, DefaultAlbumFooterItemViewBinder.class);
          this.e(AbsAlbumHeaderItemViewBinder.class, DefaultAlbumHeaderItemViewBinder.class);
          this.e(AbsPreviewSelectViewBinder.class, DefaultPreviewSelectViewBinder.class);
          this.e(AbsAlbumDividerItemViewBinder.class, DefaultAlbumDividerItemViewBinder.class);
       }
       if (p1.isEmpty()) {
          ArrayList uArrayList = new ArrayList(50);
          for (; i < 50; i++) {
             uArrayList.add(Integer.valueOf(R.layout.ksa_list_item_album_img_video));
          }
          p1.addAll(uArrayList);
       }
       return;
    }
    public static b b(c p0,Class p1,Fragment p2,int p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = -1;
       }
       return p0.a(p1, p2, p3);
    }
    public final b a(Class p0,Fragment p1,int p2){
       Class obj;
       Object[] objArray;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, c.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.q(p0, "key");
       a.q(p1, "fragment");
       obj = this.a.get(p0);
       if (obj != null) {
          if (p2 == -1) {
             Class[] uClassArray = new Class[]{Fragment.class};
             objArray = new Object[]{p1};
             p1 = obj.getConstructor(uClassArray).newInstance(objArray);
             if (p1 != null) {
             }else {
                throw new TypeCastException("null cannot be cast to non-null type INTERFACE");
             }
          }else {
             Class[] uClassArray1 = new Class[]{Fragment.class,Integer.TYPE};
             objArray = new Object[]{p1,Integer.valueOf(p2)};
             p1 = obj.getConstructor(uClassArray1).newInstance(objArray);
             if (p1 != null) {
             }else {
                throw new TypeCastException("null cannot be cast to non-null type INTERFACE");
             }
          }
          return p1;
       }else {
          throw new IllegalArgumentException("can not find implementation of key "+p0);
       }
    }
    public final ArrayList c(){
       return this.b;
    }
    public final c d(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "layoutList");
       this.b.addAll(p0);
       return this;
    }
    public final c e(Class p0,Class p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "key");
       a.q(p1, "clazz");
       this.a.put(p0, p1);
       return this;
    }
    public final void f(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       a.q(p0, "bundle");
       p0.putString("vb_op_key", c.c().d(this.a));
       p0.putIntegerArrayList("vb_pl_key", this.b);
       return;
    }
}
