package com.kuaishou.live.core.voiceparty.customview.LiveMusicMoreActionFragment;
import ml8.d;
import com.yxcorp.gifshow.fragment.PopupWindowFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import android.widget.ImageView;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import sr2.a;
import android.view.View$OnTouchListener;
import sr2.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;

public class LiveMusicMoreActionFragment extends PopupWindowFragment implements d	// class@0014a8
{
    public View G;
    public ImageView H;
    public TextView I;
    public View J;
    public ImageView K;
    public TextView L;
    public LiveMusicMoreActionFragment$a M;
    public static final int N;

    public void LiveMusicMoreActionFragment(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMusicMoreActionFragment.class, "1")) {
          return;
       }
       this.L = m1.f(p0, 0x7f0a0a8b);
       this.I = m1.f(p0, 0x7f0a077d);
       this.G = m1.f(p0, 0x7f0a0779);
       this.K = m1.f(p0, 0x7f0a0a84);
       this.H = m1.f(p0, 0x7f0a0778);
       this.J = m1.f(p0, 0x7f0a0a88);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMusicMoreActionFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.G.setOnTouchListener(new a(this));
       this.J.setOnTouchListener(new b(this));
       return;
    }
    public View xh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveMusicMoreActionFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d16d0, p1, false);
       this.doBindView(view);
       return view;
    }
}
