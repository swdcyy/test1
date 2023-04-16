package com.eclipsesource.v8.LibraryLoader$1;
import com.eclipsesource.v8.NativeLibraryLoader;
import java.lang.Object;
import com.eclipsesource.v8.LibraryLoader;
import java.lang.String;
import java.lang.System;

public final class LibraryLoader$1 implements NativeLibraryLoader	// class@000fc9
{

    public void LibraryLoader$1(){
       super();
    }
    public void loadLibraries(){
       try{
          this.loadLibraries(LibraryLoader.sAndroidNativeLibraries);
       }catch(java.lang.Exception e0){
          this.loadLibraries(LibraryLoader.sAndroidNativeLiteLibraries);
       }
       return;
    }
    public final void loadLibraries(String[] p0){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          System.loadLibrary(p0[i]);
       }
       return;
    }
}
