package com.gifshow.kanim.parser.moshi.JsonReader$a;
import java.lang.String;
import cud.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okio.ByteString;
import okio.b;
import okio.c;
import com.gifshow.kanim.parser.moshi.JsonReader;
import cud.f$a;
import java.lang.AssertionError;

public final class JsonReader$a	// class@0015c7
{
    public final String[] a;
    public final f b;

    public void JsonReader$a(String[] p0,f p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static JsonReader$a a(String[] p0){
       ByteString[] obj = PatchProxy.applyOneRefs(p0, null, JsonReader$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new ByteString[p0.length];
          b uob = new b();
          for (int i = 0; i < p0.length; i = i + 1) {
             JsonReader.z(uob, p0[i]);
             uob.readByte();
             obj[i] = uob.readByteString();
          }
          return new JsonReader$a(p0.clone(), f.d.c(obj));
       }catch(java.io.IOException e4){
          throw new AssertionError(e4);
       }
    }
}
