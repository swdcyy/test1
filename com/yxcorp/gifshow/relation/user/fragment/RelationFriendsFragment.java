package com.yxcorp.gifshow.relation.user.fragment.RelationFriendsFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import qvb.i;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import y8c.g;
import bcc.e;
import androidx.fragment.app.FragmentActivity;
import java.lang.Boolean;
import xac.w;

public class RelationFriendsFragment extends RecyclerFragment implements d	// class@001a0d
{
    public String F;
    public KwaiActionBar G;

    public void RelationFriendsFragment(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RelationFriendsFragment.class, "1")) {
          return;
       }
       this.G = m1.f(p0, 0x7f0a3f6a);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d08d2;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RelationFriendsFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(RelationFriendsFragment.class, null);
       return objectsByTag;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RelationFriendsFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       String str = this.getArguments().getString("key_user_id");
       this.F = str;
       if (TextUtils.isEmpty(str) && p0 != null) {
          this.F = p0.getString("key_user_id");
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, RelationFriendsFragment.class, "4")) {
          return;
       }
       super.onResume();
       this.q().a();
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RelationFriendsFragment.class, "3")) {
          return;
       }
       super.onSaveInstanceState(p0);
       SerializableHook.putSerializable(p0, "key_user_id", this.F);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RelationFriendsFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       this.G.q(R.string.arg_RES_7f1034c1);
       this.G.j(j.n(this.getContext(), R.drawable.arg_RES_7f081d80, 0x7f060148));
       this.G.m(-1);
       return;
    }
    public g vh(){
       e obj = PatchProxy.apply(null, this, RelationFriendsFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new e(this.getActivity());
       Bundle uBundle = 1;
       if (this.getArguments() != null) {
          uBundle = this.getArguments().getBoolean("key_view_user_info");
       }
       obj.n1("FRIENDS_CAN_VIEW_USER_INFO", Boolean.valueOf(uBundle));
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, RelationFriendsFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new w(this.F);
    }
}
