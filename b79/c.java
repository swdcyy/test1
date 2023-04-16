package b79.c;
import b79.i;
import android.view.View;
import z69.y;
import o79.f;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import c79.c;
import android.graphics.drawable.Drawable;
import ga9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ia9.d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import o79.q;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.lifecycle.ViewModel;
import java.lang.Integer;
import q79.d;
import b79.c$a;
import android.view.View$OnClickListener;
import b79.c$b;
import kotlin.TypeCastException;

public final class c extends i	// class@000380
{
    public View$OnClickListener e;
    public m f;
    public e g;
    public c h;
    public final int i;
    public final int j;
    public y k;
    public f l;
    public final AbsAlbumAssetItemViewBinder m;

    public void c(View p0,int p1,int p2,y p3,f p4,AbsAlbumAssetItemViewBinder p5){
       c obj = p0;
       Object obj1 = p4;
       Object obj2 = p5;
       a.q(obj, "mItemView");
       a.q(obj1, "mAverageCalculator");
       a.q(obj2, "viewBinder");
       super(obj, obj2);
       this.i = p1;
       this.j = p2;
       this.k = p3;
       this.l = obj1;
       this.m = obj2;
       c uoc = obj;
       obj = new c(null, null, null, -1, -1, -1, false, 0, -1, -1, false, "", 0, 0, 0);
       this.h = uoc;
    }
    public b b(){
       return this.e();
    }
    public void c(){
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.c();
       RecyclerView$ViewHolder titemView = this.itemView;
       String str = "itemView";
       a.h(titemView, str);
       int i = -1;
       if (titemView.getLayoutParams() == null) {
          titemView = this.itemView;
          a.h(titemView, str);
          titemView.setLayoutParams(new ViewGroup$LayoutParams(i, this.j));
       }else {
          titemView = this.itemView;
          a.h(titemView, str);
          titemView.getLayoutParams().width = i;
          titemView = this.itemView;
          a.h(titemView, str);
          titemView.getLayoutParams().height = this.j;
       }
       CompatImageView uCompatImage = this.e().p();
       if (uCompatImage != null) {
          layoutParams = uCompatImage.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.width = i;
          }
       }
       uCompatImage = this.e().p();
       if (uCompatImage != null) {
          layoutParams = uCompatImage.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = this.j;
          }
       }
       SizeAdjustableTextView sizeAdjustab = this.e().n();
       if (sizeAdjustab != null) {
          sizeAdjustab.setTypeface(q.a.h());
       }
       sizeAdjustab = this.e().n();
       if (sizeAdjustab != null) {
          sizeAdjustab.setTextSizeAdjustable(true);
       }
       RecyclerView$ViewHolder titemView1 = this.itemView;
       a.h(titemView1, str);
       this.e().c(titemView1, this.j);
       return;
    }
    public AbsAlbumAssetItemViewBinder e(){
       return this.m;
    }
    public void onBindClickEvent(int p0,ViewModel p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, c.class, "2")) {
          return;
       }
       super.onBindClickEvent(p0, p1);
       if (p1 == null) {
          throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.vm.AlbumAssetViewModel");
       }
       if (this.e == null) {
          this.e = new c$a(this);
       }
       View view = this.e().o();
       if (view != null) {
          view.setOnClickListener(this.e);
       }
       if (this.f == null) {
          this.f = new c$b(this, p1);
       }
       CompatImageView uCompatImage = this.e().p();
       if (uCompatImage != null) {
          uCompatImage.setOnClickListener(this.f);
       }
       return;
    }
}
