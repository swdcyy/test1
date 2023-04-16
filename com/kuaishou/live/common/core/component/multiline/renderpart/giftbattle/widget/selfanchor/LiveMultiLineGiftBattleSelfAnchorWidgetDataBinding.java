package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.selfanchor.LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import j83.b;
import tr1.a;
import jk1.f;
import xp5.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kuaishou.live.common.core.basic.widget.LiveWishListItemView;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.selfanchor.LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.selfanchor.LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.selfanchor.LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$b;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;

public final class LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding	// class@001583
{
    public final LiveWishListItemView a;
    public final b b;
    public final a c;
    public final f d;
    public final g e;
    public final LiveMultiLineGiftBattleModel f;
    public final a g;
    public final a h;

    public void LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding(ViewGroup p0,LifecycleOwner p1,b p2,a p3,f p4,g p5,LiveMultiLineGiftBattleModel p6,a p7,a p8){
       a.p(p0, "rootView");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "basicLineModel");
       a.p(p3, "giftBattleWidgetModel");
       a.p(p4, "liveAudienceGiftBoxService");
       a.p(p5, "liveInfoManager");
       a.p(p6, "giftBattleModel");
       a.p(p7, "clickBlock");
       a.p(p8, "showBlock");
       super();
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       this.h = p8;
       View view = p0.findViewById(R.id.live_gift_label_item_container);
       a.o(view, "rootView.findViewById\(R.¡­ift_label_item_container\)");
       this.a = view;
       LiveDataOperators.b(p3.b(), p2.b(), new LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$1(this)).observe(p1, new LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$a(this));
       p8.invoke();
       view.setOnClickListener(new LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$b(this));
    }
}
