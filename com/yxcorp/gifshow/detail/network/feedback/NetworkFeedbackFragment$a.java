package com.yxcorp.gifshow.detail.network.feedback.NetworkFeedbackFragment$a;
import im8.g;
import com.yxcorp.gifshow.detail.network.feedback.NetworkFeedbackFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import brd.y;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.network.feedback.g;
import java.util.Map;
import java.util.HashMap;

public class NetworkFeedbackFragment$a implements g	// class@0015b9
{
    public c b;
    public t c;
    public y d;
    public QPhoto e;
    public DialogFragment f;
    public final NetworkFeedbackFragment g;

    public void NetworkFeedbackFragment$a(NetworkFeedbackFragment p0){
       this.g = p0;
       super();
       PublishSubject publishSubje = PublishSubject.g();
       this.c = publishSubje;
       this.d = publishSubje;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NetworkFeedbackFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, NetworkFeedbackFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(NetworkFeedbackFragment$a.class, new g());
       }else {
          obj.put(NetworkFeedbackFragment$a.class, null);
       }
       return obj;
    }
}
