package k99.e0;
import e99.a;
import k99.e0$b;
import k99.e0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import java.util.Set;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class e0 extends a	// class@002b74
{
    public Set D;
    public PhotosViewPager E;
    public View F;
    public boolean G;
    public final y H;
    public ViewPager$i I;

    public void e0(){
       super();
       this.H = new e0$b(this);
       this.I = new e0$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e0.class, "3")) {
          return;
       }
       super.E8();
       if (this.S8().isAtlasPhotos() && !this.S8().isSinglePhoto()) {
          e0 tD = this.D;
          if (tD == null) {
             a.S("mOnScrollListeners");
          }
          tD.add(this.H);
          tD = this.E;
          if (tD == null) {
             a.S("mPhotosPagerView");
          }
          tD.addOnPageChangeListener(this.I);
          return;
       }else if(this.S8().isSinglePhoto() && this.R8(0)){
          ImageView imageView = this.W8();
          ViewGroup$LayoutParams layoutParams = (imageView != null)? imageView.getLayoutParams(): objArray;
          if (layoutParams instanceof RelativeLayout$LayoutParams) {
             objArray = layoutParams;
          }
          if (objArray != null) {
             objArray.addRule(12);
          }
          ImageView imageView1 = this.W8();
          if (imageView1 != null) {
             imageView1.setTranslationY((- (float)a1.e(12.00f)));
          }
          imageView1 = this.W8();
          if (imageView1 != null) {
             imageView1.setVisibility(0);
          }
       }
    label_0086 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "4")) {
          return;
       }
       super.J8();
       if (this.S8().isAtlasPhotos() && !this.S8().isSinglePhoto()) {
          e0 tD = this.D;
          if (tD == null) {
             a.S("mOnScrollListeners");
          }
          tD.remove(this.H);
          tD = this.E;
          if (tD == null) {
             a.S("mPhotosPagerView");
          }
          tD.removeOnPageChangeListener(this.I);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.c9(m1.f(p0, R.id.search_related_button));
       ImageView imageView = this.W8();
       if (imageView != null) {
          imageView.setImageResource(R.drawable.arg_RES_7f080dd6);
       }
       this.F = m1.f(p0, 0x7f0a027a);
       p0 = m1.f(p0, R.id.view_pager_photos);
       a.o(p0, "ViewBindUtils.bindWidget¡­l.R.id.view_pager_photos\)");
       this.E = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("DETAIL_SCROLL_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_SCROLL_LISTENERS\)");
       this.D = obj;
       return;
    }
}
