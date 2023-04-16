package com.yxcorp.gifshow.page.cost.list.ListReqLifecycle$a;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle$Event;
import brd.t;
import com.kwai.robust.PatchProxyResult;

public class ListReqLifecycle$a implements ListReqLifecycle	// class@000e25
{
    public PublishSubject b;

    public void ListReqLifecycle$a(){
       super();
       this.b = PublishSubject.g();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ListReqLifecycle$a.class, "3")) {
          return;
       }
       this.b.onNext(ListReqLifecycle$Event.DATA_INITED);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ListReqLifecycle$a.class, "2")) {
          return;
       }
       this.b.onNext(ListReqLifecycle$Event.END_REQ);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, ListReqLifecycle$a.class, "1")) {
          return;
       }
       this.b.onNext(ListReqLifecycle$Event.START_REQ);
       return;
    }
    public t m(){
       Object obj = PatchProxy.apply(null, this, ListReqLifecycle$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.hide();
    }
}
