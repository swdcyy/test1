package com.oasisfeng.condom.CondomContext$14;
import com.oasisfeng.condom.util.Lazy;
import com.oasisfeng.condom.CondomContext;
import java.lang.Object;
import com.oasisfeng.condom.CondomContext$PseudoContextImpl;

public class CondomContext$14 extends Lazy	// class@000a62
{
    public final CondomContext a;

    public void CondomContext$14(CondomContext p0){
       this.a = p0;
       super();
    }
    public Object create(){
       return new CondomContext$PseudoContextImpl(this.a);
    }
}
