package com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment$c;
import kac.b;
import com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import hbc.a;
import dac.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import xwb.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;

public class ContactsListFragment$c extends b	// class@0017f9
{
    public final ContactsListFragment w;

    public void ContactsListFragment$c(ContactsListFragment p0,RecyclerFragment p1,a p2,boolean p3){
       this.w = p0;
       super(p1, p2, p3, null);
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ContactsListFragment$c.class, "1")) {
          return;
       }
       super.i();
       ContactsListFragment i = this.w.I;
       if (i != null) {
          Objects.requireNonNull(i);
          if (!PatchProxy.applyVoid(objArray, i, c.class, "18")) {
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             showEvent.elementPackage = i.c(1, 0x75a8);
             i.o(showEvent);
          }
       }
       return;
    }
}
