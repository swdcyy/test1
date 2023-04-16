package com.yxcorp.gifshow.relation.explore.view.ContactBigCardView$a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.explore.view.ContactBigCardView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.explore.view.ContactBigCardView;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import android.widget.TextView;
import tkd.b;
import tkd.d;
import wu5.a;
import android.content.Context;
import android.widget.RelativeLayout;

public class ContactBigCardView$a$a implements Runnable	// class@001882
{
    public final ContactBigCardView$a b;

    public void ContactBigCardView$a$a(ContactBigCardView$a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ContactBigCardView$a$a.class, "1")) {
          return;
       }
       if (this.b.d.e.c()) {
          this.b.c.setText(R.string.arg_RES_7f100528);
          d.a(0x6de3c81e).Eo(this.b.d.getContext(), false, 17);
       }
       return;
    }
}
