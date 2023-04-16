package com.kuaishou.live.ext.FragmentViewControllerHostFragment;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.ext.FragmentViewControllerHostFragment$a;
import nsd.u;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.ViewControllerManagerImpl;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewHost;
import com.kuaishou.live.viewcontroller.ViewHost$Companion;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.IllegalStateException;

public final class FragmentViewControllerHostFragment extends Fragment	// class@001b68
{
    public ViewControllerManagerImpl b;
    public static final FragmentViewControllerHostFragment$a c;

    static {
       FragmentViewControllerHostFragment.c = new FragmentViewControllerHostFragment$a(null);
    }
    public void FragmentViewControllerHostFragment(){
       super();
       this.setRetainInstance(false);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FragmentViewControllerHostFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       Fragment parentFragme = this.getParentFragment();
       if (parentFragme != null) {
          View view = parentFragme.getView();
          if (view != null) {
             a.o(view, "parentFragment?.view\n   \x20\x02lled after onCreateView\"\)\x00");
             FragmentActivity uFragmentAct = this.requireActivity();
             a.o(uFragmentAct, "requireActivity\(\)");
             Context uContext = this.requireContext();
             a.o(uContext, "requireContext\(\)");
             this.b = new ViewControllerManagerImpl(this, uFragmentAct, uContext, ViewHost.a.b(view));
             return;
          }
       }
       throw new IllegalStateException("addViewController must be called after onCreateView");
    }
}
