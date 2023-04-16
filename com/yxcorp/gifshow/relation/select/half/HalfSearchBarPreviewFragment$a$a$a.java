package com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment$a$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment$a$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import y8c.d;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.model.ContactTargetItem;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment$a;
import k2b.e0;
import k2b.u1;
import com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment;

public class HalfSearchBarPreviewFragment$a$a$a implements View$OnClickListener	// class@001995
{
    public final HalfSearchBarPreviewFragment$a$a b;

    public void HalfSearchBarPreviewFragment$a$a$a(HalfSearchBarPreviewFragment$a$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HalfSearchBarPreviewFragment$a$a$a.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CHOOSEN_USER_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("index", Integer.valueOf((this.b.q.get() + 1)));
       oi3.d("identity", this.b.p.mUser.mId);
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setLogPage(this.b.t.w).setType(1).setElementPackage(uElementPack));
       HalfSearchBarPreviewFragment$a$a$a tb = this.b;
       tb.t.w.Hh(tb.p);
       return;
    }
}
