package com.yxcorp.gifshow.detail.relation.select.model.LastestFriendGroup;
import com.yxcorp.gifshow.model.ContactTargetItem;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;

public class LastestFriendGroup extends ContactTargetItem	// class@001702
{
    public List mLastestContacts;
    public static final long serialVersionUID = 0x26e30e1d98175cb1;

    public void LastestFriendGroup(){
       super();
       this.mLastestContacts = new ArrayList();
    }
    public void addLastestContact(ContactTargetItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LastestFriendGroup.class, "1")) {
          return;
       }
       this.mLastestContacts.add(p0);
       return;
    }
}
