package com.yxcorp.gifshow.profile.profileinstaller.c$b;
import com.yxcorp.gifshow.profile.profileinstaller.c$c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Throwable;

public class c$b implements c$c	// class@0015a2
{

    public void c$b(){
       super();
    }
    public void a(int p0,Object p1){
       if (PatchProxy.isSupport(c$b.class)) {
          PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, c$b.class, "1");
       }
       return;
    }
    public void b(int p0,Object p1){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       switch (p0){
           case 1:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:
           case 11:
           case 2:
       }
    label_0018 :
       if (p0 == 6 || (p0 == 7 || p0 == 8)) {
       }
       return;
    }
}
