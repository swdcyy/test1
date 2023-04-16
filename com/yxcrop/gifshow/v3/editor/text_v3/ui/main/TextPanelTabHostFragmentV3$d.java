package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextPanelTabHostFragmentV3$d;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextPanelTabHostFragmentV3;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import tod.a;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextTabInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;

public final class TextPanelTabHostFragmentV3$d implements ViewPager$i	// class@000c4e
{
    public final TextPanelTabHostFragmentV3 b;

    public void TextPanelTabHostFragmentV3$d(TextPanelTabHostFragmentV3 p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       String tabLogName;
       TextPanelTabHostFragmentV3$d uod = TextPanelTabHostFragmentV3$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       a a = a.a;
       TextPanelTabHostFragmentV3 k = this.b.K;
       Objects.requireNonNull(a);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(k), a, uoa, "2")) {
          TextTabInfo tEXT_TAB_KEY = TextTabInfo.TEXT_TAB_KEYBOARD;
          if (p0 == tEXT_TAB_KEY.getTabIndex()) {
             tabLogName = tEXT_TAB_KEY.getTabLogName();
          }else {
             tEXT_TAB_KEY = TextTabInfo.TEXT_TAB_TEMPLATE;
             if (p0 == tEXT_TAB_KEY.getTabIndex()) {
                tabLogName = tEXT_TAB_KEY.getTabLogName();
             }else {
                tEXT_TAB_KEY = TextTabInfo.TEXT_TAB_COLOR_TEXT;
                if (p0 == tEXT_TAB_KEY.getTabIndex()) {
                   tabLogName = tEXT_TAB_KEY.getTabLogName();
                }else {
                   tEXT_TAB_KEY = TextTabInfo.TEXT_TAB_FONT;
                   if (p0 == tEXT_TAB_KEY.getTabIndex()) {
                      tabLogName = tEXT_TAB_KEY.getTabLogName();
                   }else {
                      tEXT_TAB_KEY = TextTabInfo.TEXT_TAB_STYLE;
                      tabLogName = (p0 == tEXT_TAB_KEY.getTabIndex())? tEXT_TAB_KEY.getTabLogName(): "";
                   }
                }
             }
          }
          String str = (k != null)? "subtitle": "text";
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TEXT_SWITCH_TAB";
          i3 oi3 = i3.f();
          oi3.d("type", str);
          oi3.d("tab_name", tabLogName);
          uElementPack.params = oi3.toString();
          u1.B(new ClickMetaData().setElementPackage(uElementPack).setType(1));
       }
       return;
    }
}
