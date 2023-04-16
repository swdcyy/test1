package com.kuaishou.live.viewmanager.richtext.LiveRnRichTextViewManager;
import com.facebook.react.views.text.ReactTextAnchorViewManager;
import com.kuaishou.live.viewmanager.richtext.LiveRnRichTextViewManager$a;
import nsd.u;
import iq3.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ze.x;
import ze.n0;
import android.view.View;
import com.kuaishou.live.viewmanager.richtext.LiveRnRichTextView;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.Map;
import kotlin.Pair;
import qrd.r0;
import trd.s0;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.text.ReactTextView;
import java.util.Objects;
import yf.n;
import android.text.Spannable;
import yf.t;

public final class LiveRnRichTextViewManager extends ReactTextAnchorViewManager	// class@000ffa
{
    public static final LiveRnRichTextViewManager$a Companion;

    static {
       LiveRnRichTextViewManager.Companion = new LiveRnRichTextViewManager$a(null);
    }
    public void LiveRnRichTextViewManager(){
       super();
    }
    public d createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, LiveRnRichTextViewManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public LiveRnRichTextView createViewInstance(n0 p0){
       LiveRnRichTextView obj = PatchProxy.applyOneRefs(p0, this, LiveRnRichTextViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "reactContext");
       obj = new LiveRnRichTextView(p0);
       obj.setMovementMethod(LinkMovementMethod.getInstance());
       obj.setHighlightColor(0);
       return obj;
    }
    public Map getExportedCustomBubblingEventTypeConstants(){
       Object obj = PatchProxy.apply(null, this, LiveRnRichTextViewManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s0.k(r0.a("onReceiveRouterClickEvent", s0.k(r0.a("phasedRegistrationNames", s0.k(r0.a("bubbled", "onRouterClick"))))));
    }
    public String getName(){
       return "LiveRichTextView";
    }
    public Class getShadowNodeClass(){
       return d.class;
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(LiveRnRichTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRnRichTextViewManager.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onAfterUpdateTransaction(p0);
       p0.q();
       return;
    }
    public void updateExtraData(View p0,Object p1){
       this.updateExtraData(p0, p1);
    }
    public void updateExtraData(LiveRnRichTextView p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRnRichTextViewManager.class, "4")) {
          return;
       }
       a.p(p0, "root");
       Objects.requireNonNull(p1, "null cannot be cast to non-null type com.facebook.react.views.text.ReactTextUpdate");
       if (p1.a()) {
          t.h(p1.j(), p0);
       }
       p0.setText(p1);
       return;
    }
}
