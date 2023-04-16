package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextPanelTabHostFragmentV3$a;
import com.yxcorp.gifshow.widget.r;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextPanelTabHostFragmentV3;
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
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextTabInfo;
import rod.m;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;

public final class TextPanelTabHostFragmentV3$a extends r	// class@000c4b
{
    public final TextPanelTabHostFragmentV3 c;

    public void TextPanelTabHostFragmentV3$a(TextPanelTabHostFragmentV3 p0,f3 p1){
       this.c = p0;
       super(p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelTabHostFragmentV3$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("TextPanelTabHostFragmentV3", "click templateTab", objArray);
       ViewPager viewPager = this.c.s2();
       a.o(viewPager, "viewPager");
       viewPager.setCurrentItem(TextTabInfo.TEXT_TAB_COLOR_TEXT.getTabIndex());
       TextPanelTabHostFragmentV3.Qh(this.c).p0().setValue(Boolean.FALSE);
       return;
    }
}
