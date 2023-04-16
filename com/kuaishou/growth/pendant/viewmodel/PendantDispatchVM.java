package com.kuaishou.growth.pendant.viewmodel.PendantDispatchVM;
import androidx.lifecycle.ViewModel;
import com.kuaishou.growth.pendant.viewmodel.PendantDispatchVM$a;
import nsd.u;
import java.util.ArrayList;
import androidx.fragment.app.FragmentActivity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.growth.pendant.viewmodel.PendantPlayerVM;
import com.kuaishou.growth.pendant.viewmodel.PendantPlayerVM$a;

public final class PendantDispatchVM extends ViewModel	// class@0006fe
{
    public static final PendantDispatchVM$a Companion;
    public static final List childVMClazz;

    static {
       PendantDispatchVM.Companion = new PendantDispatchVM$a(null);
       PendantDispatchVM.childVMClazz = new ArrayList();
    }
    public void PendantDispatchVM(){
       super();
    }
    public static final PendantDispatchVM getInstance(FragmentActivity p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PendantDispatchVM$a obj = PatchProxy.applyOneRefs(p0, null, PendantDispatchVM.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PendantDispatchVM.Companion;
       Objects.requireNonNull(obj);
       ViewModel viewModel = PatchProxy.applyOneRefs(p0, obj, PendantDispatchVM$a.class, "5");
       if (viewModel != patchProxyRe) {
       }else {
          a.p(p0, "activity");
          ViewModelProvider viewModelPro = ViewModelProviders.of(p0);
          a.o(viewModelPro, "ViewModelProviders.of\(activity\)");
          ViewModel viewModel1 = viewModelPro.get(PendantDispatchVM.class);
          a.o(viewModel1, "of.get\(PendantDispatchVM::class.java\)");
          viewModel = viewModel1;
       }
       return viewModel;
    }
    public static final ViewModel getInstanceByClazz(FragmentActivity p0,Class p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PendantDispatchVM$a obj = PatchProxy.applyTwoRefs(p0, p1, null, PendantDispatchVM.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PendantDispatchVM.Companion;
       Objects.requireNonNull(obj);
       ViewModel viewModel = PatchProxy.applyTwoRefs(p0, p1, obj, PendantDispatchVM$a.class, "6");
       if (viewModel != patchProxyRe) {
       }else {
          a.p(p0, "activity");
          a.p(p1, "clazz");
          viewModel = ViewModelProviders.of(p0).get(p1);
       }
       return viewModel;
    }
    public static final void registerVM(Class p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PendantDispatchVM.class, "2")) {
          return;
       }
       PendantDispatchVM$a companion = PendantDispatchVM.Companion;
       Objects.requireNonNull(companion);
       if (!PatchProxy.applyVoidOneRefs(p0, companion, PendantDispatchVM$a.class, "1")) {
          a.p(p0, "clazz");
          List childVMClazz = PendantDispatchVM.childVMClazz;
          if (!childVMClazz.contains(p0)) {
             childVMClazz.add(p0);
          }
       }
       return;
    }
    public static final void registerVMS(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PendantDispatchVM.class, "3")) {
          return;
       }
       PendantDispatchVM$a companion = PendantDispatchVM.Companion;
       Objects.requireNonNull(companion);
       if (!PatchProxy.applyVoidOneRefs(p0, companion, PendantDispatchVM$a.class, "2")) {
          a.p(p0, "clazzList");
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Class uClass = iterator.next();
             List childVMClazz = PendantDispatchVM.childVMClazz;
             if (!childVMClazz.contains(uClass)) {
                childVMClazz.add(uClass);
             }
          }
       }
       return;
    }
    public static final void unRegisterVM(Class p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PendantDispatchVM.class, "4")) {
          return;
       }
       PendantDispatchVM$a companion = PendantDispatchVM.Companion;
       Objects.requireNonNull(companion);
       if (!PatchProxy.applyVoidOneRefs(p0, companion, PendantDispatchVM$a.class, "3")) {
          a.p(p0, "clazz");
          List childVMClazz = PendantDispatchVM.childVMClazz;
          if (childVMClazz.contains(p0)) {
             childVMClazz.remove(p0);
          }
       }
       return;
    }
    public static final void unRegisterVMs(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PendantDispatchVM.class, "5")) {
          return;
       }
       PendantDispatchVM$a companion = PendantDispatchVM.Companion;
       Objects.requireNonNull(companion);
       if (!PatchProxy.applyVoidOneRefs(p0, companion, PendantDispatchVM$a.class, "4")) {
          a.p(p0, "clazzList");
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Class uClass = iterator.next();
             List childVMClazz = PendantDispatchVM.childVMClazz;
             if (childVMClazz.contains(uClass)) {
                childVMClazz.remove(uClass);
             }
          }
       }
       return;
    }
    public final void dispatchPlayerState(FragmentActivity p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PendantDispatchVM.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "baseFeed");
       PendantPlayerVM.Companion.a(p0).processPlayerState(p1);
       return;
    }
}
