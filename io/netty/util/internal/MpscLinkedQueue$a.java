package io.netty.util.internal.MpscLinkedQueue$a;
import zqd.l;
import java.lang.Object;

public final class MpscLinkedQueue$a extends l	// class@001115
{
    public Object d;

    public void MpscLinkedQueue$a(Object p0){
       super();
       this.d = p0;
    }
    public Object a(){
       MpscLinkedQueue$a td = this.d;
       this.d = null;
       return td;
    }
    public Object e(){
       return this.d;
    }
}
