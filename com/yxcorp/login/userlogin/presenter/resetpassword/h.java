package com.yxcorp.login.userlogin.presenter.resetpassword.h;
import com.yxcorp.login.userlogin.presenter.resetpassword.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.login.userlogin.fragment.ResetPsdFragment;
import java.lang.CharSequence;
import oe6.e;
import oe6.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import fud.a;
import fud.c;
import java.io.UnsupportedEncodingException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import r2d.k;
import com.yxcorp.login.userlogin.presenter.resetpassword.h$a;
import android.content.Context;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import ekd.m1;
import java.util.Map;

public class h extends p	// class@001bdf
{
    public EditText q;

    public void h(){
       super();
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       String str = TextUtils.G(this.q).toString();
       ResetPsdFragment.jh(str, R.string.arg_RES_7f100d19);
       if (!TextUtils.x(str)) {
          e.r0(str);
          String str1 = "";
          a.T(str1);
          a.U(str1);
       }
       GifshowActivity activity = this.getActivity();
       ProgressFragment progressFrag = new ProgressFragment();
       progressFrag.Ih(R.string.arg_RES_7f103667).setCancelable(false);
       if (activity != null) {
          progressFrag.show(activity.getSupportFragmentManager(), "runner");
       }
       try{
          str = new a().e(str.getBytes("UTF-8"));
       }catch(java.io.UnsupportedEncodingException e3){
          e3.printStackTrace();
          ExceptionHandler.handleCaughtException(e3);
       }
       this.X7(b.a(0x5cfaafff).c0(str, 1).map(new e()).subscribe(new k(progressFrag, activity), new h$a(this, activity, progressFrag)));
       return;
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.G(this.q).length() > 0)? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.q = m1.f(p0, 0x7f0a2d15);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(h.class, null);
       return objectsByTag;
    }
}
