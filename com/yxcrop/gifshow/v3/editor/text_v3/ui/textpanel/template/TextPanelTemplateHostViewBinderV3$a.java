package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.List;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import tod.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;

public final class TextPanelTemplateHostViewBinderV3$a implements ViewPager$i	// class@000c61
{
    public final TextPanelTemplateHostViewBinderV3 b;

    public void TextPanelTemplateHostViewBinderV3$a(TextPanelTemplateHostViewBinderV3 p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       a a;
       TextPanelTemplateHostViewBinderV3$a uoa = TextPanelTemplateHostViewBinderV3$a.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, str)) {
          return;
       }
       PagerSlidingTabStrip$d uod = this.b.i.get(p0).c();
       a.o(uod, "delegates[position].tab");
       String str1 = uod.c();
       a.o(str1, "delegates[position].tab.id");
       this.b.H().put(str1, Boolean.TRUE);
       a = a.a;
       PagerSlidingTabStrip$d uod1 = this.b.i.get(p0).c();
       a.o(uod1, "delegates[position].tab");
       String str2 = uod1.c();
       a.o(str2, "delegates[position].tab.id");
       Objects.requireNonNull(a);
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidTwoRefs(str2, Boolean.FALSE, a, uoa1, str)) {
          a.p(str2, "tabId");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TEXT_TEMPLATE_TAB";
          i3 oi3 = i3.f();
          oi3.d("type", "text");
          oi3.d("tab_id", str2);
          uElementPack.params = oi3.toString();
          u1.B(new ClickMetaData().setElementPackage(uElementPack).setType(1));
       }
       return;
    }
}
