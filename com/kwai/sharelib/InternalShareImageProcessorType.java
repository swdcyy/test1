package com.kwai.sharelib.InternalShareImageProcessorType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import uo7.s;
import uo7.g;
import com.kwai.sharelib.tools.image.processor.b;
import kotlin.NoWhenBranchMatchedException;
import kp7.c;
import kp7.a;

public final class InternalShareImageProcessorType extends Enum	// class@00168c
{
    public static final InternalShareImageProcessorType[] $VALUES;
    public static final InternalShareImageProcessorType DEFAULT;
    public static final InternalShareImageProcessorType FRESCO;
    public static final InternalShareImageProcessorType GLIDE;

    static {
       InternalShareImageProcessorType internalShar1;
       InternalShareImageProcessorType[] internalShar = new InternalShareImageProcessorType[]{internalShar1,internalShar1,internalShar1};
       internalShar1 = new InternalShareImageProcessorType("DEFAULT", 0);
       InternalShareImageProcessorType.DEFAULT = internalShar1;
       internalShar1 = new InternalShareImageProcessorType("FRESCO", 1);
       InternalShareImageProcessorType.FRESCO = internalShar1;
       internalShar1 = new InternalShareImageProcessorType("GLIDE", 2);
       InternalShareImageProcessorType.GLIDE = internalShar1;
       InternalShareImageProcessorType.$VALUES = internalShar;
    }
    public void InternalShareImageProcessorType(String p0,int p1){
       super(p0, p1);
    }
    public static InternalShareImageProcessorType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, InternalShareImageProcessorType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(InternalShareImageProcessorType.class, p0);
    }
    public static InternalShareImageProcessorType[] values(){
       Object obj = PatchProxy.apply(null, null, InternalShareImageProcessorType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return InternalShareImageProcessorType.$VALUES.clone();
    }
    public final s toProcessor$kwaisharelib_release(){
       c uoc;
       b obj = PatchProxy.apply(null, this, InternalShareImageProcessorType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = g.a[this.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                obj = new b();
             }else {
                throw new NoWhenBranchMatchedException();
             }
          }else {
             uoc = new c();
          }
       }else {
          uoc = new a();
       }
       return obj;
    }
}
