package com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper$mEmptyView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.e;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import mkc.b;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;

public final class DesignerTemplateTipsHelper$mEmptyView$2 extends Lambda implements a	// class@0012dd
{
    public final DesignerTemplateTipsHelper this$0;

    public void DesignerTemplateTipsHelper$mEmptyView$2(DesignerTemplateTipsHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewGroup invoke(){
       e obj = PatchProxy.apply(null, this, DesignerTemplateTipsHelper$mEmptyView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.d;
       a.o(obj, "mFragment");
       View view = a.i(obj.h0(), b.i.a);
       a.o(view, "KwaiLayoutInflater.infla¡­ipsType.EMPTY.mLayoutRes\)");
       ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
       a.o(layoutParams, "view.layoutParams");
       layoutParams.width = -1;
       layoutParams.height = -2;
       view.setLayoutParams(layoutParams);
       view.setMinimumHeight(a1.e(245.00f));
       View childAt = view.getChildAt(0);
       if (childAt != null) {
          ViewGroup$LayoutParams layoutParams1 = childAt.getLayoutParams();
          Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
          layoutParams1.gravity = 48;
          layoutParams1.topMargin = a1.e(25.00f);
          childAt.setLayoutParams(layoutParams1);
       }
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
