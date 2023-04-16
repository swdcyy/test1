package com.yxcorp.gifshow.tuna_post.business2.l;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.tuna_post.business2.k;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkPhotoParam;
import d36.d;
import com.yxcorp.gifshow.tuna_post.business2.ShareBusinessLinkFragmentWrapper;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import android.view.Window;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import tmc.b;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.yxcorp.utility.n;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import tmc.a;
import android.content.DialogInterface$OnDismissListener;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$DialogInfo;
import java.util.List;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$DialogItemInfo;
import java.util.Arrays;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class l extends m	// class@001e3a
{
    public final k c;

    public void l(k p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       l tc = this.c;
       Objects.requireNonNull(tc);
       k ok = k.class;
       if (!PatchProxy.applyVoid(null, tc, ok, "12")) {
          k q = tc.q;
          Object[] objArray = (q == null)? null: q.mDialog;
          if (tc.s == null && objArray != null) {
             Activity activity = tc.getActivity();
             Objects.requireNonNull(activity);
             Activity uActivity = activity;
             k r = tc.r;
             ShareBusinessLinkPhotoParam shareBusines = tc.p.d();
             if (!PatchProxy.applyVoidFourRefs(uActivity, objArray, r, shareBusines, null, ShareBusinessLinkFragmentWrapper.class, "1")) {
                DialogContainerFragment uDialogConta = new DialogContainerFragment();
                uActivity.getWindow().setSoftInputMode(2);
                ShareBusinessLinkFragmentWrapper shareBusines1 = PatchProxy.applyFourRefs(uDialogConta, objArray, r, shareBusines, null, ShareBusinessLinkFragmentWrapper.class, "2");
                if (shareBusines1 != PatchProxyResult.class) {
                }else {
                   shareBusines1 = new ShareBusinessLinkFragmentWrapper();
                   shareBusines1.j = uDialogConta;
                   Bundle uBundle = new Bundle();
                   SerializableHook.putSerializable(uBundle, "dlg_info", objArray);
                   SerializableHook.putSerializable(uBundle, "select_item", r);
                   SerializableHook.putSerializable(uBundle, "photo_param", shareBusines);
                   shareBusines1.setArguments(uBundle);
                }
                uDialogConta.Lh(new b(shareBusines1));
                uDialogConta.Kh((int)((float)n.j(uActivity) * 0x3f1e353f));
                uDialogConta.Cb(uActivity.getSupportFragmentManager(), "ShareBusinessLinkFragmentWrapper");
                uDialogConta.k0(new a(uActivity));
             }
             String[] stringArray = new String[objArray.mItems.size()];
             for (int i = 0; i < objArray.mItems.size(); i = i + 1) {
                stringArray[i] = objArray.mItems.get(i).mEntryId;
             }
             String str = Arrays.toString(stringArray);
             if (!PatchProxy.applyVoidOneRefs(str, tc, ok, "13")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "RELATE_SERVER_CARD";
                i3 oi3 = i3.f();
                oi3.d("sub_type", str);
                uElementPack.params = oi3.e();
                u1.u(3, uElementPack, null);
             }
          }
       }
    label_0100 :
       return;
    }
}
