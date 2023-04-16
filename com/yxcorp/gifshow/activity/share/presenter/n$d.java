package com.yxcorp.gifshow.activity.share.presenter.n$d;
import lw8.b;
import com.yxcorp.gifshow.activity.share.presenter.n;
import java.lang.Object;
import com.yxcorp.gifshow.model.ContactTargetItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import android.widget.EditText;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import android.util.Pair;
import e17.i;
import java.lang.StringBuilder;
import f66.i;
import jq.a;
import q87.c;
import lnc.a1;
import java.lang.CharSequence;
import tkd.b;
import tkd.d;
import wu5.a;
import com.yxcorp.gifshow.share.l;
import java.util.HashMap;
import xw8.p0;
import java.lang.IndexOutOfBoundsException;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class n$d implements b	// class@001413
{
    public final n b;

    public void n$d(n p0){
       this.b = p0;
       super();
    }
    public void a(int p0,ContactTargetItem p1){
       Editable text;
       Object[] objArray;
       n$d uod = n$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "2")) {
          return;
       }
       if (this.b(p0, p1)) {
          this.b.V8(p0, p1);
       }else {
          uod = this.b;
          Objects.requireNonNull(uod);
          n on = n.class;
          if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, uod, on, "18")) {
             on = uod.H;
             n i = uod.I;
             String str = "ShareAtFriendsPresenter";
             if (on >= null && (i >= null && (on > i || i > uod.q.length()))) {
                a.b().e(str, "addSelectUser: ", new IndexOutOfBoundsException("text="+uod.q.getText()+"\n atFriendEditStart= "+on+",atFriendEditEnd= "+i));
             }else {
                text = uod.q.getText();
                if (text != null) {
                   ContactTargetItem mUser = p1.mUser;
                   Pair pair = (mUser.mVisitorBeFollowed != null && mUser.mFollowStatus == User$FollowStatus.FOLLOWING)? 1: null;
                   Pair pair1 = uod.R8();
                   if (!pair && pair1.first.intValue() <= 0) {
                      objArray = new Object[]{pair1.first};
                      i.b(R.style.arg_RES_7f110668, pair1.second.intValue(), objArray);
                   }else {
                      String str1 = p1.mUser.getAtIdWithAt()+" ";
                      if (str1.equals(" ")) {
                         Object[] objArray1 = new Object[0];
                         a.b().t(str, "addSelectUser: item.mUser is null.", objArray1);
                      }else if(((text.length() - (i - on)) + str1.length()) >= 2000){
                         objArray = new Object[]{Integer.valueOf(2000)};
                         i.d(R.style.arg_RES_7f11066a, String.format(a1.p(R.string.arg_RES_7f1047c9), objArray));
                      }else {
                         uod.F = true;
                         text.replace(on, i, str1);
                         uod.F = false;
                         int i1 = on + str1.length();
                         uod.H = i1;
                         uod.I = i1;
                         uod.q.setSelection(i1);
                         d.a(0x6de3c81e).z30(p1.mId);
                         User[] userArray = new User[]{p1.mUser};
                         l.a(userArray);
                         uod.D.put(p1.mId, p1.mUser);
                         uod.a9();
                         uod.w.q();
                         if (p0 == 2) {
                            uod.Y8("ËÑË÷Ñ¡ÖÐ");
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public boolean b(int p0,ContactTargetItem p1){
       n$d uod = n$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.b.D.containsKey(p1.mId);
    }
}
