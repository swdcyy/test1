package com.yxcorp.login.debuglogin.b;
import com.yxcorp.login.debuglogin.a$b;
import com.yxcorp.login.debuglogin.c;
import java.lang.Object;
import com.yxcorp.login.debuglogin.DebugAccountInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j1d.e;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import oe6.e;
import tkd.b;
import tkd.d;
import pv5.c;
import j1d.a;
import erd.g;

public final class b implements a$b	// class@001aad
{
    public final c a;

    public void b(c p0){
       this.a = p0;
    }
    public final void a(int p0,DebugAccountInfo p1){
       b ta = this.a;
       if (ta.getActivity() == null) {
       }else if(!(e.c().a()).equals(p1.mEnv)){
          i.d(R.style.arg_RES_7f110668, "请先切换至"+p1.mEnv+"环境");
       }else {
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.Cb(ta.getActivity().getSupportFragmentManager(), "DebugAccountLogin");
          if (QCurrentUser.me().isLogined()) {
             List eMPTY_LIST = (QCurrentUser.ME.getAvatars() == null)? Collections.EMPTY_LIST: Arrays.asList(QCurrentUser.ME.getAvatars());
             e.p0(eMPTY_LIST);
             d.a(0x6154d94e).uA(ta.getActivity(), new a(ta, p0, p1, progressFrag));
          }else {
             ta.P8(p0, p1, progressFrag);
          }
       }
       return;
    }
}
