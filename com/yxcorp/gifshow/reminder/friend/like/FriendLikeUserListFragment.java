package com.yxcorp.gifshow.reminder.friend.like.FriendLikeUserListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e9c.k;
import e9c.f;
import y8c.q;
import e9c.a;
import e9c.h;
import hka.k;
import com.yxcorp.gifshow.reminder.friend.like.a;
import e9c.h$b;
import com.yxcorp.gifshow.reminder.friend.like.b;
import e9c.h$d;
import rdc.c0;
import qdc.b;
import rdc.f0;
import rdc.e0;
import y8c.t;
import pdc.c;
import java.util.Objects;
import pdc.q;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import z5c.h;
import i2b.a;
import java.util.List;
import java.util.Map;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import y8c.g;
import pdc.b;
import qvb.i;
import com.yxcorp.gifshow.reminder.friend.like.e;

public class FriendLikeUserListFragment extends RecyclerFragment	// class@001abb
{
    public c F;
    public static final int G;

    public void FriendLikeUserListFragment(){
       super();
    }
    public PresenterV2 B2(){
       k obj = PatchProxy.applyWithListener(null, this, FriendLikeUserListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new k();
       obj.U7(new f(this));
       obj.U7(new a());
       if (this.s != null) {
          h oh = new h(this.rh(), this.S1(), this.S0());
          oh.P8(a.a);
          oh.R8(b.a);
          obj.U7(oh);
       }
       obj.U7(new c0());
       obj.U7(new b());
       obj.U7(new f0());
       obj.U7(new e0());
       PatchProxy.onMethodExit(FriendLikeUserListFragment.class, "7");
       return obj;
    }
    public t Bh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       c obj = PatchProxy.apply(objArray, this, FriendLikeUserListFragment.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.Gh();
       Objects.requireNonNull(obj);
       c uoc = PatchProxy.apply(objArray, obj, c.class, str);
       if (uoc != patchProxyRe) {
       }else if(obj.n == null){
          obj.n = new q(obj.g, obj.c);
       }
       uoc = obj.n;
       return uoc;
    }
    public boolean Dh(){
       return false;
    }
    public boolean Eh(){
       return true;
    }
    public final c Gh(){
       Object obj = PatchProxy.apply(null, this, FriendLikeUserListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.F == null) {
          this.F = new c(this);
       }
       return this.F;
    }
    public int M(){
       return 1;
    }
    public boolean S0(){
       return false;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FriendLikeUserListFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.h(p0, 0x7f0d0526, p1, false, (h.a() ^ 0x01));
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, FriendLikeUserListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.Gh());
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FriendLikeUserListFragment.class, "3")) {
          return;
       }
       this.Gh().a();
       super.fh(p0, p1);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0526;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FriendLikeUserListFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(FriendLikeUserListFragment.class, null);
       return objectsByTag;
    }
    public boolean lh(){
       return true;
    }
    public boolean mh(){
       return false;
    }
    public String o(){
       return "LIKE_LIST";
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, FriendLikeUserListFragment.class, "4")) {
          return;
       }
       super.th();
       RecyclerView recyclerView = this.h0();
       recyclerView.setHasFixedSize(true);
       recyclerView.setItemAnimator(null);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, FriendLikeUserListFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{this.Gh()};
       return new b(objArray);
    }
    public boolean x0(){
       return false;
    }
    public i yh(){
       c uoc = PatchProxy.apply(null, this, FriendLikeUserListFragment.class, "9");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = this.Gh().h;
       }
       return uoc;
    }
}
