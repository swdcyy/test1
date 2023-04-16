package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import j83.b;
import tr1.a;
import sq1.a;
import kr1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$followLottie$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$f;
import z0.a;
import androidx.lifecycle.Transformations;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$1;
import msd.q;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$b;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$c;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$5;
import msd.p;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$d;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding	// class@00157c
{
    public final TextView a;
    public final p b;
    public final ViewGroup c;
    public final b d;
    public final a e;
    public final a f;
    public final b g;

    public void LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding(ViewGroup p0,LifecycleOwner p1,b p2,a p3,a p4,b p5){
       a.p(p0, "rootView");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "widgetModel");
       a.p(p3, "giftBattleWidgetModel");
       a.p(p4, "roomDelegate");
       a.p(p5, "resizeController");
       super();
       this.c = p0;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       View view = p0.findViewById(R.id.multi_line_peer_name);
       a.o(view, "rootView.findViewById\(R.id.multi_line_peer_name\)");
       this.a = view;
       this.b = s.c(new LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$followLottie$2(this));
       LiveData liveData = Transformations.map(p2.d(), LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$f.a);
       a.o(liveData, "Transformations.map\(widg¡­yName\(it.mUserInfo\)\n    }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       LiveData liveData1 = Transformations.distinctUntilChanged(p2.a());
       a.o(liveData1, "Transformations.distinct¡­d\(widgetModel.muteStatus\)");
       liveData = LiveDataOperators.a(liveData, liveData1, p2.b(), new LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$1(this));
       liveData.observe(p1, new LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$a(this));
       p2.h().observe(p1, new LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$b(this));
       this.a().setOnClickListener(new LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$c(this));
       LiveDataOperators.b(p3.b(), p2.b(), LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$5.INSTANCE).observe(p1, new LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$d(this));
       p2.c().observe(p1, new LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$e(this));
    }
    public final LiveKidLottieAnimationView a(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
}
