package com.yxcorp.gifshow.fragment.PostBaseFragment;
import com.kuaishou.viewbinder.IBaseViewHost;
import com.kwai.horae.a$c;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import com.kwai.horae.lifecycle.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import c35.i;
import com.kuaishou.viewbinder.IViewBinder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.o;

public class PostBaseFragment extends FlyWheelBaseFragment implements IBaseViewHost, a$c	// class@00126f
{
    public IViewBinder n;
    public a o;

    public void PostBaseFragment(){
       super();
       this.o = new a(this);
    }
    public void Aa(){
       if (PatchProxy.applyVoid(null, this, PostBaseFragment.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("PostBaseFragment:"+this.getClass().getSimpleName(), "onRenderBegin\(\)", objArray);
       return;
    }
    public List B9(){
       Object obj = PatchProxy.apply(null, this, PostBaseFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("PostBaseFragment:"+this.getClass().getSimpleName(), "bindNextPage\(\)", objArray);
       return null;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, PostBaseFragment.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("PostBaseFragment:"+this.getClass().getSimpleName(), "onPageDestroy\(\)", objArray);
       return;
    }
    public void Of(){
       if (PatchProxy.applyVoid(null, this, PostBaseFragment.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("PostBaseFragment:"+this.getClass().getSimpleName(), "onRenderEnd\(\)", objArray);
       return;
    }
    public List W4(){
       Object obj = PatchProxy.apply(null, this, PostBaseFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("PostBaseFragment:"+this.getClass().getSimpleName(), "onPreloadResource\(\)", objArray);
       return null;
    }
    public void Z(){
       if (PatchProxy.applyVoid(null, this, PostBaseFragment.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("PostBaseFragment:"+this.getClass().getSimpleName(), "onRenderIdle\(\)", objArray);
       return;
    }
    public List c4(){
       Object obj = PatchProxy.apply(null, this, PostBaseFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("PostBaseFragment:"+this.getClass().getSimpleName(), "onPreloadData\(\)", objArray);
       return null;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, PostBaseFragment.class, "19")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("PostBaseFragment:"+this.getClass().getSimpleName(), "adaptFullScreenViewBinder\(\)", objArray);
       return;
    }
    public View dh(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostBaseFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.g(p0);
    }
    public Context host(){
       Object obj = PatchProxy.apply(null, this, PostBaseFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getContext();
    }
    public LifecycleOwner lifecycleOwner(){
       return this;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostBaseFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this instanceof i && this.n == null) {
          this.ch();
          this.n = this.V5(-1);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       PostBaseFragment obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PostBaseFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.o.e();
       if (this instanceof i) {
          obj = this.n;
          if (obj != null) {
             View bindedView = obj.getBindedView(p0, p1, p2);
             this.O1().bindViews(bindedView);
             return bindedView;
          }
       }
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PostBaseFragment.class, "8")) {
          return;
       }
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PostBaseFragment.class, "7")) {
          return;
       }
       this.o.f();
       super.onDestroyView();
       if (this.n != null) {
          int[] ointArray = new int[]{this.n.p()};
          PreLoader.getInstance().clear(ointArray);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostBaseFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       return;
    }
    public void r2(){
       if (PatchProxy.applyVoid(null, this, PostBaseFragment.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("PostBaseFragment:"+this.getClass().getSimpleName(), "onPageCreate\(\)", objArray);
       return;
    }
}
