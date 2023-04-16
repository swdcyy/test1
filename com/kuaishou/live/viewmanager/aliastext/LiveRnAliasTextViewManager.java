package com.kuaishou.live.viewmanager.aliastext.LiveRnAliasTextViewManager;
import com.facebook.react.views.text.ReactTextAnchorViewManager;
import com.kuaishou.live.viewmanager.aliastext.LiveRnAliasTextViewManager$a;
import nsd.u;
import hq3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ze.x;
import ze.n0;
import android.view.View;
import com.facebook.react.views.text.ReactTextView;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Objects;
import yf.n;
import android.text.Spannable;
import android.widget.TextView;
import yf.t;

public final class LiveRnAliasTextViewManager extends ReactTextAnchorViewManager	// class@000ff5
{
    public static final LiveRnAliasTextViewManager$a Companion;

    static {
       LiveRnAliasTextViewManager.Companion = new LiveRnAliasTextViewManager$a(null);
    }
    public void LiveRnAliasTextViewManager(){
       super();
    }
    public a createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, LiveRnAliasTextViewManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactTextView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRnAliasTextViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "reactContext");
       return new ReactTextView(p0);
    }
    public String getName(){
       return "AliasTextView";
    }
    public Class getShadowNodeClass(){
       return a.class;
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(ReactTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRnAliasTextViewManager.class, "4")) {
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
    public void updateExtraData(ReactTextView p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRnAliasTextViewManager.class, "3")) {
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
