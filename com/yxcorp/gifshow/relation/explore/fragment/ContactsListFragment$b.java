package com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment$b;
import y8c.g;
import com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment;
import java.util.ArrayList;
import y8c.f;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.z;
import com.yxcorp.gifshow.relation.explore.presenter.j;
import nu7.d;
import ml8.c;

public class ContactsListFragment$b extends g	// class@0017f8
{
    public final ArrayList w;
    public final ContactsListFragment x;

    public void ContactsListFragment$b(ContactsListFragment p0,ArrayList p1){
       this.x = p0;
       this.w = p1;
       super();
    }
    public ArrayList a1(int p0,f p1){
       return this.w;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       ContactsListFragment$b uob = ContactsListFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new z(false));
       obj.U7(new j(false));
       obj.U7(new d());
       return new f(a.i(p0, 0x7f0d0965), obj);
    }
}
