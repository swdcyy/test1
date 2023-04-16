package com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.a;
import lf3.g;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.d;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import wv1.q;
import java.lang.Runnable;
import lf3.f;

public final class a implements g	// class@001702
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "5")) {
       }else {
          String str = "LiveActivityWidgetMessagePresenter";
          if (p0 == null) {
             b.r(LiveLogTag.LIVE_LEFT_TOP_MINI_WIDGET.appendTag(str), "onReceiveWidgetCloseSignal widgetCloseSignal == null");
          }else if(TextUtils.isEmpty(p0.widgetId)){
             b.r(LiveLogTag.LIVE_LEFT_TOP_MINI_WIDGET.appendTag(str), "onReceiveWidgetCloseSignal widgetId == null");
          }else {
             tb.v = System.currentTimeMillis();
             tb.R8(new q(tb, p0));
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
