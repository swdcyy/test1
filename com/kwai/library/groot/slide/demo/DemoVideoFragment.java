package com.kwai.library.groot.slide.demo.DemoVideoFragment;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import dw6.b;
import com.yxcorp.gifshow.entity.QPhoto;
import ag6.a;
import android.widget.TextView;
import java.lang.StringBuilder;
import java.lang.CharSequence;

public class DemoVideoFragment extends GrootBaseFragment	// class@00083c
{
    public QPhoto x;
    public TextView y;

    public void DemoVideoFragment(){
       super();
    }
    public void H2(){
    }
    public void N2(){
    }
    public void Q0(){
    }
    public void Q1(){
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public boolean jh(){
       return false;
    }
    public boolean kh(){
       return false;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DemoVideoFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DemoVideoFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.ch() != null && this.ch().b(QPhoto.class) != null) {
          this.x = this.ch().b(QPhoto.class);
       }
       View view = a.c(p0, R.layout.arg_RES_7f0d0256, p1, false);
       this.y = view.findViewById(0x7f0a0a8f);
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DemoVideoFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, DemoVideoFragment.class, "4") && this.x != null) {
          DemoVideoFragment ty = this.y;
          if (ty != null) {
             ty.setText(this.x.getUserName()+"  "+this.x.getPhotoId());
          }
       }
       return;
    }
}
