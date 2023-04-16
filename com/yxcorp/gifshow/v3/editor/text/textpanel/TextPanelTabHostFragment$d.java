package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment$d;
import com.yxcorp.gifshow.widget.r;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment;
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
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextTabInfo;

public final class TextPanelTabHostFragment$d extends r	// class@0014c8
{
    public final TextPanelTabHostFragment c;

    public void TextPanelTabHostFragment$d(TextPanelTabHostFragment p0,f3 p1){
       this.c = p0;
       super(p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelTabHostFragment$d.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("TextPanelTabHostFragment", "click templateTab", objArray);
       ViewPager viewPager = this.c.s2();
       a.o(viewPager, "viewPager");
       viewPager.setCurrentItem(TextTabInfo.TEXT_TAB_TEMPLATE.getTabIndex());
       return;
    }
}
