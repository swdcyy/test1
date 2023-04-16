package com.yxcorp.gifshow.visible.d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.visible.PhotoVisibilityController;
import android.view.View;
import vw8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.util.Objects;
import rxc.k;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.visible.ShareVisibleFragment;
import com.yxcorp.gifshow.visible.ShareVisibleFragment$ItemsVisibilityConfig;
import com.yxcorp.gifshow.visible.ShareVisibleFragment$a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import mz6.b;
import android.content.Context;
import mz6.b$d;
import rxc.b;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import java.util.List;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel;
import androidx.lifecycle.MutableLiveData;
import android.widget.RadioButton;
import java.lang.Integer;

public class d extends m	// class@0016c6
{
    public final PhotoVisibilityController c;

    public void d(PhotoVisibilityController p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       d tc;
       k a;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       boolean b = false;
       Object[] objArray = null;
       if (PostExperimentUtils.U0()) {
          if (!PatchProxy.applyVoid(objArray, objArray, uoa, "95")) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "SET_PRODUCTION_STATUS";
             uElementPack1.name = "part";
             u1.M("", null, 6, uElementPack1, null, null);
          }
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, PhotoVisibilityController.class, "9")) {
             a = k.a;
             PhotoVisibilityController l = tc.l;
             Object[] objArray1 = (l == null)? objArray: l.T0();
             if (a.a(objArray1, b)) {
                ShareVisibleFragment.D.a(tc.l, b, ShareVisibleFragment$ItemsVisibilityConfig.SHARE).Cb(tc.j.getSupportFragmentManager(), "visibleFragment");
             }else {
                b uob = new b(tc.j);
                uob.a(new b$d(R.string.arg_RES_7f1047cd));
                uob.a(new b$d(R.string.arg_RES_7f104783));
                uob.a(new b$d(R.string.arg_RES_7f104780));
                uob.l(new b(tc));
                uob.q();
             }
             if (!PatchProxy.applyVoid(objArray, objArray, uoa, "96")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "PART_SETTING_DIALOG";
                u1.D0("", null, 4, uElementPack, null, null);
             }
          }
       }else {
          tc = this.c;
          tc.k.x0(tc.i.get(1), objArray, b);
       }
       this.c.k.q0().postValue(Integer.valueOf(this.c.d.getId()));
       return;
    }
}
