package io3.a;
import io3.b;
import eo3.w;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import nm3.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModelProvider;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.ViewModelStore;
import io3.a$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModel;

public abstract class a implements b	// class@002dce
{
    public final w mRedPacketContext;

    public void a(w p0){
       super();
       this.mRedPacketContext = p0;
    }
    public abstract void bind(View p0,RedPacketBaseViewModel p1);
    public abstract RedPacketBaseViewModel createVM();
    public RedPacketBaseViewModel createVM(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ViewModelProvider(this.mRedPacketContext.k().getViewModelStore(), new a$a(this, p0)).get(p0.b());
    }
    public Object createVM(){
       return this.createVM();
    }
    public abstract View createView();
    public void release(){
    }
}
