package com.yxcorp.gifshow.activity.share.presenter.n$c;
import tyc.u4;
import com.yxcorp.gifshow.activity.share.presenter.n;
import android.text.Editable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ow8.c;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import com.kwai.framework.model.user.User;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import xw8.p0;
import vw8.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import k2b.v1$c;
import k2b.v1$a;
import com.kwai.library.widget.edittext.SafeEditText;
import lq.i;
import lq.e;
import lq.e$c;
import com.yxcorp.utility.TextUtils;

public class n$c extends u4	// class@001412
{
    public final n b;

    public void n$c(n p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$c.class, "1")) {
          return;
       }
       Matcher matcher = c.a.matcher(p0.toString());
       while (matcher.find()) {
          String str = matcher.group(2);
          if (this.b.D.containsKey(str)) {
             continue ;
          }else {
             User user = this.b.E.get(str);
             if (user == null) {
                continue ;
             }else {
                Object[] objArray = new Object[0];
                a.b().w("ShareAtFriendsPresenter", "afterTextChanged\(\) restore user "+user.mId+" "+user.mName, objArray);
                this.b.D.put(str, user);
                this.b.a9();
             }
          }
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       b a;
       if (PatchProxy.isSupport(n$c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, n$c.class, "2")) {
          return;
       }
       if (this.b.w.H == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareAtFriendsPresenter", "beforeTextChanged\(\) s="+p0+" start="+p1+" count="+p2+" after="+p3, objArray);
       Matcher matcher = c.a.matcher(p0.subSequence(p1, (p2 + p1)));
       while (matcher.find()) {
          String str = matcher.group(2);
          a = b.a;
          Objects.requireNonNull(a);
          v1$a uoa = PatchProxy.applyOneRefs(str, a, b.class, "4");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = new v1$a().j(1).h("DELETE_USER_DESCRIBE").g("user_id", str);
          }
          uoa.b();
          User user = this.b.D.remove(str);
          n$c tb = this.b;
          if (tb.K != null && user != null) {
             tb.E.put(str, user);
             Object[] objArray1 = new Object[0];
             a.b().w("ShareAtFriendsPresenter", "beforeTextChanged\(\) remove user "+user.mId+" "+user.mName, objArray1);
             this.b.a9();
          }
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       int i;
       if (PatchProxy.isSupport(n$c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, n$c.class, "3")) {
          return;
       }
       if (this.b.w.H == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareAtFriendsPresenter", "onTextChanged\(\) s="+p0+" start="+p1+" count="+p3, objArray);
       this.b.W8();
       Editable text = this.b.q.getText();
       String str = "";
       if (p3 > 0 && p0 != null) {
          i = p1 + p3;
          str = p0.subSequence((i - 1), i).toString();
       }
       e$c uoc = null;
       if (i.h()) {
          i.m().k().t(uoc);
       }
       if (TextUtils.n("@", str) || TextUtils.n("£À", str)) {
          n$c tb = this.b;
          if (tb.K != null) {
             if (text != null) {
                i = p1 + p3;
                int i1 = i - 1;
                if (i1 && text.charAt((i - 2)) != ' ') {
                   text.replace(i1, i, " @");
                   return;
                }
             }
             this.b.X8(((p1 + p3) - 1));
          }else {
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(uoc, tb, n.class, "13")) {
                tb.A = true;
                tb.P8();
             }
          }
       }
       n$c tb1 = this.b;
       if (tb1.K != null) {
          tb1.Z8(p0, p1, p2, p3, false);
       }
       return;
    }
}
