package com.samsung.android.sdk.camera.impl.filter.a;
import java.lang.Cloneable;
import tk8.a;
import java.lang.Object;
import java.util.Hashtable;
import java.util.ArrayList;
import java.lang.AssertionError;

public class a extends a implements Cloneable	// class@000b7c
{

    public Object clone(){
       return this.d();
    }
    public a d(){
       try{
          a uoa = super.clone();
          this.c = uoa.c.clone();
          this.d = uoa.d.clone();
          return uoa;
       }catch(java.lang.CloneNotSupportedException e0){
          throw new AssertionError();
       }
    }
}
