package com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment$d;
import s2b.a;
import com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import h7c.b;
import org.json.JSONObject;
import g7c.i;

public class ContactsListFragment$d implements a	// class@0017fa
{
    public final ContactsListFragment a;

    public void ContactsListFragment$d(ContactsListFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContactsListFragment$d.class, "1")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(new b(iterator.next()));
       }
       i.e(uArrayList, 85, null);
       return;
    }
    public boolean b(Object p0){
       boolean b;
       if (p0.mShowed != null) {
          b = false;
       }else {
          p0.mShowed = true;
          b = true;
       }
       return b;
    }
}
