package f83.a;
import ip1.a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import f83.a$a;
import android.view.View$OnLayoutChangeListener;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fe3.a;
import java.lang.Integer;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LiveData;
import android.content.Context;

public final class a implements a	// class@0028ea
{
    public final ViewGroup a;
    public final RenderAreaView b;
    public final View$OnLayoutChangeListener c;
    public final MutableLiveData d;
    public final View e;

    public void a(View p0){
       a.p(p0, "rootView");
       super();
       this.e = p0;
       ViewGroup viewGroup = p0.findViewById(R.id.live_multi_chat_container_layout);
       this.a = viewGroup;
       this.b = p0.findViewById(0x7f0a25fe);
       a$a uoa = new a$a(this);
       this.c = uoa;
       viewGroup.addOnLayoutChangeListener(uoa);
       this.d = new MutableLiveData();
    }
    public RenderAreaView c(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       a.o(obj, "renderView");
       return obj;
    }
    public a d(a p0,int p1){
       a obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "canvasSize");
       uoa = this.a;
       a.o(uoa, "multiChatRootView");
       a ta = this.a;
       a.o(ta, "multiChatRootView");
       obj = new a(uoa.getMeasuredWidth(), ta.getMeasuredHeight());
       b.d0(LiveCommonLogTag.LITE_NEW_MULTI_CHAT, "notifyCanvasSizeUpdate", "canvasSize", p0.d()+'x'+p0.c(), "viewSize", obj.d()+'x'+obj.c());
       this.d.setValue(obj);
       return obj;
    }
    public ViewGroup e(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       a.o(obj, "multiChatRootView");
       return obj;
    }
    public LiveData f(){
       return this.d;
    }
    public View p(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new View(this.e.getContext());
    }
}
