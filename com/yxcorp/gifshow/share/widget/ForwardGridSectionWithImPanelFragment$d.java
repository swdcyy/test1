package com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment$d;
import im8.g;
import java.lang.Object;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import java.util.ArrayList;
import java.util.List;
import io.reactivex.subjects.PublishSubject;
import ric.d;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.widget.a0;
import java.util.Map;
import java.util.HashMap;

public class ForwardGridSectionWithImPanelFragment$d implements g	// class@001ce1
{
    public boolean b;
    public IMShareSelectTargetsParams c;
    public ObservableList d;
    public SharePanelFragment e;
    public KwaiDialogFragment f;
    public f g;
    public PublishSubject h;
    public IMShareObject i;
    public d j;
    public String k;

    public void ForwardGridSectionWithImPanelFragment$d(){
       super();
       this.d = new ObservableList(new ArrayList());
       this.h = PublishSubject.g();
       this.j = new d();
       this.k = "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ForwardGridSectionWithImPanelFragment$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new a0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ForwardGridSectionWithImPanelFragment$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ForwardGridSectionWithImPanelFragment$d.class, new a0());
       }else {
          obj.put(ForwardGridSectionWithImPanelFragment$d.class, null);
       }
       return obj;
    }
}
