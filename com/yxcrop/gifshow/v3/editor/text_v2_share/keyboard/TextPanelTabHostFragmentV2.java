package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextPanelTabHostFragmentV2;
import com.kwai.feature.post.api.fragment.FlyWheelTabHostFragment;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextPanelTabHostFragmentV2$d;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextTemplateConstantV2;
import tyc.f3;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextPanelTabHostFragmentV2$c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextPanelTabHostFragmentV2$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import android.view.View;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import god.a;
import androidx.fragment.app.Fragment;
import iod.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextPanelTabHostFragmentV2$b;
import androidx.viewpager.widget.ViewPager$i;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextTabInfo;
import java.lang.CharSequence;
import android.view.View$OnClickListener;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.template.TextPanelTemplateFragmentV2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.TextPanelFontFragmentV2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.TextPanelStyleFragmentV2;

public final class TextPanelTabHostFragmentV2 extends FlyWheelTabHostFragment	// class@000b9a
{
    public FrameLayout E;
    public a F;
    public final TextPanelTabHostFragmentV2$d G;
    public final TextPanelTabHostFragmentV2$c H;
    public final TextPanelTabHostFragmentV2$a I;
    public HashMap J;

    public void TextPanelTabHostFragmentV2(){
       super();
       TextTemplateConstantV2 m = TextTemplateConstantV2.m;
       this.G = new TextPanelTabHostFragmentV2$d(this, m.b());
       this.H = new TextPanelTabHostFragmentV2$c(this, m.b());
       this.I = new TextPanelTabHostFragmentV2$a(this, m.b());
    }
    public int Bh(){
       return 0x7f0a444e;
    }
    public String E7(){
       return "KeyBoardTextPanel";
    }
    public int getLayoutResId(){
       return 0x7f0d15e2;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, TextPanelTabHostFragmentV2.class, "5")) {
       }else {
          TextPanelTabHostFragmentV2 tJ = this.J;
          if (tJ != null) {
             tJ.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelTabHostFragmentV2.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       p0 = p0.findViewById(R.id.toast_container);
       a.o(p0, "view.findViewById\(R.id.toast_container\)");
       this.E = p0;
       this.F = a.a.b(this);
       if (!PatchProxy.applyVoid(null, this, TextPanelTabHostFragmentV2.class, "2")) {
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
       this.Oh(new TextPanelTabHostFragmentV2$b(this));
       return;
    }
    public List wh(){
       Bundle obj = PatchProxy.apply(null, this, TextPanelTabHostFragmentV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getArguments();
       ArrayList uArrayList = new ArrayList();
       TextTabInfo tEXT_TAB_TEM = TextTabInfo.TEXT_TAB_TEMPLATE;
       String tabName = tEXT_TAB_TEM.getTabName();
       PagerSlidingTabStrip$d uod = new PagerSlidingTabStrip$d(tabName, tEXT_TAB_TEM.getTabName());
       boolean b = true;
       uod.j(this.G, b);
       TextPanelTemplateFragmentV2 textPanelTem = TextPanelTemplateFragmentV2.class;
       Bundle uBundle = (obj != null)? obj: new Bundle();
       uArrayList.add(new b(uod, textPanelTem, uBundle));
       tEXT_TAB_TEM = TextTabInfo.TEXT_TAB_FONT;
       String tabName1 = tEXT_TAB_TEM.getTabName();
       uod = new PagerSlidingTabStrip$d(tabName1, tEXT_TAB_TEM.getTabName());
       uod.j(this.I, b);
       TextPanelFontFragmentV2 textPanelFon = TextPanelFontFragmentV2.class;
       uBundle = (obj != null)? obj: new Bundle();
       uArrayList.add(new b(uod, textPanelFon, uBundle));
       tEXT_TAB_TEM = TextTabInfo.TEXT_TAB_STYLE;
       tabName1 = tEXT_TAB_TEM.getTabName();
       uod = new PagerSlidingTabStrip$d(tabName1, tEXT_TAB_TEM.getTabName());
       uod.j(this.H, b);
       if (obj == null) {
          obj = new Bundle();
       }
       uArrayList.add(new b(uod, TextPanelStyleFragmentV2.class, obj));
       return uArrayList;
    }
}
