package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostFragmentV3;
import com.kwai.feature.post.api.fragment.FlyWheelTabHostFragment;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import java.util.HashMap;
import android.view.View;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3;
import java.util.List;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;

public final class TextPanelTemplateHostFragmentV3 extends FlyWheelTabHostFragment	// class@000c60
{
    public final List E;
    public TextPanelTemplateHostViewBinderV3 F;
    public HashMap G;

    public void TextPanelTemplateHostFragmentV3(){
       super();
       this.E = new ArrayList();
    }
    public int Bh(){
       return 0x7f0a444e;
    }
    public int getLayoutResId(){
       return 0x7f0d15e0;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TextPanelTemplateHostFragmentV3.class, "3")) {
          return;
       }
       super.onDestroyView();
       Iterator iterator = this.E.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       if (!PatchProxy.applyVoid(null, this, TextPanelTemplateHostFragmentV3.class, "8")) {
          TextPanelTemplateHostFragmentV3 tG = this.G;
          if (tG != null) {
             tG.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelTemplateHostFragmentV3.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       TextPanelTemplateHostViewBinderV3 textPanelTem = new TextPanelTemplateHostViewBinderV3(this, p0);
       this.F = textPanelTem;
       this.E.add(textPanelTem);
       Iterator iterator = this.E.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       if (!PatchProxy.applyVoid(null, this, TextPanelTemplateHostFragmentV3.class, "5")) {
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
          a.o(pagerSliding, "tabStrip");
          pagerSliding.v(0);
          pagerSliding.setScrollSelectedTabToCenter(1);
       }
       this.Nh(1);
       return;
    }
    public List wh(){
       Object obj = PatchProxy.apply(null, this, TextPanelTemplateHostFragmentV3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
}
