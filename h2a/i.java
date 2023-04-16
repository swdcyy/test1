package h2a.i;
import android.view.View$OnClickListener;
import h2a.l;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.network.feedback.log.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Collection;
import ekd.q;
import com.yxcorp.utility.TextUtils;
import e17.i;
import java.util.UUID;
import e2a.b;
import java.util.List;
import java.lang.Runnable;
import t45.c;
import java.lang.Iterable;
import brd.t;
import h2a.k;
import erd.r;
import brd.a0;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import b2a.d;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import com.kwai.library.network.detector.model.NetworkDetectConfig;
import com.kwai.sdk.switchconfig.a;
import fg6.a;
import f2a.a;
import com.google.gson.Gson;
import java.lang.RuntimeException;
import dy6.c;
import com.kuaishou.aegon.netcheck.NetcheckTaskController$TaskType;
import java.util.Map;
import yb6.d;
import java.util.ArrayList;
import wkd.b;
import by6.e;
import b2a.c;
import by6.e$b;
import b2a.b;
import b2a.a;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import lnc.a1;

public final class i implements View$OnClickListener	// class@002549
{
    public final l b;

    public void i(l p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       Object[] objArray1;
       c uoc;
       String str2;
       i b = this.b;
       Objects.requireNonNull(b);
       Object[] objArray = null;
       String str = "5";
       if (PatchProxy.applyVoid(objArray, b, l.class, str)) {
       }else {
          BaseFeed entity = b.r.getEntity();
          if (!PatchProxy.applyVoidOneRefs(entity, objArray, a.class, str)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.name = "PLAY_FEEDBACK_POPUP_NEXT";
             uElementPack.action2 = "PLAY_FEEDBACK_POPUP_NEXT";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             if (entity != null) {
                uContentPack.photoPackage = w1.f(entity);
             }
             u1.u(6, uElementPack, uContentPack);
          }
          CharSequence text = b.q.getText();
          if (q.f(b.u) && TextUtils.x(text)) {
             i.a(R.style.arg_RES_7f11066a, 0x7f105052);
          }else if(TextUtils.x(text)){
             objArray1 = objArray;
          }else {
             str2 = text.toString();
          }
          String str1 = UUID.randomUUID().toString();
          l u = b.u;
          if (!PatchProxy.applyVoidThreeRefs(u, objArray1, str1, null, a.class, "9") && (!TextUtils.x(objArray1) || !q.f(u))) {
             c.a(new b(objArray1, u, str1));
          }
          Boolean uBoolean = t.fromIterable(b.u).any(k.b).e();
          if (uBoolean != null && uBoolean.booleanValue()) {
             Activity uActivity = b.getActivity();
             l r = b.r;
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             d uod = d.class;
             if (!PatchProxy.applyVoidThreeRefs(uActivity, str1, r, null, d.class, "1")) {
                ProgressFragment progressFrag = PatchProxy.apply(objArray, objArray, uod, "2");
                if (progressFrag != patchProxyRe) {
                }else {
                   progressFrag = new ProgressFragment();
                   progressFrag.setCancelable(0);
                   progressFrag.Kh(0);
                   progressFrag.vh(R.string.cancel);
                   progressFrag.Ih(R.string.arg_RES_7f105046);
                }
                Object obj = progressFrag;
                NetworkDetectConfig networkDetec = PatchProxy.applyTwoRefs(str1, r, objArray, uod, str);
                if (networkDetec != patchProxyRe) {
                }else {
                   str2 = a.t().c("networkDetectClientDefaultConfig", objArray);
                   try{
                      if (!TextUtils.x(str2)) {
                         a uoa = a.a.h(str2, a.class);
                      label_011e :
                         if (objArray1 == null) {
                            networkDetec = d.a();
                            d.b(r, str1, networkDetec.mNetworkDetectTaskGroups.get(0).mNetworkDetectTasks, objArray);
                         }else {
                            a mTaskDefault = objArray1.mTaskDefaultConfigMap;
                            if (mTaskDefault != null) {
                               objArray = mTaskDefault.get(NetcheckTaskController$TaskType.SERVER_CHECK.getType());
                            }
                            mTaskDefault = objArray1.mNetworkDetectConfig;
                            if (mTaskDefault == null) {
                               networkDetec = d.a();
                            }else {
                               mTaskDefault.mExpiredTimestamp = d.a() + 0x5265c00;
                               if (mTaskDefault.mNetworkDetectTaskGroups == null) {
                                  objArray1.mNetworkDetectConfig.mNetworkDetectTaskGroups = new ArrayList();
                               }
                               if (objArray1.mNetworkDetectConfig.mNetworkDetectTaskGroups.isEmpty()) {
                                  uoc = new c();
                                  uoc.mNetworkDetectTasks = new ArrayList();
                                  objArray1.mNetworkDetectConfig.mNetworkDetectTaskGroups.add(uoc);
                               }
                            }
                            d.b(r, str1, networkDetec.mNetworkDetectTaskGroups.get(0).mNetworkDetectTasks, objArray);
                         }
                      }
                   }catch(com.google.gson.JsonSyntaxException e0){
                      e0.printStackTrace();
                   }
                   objArray1 = objArray;
                   goto label_011e ;
                }
                networkDetec.mMode = 1;
                Object obj1 = obj;
                uoc = new c(obj, str1, uActivity, networkDetec, r);
                b.a(0x2e66f141).a(networkDetec, uod);
                obj1.xh(new b(obj1));
                obj1.k0(new a(networkDetec));
                obj1.show(uActivity.getSupportFragmentManager(), "detectNetwork");
                obj1.Fh(0, 100, 1);
             }
          }else {
             d.c(b.getActivity(), a1.p(R.string.arg_RES_7f105042), b.r.getEntity(), 0);
          }
          b.P8();
       }
       return;
    }
}
