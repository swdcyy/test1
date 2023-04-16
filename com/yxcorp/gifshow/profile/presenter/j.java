package com.yxcorp.gifshow.profile.presenter.j;
import im8.g;
import ja5.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.presenter.j$a;
import android.view.View$OnClickListener;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import i4c.b1;
import java.util.Map;
import java.util.HashMap;
import qvb.f;
import java.lang.Integer;
import com.kwai.framework.model.user.User;

public class j extends c implements g	// class@00144f
{
    public User A;
    public View B;
    public f C;
    public boolean D;
    public View E;
    public int z;

    public void j(int p0){
       super(p0);
       this.D = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       this.E.setOnClickListener(new j$a(this));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.E = this.m8();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a3105);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(j.class, new b1());
       }else {
          obj.put(j.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       super.j8();
       this.C = this.r8("DETAIL_PAGE_LIST");
       this.z = this.r8("TAB_ID").intValue();
       this.A = this.r8("PROFILE_PAGE_USER");
       return;
    }
}
