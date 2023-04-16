package rg.g;
import rg.a;
import java.lang.String;
import java.lang.System;

public final class g extends a	// class@002386
{

    public void g(){
       super();
    }
    public String b(String p0){
       if (p0.startsWith("lib") && p0.endsWith(".so")) {
          return p0;
       }
       return System.mapLibraryName(p0);
    }
    public void d(String p0){
       System.load(p0);
    }
    public void loadLibrary(String p0){
       System.loadLibrary(p0);
    }
}
