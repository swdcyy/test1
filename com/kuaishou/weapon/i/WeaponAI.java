package com.kuaishou.weapon.i.WeaponAI;
import java.lang.String;
import com.kuaishou.weapon.i.WeaponCB;
import java.lang.Class;
import java.lang.Object;
import android.content.IntentFilter;

public interface abstract WeaponAI	// class@0011a4
{

    void cm(String p0,String p1,String p2,WeaponCB p3,Class[] p4,Object[] p5);
    String p(String p0);
    void r(String p0,IntentFilter p1,String p2,String p3);
    void sp(String p0,boolean p1);
    void ssb(int p0,boolean p1);
    void u(String p0);
    void ur(String p0,IntentFilter p1,String p2,String p3);
}
