package h8a.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h8a.e$b;
import h8a.e$a;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import h8a.e$c;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Number;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import ekd.m1;
import android.text.TextPaint;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import qrd.l1;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import brd.y;
import mrd.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import xx9.a;

public final class e extends PresenterV2	// class@0025e8
{
    public a A;
    public y B;
    public f8 C;
    public SlidePlayViewModel D;
    public boolean E;
    public final RecyclerView$r F;
    public final a G;
    public PhotoDetailParam p;
    public NasaBizParam q;
    public QPhoto r;
    public ViewStubInflater2 s;
    public PhotosScaleHelpView t;
    public View u;
    public TextView v;
    public RecyclerView w;
    public BaseFragment x;
    public t y;
    public a z;

    public void e(){
       super();
       this.F = new e$b(this);
       this.G = new e$a(this);
    }
    public static final View P8(e p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mCoverView");
       }
       return p0;
    }
    public static final TextView R8(e p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mPositionView");
       }
       return p0;
    }
    public static final PhotosScaleHelpView S8(e p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mScaleHelpView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tx = this.x;
       String str = "mFragment";
       if (tx == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tx.requireParentFragment());
       this.D = slidePlayVie;
       a.m(slidePlayVie);
       e tx1 = this.x;
       if (tx1 == null) {
          a.S(str);
       }
       slidePlayVie.P(tx1, this.G);
       tx = this.s;
       if (tx == null) {
          a.S("mRecyclerViewStub");
       }
       tx.d(this.m8());
       tx = this.y;
       if (tx == null) {
          a.S("mNasaScaleCleanControllerShowObservable");
       }
       this.X7(tx.subscribe(new e$c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       e tD = this.D;
       a.m(tD);
       e tx = this.x;
       if (tx == null) {
          a.S("mFragment");
       }
       tD.D(tx, this.G);
       return;
    }
    public final boolean V8(){
       e obj = PatchProxy.apply(null, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r;
       if (obj == null) {
          a.S("mPhoto");
       }
       int[] atlasIndices = obj.getAtlasIndices();
       boolean b = false;
       if (atlasIndices != null) {
          int i = (!atlasIndices.length)? 1: 0;
          if ((i ^ 1) == 1) {
             b = true;
          }
       }
       return b;
    }
    public final int W8(){
       int i2;
       e obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       String str = "mPhoto";
       if (this.V8()) {
          obj = this.r;
          if (obj == null) {
             a.S(str);
          }
          int[] atlasIndices = obj.getAtlasIndices();
          a.m(atlasIndices);
          a.o(atlasIndices, "mPhoto.atlasIndices!!");
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          int len = atlasIndices.length;
          for (int i = 0; i < len; i = i + 1) {
             int i1 = atlasIndices[i];
             Integer integer = Integer.valueOf(i1);
             ArrayList uArrayList = linkedHashMa.get(integer);
             if (uArrayList == null) {
                uArrayList = new ArrayList();
                linkedHashMa.put(integer, uArrayList);
             }
             uArrayList.add(Integer.valueOf(i1));
          }
          i2 = linkedHashMa.size();
       }else {
          obj = this.r;
          if (obj == null) {
             a.S(str);
          }
          i2 = obj.getAtlasList().size();
       }
       return i2;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.cover_frame);
       a.o(view, "ViewBindUtils.bindWidget¡­otView, R.id.cover_frame\)");
       this.u = view;
       view = m1.f(p0, R.id.out_mask);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.out_mask\)");
       this.t = view;
       p0 = m1.f(p0, R.id.long_atlas_position_view);
       a.o(p0, "ViewBindUtils.bindWidget¡­long_atlas_position_view\)");
       this.v = p0;
       String str = "mPositionView";
       if (p0 == null) {
          a.S(str);
       }
       TextPaint paint = p0.getPaint();
       a.o(paint, "mPositionView.paint");
       paint.setFakeBoldText(true);
       e tv = this.v;
       if (tv == null) {
          a.S(str);
       }
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setColor(a1.a(R.color.arg_RES_7f06020a));
       gradientDraw.setShape(0);
       gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07027a));
       tv.setBackground(gradientDraw);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.x = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.p = obj;
       obj = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.N¡­NTROLLER_SHOW_OBSERVABLE\)");
       this.y = obj;
       this.B = this.r8("DETAIL_IMAGE_LOAD_OBSERVER");
       obj = this.r8("NASA_LONG_PHOTO_SCREEN_CLEAN_VIEW");
       a.o(obj, "inject\(DetailAccessIds.N¡­_PHOTO_SCREEN_CLEAN_VIEW\)");
       this.s = obj;
       obj = this.r8("NASA_LONG_PHOTO_INDICATOR");
       a.o(obj, "inject\(DetailAccessIds.NASA_LONG_PHOTO_INDICATOR\)");
       this.A = obj;
       obj = this.q8(NasaBizParam.class);
       a.o(obj, "inject\(NasaBizParam::class.java\)");
       this.q = obj;
       obj = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.z = obj;
       return;
    }
}
