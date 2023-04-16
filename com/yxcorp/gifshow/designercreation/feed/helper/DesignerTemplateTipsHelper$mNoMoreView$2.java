package com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper$mNoMoreView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper;
import android.view.View;
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
import android.view.ViewGroup;
import i2b.a;

public final class DesignerTemplateTipsHelper$mNoMoreView$2 extends Lambda implements a	// class@0012df
{
    public final DesignerTemplateTipsHelper this$0;

    public void DesignerTemplateTipsHelper$mNoMoreView$2(DesignerTemplateTipsHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       e obj = PatchProxy.apply(null, this, DesignerTemplateTipsHelper$mNoMoreView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.d;
       a.o(obj, "mFragment");
       View view = a.i(obj.h0(), R.layout.arg_RES_7f0d1618);
       a.o(view, "KwaiLayoutInflater.infla¡­w, R.layout.tips_no_more\)");
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
