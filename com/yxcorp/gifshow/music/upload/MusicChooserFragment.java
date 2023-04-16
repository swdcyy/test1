package com.yxcorp.gifshow.music.upload.MusicChooserFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import iqb.a;
import android.view.View$OnClickListener;
import iqb.b;

public class MusicChooserFragment extends BaseFragment	// class@00207c
{
    public View j;
    public static final int k;

    public void MusicChooserFragment(){
       super();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicChooserFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.j == null) {
          View view = a.g(p0, R.layout.arg_RES_7f0d04f4, p1, false);
          this.j = view;
          view.findViewById(R.id.notagree_radio_btn).setOnClickListener(new a(this));
          this.j.findViewById(R.id.agree_radio_btn).setOnClickListener(new b(this));
       }
       return this.j;
    }
}
