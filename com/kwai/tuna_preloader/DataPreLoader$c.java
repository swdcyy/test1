package com.kwai.tuna_preloader.DataPreLoader$c;
import java.lang.Object;
import gu7.b;
import java.lang.Throwable;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;

public abstract class DataPreLoader$c	// class@001957
{
    public b a;

    public void DataPreLoader$c(){
       super();
    }
    public final b a(){
       return this.a;
    }
    public void b(Throwable p0){
    }
    public void c(){
    }
    public void d(){
    }
    public void e(){
    }
    public void f(){
    }
    public void g(boolean p0,Throwable p1){
    }
    public void h(boolean p0,ResultWrapper p1){
       if (PatchProxy.isSupport(DataPreLoader$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, DataPreLoader$c.class, "3")) {
          return;
       }
       a.p(p1, "result");
       return;
    }
    public void i(Throwable p0){
    }
    public void j(ResultWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$c.class, "2")) {
          return;
       }
       a.p(p0, "result");
       return;
    }
    public void k(){
    }
    public void l(){
    }
}
