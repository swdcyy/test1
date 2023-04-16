package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.TabWithAvatarViewElement$createView$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.TabWithAvatarViewElement$createView$1;
import com.kwai.written.view.IWrittenLayout;
import java.lang.Object;
import com.kwai.kcube.ext.widget.TabAutoSizeLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import java.lang.Integer;
import android.widget.FrameLayout$LayoutParams;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.TabWithAvatarViewElement$createView$1$1$1;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewStub;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.TabWithAvatarViewElement$createView$1$1$2;
import android.content.Context;
import com.kwai.library.widget.textview.IconifyRadioButtonNew;
import zsa.a;
import android.view.View;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.TabWithAvatarViewElement$createView$1$1$4;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.TabWithAvatarViewElement$createView$1$1$5;

public final class TabWithAvatarViewElement$createView$1$1 extends Lambda implements l	// class@001710
{
    public final IWrittenLayout $this_buildView;
    public final TabWithAvatarViewElement$createView$1 this$0;

    public void TabWithAvatarViewElement$createView$1$1(TabWithAvatarViewElement$createView$1 p0,IWrittenLayout p1){
       this.this$0 = p0;
       this.$this_buildView = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabAutoSizeLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabWithAvatarViewElement$createView$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setClipChildren(false);
       p0.setClipToPadding(false);
       this.$this_buildView.N0(p0, Integer.valueOf(R.id.follow_tab_image_stub), this.$this_buildView.o(new FrameLayout$LayoutParams(-2, -2)), TabWithAvatarViewElement$createView$1$1$1.INSTANCE);
       TabWithAvatarViewElement$createView$1$1 t$this_build = this.$this_buildView;
       t$this_build.j0(p0, t$this_build.o(new FrameLayout$LayoutParams(-1, -1)), new TabWithAvatarViewElement$createView$1$1$2(this));
       Context context = p0.getContext();
       a.o(context, "context");
       IconifyRadioButtonNew iconifyRadio = this.this$0.this$0.w(context);
       iconifyRadio.setId(R.id.follow_tab_text);
       p0.addView(iconifyRadio);
       this.$this_buildView.N0(p0, Integer.valueOf(R.id.follow_tab_double_image_group_stub), this.$this_buildView.o(new FrameLayout$LayoutParams(-2, -2)), TabWithAvatarViewElement$createView$1$1$4.INSTANCE);
       this.$this_buildView.N0(p0, Integer.valueOf(R.id.follow_tab_triple_image_group_stub), this.$this_buildView.o(new FrameLayout$LayoutParams(-2, -2)), TabWithAvatarViewElement$createView$1$1$5.INSTANCE);
       return;
    }
}
