package com.yxcorp.login.debuglogin.DebugLoginFragment;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.debuglogin.g;
import com.yxcorp.login.debuglogin.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.res.Resources;
import zf6.l;
import android.app.Activity;
import ekd.i;

public class DebugLoginFragment extends LoginPresenterFragment	// class@001aa7
{

    public void DebugLoginFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, DebugLoginFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new g());
       obj.U7(new c());
       PatchProxy.onMethodExit(DebugLoginFragment.class, "3");
       return obj;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DebugLoginFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0029, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DebugLoginFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       i.h(this.getActivity(), this.getResources().getColor(R.color.arg_RES_7f060a47), l.r());
       return;
    }
}
