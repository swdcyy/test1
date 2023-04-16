package com.yxcorp.gifshow.webview.bridge.a$a$b;
import u07.u;
import com.yxcorp.gifshow.webview.bridge.a$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsDialogParams$DialogButton;
import java.util.Iterator;
import com.yxcorp.gifshow.model.Action;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.ActionType;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import com.kuaishou.webkit.WebView;
import android.app.Activity;
import java.util.Map;
import com.yxcorp.gifshow.util.b;

public class a$a$b implements u	// class@00170b
{
    public final a$a b;

    public void a$a$b(a$a p0){
       this.b = p0;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a$b.class, "1")) {
          return;
       }
       JsDialogParams$DialogButton mActions = this.b.k.get(1).mActions;
       if (mActions == null) {
          return;
       }
       Iterator iterator = mActions.iterator();
       while (iterator.hasNext()) {
          Action uAction = iterator.next();
          if (!TextUtils.x(uAction.mUrl)) {
             Action mActionType = uAction.mActionType;
             if (mActionType == null) {
                continue ;
             }else if(mActionType == ActionType.JS_CALLBACK){
                if (!TextUtils.x(uAction.mUrl)) {
                   this.b.d(uAction.mUrl, null);
                }
             }else if(mActionType == ActionType.WEB){
                this.b.o.b.loadUrl(uAction.mUrl);
             }else {
                b.a(this.b.o.a, uAction, null);
             }
          }
       }
       return;
    }
}
