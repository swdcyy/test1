package com.yxcorp.gifshow.reminder.friend.manager.friend.FriendTabManagerFriendFragment;
import mdc.b;
import wq6.k;
import com.yxcorp.gifshow.reminder.friend.relation.FriendsListContainerFragment;
import com.yxcorp.gifshow.reminder.friend.manager.friend.FriendTabManagerFriendFragment$a;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import tdc.a;
import java.lang.Boolean;
import java.lang.Integer;
import fr6.a;
import wq6.j;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import tkd.b;
import tkd.d;
import rx5.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import wq6.d;

public final class FriendTabManagerFriendFragment extends FriendsListContainerFragment implements b, k	// class@001ac3
{
    public static final FriendTabManagerFriendFragment$a w;

    static {
       FriendTabManagerFriendFragment.w = new FriendTabManagerFriendFragment$a(null);
    }
    public void FriendTabManagerFriendFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, FriendTabManagerFriendFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       a.o(obj, "super.onCreatePresenter\(\)");
       obj.U7(new a());
       PatchProxy.onMethodExit(FriendTabManagerFriendFragment.class, "3");
       return obj;
    }
    public void E4(boolean p0,int p1){
       if (PatchProxy.isSupport(FriendTabManagerFriendFragment.class)) {
          PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, FriendTabManagerFriendFragment.class, "5");
       }
       return;
    }
    public void K9(){
       PatchProxy.applyVoid(null, this, FriendTabManagerFriendFragment.class, "6");
    }
    public int M(){
       return 1;
    }
    public a b0(){
       return j.a(this);
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FriendTabManagerFriendFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0537, p1, false);
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FriendTabManagerFriendFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       this.u = true;
       super.fh(p0, p1);
       View[] viewArray = new View[true];
       viewArray[0] = p0;
       d.a(0x77cfa10c).Qa(this, viewArray);
       return;
    }
    public void mc(boolean p0,int p1){
       if (PatchProxy.isSupport(FriendTabManagerFriendFragment.class)) {
          PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, FriendTabManagerFriendFragment.class, "4");
       }
       return;
    }
    public int mh(){
       return 0x7f0d0537;
    }
    public String o(){
       return "FRIEND_MANAGE_PAGE";
    }
    public void o7(){
       PatchProxy.applyVoid(null, this, FriendTabManagerFriendFragment.class, "7");
    }
    public d s8(){
       return j.b(this);
    }
    public d z5(){
       return j.c(this);
    }
}
