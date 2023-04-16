package com.yxcorp.gifshow.v3.previewer.ktv.KtvShareGuideFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import ooc.p0;
import android.content.Intent;
import android.app.Activity;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.TextView;
import mwc.h0;
import android.view.View$OnClickListener;
import mwc.i0;
import mwc.f0;
import mwc.g0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.yxcorp.utility.n;
import java.lang.CharSequence;

public class KtvShareGuideFragment extends BaseFragment implements d	// class@0015ae
{
    public KwaiActionBar j;
    public TextView k;
    public String l;
    public static final int m;

    public void KtvShareGuideFragment(){
       super();
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, KtvShareGuideFragment.class, "5")) {
          return;
       }
       if (this.getActivity() != null) {
          p0.e();
          this.getActivity().setResult(0, new Intent());
          this.getActivity().finish();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvShareGuideFragment.class, "4")) {
          return;
       }
       this.j = m1.f(p0, 0x7f0a3f6a);
       this.k = m1.f(p0, 0x7f0a1644);
       m1.a(p0, new h0(this), R.id.ktv_edit_guide_save_owner);
       m1.a(p0, new i0(this), R.id.ktv_edit_guide_save_friend);
       m1.a(p0, new f0(this), R.id.left_btn);
       m1.a(p0, new g0(this), R.id.ktv_edit_guide_save_close);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KtvShareGuideFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d070e, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvShareGuideFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       n.a(this.j);
       String str = this.getArguments().getString("ktv_share_guide_fragment_key");
       this.l = str;
       this.k.setText(str);
       return;
    }
}
