package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding;
import androidx.lifecycle.LifecycleOwner;
import sq1.a;
import sz1.e;
import xp5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import j83.b;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding$bindViewModel$2;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding$b;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding$c;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ls1.g;
import android.widget.TextView;

public final class LiveMultiLineWidgetUserTagDataBinding	// class@00155a
{
    public b a;
    public final LifecycleOwner b;
    public final e c;

    public void LiveMultiLineWidgetUserTagDataBinding(LifecycleOwner p0,a p1,e p2,i p3){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "roomDelegate");
       a.p(p2, "liveMultiInteractManager");
       a.p(p3, "liveLogPackageProvider");
       super();
       this.b = p0;
       this.c = p2;
    }
    public final void a(b p0,LiveMediumTextView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMultiLineWidgetUserTagDataBinding.class, "1")) {
          return;
       }
       a.p(p0, "widgetModel");
       a.p(p1, "userTagView");
       this.a = p0;
       LiveData liveData = Transformations.distinctUntilChanged(p0.e());
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData.observe(this.b, new LiveMultiLineWidgetUserTagDataBinding$a(this, p1, p0));
       liveData = Transformations.distinctUntilChanged(LiveDataOperators.b(p0.d(), p0.b(), LiveMultiLineWidgetUserTagDataBinding$bindViewModel$2.INSTANCE));
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData.observe(this.b, new LiveMultiLineWidgetUserTagDataBinding$b(this, p0, p1));
       p0.d().observe(this.b, new LiveMultiLineWidgetUserTagDataBinding$c(p0));
       return;
    }
    public final void b(String p0,LiveMediumTextView p1,int p2){
       if (PatchProxy.isSupport(LiveMultiLineWidgetUserTagDataBinding.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveMultiLineWidgetUserTagDataBinding.class, "2")) {
          return;
       }
       int i = (TextUtils.x(p0) || !g.j(p2))? 8: 0;
       p1.setVisibility(i);
       return;
    }
}
