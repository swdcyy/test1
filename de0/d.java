package de0.d;
import de0.f;
import de0.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import de0.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.UninitializedPropertyAccessException;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import de0.a$a;
import java.lang.StringBuilder;
import androidx.lifecycle.LiveData;
import com.kuaishou.growth.pendant.core.common.NoObserverAttachedException;
import com.kuaishou.growth.pendant.core.config.PendantCoreConfig;
import java.lang.Thread;
import java.lang.StackTraceElement;

public abstract class d extends ViewModel implements f, a	// class@001f81
{
    public Object _viewEffect;
    public final e _viewEffects;
    public Object _viewState;
    public final MutableLiveData _viewStates;

    public void d(){
       super();
       this._viewStates = new MutableLiveData();
       this._viewEffects = new e();
    }
    public final Object getViewEffect(){
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this._viewEffect;
       if (obj != null) {
          return obj;
       }
       throw new UninitializedPropertyAccessException("\"viewEffect\" was queried before it is initialized");
    }
    public final Object getViewState(){
       d obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this._viewState;
       if (obj != null) {
          return obj;
       }
       throw new UninitializedPropertyAccessException("\"viewState\" was queried before being initialized. You must initialize \"viewState\" inside init{} block");
    }
    public void log(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "7")) {
          return;
       }
       a.p(p0, "msg");
       a$a.a(this, p0, p1);
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       super.onCleared();
       a$a.b(this, this.hashCode()+"onCleared", null, 2, null);
       return;
    }
    public void process(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       a$a.b(this, '@'+this.hashCode()+" processing viewEvent:"+p0, null, 2, null);
       if (!this.viewStates().hasObservers()) {
          this.log("process", new NoObserverAttachedException("No observer attached. In case of AacMviCustomView \"startObserving\(\)\" function needs to be called manually."));
       }
       return;
    }
    public final void setViewEffect(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       PendantCoreConfig i = PendantCoreConfig.i;
       if (i.b()) {
          if (i.c()) {
             Thread thread = Thread.currentThread();
             a.o(thread, "Thread.currentThread\(\)");
             StackTraceElement[] stackTrace = thread.getStackTrace();
             a$a.b(this, "setting viewEffect from\n                        "+stackTrace[3]+"\n                        "+stackTrace[4]+"\n                        "+stackTrace[5]+"\n                        : "+p0, null, 2, null);
          }else {
             a$a.b(this, "setting viewEffect: "+p0, null, 2, null);
          }
       }
       this._viewEffect = p0;
       this._viewEffects.setValue(p0);
       return;
    }
    public final void setViewState(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       PendantCoreConfig i = PendantCoreConfig.i;
       if (i.b()) {
          if (i.c()) {
             Thread thread = Thread.currentThread();
             a.o(thread, "Thread.currentThread\(\)");
             StackTraceElement[] stackTrace = thread.getStackTrace();
             a$a.b(this, "setting viewState from \n                      "+stackTrace[3]+"\n                      "+stackTrace[4]+"\n                      "+stackTrace[5]+"\n                      : "+p0, null, 2, null);
          }else {
             a$a.b(this, "setting viewState: "+p0, null, 2, null);
          }
       }
       this._viewState = p0;
       this._viewStates.setValue(p0);
       return;
    }
    public final e viewEffects$pendant_core_release(){
       return this._viewEffects;
    }
    public final LiveData viewStates(){
       return this._viewStates;
    }
}
