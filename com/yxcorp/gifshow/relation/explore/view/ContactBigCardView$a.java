package com.yxcorp.gifshow.relation.explore.view.ContactBigCardView$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.view.ContactBigCardView;
import android.widget.TextView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.ja;
import com.yxcorp.gifshow.relation.explore.view.BaseCardView;
import fac.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.relation.explore.view.ContactBigCardView$a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;

public class ContactBigCardView$a extends m	// class@001883
{
    public final TextView c;
    public final ContactBigCardView d;

    public void ContactBigCardView$a(ContactBigCardView p0,TextView p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContactBigCardView$a.class, "1")) {
          return;
       }
       this.d.e("confirm");
       ja.a();
       ContactBigCardView$a td = this.d;
       td.e.h(td.d.a.getActivity(), new ContactBigCardView$a$a(this));
       return;
    }
}
