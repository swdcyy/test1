package com.yxcorp.gifshow.relation.explore.fragment.SimpleUserListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import z8c.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import o1.f;
import com.kwai.framework.model.user.User;
import java.util.Map;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import y8c.g;
import com.yxcorp.gifshow.relation.explore.fragment.SimpleUserListFragment$a;

public abstract class SimpleUserListFragment extends RecyclerFragment	// class@00180e
{

    public void SimpleUserListFragment(){
       super();
    }
    public a Gh(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, SimpleUserListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.o(f.c(this.getResources(), R.drawable.arg_RES_7f08206b, objArray));
       obj.s(f.c(this.getResources(), R.drawable.arg_RES_7f080685, objArray));
       obj.d = f.c(this.getResources(), 0x7f080685, objArray);
       return obj;
    }
    public String Hh(User p0){
       return "";
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SimpleUserListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SimpleUserListFragment.class, null);
       return objectsByTag;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SimpleUserListFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       a uoa = this.Gh();
       if (uoa != null) {
          this.h0().addItemDecoration(uoa);
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, SimpleUserListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SimpleUserListFragment$a(this);
    }
}
