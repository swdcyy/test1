package com.kuaishou.live.core.show.subscribe.edit.a;
import im8.g;
import a51.c;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.edit.o;
import sk2.g;
import sk2.d;
import sk2.e;
import sk2.f;
import ok.x;
import com.kuaishou.live.core.show.subscribe.edit.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import ekd.k1;
import crd.a;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import androidx.fragment.app.c;
import com.kwai.robust.PatchProxyResult;
import sk2.j;
import java.util.Map;
import java.util.HashMap;

public abstract class a extends c implements g	// class@0010f6
{
    public final MutableLiveData v;
    public final o w;
    public g x;
    public static String sLivePresenterClassName = "LiveSubscribeBasePresenter";

    public void a(){
       super();
       MutableLiveData mutableLiveD = new MutableLiveData(Boolean.FALSE);
       this.v = mutableLiveD;
       o oo = new o(mutableLiveD, new g(this), new d(this), new e(this), new f(this));
       this.w = v6;
       this.x = new a$a(this);
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       super.J8();
       a tw = this.w;
       Objects.requireNonNull(tw);
       if (!PatchProxy.applyVoid(objArray, tw, o.class, "25")) {
          x.E(tw.j);
          tw.j = objArray;
          x.E(tw.k);
          tw.k = objArray;
          tw.m(false);
          k1.n(tw);
          tw.l = objArray;
          tw.h.d();
          tw.g.clear();
       }
       return;
    }
    public abstract int S8();
    public ClientContent$LiveStreamPackage V8(){
       return null;
    }
    public abstract int W8();
    public ClientContent$LiveVoicePartyPackageV2 X8(){
       return null;
    }
    public final void Y8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.v.setValue(Boolean.valueOf(p0));
       return;
    }
    public abstract c b();
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new j());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
