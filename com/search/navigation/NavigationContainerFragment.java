package com.search.navigation.NavigationContainerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.search.navigation.NavigationContainerFragment$a;
import com.search.navigation.NavigationContainerFragment$b;
import jl8.d;
import android.os.Bundle;
import fl8.b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import gl8.a;
import fl8.a;
import kl8.b;
import jl8.a;
import fl8.c;
import androidx.fragment.app.FragmentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.ComponentActivity;
import o0.b;
import androidx.lifecycle.LifecycleOwner;
import il8.c;
import java.lang.Object;

public abstract class NavigationContainerFragment extends BaseFragment	// class@000b8a
{
    public c j;
    public final b k;
    public final b l;

    public void NavigationContainerFragment(){
       super();
       this.k = new NavigationContainerFragment$a(this, false);
       this.l = new NavigationContainerFragment$b(this);
    }
    public abstract int ch();
    public abstract void dh(d p0);
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       b uob = new b(this.getChildFragmentManager(), this.ch());
       this.j = uob;
       uob.h().f(this.l);
       a uoa = new a();
       this.dh(uoa);
       this.j.i(uoa);
       this.k.d();
       this.getActivity().getOnBackPressedDispatcher().a(this, this.k);
    }
    public final Fragment t(){
       NavigationContainerFragment tj = this.j;
       if (tj == null) {
          return null;
       }
       c uoc = tj.p();
       if (uoc == null) {
          return null;
       }
       return uoc.b();
    }
}
