package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$g;
import erd.a;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicBoolean;
import rod.m;
import q87.c;
import java.util.List;
import android.widget.ProgressBar;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import mn9.b;
import java.util.Objects;
import pod.a;
import lod.b;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import jod.f;
import ynd.g;
import ood.d;
import nuc.a;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostFragmentV3;
import kotlin.jvm.internal.a;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import java.util.Map;
import java.lang.Boolean;

public final class TextPanelTemplateHostViewBinderV3$g implements a	// class@000c68
{
    public final TextPanelTemplateHostViewBinderV3 b;

    public void TextPanelTemplateHostViewBinderV3$g(TextPanelTemplateHostViewBinderV3 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TextPanelTemplateHostViewBinderV3$g.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("TextPanelTemplateHostViewBinderV3", "showTextTemplatePanel success textTemplateRepoV3NeedRequestNetwork:"+this.b.d.w0().get(), objArray);
       this.b.d.w0().set(i);
       int i1 = 8;
       if (!this.b.i.size()) {
          this.b.f.setVisibility(i1);
          this.b.h.setVisibility(i1);
          this.b.g.setVisibility(i);
       }else {
          this.b.f.setVisibility(i1);
          this.b.h.setVisibility(i);
          this.b.g.setVisibility(i1);
       }
       TextPanelTemplateHostViewBinderV3$g tb = this.b;
       tb.l.Kh(tb.i);
       b uob = this.b.d.v0();
       Objects.requireNonNull(uob, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateDataProviderV3");
       uob = uob.i();
       Objects.requireNonNull(uob, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3");
       d uod = uob.f(this.b.j.a().d());
       if (uod != null) {
          TextPanelTemplateHostViewBinderV3 l = this.b.l;
          String str = uod.p().h();
          Objects.requireNonNull(l);
          if (!PatchProxy.applyVoidOneRefs(str, l, TextPanelTemplateHostFragmentV3.class, "6")) {
             a.p(str, "tabId");
             int i4 = l.yh(str);
             if (i4 != -1) {
                ViewPager viewPager = l.s2();
                a.o(viewPager, "viewPager");
                viewPager.setCurrentItem(i4);
             }
          }
       }
       if (this.b.i.size() > 0) {
          TextPanelTemplateHostViewBinderV3 i2 = this.b.i;
          PagerSlidingTabStrip$d uod1 = i2.get((i2.size() - 1)).c();
          a.o(uod1, "delegates[delegates.size-1].tab");
          View view = uod1.e();
          a.o(view, "delegates[delegates.size-1].tab.tabView");
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
          layoutParams.setMarginEnd(a1.d(R.dimen.arg_RES_7f07034b));
          TextPanelTemplateHostViewBinderV3 i3 = this.b.i;
          PagerSlidingTabStrip$d uod2 = i3.get((i3.size() - 1)).c();
          a.o(uod2, "delegates[delegates.size-1].tab");
          View view1 = uod2.e();
          a.o(view1, "delegates[delegates.size-1].tab.tabView");
          view1.setLayoutParams(layoutParams);
          PagerSlidingTabStrip$d uod3 = this.b.i.get(i).c();
          a.o(uod3, "delegates[0].tab");
          String str1 = uod3.c();
          a.o(str1, "delegates[0].tab.id");
          this.b.H().put(str1, Boolean.TRUE);
       }
       return;
    }
}
