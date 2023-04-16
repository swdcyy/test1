package com.kwai.dva.dex2oat.util.Dex2OatFilesUtil$isElfFile$1$compareByteAndChar$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Byte;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class Dex2OatFilesUtil$isElfFile$1$compareByteAndChar$1 extends Lambda implements p	// class@000d1c
{
    public static final Dex2OatFilesUtil$isElfFile$1$compareByteAndChar$1 INSTANCE;

    static {
       Dex2OatFilesUtil$isElfFile$1$compareByteAndChar$1.INSTANCE = new Dex2OatFilesUtil$isElfFile$1$compareByteAndChar$1();
    }
    public void Dex2OatFilesUtil$isElfFile$1$compareByteAndChar$1(){
       super(2);
    }
    public final Boolean invoke(Byte p0,char p1){
       if (PatchProxy.isSupport(Dex2OatFilesUtil$isElfFile$1$compareByteAndChar$1.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Character.valueOf(p1), this, Dex2OatFilesUtil$isElfFile$1$compareByteAndChar$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       boolean b = false;
       if (p0 != null && (char)p0.byteValue() == p1) {
          b = true;
       }
       return Boolean.valueOf(b);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.charValue());
    }
}
