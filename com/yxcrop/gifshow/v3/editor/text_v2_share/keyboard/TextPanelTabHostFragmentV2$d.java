package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextPanelTabHostFragmentV2$d;
import com.yxcorp.gifshow.widget.r;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextPanelTabHostFragmentV2;
import tyc.f3;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextTabInfo;

public final class TextPanelTabHostFragmentV2$d extends r	// class@000b99
{
    public final TextPanelTabHostFragmentV2 c;

    public void TextPanelTabHostFragmentV2$d(TextPanelTabHostFragmentV2 p0,f3 p1){
       this.c = p0;
       super(p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelTabHostFragmentV2$d.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("TextPanelTabHostFragmentV2", "click templateTab", objArray);
       ViewPager viewPager = this.c.s2();
       a.o(viewPager, "viewPager");
       viewPager.setCurrentItem(TextTabInfo.TEXT_TAB_TEMPLATE.getTabIndex());
       return;
    }
}