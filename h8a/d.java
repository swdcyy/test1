package h8a.d;
import e7a.a;
import h8a.d$b;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import h8a.d$a;
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
import xx9.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import mrd.a;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.view.View;
import ekd.m1;
import android.text.TextPaint;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import qrd.l1;
import android.graphics.drawable.Drawable;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class d extends a	// class@0025e4
{
    public SlideVerticalAtlasPlayer A;
    public final RecyclerView$r B;
    public t v;
    public a w;
    public a x;
    public PhotosScaleHelpView y;
    public TextView z;

    public void d(){
       super();
       this.B = new d$b(this);
    }
    public static final TextView X8(d p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("positionView");
       }
       return p0;
    }
    public static final PhotosScaleHelpView Y8(d p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("scaleHelpView");
       }
       return p0;
    }
    public static final SlideVerticalAtlasPlayer Z8(d p0){
       p0 = p0.A;
       if (p0 == null) {
          a.S("verticalAtlasPlayer");
       }
       return p0;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d tv = this.v;
       if (tv == null) {
          a.S("scaleCleanControllerShowObservable");
       }
       b uob = tv.subscribe(new d$a(this));
       a.o(uob, "scaleCleanControllerShow¡­= View.GONE\n      }\n    }");
       this.P8(uob);
       return;
    }
    public void W8(){
    }
    public final boolean a9(){
       int[] obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.R8().getAtlasIndices();
       boolean b = false;
       if (obj != null) {
          int i = (!obj.length)? 1: 0;
          if ((i ^ 1) == 1) {
             b = true;
          }
       }
       return b;
    }
    public final int b9(){
       int i2;
       int[] obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.a9()) {
          obj = this.R8().getAtlasIndices();
          a.m(obj);
          a.o(obj, "currentPhoto.atlasIndices!!");
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          int len = obj.length;
          for (int i = 0; i < len; i = i + 1) {
             int i1 = obj[i];
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
          i2 = this.R8().getAtlasList().size();
       }
       return i2;
    }
    public final void c9(){
       int i1;
       d tw;
       String str;
       CharSequence text;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "4")) {
          return;
       }
       d tx = this.x;
       if (tx == null) {
          a.S("screenCleanStatusCombination");
       }
       if (!tx.c()) {
          return;
       }else {
          tx = this.A;
          if (tx == null) {
             a.S("verticalAtlasPlayer");
          }
          RecyclerView$LayoutManager layoutManage = tx.getLayoutManager();
          if (layoutManage instanceof LinearLayoutManager) {
             objArray = layoutManage;
          }
          if (objArray != null) {
             tx = this.z;
             if (tx == null) {
                a.S("positionView");
             }
             if (tx.getVisibility()) {
                tx = this.z;
                if (tx == null) {
                   a.S("positionView");
                }
                tx.setVisibility(0);
             }
             int i = 1;
             if (!objArray.h()) {
                i1 = 1;
             }else if(objArray.E() == (this.R8().getAtlasList().size() - i)){
                i1 = this.R8().getAtlasList().size();
             }else {
                i1 = ((objArray.i0() + objArray.c()) / 2) + i;
             }
             if (i1 <= 0) {
                i1 = 1;
             }
             if (this.a9()) {
                int[] atlasIndices = this.R8().getAtlasIndices();
                a.m(atlasIndices);
                int i2 = i1 - 1;
                if (atlasIndices.length > i2) {
                   int[] atlasIndices1 = this.R8().getAtlasIndices();
                   a.m(atlasIndices1);
                   i1 = atlasIndices1[i2] + i;
                   tw = this.w;
                   if (tw == null) {
                      a.S("verticalAtlasIndicator");
                   }
                   tw.onNext(Integer.valueOf((i1 - 1)));
                   str = i1+'/'+this.b9();
                   tw = this.z;
                   if (tw == null) {
                      a.S("positionView");
                   }
                   text = tw.getText();
                   if (text != null && !text.equals(str)) {
                      tw = this.z;
                      if (tw == null) {
                         a.S("positionView");
                      }
                      tw.setText(str);
                   }
                }
             }
             if (i1 >= this.b9()) {
                i1 = this.b9();
             }
             tw = this.w;
             if (tw == null) {
                a.S("verticalAtlasIndicator");
             }
             tw.onNext(Integer.valueOf((i1 - 1)));
             str = i1+'/'+this.b9();
             tw = this.z;
             if (tw == null) {
                a.S("positionView");
             }
             text = tw.getText();
             if (text != null && !text.equals(str)) {
                tw = this.z;
                if (tw == null) {
                   a.S("positionView");
                }
                tw.setText(str);
             }
          }
       label_0140 :
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       super.doBindView(p0);
       View view = m1.f(p0, R.id.cover_frame);
       a.o(view, "ViewBindUtils.bindWidget¡­otView, R.id.cover_frame\)");
       this.A = view;
       view = m1.f(p0, R.id.out_mask);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.out_mask\)");
       this.y = view;
       p0 = m1.f(p0, R.id.long_atlas_position_view);
       a.o(p0, "ViewBindUtils.bindWidget¡­long_atlas_position_view\)");
       this.z = p0;
       String str = "positionView";
       if (p0 == null) {
          a.S(str);
       }
       TextPaint paint = p0.getPaint();
       a.o(paint, "positionView.paint");
       paint.setFakeBoldText(true);
       d tz = this.z;
       if (tz == null) {
          a.S(str);
       }
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setColor(a1.a(R.color.arg_RES_7f06020a));
       gradientDraw.setShape(0);
       gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07027a));
       tz.setBackground(gradientDraw);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       super.j8();
       Object obj = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.x = obj;
       obj = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.N¡­NTROLLER_SHOW_OBSERVABLE\)");
       this.v = obj;
       obj = this.r8("NASA_LONG_PHOTO_INDICATOR");
       a.o(obj, "inject\(DetailAccessIds.NASA_LONG_PHOTO_INDICATOR\)");
       this.w = obj;
       return;
    }
}
