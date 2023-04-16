package com.yxcorp.gifshow.message.init.RecordMessageUsage;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class RecordMessageUsage	// class@001224
{
    public static Boolean a;

    static {
       RecordMessageUsage.a = Boolean.FALSE;
    }
    public void RecordMessageUsage(){
       super();
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, RecordMessageUsage.class, "3")) {
          return;
       }
       RecordMessageUsage.a = Boolean.TRUE;
       return;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, RecordMessageUsage.class, "2")) {
          return;
       }
       RecordMessageUsage.a = Boolean.TRUE;
       return;
    }
    public static void c(){
       if (PatchProxy.applyVoid(null, null, RecordMessageUsage.class, "1")) {
          return;
       }
       RecordMessageUsage.a = Boolean.TRUE;
       return;
    }
}
