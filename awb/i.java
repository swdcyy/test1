package awb.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import zvb.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.model.FilterOption;
import java.util.Collection;
import ekd.q;
import java.util.List;
import android.view.View;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.follow.model.FilterSubOption;
import java.lang.Number;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Objects;
import com.yxcorp.gifshow.panel.sizer.view.SizerSlideView;
import java.lang.Integer;
import android.widget.TextView;
import java.lang.CharSequence;
import zvb.a;
import com.yxcorp.utility.TextUtils;
import awb.e;
import bwb.c$a;
import bwb.c;
import ekd.m1;
import android.text.TextPaint;
import awb.h;
import com.yxcorp.gifshow.panel.sizer.view.SizerSlideView$b;
import awb.g;
import com.yxcorp.gifshow.panel.sizer.view.SizerSlideView$a;
import y8c.d;
import yvb.e$b;

public class i extends PresenterV2	// class@000348
{
    public FilterOption p;
    public d q;
    public e$b r;
    public TextView s;
    public SizerSlideView t;

    public void i(){
       super();
    }
    public void E8(){
       int i;
       SizerSlideView sizerSlideVi;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "3")) {
          return;
       }
       if (!q.f(this.p.mSubOptions) && !b.a(this.p.mSubOptions)) {
          this.t.setSelected(this.p.mSelected);
          i tt = this.t;
          FilterOption mSubOptions = this.p.mSubOptions;
          ArrayList uArrayList = PatchProxy.applyOneRefs(mSubOptions, objArray, uob, "5");
          if (uArrayList != patchProxyRe) {
          }else {
             a.p(mSubOptions, "subOptions");
             uArrayList = new ArrayList();
             Iterator iterator1 = mSubOptions.iterator();
             while (iterator1.hasNext()) {
                FilterSubOption mName = iterator1.next().mName;
                a.o(mName, "subOption.mName");
                uArrayList.add(mName);
             }
          }
          mSubOptions = this.p.mSubOptions;
          Object obj = PatchProxy.applyOneRefs(mSubOptions, objArray, uob, "4");
          i = 0;
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else if(mSubOptions == null || mSubOptions.isEmpty()){
             sizerSlideVi = 1;
          }else {
             sizerSlideVi = null;
          }
          if (!sizerSlideVi) {
             Iterator iterator = mSubOptions.iterator();
             b = false;
             while (true) {
                if (iterator.hasNext()) {
                   if (iterator.next().mSelected != null) {
                   label_00a3 :
                      if (b == -1) {
                         iterator = mSubOptions.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               if (iterator.next().mIsDefault != null) {
                               label_00be :
                                  if (i == -1) {
                                     i = CollectionsKt__CollectionsKt.G(mSubOptions);
                                  }
                               }else {
                                  i = i + 1;
                               }
                            }else {
                               i = -1;
                               goto label_00be ;
                            }
                         }
                      }else {
                         i = b;
                      }
                   }else {
                      b = b + 1;
                   }
                }else {
                   b = -1;
                   goto label_00a3 ;
                }
             }
          }
          Objects.requireNonNull(tt);
          if (!PatchProxy.isSupport(SizerSlideView.class) || (PatchProxy.applyVoidTwoRefs(uArrayList, Integer.valueOf(i), tt, SizerSlideView.class, "1") || (q.f(uArrayList) || (i > uArrayList.size() || (uArrayList.size() >= 3 && uArrayList.size() <= 8))))) {
             tt.o = uArrayList;
             tt.setSelectedPosition(i);
          }
       label_0102 :
          this.s.setSelected(this.p.mSelected);
          this.s.setText(this.p.getShowDisplayText());
          if (!TextUtils.x(a.b(this.p)) && !TextUtils.x(a.c(this.p))) {
             c.a(a.b(this.p), new e(this));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       TextView textView = m1.f(p0, R.id.title);
       this.s = textView;
       textView.getPaint().setFakeBoldText(true);
       SizerSlideView sizerSlideVi = m1.f(p0, R.id.slide_view);
       this.t = sizerSlideVi;
       sizerSlideVi.setOnSelectedListener(new h(this));
       this.t.setOnScrollListener(new g(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.r8("panel_sizer_header_INJECT_KEY_ITEM");
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       this.r = this.r8("panel_sizer_header_INJECT_KEY_ITEM_CLICK");
       return;
    }
}
