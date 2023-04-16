package com.kuaishou.weapon.WeaponRECE;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.kuaishou.weapon.ks.r;
import com.kuaishou.weapon.WeaponRECE$1;
import java.lang.Runnable;

public class WeaponRECE extends BroadcastReceiver	// class@0011a1
{

    public void WeaponRECE(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       r.a().a(new WeaponRECE$1(this, p1, p0));
    }
}
