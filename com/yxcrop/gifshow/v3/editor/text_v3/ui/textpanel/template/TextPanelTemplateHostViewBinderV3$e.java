package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$e;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import android.os.Bundle;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateFragmentV3;

public final class TextPanelTemplateHostViewBinderV3$e implements g	// class@000c66
{
    public final TextPanelTemplateHostViewBinderV3 b;

    public void TextPanelTemplateHostViewBinderV3$e(TextPanelTemplateHostViewBinderV3 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelTemplateHostViewBinderV3$e.class, "1")) {
       }else {
          a.o(p0, "it");
          p0 = p0.iterator();
          while (p0.hasNext()) {
             MaterialGroupInfo materialGrou = p0.next();
             Bundle uBundle = new Bundle();
             uBundle.putString("GROUP_ID", materialGrou.getGroupId());
             this.b.i.add(new b(new PagerSlidingTabStrip$d(materialGrou.getGroupId(), materialGrou.getGroupName()), TextPanelTemplateFragmentV3.class, uBundle));
          }
       }
       return;
    }
}
