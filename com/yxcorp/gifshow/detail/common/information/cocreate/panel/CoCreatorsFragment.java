package com.yxcorp.gifshow.detail.common.information.cocreate.panel.CoCreatorsFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.common.information.cocreate.panel.b;
import java.util.List;
import java.util.Map;
import g9c.d;
import c9c.c;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kuaishou.android.model.mix.CoCreateInfo;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import lnc.a1;
import android.view.ViewGroup;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import y8c.g;
import cy9.h;
import cy9.p;
import qvb.i;
import com.yxcorp.gifshow.detail.common.information.cocreate.panel.CoCreatorsFragment$a;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.android.model.mix.CoCreateInfo$CoCreateMember;
import java.util.Collection;
import ekd.q;

public class CoCreatorsFragment extends RecyclerDialogFragment	// class@00140b
{
    public boolean A;
    public QPhoto B;
    public CoCreateInfo z;
    public static final int C;

    public void CoCreatorsFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CoCreatorsFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new b());
       PatchProxy.onMethodExit(CoCreatorsFragment.class, "7");
       return obj;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, CoCreatorsFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       CoCreatorsFragment tz = this.z;
       if (tz != null) {
          obj.add(tz);
          obj.add(this.B);
       }
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d04a9;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoCreatorsFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(CoCreatorsFragment.class, null);
       return objectsByTag;
    }
    public d ia(){
       Object obj = PatchProxy.apply(null, this, CoCreatorsFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.a();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoCreatorsFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          this.z = p0.get("CoCreateInfo");
          this.A = p0.get("IsMinePhoto").booleanValue();
          this.B = p0.get("CoCreateQphoto");
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoCreatorsFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Window window = (this.getDialog() != null)? this.getDialog().getWindow(): null;
       if (window != null) {
          window.setDimAmount(0);
       }
       return;
    }
    public boolean th(){
       return true;
    }
    public void wh(){
       if (PatchProxy.applyVoid(null, this, CoCreatorsFragment.class, "5")) {
          return;
       }
       super.wh();
       this.h0().setMinimumHeight(a1.d(R.dimen.arg_RES_7f0702a0));
       this.h0().setMaxHeight((int)(((float)n.j(this.getActivity()) * 0x3f1e353f) - (float)a1.d(R.dimen.arg_RES_7f070325)));
       return;
    }
    public g xh(){
       Object obj = PatchProxy.apply(null, this, CoCreatorsFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.A != null) {
          return new h(this.B);
       }
       return new p(this.B);
    }
    public i zh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, CoCreatorsFragment.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       ArrayList uArrayList = PatchProxy.apply(objArray, this, CoCreatorsFragment.class, "10");
       if (uArrayList != patchProxyRe) {
       }else {
          ArrayList uArrayList1 = new ArrayList();
          uArrayList = new ArrayList();
          Iterator iterator = this.z.mMembers.iterator();
          while (iterator.hasNext()) {
             CoCreateInfo$CoCreateMember uCoCreateMem = iterator.next();
             CoCreateInfo$CoCreateMember inviteStatus = uCoCreateMem.inviteStatus;
             if (!inviteStatus) {
                uArrayList.add(uCoCreateMem);
             }else if(!inviteStatus - 1){
                uArrayList1.add(uCoCreateMem);
             }
          }
          ArrayList uArrayList2 = new ArrayList(uArrayList1);
          if (!q.f(uArrayList)) {
             uArrayList2.add(new CoCreateInfo$CoCreateMember());
             uArrayList2.addAll(uArrayList);
          }
          if (this.A != null) {
             uArrayList = uArrayList2;
          }else {
             uArrayList = uArrayList1;
          }
       }
       return new CoCreatorsFragment$a(uArrayList);
    }
}
