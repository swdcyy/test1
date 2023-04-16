package com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestManagementFragment$a;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.d;
import java.util.Map;
import java.util.HashMap;

public class InterestManagementFragment$a implements g	// class@00173d
{
    public PublishSubject b;
    public y c;
    public t d;

    public void InterestManagementFragment$a(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       this.b = publishSubje;
       this.c = publishSubje;
       this.d = publishSubje.hide();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, InterestManagementFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(InterestManagementFragment$a.class, "1");
          return new d();
       }else {
          PatchProxy.onMethodExit(InterestManagementFragment$a.class, "1");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, InterestManagementFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(InterestManagementFragment$a.class, new d());
       }else {
          obj.put(InterestManagementFragment$a.class, null);
       }
       PatchProxy.onMethodExit(InterestManagementFragment$a.class, "2");
       return obj;
    }
}
