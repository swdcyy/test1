package b79.m;
import b79.i;
import android.view.View;
import z69.y;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumTakePhotoItemViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import b79.m$a;
import java.util.List;
import androidx.lifecycle.ViewModel;
import r79.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q79.d;
import ga9.b;
import ia9.d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Integer;
import android.view.View$OnClickListener;

public final class m extends i	// class@00038b
{
    public final m e;
    public final int f;
    public y g;
    public final AbsAlbumTakePhotoItemViewBinder h;

    public void m(View p0,int p1,y p2,AbsAlbumTakePhotoItemViewBinder p3){
       a.q(p0, "mItemView");
       a.q(p3, "viewBinder");
       super(p0, p3);
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.e = new m$a(this);
    }
    public void a(Object p0,List p1,ViewModel p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "2")) {
       }else {
          a.q(p1, "payloads");
          if (!p2 instanceof d) {
             p2 = null;
          }
          boolean b = (p2 != null)? p2.r(): true;
          this.d(b);
       }
       return;
    }
    public b b(){
       return this.e();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       super.c();
       RecyclerView$ViewHolder titemView = this.itemView;
       a.h(titemView, "itemView");
       this.e().c(titemView, this.f);
       return;
    }
    public AbsAlbumTakePhotoItemViewBinder e(){
       return this.h;
    }
    public void onBindClickEvent(int p0,ViewModel p1){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, m.class, "3")) {
          return;
       }
       super.onBindClickEvent(p0, p1);
       View view = this.e().n();
       if (view != null) {
          view.setOnClickListener(this.e);
       }
       return;
    }
}
