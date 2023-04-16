package com.yxcorp.gifshow.novel.common.plugin.fragment.NovelHomeProxyFragment;
import com.yxcorp.gifshow.novel.common.plugin.fragment.NovelBasePluginProxyFragment;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import hvb.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.HashMap;
import android.view.View;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import wq6.d;
import wq6.k;

public final class NovelHomeProxyFragment extends NovelBasePluginProxyFragment	// class@0021b4
{
    public HashMap k;

    public void NovelHomeProxyFragment(){
       super();
    }
    public Fragment ch(){
       Object obj = PatchProxy.apply(null, this, NovelHomeProxyFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0x3e060d44).e00();
    }
    public String eh(){
       return "NovelHomeProxyFragment";
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, NovelHomeProxyFragment.class, "4")) {
       }else {
          NovelHomeProxyFragment tk = this.k;
          if (tk != null) {
             tk.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NovelHomeProxyFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.z5();
       return;
    }
}
