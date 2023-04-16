package com.yxcorp.plugin.search.template.bigcard.state.a;
import com.yxcorp.plugin.search.template.bigcard.state.PhoneVolumeState$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.plugin.search.template.bigcard.state.a$a;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class a implements PhoneVolumeState$a	// class@00077d
{
    public PublishSubject a;
    public boolean b;
    public boolean c;
    public final BaseFragment d;

    public void a(BaseFragment p0){
       super();
       this.d = p0;
       this.a = PublishSubject.g();
    }
    public void a(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.b = p0;
       this.a.onNext(a$a.a(this.c(), true));
       return;
    }
    public void b(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.b = p0;
       this.a.onNext(a$a.a(this.c(), false));
       return;
    }
    public boolean c(){
       boolean b = (this.c != null)? true: this.b;
       return b;
    }
    public boolean d(){
       return this.b;
    }
    public t e(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d.isDetached() || this.d.getActivity() == null) {
          return t.empty();
       }
       return this.a;
    }
    public void f(boolean p0){
       this.c = p0;
    }
}
