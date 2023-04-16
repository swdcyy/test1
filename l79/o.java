package l79.o;
import ia9.d;
import l79.o$a;
import nsd.u;
import android.view.View;
import java.util.Set;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedItemViewBinder;
import l79.m$c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ga9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup$LayoutParams;
import o79.i;
import com.kwai.moved.impls.widget.KsAlbumScaleLayout;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import android.widget.ImageView;
import android.widget.RelativeLayout$LayoutParams;
import androidx.lifecycle.ViewModel;
import java.lang.Integer;
import l79.o$b;
import android.view.View$OnClickListener;
import l79.o$c;

public final class o extends d	// class@002ccb
{
    public final int d;
    public final int e;
    public final int f;
    public final Set g;
    public final m$c h;
    public final boolean i;
    public static final o$a j;

    static {
       o.j = new o$a(null);
    }
    public void o(View p0,int p1,int p2,int p3,Set p4,AbsSelectedItemViewBinder p5,m$c p6,boolean p7){
       a.q(p0, "itemView");
       a.q(p4, "invisibleSet");
       a.q(p5, "viewBinder");
       super(p0, p5);
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p6;
       this.i = p7;
    }
    public void c(){
       RecyclerView$ViewHolder titemView1;
       int i;
       ViewGroup$LayoutParams layoutParams;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "1")) {
          return;
       }
       super.c();
       RecyclerView$ViewHolder titemView = this.itemView;
       String str = "itemView";
       a.h(titemView, str);
       this.b().c(titemView, this.e);
       float f = 2.00f;
       if (this.i != null) {
          titemView1 = this.itemView;
          a.h(titemView1, str);
          titemView1.getLayoutParams().width = this.e + i.d(f);
       }else {
          titemView1 = this.itemView;
          a.h(titemView1, str);
          titemView1.getLayoutParams().width = this.e;
       }
       titemView1 = this.itemView;
       a.h(titemView1, str);
       i = -1;
       titemView1.getLayoutParams().height = i;
       KsAlbumScaleLayout ksAlbumScale = this.b().m();
       if (ksAlbumScale != null) {
          layoutParams = ksAlbumScale.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.width = this.e;
          }
       }
       ksAlbumScale = this.b().m();
       if (ksAlbumScale != null) {
          layoutParams = ksAlbumScale.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = this.e;
          }
       }
       CompatImageView uCompatImage = this.b().n();
       if (uCompatImage != null) {
          layoutParams = uCompatImage.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.width = i;
          }
       }
       uCompatImage = this.b().n();
       if (uCompatImage != null) {
          layoutParams = uCompatImage.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = this.e;
          }
       }
       if (this.i != null) {
          ksAlbumScale = this.b().m();
          layoutParams = (ksAlbumScale != null)? ksAlbumScale.getLayoutParams(): objArray;
          if (layoutParams instanceof RelativeLayout$LayoutParams) {
             objArray = layoutParams;
          }
          if (objArray != null) {
             objArray.leftMargin = i.d(0x3f800000);
          }
          View view = this.b().o();
          if (view != null) {
             layoutParams = view.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.width = this.e + i.d(f);
             }
          }
          view = this.b().o();
          if (view != null) {
             layoutParams = view.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.height = this.e + i.d(f);
             }
          }
       }
    label_0107 :
       return;
    }
    public void onBindClickEvent(int p0,ViewModel p1){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, o.class, "3")) {
          return;
       }
       super.onBindClickEvent(p0, p1);
       View view = this.b().k();
       if (view != null) {
          view.setOnClickListener(new o$b(this));
       }
       KsAlbumScaleLayout ksAlbumScale = this.b().m();
       if (ksAlbumScale != null) {
          ksAlbumScale.setOnClickListener(new o$c(this));
       }
       return;
    }
}
