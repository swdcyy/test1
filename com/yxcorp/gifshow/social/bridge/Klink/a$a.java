package com.yxcorp.gifshow.social.bridge.Klink.a$a;
import o75.b0;
import com.yxcorp.gifshow.social.bridge.Klink.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.social.bridge.Klink.KlinkStateParams;
import com.yxcorp.gifshow.social.bridge.Klink.KlinkState;
import java.lang.Enum;

public class a$a implements b0	// class@001d4e
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void A(int p0){
    }
    public void B(){
    }
    public void C(int p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.a.Oa("klink_state_changed", new KlinkStateParams(KlinkState.values()[p1].toString()));
       return;
    }
    public void f(){
    }
    public void h(){
    }
    public void i(int p0,String p1){
    }
    public void k(){
    }
    public void v(){
    }
}
