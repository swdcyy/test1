package amd.c;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import xvc.f;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import xld.a;
import com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import tvc.c;
import tvc.e;

public abstract class c extends EditReduxViewModel	// class@00006e
{

    public void c(boolean p0,f p1,VideoSDKPlayerView p2,a p3,DecorationMiddleware p4){
       a.p(p1, "editRepo");
       a.p(p3, "initState");
       a.p(p4, "middlewareList");
       c[] uocArray = new c[]{p4};
       super(p0, p1, p3, uocArray, p2);
    }
}
