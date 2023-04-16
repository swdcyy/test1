package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment;
import com.kwai.feature.post.api.fragment.FlyWheelTabHostFragment;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment$textElementViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment$textStyleAttrs$2;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment$d;
import fvc.d;
import tyc.f3;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment$c;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment$a;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import android.view.View;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import androidx.lifecycle.MutableLiveData;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment$b;
import androidx.viewpager.widget.ViewPager$i;
import java.util.List;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextTabInfo;
import java.lang.CharSequence;
import android.view.View$OnClickListener;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTemplateFragment;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelFontFragment;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelStyleFragment;

public final class TextPanelTabHostFragment extends FlyWheelTabHostFragment	// class@0014cb
{
    public final p E;
    public final p F;
    public FrameLayout G;
    public final TextPanelTabHostFragment$d H;
    public final TextPanelTabHostFragment$c I;
    public final TextPanelTabHostFragment$a J;
    public HashMap K;

    public void TextPanelTabHostFragment(){
       super();
       this.E = s.c(new TextPanelTabHostFragment$textElementViewModel$2(this));
       this.F = s.c(new TextPanelTabHostFragment$textStyleAttrs$2(this));
       d b = d.b;
       this.H = new TextPanelTabHostFragment$d(this, b.a());
       this.I = new TextPanelTabHostFragment$c(this, b.a());
       this.J = new TextPanelTabHostFragment$a(this, b.a());
    }
    public int Bh(){
       return 0x7f0a444e;
    }
    public String E7(){
       return "KeyBoardTextPanel";
    }
    public final TextElementViewModel Qh(){
       Object obj = PatchProxy.apply(null, this, TextPanelTabHostFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.getValue();
    }
    public int getLayoutResId(){
       return 0x7f0d15e1;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, TextPanelTabHostFragment.class, "8")) {
       }else {
          TextPanelTabHostFragment tK = this.K;
          if (tK != null) {
             tK.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelTabHostFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       p0 = p0.findViewById(R.id.toast_container);
       a.o(p0, "view.findViewById\(R.id.toast_container\)");
       this.G = p0;
       Object[] objArray = null;
       TextStyleAttrs textStyleAtt = PatchProxy.apply(objArray, this, TextPanelTabHostFragment.class, "2");
       if (textStyleAtt == PatchProxyResult.class) {
          textStyleAtt = this.F.getValue();
       }
       if (textStyleAtt != null) {
          this.Qh().W0().setValue(textStyleAtt);
       }
       if (!PatchProxy.applyVoid(objArray, this, TextPanelTabHostFragment.class, "4")) {
          PagerSlidingTabStrip pagerSliding = this.zh();
          PagerSlidingTabStrip g = pagerSliding.g;
          a.o(g, "tabsContainer");
          int childCount = g.getChildCount();
          int i = 0;
          while (i < childCount) {
             View childAt = g.getChildAt(i);
             if (childAt instanceof TextView) {
                childAt.setGravity(1);
             }
             i = i + 1;
          }
          pagerSliding.A(0, 1);
          pagerSliding.setTabGravity(49);
       }
       this.Nh(2);
       this.Oh(new TextPanelTabHostFragment$b(this));
       return;
    }
    public List wh(){
       Bundle obj = PatchProxy.apply(null, this, TextPanelTabHostFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getArguments();
       ArrayList uArrayList = new ArrayList();
       TextTabInfo tEXT_TAB_TEM = TextTabInfo.TEXT_TAB_TEMPLATE;
       String tabName = tEXT_TAB_TEM.getTabName();
       PagerSlidingTabStrip$d uod = new PagerSlidingTabStrip$d(tabName, tEXT_TAB_TEM.getTabName());
       boolean b = true;
       uod.j(this.H, b);
       TextPanelTemplateFragment textPanelTem = TextPanelTemplateFragment.class;
       Bundle uBundle = (obj != null)? obj: new Bundle();
       uArrayList.add(new b(uod, textPanelTem, uBundle));
       tEXT_TAB_TEM = TextTabInfo.TEXT_TAB_FONT;
       String tabName1 = tEXT_TAB_TEM.getTabName();
       uod = new PagerSlidingTabStrip$d(tabName1, tEXT_TAB_TEM.getTabName());
       uod.j(this.J, b);
       TextPanelFontFragment textPanelFon = TextPanelFontFragment.class;
       uBundle = (obj != null)? obj: new Bundle();
       uArrayList.add(new b(uod, textPanelFon, uBundle));
       tEXT_TAB_TEM = TextTabInfo.TEXT_TAB_STYLE;
       tabName1 = tEXT_TAB_TEM.getTabName();
       uod = new PagerSlidingTabStrip$d(tabName1, tEXT_TAB_TEM.getTabName());
       uod.j(this.I, b);
       if (obj == null) {
          obj = new Bundle();
       }
       uArrayList.add(new b(uod, TextPanelStyleFragment.class, obj));
       return uArrayList;
    }
}
