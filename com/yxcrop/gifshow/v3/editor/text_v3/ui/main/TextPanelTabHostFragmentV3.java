package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextPanelTabHostFragmentV3;
import com.kwai.feature.post.api.fragment.FlyWheelTabHostFragment;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextPanelTabHostFragmentV3$c;
import god.c;
import tyc.f3;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextPanelTabHostFragmentV3$f;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextPanelTabHostFragmentV3$a;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextPanelTabHostFragmentV3$e;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextPanelTabHostFragmentV3$b;
import rod.m;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import android.view.View;
import android.os.Bundle;
import xod.f;
import androidx.fragment.app.Fragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextTabInfo;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextPanelTabHostFragmentV3$d;
import androidx.viewpager.widget.ViewPager$i;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.view.View$OnClickListener;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.keyboard.TextPanelKeyBoardFragmentV3;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostFragmentV3;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateFragmentV3;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextPanelFontFragmentV3;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.style.TextPanelStyleFragmentV3;

public final class TextPanelTabHostFragmentV3 extends FlyWheelTabHostFragment	// class@000c51
{
    public m E;
    public final TextPanelTabHostFragmentV3$c F;
    public final TextPanelTabHostFragmentV3$f G;
    public final TextPanelTabHostFragmentV3$a H;
    public final TextPanelTabHostFragmentV3$e I;
    public final TextPanelTabHostFragmentV3$b J;
    public final boolean K;
    public HashMap L;

    public void TextPanelTabHostFragmentV3(boolean p0){
       super();
       this.K = p0;
       c p = c.p;
       this.F = new TextPanelTabHostFragmentV3$c(this, p.c());
       this.G = new TextPanelTabHostFragmentV3$f(this, p.c());
       this.H = new TextPanelTabHostFragmentV3$a(this, p.c());
       this.I = new TextPanelTabHostFragmentV3$e(this, p.c());
       this.J = new TextPanelTabHostFragmentV3$b(this, p.c());
    }
    public static final m Qh(TextPanelTabHostFragmentV3 p0){
       p0 = p0.E;
       if (p0 == null) {
          a.S("textMainViewModelV3");
       }
       return p0;
    }
    public int Bh(){
       return 0x7f0a444e;
    }
    public String E7(){
       return "KeyBoardTextPanel";
    }
    public int getLayoutResId(){
       return 0x7f0d15e3;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, TextPanelTabHostFragmentV3.class, "6")) {
       }else {
          TextPanelTabHostFragmentV3 tL = this.L;
          if (tL != null) {
             tL.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelTabHostFragmentV3.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.E = f.a.f(this);
       if (!PatchProxy.applyVoid(null, this, TextPanelTabHostFragmentV3.class, "2")) {
          PagerSlidingTabStrip pagerSliding = this.zh();
          PagerSlidingTabStrip g = pagerSliding.g;
          a.o(g, "tabsContainer");
          int childCount = g.getChildCount();
          int i = 0;
          int i1 = 1;
          while (i < childCount) {
             View childAt = g.getChildAt(i);
             if (childAt instanceof TextView) {
                childAt.setGravity(i1);
                if (a.g(childAt.getText(), TextTabInfo.TEXT_TAB_TEMPLATE.getTabName()) && this.K != null) {
                   childAt.setVisibility(8);
                }
             }
             i = i + 1;
          }
          pagerSliding.A(0, i1);
          pagerSliding.setTabGravity(49);
       }
       this.Nh(5);
       this.Oh(new TextPanelTabHostFragmentV3$d(this));
       return;
    }
    public List wh(){
       Bundle obj = PatchProxy.apply(null, this, TextPanelTabHostFragmentV3.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getArguments();
       ArrayList uArrayList = new ArrayList();
       TextTabInfo tEXT_TAB_KEY = TextTabInfo.TEXT_TAB_KEYBOARD;
       String tabName = tEXT_TAB_KEY.getTabName();
       PagerSlidingTabStrip$d uod = new PagerSlidingTabStrip$d(tabName, tEXT_TAB_KEY.getTabName());
       boolean b = true;
       uod.j(this.F, b);
       TextPanelKeyBoardFragmentV3 textPanelKey = TextPanelKeyBoardFragmentV3.class;
       Bundle uBundle = (obj != null)? obj: new Bundle();
       uArrayList.add(new b(uod, textPanelKey, uBundle));
       tEXT_TAB_KEY = TextTabInfo.TEXT_TAB_TEMPLATE;
       String tabName1 = tEXT_TAB_KEY.getTabName();
       uod = new PagerSlidingTabStrip$d(tabName1, tEXT_TAB_KEY.getTabName());
       uod.j(this.G, b);
       TextPanelTemplateHostFragmentV3 textPanelTem = TextPanelTemplateHostFragmentV3.class;
       uBundle = (obj != null)? obj: new Bundle();
       uArrayList.add(new b(uod, textPanelTem, uBundle));
       tEXT_TAB_KEY = TextTabInfo.TEXT_TAB_COLOR_TEXT;
       tabName1 = tEXT_TAB_KEY.getTabName();
       uod = new PagerSlidingTabStrip$d(tabName1, tEXT_TAB_KEY.getTabName());
       uod.j(this.H, b);
       Bundle uBundle1 = new Bundle();
       uBundle1.putBoolean("IS_DESIGN", b);
       if (obj != null) {
          uBundle1.putAll(obj);
       }
       uArrayList.add(new b(uod, TextPanelTemplateFragmentV3.class, uBundle1));
       tEXT_TAB_KEY = TextTabInfo.TEXT_TAB_FONT;
       tabName1 = tEXT_TAB_KEY.getTabName();
       uod = new PagerSlidingTabStrip$d(tabName1, tEXT_TAB_KEY.getTabName());
       uod.j(this.J, b);
       TextPanelFontFragmentV3 textPanelFon = TextPanelFontFragmentV3.class;
       uBundle = (obj != null)? obj: new Bundle();
       uArrayList.add(new b(uod, textPanelFon, uBundle));
       tEXT_TAB_KEY = TextTabInfo.TEXT_TAB_STYLE;
       tabName1 = tEXT_TAB_KEY.getTabName();
       uod = new PagerSlidingTabStrip$d(tabName1, tEXT_TAB_KEY.getTabName());
       uod.j(this.I, b);
       if (obj == null) {
          obj = new Bundle();
       }
       uArrayList.add(new b(uod, TextPanelStyleFragmentV3.class, obj));
       return uArrayList;
    }
}
