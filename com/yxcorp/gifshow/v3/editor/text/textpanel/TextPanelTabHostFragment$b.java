package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment$b;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextTabInfo;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import msd.l;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class TextPanelTabHostFragment$b implements ViewPager$i	// class@0014c6
{
    public final TextPanelTabHostFragment b;

    public void TextPanelTabHostFragment$b(TextPanelTabHostFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       String tabLogName;
       TextPanelTabHostFragment$b uob = TextPanelTabHostFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       TextTabInfo tEXT_TAB_TEM = TextTabInfo.TEXT_TAB_TEMPLATE;
       if (p0 != tEXT_TAB_TEM.getTabIndex()) {
          TextElementViewModel.b1(this.b.Qh(), 3, null, 2, null);
       }
       TextPanelTabHostFragment$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(TextPanelTabHostFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tb, TextPanelTabHostFragment.class, "5")) {
          if (p0 == tEXT_TAB_TEM.getTabIndex()) {
             tabLogName = tEXT_TAB_TEM.getTabLogName();
          }else {
             tEXT_TAB_TEM = TextTabInfo.TEXT_TAB_FONT;
             if (p0 == tEXT_TAB_TEM.getTabIndex()) {
                tabLogName = tEXT_TAB_TEM.getTabLogName();
             }else {
                tEXT_TAB_TEM = TextTabInfo.TEXT_TAB_STYLE;
                tabLogName = (p0 == tEXT_TAB_TEM.getTabIndex())? tEXT_TAB_TEM.getTabLogName(): "";
             }
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TEXT_SWITCH_TAB";
          uElementPack.params = "tab_name: "+tabLogName;
          u1.u(1, uElementPack, null);
       }
       return;
    }
}
