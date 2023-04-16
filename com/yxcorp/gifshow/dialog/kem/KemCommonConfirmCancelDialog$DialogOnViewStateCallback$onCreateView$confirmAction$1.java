package com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog$DialogOnViewStateCallback$onCreateView$confirmAction$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog$DialogOnViewStateCallback;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.response.dialog.KemCommonConfirmCancelDialogResponse;
import com.yxcorp.gifshow.model.response.dialog.KemCommonConfirmCancelDialogResponse$Buttons;
import com.yxcorp.gifshow.model.response.dialog.KemCommonConfirmCancelDialogResponse$Button;
import java.util.List;
import trd.t;
import x9a.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.model.Action;
import java.lang.CharSequence;
import android.text.TextUtils;
import x9a.s;
import java.lang.Enum;
import android.app.Activity;
import o56.f;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import java.util.HashMap;
import android.net.Uri;
import ekd.w0;
import com.kwai.framework.model.router.RouteType;
import jb6.b;
import i89.d;
import i89.c;
import java.util.Map;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import x9a.j0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class KemCommonConfirmCancelDialog$DialogOnViewStateCallback$onCreateView$confirmAction$1 extends Lambda implements l	// class@001aa4
{
    public final c $popup;
    public final KemCommonConfirmCancelDialog$DialogOnViewStateCallback this$0;

    public void KemCommonConfirmCancelDialog$DialogOnViewStateCallback$onCreateView$confirmAction$1(KemCommonConfirmCancelDialog$DialogOnViewStateCallback p0,c p1){
       this.this$0 = p0;
       this.$popup = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       i3 obj1;
       if (PatchProxy.applyVoidOneRefs(p0, this, KemCommonConfirmCancelDialog$DialogOnViewStateCallback$onCreateView$confirmAction$1.class, "1")) {
          return;
       }
       a.p(p0, "clickType");
       KemCommonConfirmCancelDialogResponse$Buttons mConfirm = this.this$0.c().mButtons.mConfirm;
       ClientEvent$ElementPackage obj = null;
       if (mConfirm != null) {
          KemCommonConfirmCancelDialogResponse$Button mAction = mConfirm.mAction;
          if (mAction != null) {
             List list = t.k(mAction);
             obj1 = PatchProxy.applyOneRefs(list, obj, t.class, "2");
             if (obj1 != PatchProxyResult.class) {
                obj1.booleanValue();
             }else if(q.f(list)){
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   Action uAction = iterator.next();
                   if (!TextUtils.isEmpty(uAction.mUrl)) {
                      Action mActionType = uAction.mActionType;
                      if (mActionType == null) {
                         continue ;
                      }else {
                         int i = s.a[mActionType.ordinal()];
                         if (i != 1) {
                            if (i != 2 && i != 3) {
                               continue ;
                            }else {
                               Activity uActivity = f.a();
                               if (uActivity != null) {
                                  a.b(b.j(uActivity, uAction.mUrl), obj);
                               }
                            }
                         }else {
                            HashMap hashMap = new HashMap();
                            Action mEcho = uAction.mEcho;
                            if (mEcho != null) {
                               a.o(mEcho, "dialogAction.mEcho");
                               hashMap.put("echo", mEcho);
                            }
                            Uri uri = w0.f(uAction.mUrl);
                            a.o(uri, "SafetyUriCalls.parseUriF¡­String\(dialogAction.mUrl\)");
                            String str = (TextUtils.isEmpty(uri.getHost()))? b.e(uAction.mUrl, RouteType.API): uAction.mUrl;
                            c.a().requestAction(str, hashMap).subscribe(Functions.d(), Functions.d());
                         }
                      }
                   }
                }
             }
          }
       }
       c.a().e(this.this$0.c().mActivityId, this.this$0.c().mDialogType).subscribe();
       this.$popup.q(4);
       KemCommonConfirmCancelDialogResponse kemCommonCon = this.this$0.c();
       if (!PatchProxy.applyVoidTwoRefs(kemCommonCon, p0, obj, j0.class, "5")) {
          obj = new ClientEvent$ElementPackage();
          obj.action2 = "COMMON_POPUP_WINDOW";
          obj1 = j0.f(kemCommonCon, 64);
          obj1.d("click_type", p0);
          obj.params = obj1.e();
          u1.u(1, obj, j0.b(kemCommonCon));
       }
       return;
    }
}
