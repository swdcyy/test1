package com.oasisfeng.condom.CondomProcess$1;
import java.lang.Runnable;
import android.app.Application;
import java.lang.String;
import java.lang.Object;
import com.oasisfeng.condom.CondomProcess;

public final class CondomProcess$1 implements Runnable	// class@000a89
{
    public final Application b;
    public final String[] c;

    public void CondomProcess$1(Application p0,String[] p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void run(){
       CondomProcess.doValidateProcessNames(this.b, this.c);
    }
}
