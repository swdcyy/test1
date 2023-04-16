package com.yxcorp.gifshow.im_rtc.media.a$a;
import zwa.v;
import com.yxcorp.gifshow.im_rtc.media.a;
import java.lang.Object;
import java.lang.String;
import zwa.u;
import java.util.List;
import dxa.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import dc5.c;
import java.util.Iterator;
import cxa.m;

public class a$a implements v	// class@001932
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void N2(String p0,String p1,int p2,int p3){
       u.d(this, p0, p1, p2, p3);
    }
    public void O2(String p0,List p1){
       u.a(this, p0, p1);
    }
    public void a(int p0,String p1,b p2){
       u.b(this, p0, p1, p2);
    }
    public void b(int p0,String p1,String p2,b p3){
       Iterator iterator;
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, a$a.class, "1")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p2, ta, a.class, "6")) {
          if (("DIALING").equals(p2)) {
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, a.class, "7")) {
                c.g("IMRTCMedia", "notifySwitchDialing");
                iterator = ta.a.iterator();
                while (iterator.hasNext()) {
                   iterator.next().f(p0);
                }
             }
          }else if(("REQUESTED").equals(p2)){
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, a.class, "8")) {
                c.g("IMRTCMedia", "notifySwitchRequested");
                iterator = ta.a.iterator();
                while (iterator.hasNext()) {
                   iterator.next().c(p0);
                }
             }
          }else if(("CALLING").equals(p2)){
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, a.class, "9")) {
                c.g("IMRTCMedia", "notifySwitchCalling");
                iterator = ta.a.iterator();
                while (iterator.hasNext()) {
                   iterator.next().b(p0);
                }
             }
          }else {
             ta.b = false;
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, a.class, "10")) {
                c.g("IMRTCMedia", "notifySwitchIDLE");
                iterator = ta.a.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a(p0);
                }
             }
          }
       }
       return;
    }
}
