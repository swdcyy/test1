package com.hhh.mvvm.base.BaseFragment;
import dm.f;
import com.trello.rxlifecycle3.components.support.RxFragment;
import dm.e;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import ag6.a;

public abstract class BaseFragment extends RxFragment implements f	// class@000560
{

    public void BaseFragment(){
       super();
    }
    public void A(){
       e.b(this);
    }
    public final View Vg(int p0){
       View view = (this.getView() != null)? this.getView().findViewById(p0): null;
       return view;
    }
    public final void Wg(){
       if (this.isAdded()) {
          this.requireActivity().finish();
       }
       return;
    }
    public abstract int getLayoutResId();
    public void i7(){
       e.a(this);
    }
    public void m0(){
       e.c(this);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int layoutResId = this.getLayoutResId();
       if (layoutResId) {
          return a.c(p0, layoutResId, p1, false);
       }
       return null;
    }
}
