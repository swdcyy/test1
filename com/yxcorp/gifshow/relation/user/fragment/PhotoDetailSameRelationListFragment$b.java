package com.yxcorp.gifshow.relation.user.fragment.PhotoDetailSameRelationListFragment$b;
import zbc.d;
import com.yxcorp.gifshow.relation.user.fragment.PhotoDetailSameRelationListFragment;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import hcc.j0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.u1;

public class PhotoDetailSameRelationListFragment$b implements d	// class@001a09
{
    public final PhotoDetailSameRelationListFragment a;

    public void PhotoDetailSameRelationListFragment$b(PhotoDetailSameRelationListFragment p0){
       this.a = p0;
       super();
    }
    public void a(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailSameRelationListFragment$b.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, PhotoDetailSameRelationListFragment.class, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FOLLOW_COMMON_FRIENDS";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.userPackage = j0.b(p0);
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          uClickEvent.elementPackage = uElementPack;
          uClickEvent.contentPackage = uContentPack;
          u1.a0(uClickEvent);
       }
       return;
    }
}
