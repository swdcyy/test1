package com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment$a;
import zbc.d;
import com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xwb.c;
import g7c.i;

public class ContactsListFragment$a implements d	// class@0017f7
{
    public final ContactsListFragment a;

    public void ContactsListFragment$a(ContactsListFragment p0){
       this.a = p0;
       super();
    }
    public void a(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContactsListFragment$a.class, "1")) {
          return;
       }
       ContactsListFragment i = this.a.I;
       if (i != null) {
          i.p(p0);
       }
       i.a(p0, 85, "follow");
       return;
    }
}
