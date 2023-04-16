package com.yxcorp.gifshow.relation.select.search.SearchBarFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.relation.select.search.SearchBarFragment$b;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import tbc.d;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.select.search.SearchBarFragment$a;

public class SearchBarFragment extends BaseFragment	// class@0019b4
{
    public SearchBarFragment$a j;
    public a k;
    public SelectUsersBundle l;
    public SearchBarFragment$b m;

    public void SearchBarFragment(){
       super();
       this.m = new SearchBarFragment$b(this);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Serializable serializable = SerializableHook.getSerializable(this.getArguments(), "key_select_users_bundle");
       if (serializable != null) {
          this.l = serializable;
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SearchBarFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       SearchBarFragment tl = this.l;
       if (tl == null || !tl.isHalfScreen()) {
          return a.g(p0, 0x7f0d1366, p1, false);
       }
       if (d.c(this.l)) {
          return a.h(p0, 0x7f0d05ac, p1, false, 1);
       }
       return a.g(p0, 0x7f0d05ac, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, SearchBarFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       SearchBarFragment tj = this.j;
       if (tj != null) {
          tj.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchBarFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.j == null) {
          SearchBarFragment$a uoa = new SearchBarFragment$a(this);
          this.j = uoa;
          uoa.f(p0);
       }
       Object[] objArray = new Object[]{this,this.m};
       this.j.i(objArray);
       return;
    }
}
