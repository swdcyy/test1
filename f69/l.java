package f69.l;
import xja.a;
import f69.s;
import java.lang.Object;
import com.yxcorp.gifshow.follow.state.UserFollowState;
import java.util.Objects;
import e69.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.p0;
import e17.i;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import f69.h;
import java.lang.Runnable;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.FriendClap;
import wkd.b;
import jga.a;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import f69.n;
import sfc.a;
import erd.g;
import crd.b;
import f69.e;
import androidx.fragment.app.Fragment;
import qa9.q;
import qa9.s;
import f69.f;
import mz6.a;
import mz6.b$d;
import lnc.a1;
import mz6.b;
import java.lang.CharSequence;
import f69.d;
import android.content.DialogInterface$OnCancelListener;
import f69.j;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public final class l implements a	// class@0022bb
{
    public final s a;

    public void l(s p0){
       this.a = p0;
    }
    public final void a(UserFollowState p0,int p1){
       a uoa;
       String str;
       l ta = this.a;
       Objects.requireNonNull(ta);
       s os = s.class;
       if (p1 != 1 && p1 != 2) {
          if (p1 != 3) {
             if (p1 != 4) {
                if (p1 == 5) {
                   uoa = a.class;
                   if (!PatchProxy.applyVoid(null, ta, os, "7") && ta.getActivity() != null) {
                      if (!p0.C(ta.getActivity())) {
                         i.a(R.style.arg_RES_7f110669, 0x7f1038e7);
                      }else if(!QCurrentUser.ME.isLogined()){
                         ta.a9(a.B.getString(R.string.arg_RES_7f103077), new h(ta));
                      }else {
                         s q = ta.q;
                         if (q.mFriendClap.mCanClap != null) {
                            str = a.a(ta.t);
                            if (!PatchProxy.applyVoidTwoRefs(q, str, null, uoa, "3")) {
                               a.e(q, "reply_like", str);
                            }
                            ta.X7(b.a(0x1d5ac2c4).h(a.a(ta.t), ta.q.mId).map(new e()).subscribeOn(d.c).observeOn(d.a).subscribe(new n(ta), new a()));
                         }else {
                            str = a.a(ta.t);
                            if (!PatchProxy.applyVoidTwoRefs(q, str, null, uoa, "4")) {
                               a.e(q, "have_replied_like", str);
                            }
                            ta.X7(b.a(0x1d5ac2c4).j(a.a(ta.t), ta.q.mId).map(new e()).subscribeOn(d.c).observeOn(d.a).subscribe(new e(ta), new a()));
                         }
                      }
                   }
                }
             }else if(PatchProxy.applyVoid(null, ta, os, "15") || ta.getActivity() == null){
                a.c(ta.q);
                q oq = s.a(ta.r);
                if (oq != null) {
                   ta.X7(oq.e().subscribe(new f(ta)));
                   oq.c();
                }
             }
          }else {
             ta.Y8();
          }
       }else if(p0 == UserFollowState.FOLLOWED_EACH_OTHER){
          if (!PatchProxy.applyVoid(null, ta, os, "8") && ta.getActivity() != null) {
             uoa = a.b();
             uoa.o(R.color.arg_RES_7f060c49);
             uoa.g(R.string.arg_RES_7f104f05);
             b$d uod = uoa.a();
             String str1 = (ta.q.isFemale())? a1.p(R.string.arg_RES_7f103fdc): a1.p(R.string.arg_RES_7f103fdd);
             b uob = new b(ta.getActivity());
             uob.o(str1);
             uob.a(uod);
             uob.k(new d(ta));
             uob.l(new j(ta));
             uob.q();
          }
       }else {
          ta.X8();
       }
    label_01a4 :
       return;
    }
}
