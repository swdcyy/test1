package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextPanelTabHostFragmentV2$b;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextPanelTabHostFragmentV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import iod.a;
import java.lang.Boolean;
import god.b;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextTabInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class TextPanelTabHostFragmentV2$b implements ViewPager$i	// class@000b97
{
    public final TextPanelTabHostFragmentV2 b;

    public void TextPanelTabHostFragmentV2$b(TextPanelTabHostFragmentV2 p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       b a;
       String tabLogName;
       TextPanelTabHostFragmentV2$b uob = TextPanelTabHostFragmentV2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       TextPanelTabHostFragmentV2 f = this.b.F;
       if (f == null) {
          a.S("textKeyboardViewModel");
       }
       f.o0().setValue(Boolean.TRUE);
       a = b.a;
       Objects.requireNonNull(a);
       b uob1 = b.class;
       if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), a, uob1, "3")) {
          TextTabInfo tEXT_TAB_TEM = TextTabInfo.TEXT_TAB_TEMPLATE;
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
