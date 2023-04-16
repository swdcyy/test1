package com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import lnc.a1;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import y8c.t;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment$b;
import java.lang.Boolean;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment$d;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.LiveEmptyView;
import android.widget.TextView;
import com.kuaishou.live.core.show.contributorlist.f;
import android.view.View$OnClickListener;
import p62.e;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import java.util.Map;
import g9c.d;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import zf6.l;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import b61.b;
import java.lang.CharSequence;
import qvb.q;
import qvb.p;
import qvb.i;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListResponse;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.contributorlist.LiveContributor;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import qa6.b;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import p62.h;
import y8c.g;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment$c;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment$a;

public class LiveContributorListDialogFragment extends RecyclerDialogFragment implements d	// class@000ad4
{
    public String A;
    public UserInfo B;
    public int C;
    public boolean D;
    public LiveContributorListDialogFragment$d E;
    public View F;
    public View G;
    public LiveEmptyView H;
    public TextView I;
    public View J;
    public LiveUserView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public String z;
    public static final int P;

    static {
       LiveContributorListDialogFragment.P = a1.e(10.00f);
    }
    public void LiveContributorListDialogFragment(){
       super();
    }
    public static LiveContributorListDialogFragment Bh(String p0,UserInfo p1,int p2){
       LiveContributorListDialogFragment obj;
       if (PatchProxy.isSupport(LiveContributorListDialogFragment.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, LiveContributorListDialogFragment.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveContributorListDialogFragment();
       obj.A = p0;
       obj.B = p1;
       obj.C = p2;
       return obj;
    }
    public t Ah(){
       Object obj = PatchProxy.apply(null, this, LiveContributorListDialogFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveContributorListDialogFragment$b(this);
    }
    public void Ch(boolean p0){
       if (PatchProxy.isSupport(LiveContributorListDialogFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveContributorListDialogFragment.class, "19")) {
          return;
       }
       LiveContributorListDialogFragment tE = this.E;
       if (tE != null) {
          LiveContributorListDialogFragment tB = this.B;
          if (tB != null) {
             tE.c(tB, p0);
          }
       }
       return;
    }
    public void Dh(boolean p0){
       this.D = p0;
    }
    public void Eh(LiveContributorListDialogFragment$d p0){
       this.E = p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveContributorListDialogFragment.class, "1")) {
          return;
       }
       this.F = m1.f(p0, 0x7f0a1bb3);
       this.G = m1.f(p0, 0x7f0a1baf);
       this.H = m1.f(p0, 0x7f0a1bb0);
       this.I = m1.f(p0, 0x7f0a1bb6);
       m1.a(p0, new f(this), R.id.live_contributor_list_rule_image_view);
       m1.a(p0, new e(this), R.id.live_contributor_list_send_gift_button);
       this.J = m1.f(p0, 0x7f0a1bb4);
       this.L = m1.f(p0, 0x7f0a1bbc);
       this.K = m1.f(p0, 0x7f0a1bba);
       this.M = m1.f(p0, 0x7f0a1bbb);
       this.N = m1.f(p0, 0x7f0a1bbd);
       this.O = m1.f(p0, 0x7f0a1bb2);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0ace;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveContributorListDialogFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveContributorListDialogFragment.class, null);
       return objectsByTag;
    }
    public d ia(){
       return null;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveContributorListDialogFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setCancelable(true);
       this.setStyle(true, 0x1030010);
       return super.onCreateDialog(p0);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Window obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveContributorListDialogFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (PatchProxy.applyVoid(null, this, LiveContributorListDialogFragment.class, "23") || (this.isAdded() && this.getDialog() != null)) {
          this.getDialog().setCanceledOnTouchOutside(1);
          obj = this.getDialog().getWindow();
          obj.setWindowAnimations(R.style.arg_RES_7f1103bf);
          obj.setLayout(-1, (int)((float)n.j(this.requireActivity()) * 0x3f19999a));
          obj.setGravity(80);
       }
    label_005a :
       return super.onCreateView(l.b(p0, 1), p1, p2);
    }
    public void onViewCreated(View p0,Bundle p1){
       float f;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveContributorListDialogFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveContributorListDialogFragment.class, "11") && this.getView() != null) {
          GradientDrawable gradientDraw = new GradientDrawable();
          gradientDraw.setColor(a1.a(R.color.arg_RES_7f061c32));
          float[] uofloatArray = new float[]{f,f,f,f,0,0,0,0};
          f = (float)LiveContributorListDialogFragment.P;
          gradientDraw.setCornerRadii(uofloatArray);
          this.getView().setBackground(gradientDraw);
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveContributorListDialogFragment.class, "12")) {
          LiveContributorListDialogFragment tB = this.B;
          if (tB != null && tB.mName != null) {
             this.I.setText(a1.r(R.string.arg_RES_7f101f65, b.c(tB)));
          }
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       LiveContributorListDialogFragment tN;
       LiveContributor obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveContributorListDialogFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveContributorListDialogFragment.class, "10")) {
          return;
       }
       p.b(this, p0, p1);
       i oi = this.q();
       String str = PatchProxy.applyOneRefs(oi, this, LiveContributorListDialogFragment.class, "14");
       String str1 = "";
       if (str != patchProxyRe) {
       }else if(oi.L0() instanceof LiveContributorListResponse){
          str = oi.L0().getRuleH5Url();
       }else {
          str = str1;
       }
       this.z = str;
       oi = this.q();
       if (!PatchProxy.applyVoidOneRefs(oi, this, LiveContributorListDialogFragment.class, "17")) {
          if (!q.f(oi.getItems())) {
             Object[] objArray = null;
             List obj = PatchProxy.apply(objArray, this, LiveContributorListDialogFragment.class, "16");
             int i = 1;
             if (obj != patchProxyRe) {
                obj = obj.booleanValue();
             }else {
                tN = this.B;
                if (tN != null) {
                   tN = TextUtils.n(tN.mId, QCurrentUser.me().getId());
                   if (this.D == null && !tN) {
                      tN = true;
                   }
                }
                tN = false;
             }
             if (obj) {
                this.J.setVisibility(0);
                obj = oi.getItems();
                Iterator obj1 = PatchProxy.applyOneRefs(obj, this, LiveContributorListDialogFragment.class, "18");
                if (obj1 != patchProxyRe) {
                   objArray = obj1;
                }else if(q.f(obj)){
                   obj1 = obj.iterator();
                   while (obj1.hasNext()) {
                      LiveContributor liveContribu = obj1.next();
                      if (liveContribu != null) {
                         LiveContributor mUserInfo = liveContribu.mUserInfo;
                         if (mUserInfo != null && (!TextUtils.x(mUserInfo.mId) && (QCurrentUser.me().getId()).equals(liveContribu.mUserInfo.mId))) {
                            obj2 = liveContribu;
                            break ;
                         }
                      }
                   }
                }
                if (objArray != null) {
                   this.L.setText(String.valueOf((obj.indexOf(objArray) + i)));
                   tN = this.N;
                   obj2 = PatchProxy.applyOneRefs(oi, this, LiveContributorListDialogFragment.class, "15");
                   if (obj2 != patchProxyRe) {
                      str1 = obj2;
                   }else if(oi.L0() instanceof LiveContributorListResponse){
                      str1 = oi.L0().getRankingDescription();
                   }
                   tN.setText(str1);
                }else {
                   this.L.setText("-");
                }
                UserInfo userInfo = UserInfo.convertFromQUser(b.a(QCurrentUser.me()));
                this.M.setText(userInfo.mName);
                g.d(this.K, userInfo, HeadImageSize.SMALL);
                this.O.setOnClickListener(new h(this));
                LiveContributorListDialogFragment tE = this.E;
                if (tE != null) {
                   tE.d(0);
                }
             }
          }
          this.J.setVisibility(8);
       }
       return;
    }
    public g xh(){
       Object obj = PatchProxy.apply(null, this, LiveContributorListDialogFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveContributorListDialogFragment$c(this);
    }
    public i zh(){
       Object obj = PatchProxy.apply(null, this, LiveContributorListDialogFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveContributorListDialogFragment$a(this);
    }
}
